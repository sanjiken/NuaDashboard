package com.NuaDashboard.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.model.UserModelResultCnx;

@LocalBean
@Stateless
public class UserEntityService {


	@PersistenceContext
	EntityManager eem;
	
	
	
	public String searchService(UserModelRequestCnx user){	
		try {
			
			Query query = eem.createQuery(" SELECT new com.NuaDashboard.model.UserModelRequestCnx(  "
					   + " u.email,"
					   + " u.password )   "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1  ")
				.setParameter("p1", user.getEmail());
				
			UserModelRequestCnx result = (UserModelRequestCnx) query.getSingleResult();
			
			
			
			        if(!user.getPassword().equals(result.getPassword())){
			        	return "Password Not Correct";
			        	
			        }
			        else{
			        	return "Succes";
			        }
			    
			
		} catch (Exception e) {
			e.printStackTrace();
			return "UserNotFound";
		}
			
			
			
			
	}
	
	
	
	
	
	
	
	
	public String addUserService(UserModelRequestAdd userRequest){
		
		String isSucces = "succes" ;
		
		if (userRequest != null) {
			
			
			
			try {
				UserEntity user = new UserEntity();
				user.setUserName(userRequest.getUserName());
			
	            user.setPassword(userRequest.getPassword());
			    user.setEmail(userRequest.getEmail());
				user.setIsActivate(false);
				
				eem.persist(user);
			} catch (Exception e) {
				e.printStackTrace();
				isSucces = "error";
			}
		}else{
			isSucces = "user request null";
		}
		
		
		return isSucces;
	
		
		     
		}
	
	
	


	public UserModelResultCnx searchUserService(UserModelRequestCnx user){
		
		System.out.println("this is the mail from service : " + user.getEmail());
		System.out.println("this is the password from service : " + user.getPassword());

		try {
			
			Query query = eem.createQuery(" SELECT new com.NuaDashboard.model.UserModelResultCnx(  "
						+ " u.id ,      "
						+ " u.userName, "
						+ " u.email )   "
					   + " FROM UserEntity u   "
					   + " WHERE u.email = :p1 and u.password= :p2 ")
				.setParameter("p1", user.getEmail())
				.setParameter("p2", user.getPassword());
				
			UserModelResultCnx userResult = new UserModelResultCnx();
			
			userResult = (UserModelResultCnx)  query.getSingleResult();
				return userResult;
			
		} catch (Exception e) {
			return null;
		}
		
}
		

	public String searchMail(String email){
		
		
		try {
			Query query = eem.createQuery(" SELECT u  "
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
	
	
	
}
