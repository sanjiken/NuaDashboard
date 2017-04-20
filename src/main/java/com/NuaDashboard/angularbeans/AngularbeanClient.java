package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.service.ClientEntityService;
import com.NuaDashboard.service.ProjectEntityService;
import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ClientModelRequest;
import com.NuaDashboard.model.ClientModelResult;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanClient {

	@Inject
	ModelQuery modelQuery;

	@Inject
	ClientEntityService clientEntityService;	
	
	@NGPostConstruct

		          
	
	@Get
	@NGReturn(model="searchClient")
	public List<UserEntity> searchbeanClient(){
		
		return clientEntityService.searchClient();
	}
	
	@Get
	@NGReturn(model="activeMsg")
	public String string(String idClient){
		
		return clientEntityService.activateClient(idClient);
	}
	
	@Get
	@NGReturn(model="deletMsg")
	public String deleteClient(String idClient){

		return clientEntityService.deleteClient(idClient);
	}
}
	