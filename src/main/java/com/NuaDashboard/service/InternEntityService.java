package com.NuaDashboard.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.RoleEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultCnx;
import com.NuaDashboard.model.modelInterneResult;


@LocalBean
@Stateless
public class InternEntityService {
	@PersistenceContext
	EntityManager em;
	
	
	public  List<modelInterneResult> searchInternTTService(){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.modelInterneResult(  "
						+"u.id ,      "
						+"u.userName, "
						+"u.email,"
						+"u.numtel,"
						+"u.adress )"
					   + " FROM UserEntity u   "
					   + " WHERE u.idRole.id = :p1 "
					   + "AND u.isDeleted = :p2  ")
					.setParameter("p1",3)
					.setParameter("p2", false);
			
			List<modelInterneResult> user = (List<modelInterneResult>) query.getResultList();
			
			
			
				return  user;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}
	
	
public String suppInternService(Integer intern){
		
		String isSucces = "succes" ;
		System.out.println("InternEntityService.suppInternService()"+ intern);

			
			
			
			try {
				Query query = em.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultCnx(  "
						+ " u.id ,      "
						+ " u.userName ,  "
						+ " u.isActivate , "
						+ " u.isDeleted ,  "
						+ " u.email ,    "
						+ " u.numtel ,     "
						+ " u.adress ,"
						+ " u.idRole.abr )     "
					   +  " FROM UserEntity u   "
					   +  " WHERE u.id = :p1 ")
				.setParameter("p1", intern);
			
				
			UserModelResultCnx userResult = new UserModelResultCnx();
			
			userResult = (UserModelResultCnx)  query.getSingleResult();
			userResult.setIsDeleted(true);
				
				
				
			em.merge(userResult);
			
			} catch (Exception e) {
				e.printStackTrace();
				isSucces = "error";
			}
		
		
		
		
		
		return isSucces;
	
		
		
	
}
	
}
