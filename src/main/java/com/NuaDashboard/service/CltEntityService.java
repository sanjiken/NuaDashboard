package com.NuaDashboard.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ModelCltResult;

@LocalBean
@Stateless
public class CltEntityService {
	@PersistenceContext
	EntityManager em;
	
	
	
	
public  List<ModelCltResult> searchCltTService(){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ModelCltResult(  "
						+"u.id ,      "
						+"u.userName, "
						+"u.email,"
						+"u.numtel,"
						+"u.adress )"
					   + " FROM UserEntity u   "
					   + " WHERE u.idRole.id = :p1 "
					   + "AND u.isActivate = :p2  "
					   + "AND u.isDeleted = :p3  ")
					.setParameter("p1",2)
					.setParameter("p2",true)
					.setParameter("p3", false);
			
			List<ModelCltResult> user = (List<ModelCltResult>) query.getResultList();
			
			
			
				return  user;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}





public String suppCltService(Integer clt){
	
	String isSucces = "succes" ;
	System.out.println("CltEntityService.suppCltService()"+ clt);

		
		
		
		try {
			Query q = em.createQuery(" SELECT u "
				   +  " FROM UserEntity u   "
				   +  " WHERE u.id = :p1 ")
			.setParameter("p1", clt);
		
			
		
			UserEntity  userEntity = (UserEntity)  q.getSingleResult();
		
		
		userEntity.setIsDeleted(true);
			
		em.merge(userEntity);
		
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
	
	
	
	
	
	return isSucces;

	
	

}




	
}
