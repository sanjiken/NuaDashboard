package com.NuaDashboard.angularbeans;

import javax.inject.Inject;

import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultCnx;
import com.NuaDashboard.service.UserEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanUserInsc {

	@Inject
	ModelQuery modelQuery;

	@Inject
	UserEntityService UserEntityService;

	@NGPostConstruct
	public void init() {
		modelQuery.setProperty("user", new UserModelRequestAdd());
		          
	}
	
	
	
	
	@Get
	@NGReturn(model = "rescherchmail")
	public String mailSearsh(String email ){
		return UserEntityService.searchMail(email);
	}
	
	
	

	

	@Get
	@NGReturn(model = "msgUserAdd")
	public String addUserBean(UserModelRequestAdd UserModelRequestAdd) {

		return UserEntityService.addUserService(UserModelRequestAdd);
	}
	

}
