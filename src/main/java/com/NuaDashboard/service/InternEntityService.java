package com.NuaDashboard.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.RoleEntity;
import com.NuaDashboard.entity.UserEntity;
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
					   + "AND u.isActivate = :p2  "
					   + "AND u.isDeleted = :p3  ")
					.setParameter("p1",3)
					.setParameter("p2",true)
					.setParameter("p3", false);
			
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
				Query query = em.createQuery(" SELECT u "
					   +  " FROM UserEntity u   "
					   +  " WHERE u.id = :p1 ")
				.setParameter("p1", intern);
			
				
			
				UserEntity  userEntity = (UserEntity)  query.getSingleResult();
			
			
			userEntity.setIsDeleted(true);
				
			em.merge(userEntity);
			
			} catch (Exception e) {
				e.printStackTrace();
				isSucces = "error";
			}
		
		
		
		
		
		return isSucces;
	
		
		
	
}



	



public String editInternService(Integer intern){
	
	
	
	String isSucces = "succes" ;
	System.out.println("InternEntityService.suppInternService()"+ intern);

		
		
		
		try {
			
			Query q = em.createQuery("SELECT u FROM RoleEntity u WHERE u.id = :p1")
					.setParameter("p1",2);
			RoleEntity role = (RoleEntity) q.getSingleResult();
			
			Query query = em.createQuery(" SELECT u "
				   +  " FROM UserEntity u   "
				   +  " WHERE u.id = :p1 ")
			.setParameter("p1", intern);
		
			
		
			UserEntity  userEntity = (UserEntity)  query.getSingleResult();
		
		
		userEntity.setIdRole(role);	
		em.merge(userEntity);
		
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
	
	
	
	
	
	return isSucces;

	
	

}




public String desactiveInternService(Integer intern){
	
	String isSucces = "succes" ;
	System.out.println("InternEntityService.activeInternService()"+ intern);

		
		
		
		try {
			Query query = em.createQuery(" SELECT u "
				   +  " FROM UserEntity u   "
				   +  " WHERE u.id = :p1 ")
			.setParameter("p1", intern);
		
			
		
			UserEntity  userEntity = (UserEntity)  query.getSingleResult();
		
		
		userEntity.setIsActivate(false);
		
		em.merge(userEntity);
		
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
	
	
	
	
	
	return isSucces;

	
	

}


}
