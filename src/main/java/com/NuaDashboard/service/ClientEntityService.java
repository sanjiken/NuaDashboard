package com.NuaDashboard.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.NuaDashboard.entity.ProjetEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ClientModelRequest;
import com.NuaDashboard.model.ClientModelResult;
import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelResultAdd;

@LocalBean
@Stateless
public class ClientEntityService {

	

	@PersistenceContext
	EntityManager em;
	
	public  List <UserEntity> searchClient(){
		
		try {
			String isSucces ="succes" ;
			Query query = em.createQuery(" SELECT u"
					  + " FROM UserEntity u   "
					   + " WHERE u.isDeleted = :p1"
					   + " and u.idRole.id = :p2 ")
					.setParameter("p1",false)
					.setParameter("p2", 2);
					
					
				
			List<UserEntity> client = (List<UserEntity>) query.getResultList();
			 return client;
			 		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	
	     
	}
public String activateClient(String idClient){
		
		try {
			Query query = em.createQuery("SELECT U "
									   + "FROM UserEntity  u "
									   + "WHERE u.id = :p1 ")
					.setParameter("p1", Integer.parseInt(idClient));
			UserEntity client = (UserEntity) query.getSingleResult();
			
			client.setIsActivate(true);
			
			em.merge(client);
			
			return "succes";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
}

public String deleteClient(String idClient){
	try {
		Query query = em.createQuery("SELECT U "
								   + "FROM UserEntity  u "
								   + "WHERE u.id = :p1 ")
				.setParameter("p1", Integer.parseInt(idClient));
		UserEntity user = (UserEntity) query.getSingleResult();
		
		user.setIsDeleted(true);
		
		em.merge(user);
		
		return "succes";
		
	} catch (Exception e) {
		e.printStackTrace();
		return "error";
	}
}


}