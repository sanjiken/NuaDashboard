package com.NuaDashboard.service;

import java.util.ArrayList;
import java.util.List;

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

public class ClientEntityService {

	

	@PersistenceContext
	EntityManager em;
	
	public  List<ClientModelResult> searchClient(ClientModelRequest clientRequest){
		
		try {
			String isSucces ="succes" ;
			System.out.println("ClientEntityService.searchClientService()"+ clientRequest.getUserName());
			Query query = em.createQuery(" SELECT u  "
					  + " FROM UserEntity u   "
					   + " WHERE u.id = :p1 ")
					.setParameter("p1",clientRequest.getIdClient());
				
			List<ClientModelResult> client = (List<ClientModelResult>) query.getResultList();
			 return client;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	
	     
	}

public String deleteclient(ClientModelRequest clientRequest){
		
		try {
			Query query = em.createQuery("SELECT u FROM UserEntity u  "
					  + " WHERE u.id = :p1 "
					   + "AND u.isActivate = :p2  ")
					.setParameter("p1",clientRequest.getIdClient())
					.setParameter("p2", false);
				
			UserEntity client = (UserEntity) query.getSingleResult();
			
			client.setIsDeleted(true);
			
			em.merge(client);
		
			return "Success";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	
	     
	}
	
	