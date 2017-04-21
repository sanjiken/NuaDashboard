package com.NuaDashboard.service;
import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import com.NuaDashboard.entity.MessageEntity;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ListContactModelResult;
import com.NuaDashboard.model.modelMsgResult;

@LocalBean
@Stateless
public class MsgEntityService {


	@PersistenceContext
	EntityManager em;
	

public  List<ListContactModelResult> searchIntClt(){
		
	System.out.println("MsgEntityService.searchIntClt()"+em.equals(null));
	
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ListContactModelResult(  "
						+ "u.id ,      "
						+ "u.userName ) "
					   + " FROM UserEntity u   "
					   +  " WHERE u.idRole.id = :p1 OR u.idRole.id = :p2 ")
					.setParameter("p1",2)
					.setParameter("p2",3);
					
				
			List<ListContactModelResult> intClt = (List<ListContactModelResult>) query.getResultList();
			 return intClt;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}
	
	
public  List<ListContactModelResult>  searchIntSa(){
		
		try {
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ListContactModelResult(  "
					+ " u.id ,      "
					+ " u.userName ) "
				   + " FROM UserEntity u   "
				   +  " WHERE u.idRole.id = :p1 OR u.idRole.id = :p2 ")
				.setParameter("p1",2)
				.setParameter("p2",1);
				
			
		List<ListContactModelResult> IntSa = (List<ListContactModelResult>) query.getResultList();
		 return IntSa;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	
	
	

public  List<ListContactModelResult> searchIntSaClt(){
	
		try {
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.ListContactModelResult(  "
					+ " u.id ,      "
					+ " u.userName ) "
				   + " FROM UserEntity u   "
				   +  " WHERE u.idRole.id = :p1 OR u.idRole.id = :p2 OR u.idRole.id = :p3 ")
				.setParameter("p1",1)
				.setParameter("p2",2)
				.setParameter("p3",3);
				
			
		List<ListContactModelResult> IntSaClt = (List<ListContactModelResult>) query.getResultList();
		 return IntSaClt;
		 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	
	


	

	

	

public  List<modelMsgResult> searchMsgTTService(Integer idRecpt, Integer idActr){
	
		try {
			
			System.out.println("cc im receptob : "+idRecpt);
			System.out.println("cc im actopr : "+idActr);
			
			Query query = em.createQuery(" SELECT new com.NuaDashboard.model.modelMsgResult(  "
					+ "u.contenuMesg ,       "
					+ "u.isShow ,            "
					+ "u.hour ,   "
					+ "u.min ,  "
					+ "u.sec , "
					+ "u.dat , "
					+ "u.mon ,"
					+ "u.ye ,"
					+ "u.isDeleted ,         "
					+ "u.UserActor,          "
					+ "u.UserRecepteur )     "
				   + " FROM MessageEntity u   "
				   + " WHERE (u.UserActor.id = :p1 and u.UserRecepteur.id = :p2) OR (u.UserActor.id = :p3 and u.UserRecepteur.id = :p4 )"
				   + "ORDER BY(u.min,u.sec) ")
				.setParameter("p1",idActr)
				.setParameter("p2",idRecpt)
				.setParameter("p3",idRecpt)
				.setParameter("p4",idActr);
				
			
		List<modelMsgResult> msg = (List<modelMsgResult>) query.getResultList();
		 return msg;
		 
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
}	
		
	


public String addMsgService(String contenu , Integer idAct , Integer idRcpt ){
	
	String isSucces = "succes" ;
	System.out.println("UserEntityService.addMsgService()");
	if (contenu != null) {
		
		/***
		 * get actor
		 */
		Query query = em.createQuery(" SELECT u "
				   + " FROM UserEntity u   "
				   + " WHERE u.id = :p1 ")
				.setParameter("p1", idAct);

			UserEntity actor= (UserEntity) query.getSingleResult();

		  /***
	       * get receptor
		   */
			Query q = em.createQuery(" SELECT u "
					   + " FROM UserEntity u   "
					   + " WHERE u.id = :p1 ")
					.setParameter("p1", idRcpt);

				UserEntity recpt= (UserEntity) q.getSingleResult();
	
			
				/**
				 * get date 
				 * */
				Date d = new Date();
				String h = Integer.toString(d.getHours());
				String min = Integer.toString(d.getMinutes());
				String s = Integer.toString(d.getSeconds());
				String dat = Integer.toString(d.getDate());
				String m = Integer.toString(d.getMonth());
				String y = Integer.toString(d.getYear());
				
			
			
				
			
		try {
			MessageEntity msg = new MessageEntity();
			msg.setContenuMesg(contenu);
            msg.setIsShow(false);
			msg.setIsDeleted(false);
		    msg.setUserActor(actor);
			msg.setUserRecepteur(recpt);
			msg.setHour(h);
			msg.setMin(min);
			msg.setSec(s);
			msg.setDat(dat);
			msg.setMon(m);
			msg.setYe(y);
			
			em.persist(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
			isSucces = "error";
		}
	}else{
		isSucces = "user request null";
	}
	
	
	return isSucces;

	
	     
	}





	
	
}
