package com.NuaDashboard.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.ProjetEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelResultAdd;

public class ProjectEntityService {

	

	@PersistenceContext
	EntityManager em;
	
	public  List<ProjetModelResult> searchProjetServiceAdmin(Integer user){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+ " u.id ,      "
						+ " u.projetName, "
						+"u.propriete,     "
						+"u.statue, "
						+"u.support, "
						+"u.isDeleted, "
						+"u.idClient.id, "
						+"u.idInterne.id )     "
					   + " FROM ProjetEntity u   ");
				
			List<ProjetModelResult> projet = (List<ProjetModelResult>) query.getResultList();
			 return projet;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}
	
	
public  List<ProjetModelResult>  searchProjetServiceClient(Integer user){
		
		try {
			System.out.println("this is the id user  "  + user);
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+"u.id ,      "
						+"u.projetName, "
						+"u.propriete,     "
						+"u.statue, "
						+"u.support, "
						+"u.isDeleted, "
						+"u.idClient.id, "
						+"u.idInterne.id )     "
					   + " FROM ProjetEntity u   "
					   + " WHERE u.idClient.id = :p1  ")
					.setParameter("p1", user);
			
			List<ProjetModelResult> projet = (List<ProjetModelResult>) query.getResultList();
			
			
			
				return projet;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	
	
	

public  List<ProjetModelResult> searchProjetServiceInterne(Integer user){
	
	List<ProjetModelResult> projet = new ArrayList<ProjetModelResult>();
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+"u.id ,      "
						+"u.projetName, "
						+"u.propriete,     "
						+"u.statue,"
						+"u.support,"
						+"u.isDeleted,"
						+"u.idClient.id,"
						+"u.idInterne.id )     "
					   + " FROM ProjetEntity u   "
					   + " WHERE u.idInterne.id = :p1  ")
					.setParameter("p1", user);
			
		 projet = (List<ProjetModelResult>) query.getResultList();
			
			
			
				return  projet;
			
		} catch (Exception e) {
			return null;
		}
		
}	



public  String addProjetService(ProjetModelRequest projetRequest){
	
	String isSucces ="succes" ;
	System.out.println("ProjectEntityService.addProjetService()"+ projetRequest.getProjetName());
	
	/*
	 * get client
	 */
	Query query = em.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultAdd("
			+"u.id ,      "
			+"u.userName, "
			+"u.email,"
			+"u.numtel,"
			+"u.adress )"
		   + " FROM UserEntity u   "
		   + " WHERE u.id = :p1 "
		   + "AND u.isDeleted = :p2  ")
		.setParameter("p1",projetRequest.getIdClient())
		.setParameter("p2", false);

	UserEntity client= (UserEntity) query.getSingleResult();
	
	/*
	 * get Intern
	 */

Query q = em.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultAdd(  "
		+"u.id ,      "
		+"u.userName, "
		+"u.email,"
		+"u.numtel,"
		+"u.adress )"
	   + " FROM UserEntity u   "
	   + " WHERE u.id = :p1 "
	   + "AND u.isDeleted = :p2  ")
	.setParameter("p1",projetRequest.getIdInterne())
	.setParameter("p2", false);

UserEntity interne = (UserEntity) q.getSingleResult();



	
	
	if (projetRequest != null){ 
		try {
			ProjetEntity projet = new ProjetEntity();
			projet.setProjetName(projetRequest.getProjetName());
			projet.setPropriete(projetRequest.getPropriete());
			projet.setStatue(false);
			projet.setSupport(projetRequest.getSupport());
			projet.setIsDeleted(false);
			projet.setIdClient(client);
			projet.setIdInterne(interne);
			
			
			em.persist(projet);
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
	}else{
		
		isSucces ="projet request null";
	}
	
	
	return isSucces;

	
	     
	}
	




public  List<UserModelResultAdd> searchClientTTService(){
	
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultAdd(  "
						+"u.id ,      "
						+"u.userName, "
						+"u.email,     "
						+"u.numtel,"
						+"u.adress )"
					   + " FROM UserEntity u  "
					   + " WHERE u.idRole.id = :p1 "
					   + "AND u.isDeleted = :p2  ")
					.setParameter("p1",2)
					.setParameter("p2", false);
			
			List<UserModelResultAdd> user = (List<UserModelResultAdd>) query.getResultList();
			
			
			
				return  user;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	
	



public  List<UserModelResultAdd> searchInternTTService(){
	
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultAdd(  "
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
			
			List<UserModelResultAdd> user = (List<UserModelResultAdd>) query.getResultList();
			
			
			
				return  user;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	

}
