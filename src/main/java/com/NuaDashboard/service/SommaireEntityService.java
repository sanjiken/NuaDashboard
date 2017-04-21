package com.NuaDashboard.service;

import java.util.List;
import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.NuaDashboard.entity.ProjetEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.model.SommaireModelResult;

@LocalBean
@Stateless
public class SommaireEntityService {
	
	@PersistenceContext
	EntityManager em;
	
	public  List<SommaireModelResult> SommaireService(){
		
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.SommaireModelResult(  "
						+ " u.id ,      "
						+ " u.projetName, "
						+"u.propriete,     "
						+"u.statue, "
						+"u.idClient.userName )"
					   + " FROM ProjetEntity u   ");
				
			List<SommaireModelResult> projet = (List<SommaireModelResult>) query.getResultList();
			 return projet;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}
	
	
}
