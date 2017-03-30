package com.NuaDashboard.angularbeans;

import javax.inject.Inject;

import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultCnx;
import com.NuaDashboard.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanUserCnx {

	@Inject
	ModelQuery modelQuery;

	@Inject
	UserEntityService UserEntityService;

	@NGPostConstruct
	public void init() {
		modelQuery.setProperty("userCnx", new UserModelRequestCnx());
		          
	}
	
	
	@Get
	@NGReturn(model = "resUserSearsh")
	public String userSearsh(UserModelRequestCnx user ){
		return UserEntityService.searchService(user);
	}
	
	
	
	@Get
	@NGReturn(model = "userConnected")
	public UserModelResultCnx getUserConnected(UserModelRequestCnx user){
    
			 return UserEntityService.searchUserService(user);
	
	}

	@Get
	@NGReturn(model = "userResult")
	public UserModelResultCnx searchUserBean(UserModelRequestCnx user) {

		System.out.println("this is the mail from bean : " + user.getEmail());
		System.out.println("this is the password from bean : " + user.getPassword());

		return UserEntityService.searchUserService(user);
	}

	@Get
	@NGReturn(model = "getRole")
	public String getRoleUser(Integer userID) {

		
		return UserEntityService.searchRole(userID);
	
	}

}
