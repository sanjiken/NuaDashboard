package com.NuaDashboard.service;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.ProjetEntity;
import com.NuaDashboard.entity.RoleEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.model.UserModelResultCnx;

@LocalBean
@Stateless
public class ProfilEntityService {


	@PersistenceContext
	EntityManager em;
public String searchMail(String email){
		
		
		try {
			Query query = em.createQuery(" SELECT u  "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1  ")
				.setParameter("p1", email);
				
				
			
			UserEntity userResult = (UserEntity)  query.getSingleResult();
				
			return "mailFound";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "mailNotFound";
		}
		
}
public  List<ProjetModelResult> searchProfilServiceAdmin(Integer user){
		
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
	
	
public  List<ProjetModelResult>  searchProfilServiceClient(Integer user){
		
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
	
	

public  List<ProjetModelResult> searchProfilServiceInterne(Integer user){
	
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
public  String editUserService(UserModelRequestAdd userRequest, Integer idUser){
	
	String isSucces ="succes" ;
	System.out.println("ProfilEntityService.editUserService()"+ userRequest.getUserName());
	try {
		Query Q = em.createQuery(" SELECT u "
				   +  " FROM UserEntity u   "
				   +  " WHERE u.id = :p1 ")
			.setParameter("p1", idUser);

		UserEntity  UserEntity = (UserEntity) Q.getSingleResult();	
			
	   
		UserEntity.setNumtel(userRequest.getNumtel());
		UserEntity.setAdress(userRequest.getAdress() );
					
					
					
					
		em.merge(UserEntity);
				} catch (Exception e) {
					e.printStackTrace();
					isSucces = "error";
				}
			
			
			
			return isSucces;

			
			     
			}
}