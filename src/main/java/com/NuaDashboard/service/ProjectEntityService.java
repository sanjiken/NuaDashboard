package com.NuaDashboard.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.model.ProjetModelResult;

public class ProjectEntityService {

	

	@PersistenceContext
	EntityManager em;
	
	public  List<ProjetModelResult> searchProjetServiceAdmin(Integer user){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+ " u.id ,      "
						+ " u.projetName, "
						+"u.propriete,     "
						+"u.statue,"
						+"u.support,"
						+"u.idClient.id,"
						+"u.idInterne.id )     "
					   + " FROM ProjetEntity u   ");
				
			List<ProjetModelResult> projet = (List<ProjetModelResult>) query.getResultList();
			 return projet;
			
		} catch (Exception e) {
			return null;
		}
		
}
	
	
public  List<ProjetModelResult>  searchProjetServiceClient(Integer user){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+ " u.id ,      "
						+ " u.projetName, "
						+ " u.responsable,    "
						+"u.propriete,     "
						+"u.statue,"
						+"u.support,"
						+"u.idClient.id,"
						+"u.idInterne.id )     "
					   + " FROM ProjetEntity u   "
					   + " WHERE u.idClient.id = :p1  ")
					.setParameter("p1", user);
			
			List<ProjetModelResult> projet = (List<ProjetModelResult>) query.getResultList();
			
			
			
				return projet;
			
		} catch (Exception e) {
			return null;
		}
		
}	
	
	

public  List<ProjetModelResult> searchProjetServiceInterne(Integer user){
	
	List<ProjetModelResult> projet = new ArrayList<ProjetModelResult>();
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ProjetModelResult(  "
						+ " u.id ,      "
						+ " u.projetName, "
						+"u.propriete,     "
						+"u.statue,"
						+"u.support,"
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
	
	

		
}
