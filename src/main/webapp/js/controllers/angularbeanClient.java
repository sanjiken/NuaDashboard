package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.service.ProjectEntityService;
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
	clientEntityService clientEntityService;	
	
	@NGPostConstruct
	public void init() {
		modelQuery.setProperty("client", new ClientModelRequest());
		          
	}
	
	@Get
	@NGReturn(model = "searchClient")
	public  List<ClientModelResult>  searchbeanClient(ClientModelRequest clientRequest  ){
		return clientEntityService.searchClientService(clientRequest);
	}
	
	@Get
	@NGReturn(model = "msgClientDelet")
	public String deletclientBean() {

		return clientEntityService.deletclientService();
	}
	
	
	