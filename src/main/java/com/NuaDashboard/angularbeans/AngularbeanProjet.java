package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelRequest;
import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.service.ProjectEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanProjet {

	@Inject
	ModelQuery modelQuery;

	@Inject
	ProjectEntityService projetEntityService;	
	
	@NGPostConstruct
	public void init() {
		modelQuery.setProperty("projet", new ProjetModelRequest());
		          
	}
	
	@Get
	@NGReturn(model = "searchProjetAdmin")
	public  List<ProjetModelResult>  searchbeanProjetAdmin(Integer role ){
		return projetEntityService.searchProjetServiceAdmin(role);
	}
	
	
	@Get
	@NGReturn(model = "searchProjetClient")
	public List<ProjetModelResult> searchbeanProjetClient(Integer role ){
		return projetEntityService.searchProjetServiceClient(role);
	}
	
	@Get
	@NGReturn(model = "searchProjetInterne")
	public List<ProjetModelResult> searchbeanProjetInterne(Integer role ){
		return projetEntityService.searchProjetServiceInterne(role);
	}
	
	@Get
	@NGReturn(model = "msgProjetAdd")
	public String addProjetBean(ProjetModelRequest ProjetModelRequest) {

		return projetEntityService.addProjetService(ProjetModelRequest);
	}
	
	@Get
	@NGReturn(model = "clientTT")
	public List<UserModelResultAdd> getClientTT( ){
		return projetEntityService.searchClientTTService();
	}
	
	
	@Get
	@NGReturn(model = "internTT")
	public List<UserModelResultAdd> getInternTT( ){
		return projetEntityService.searchInternTTService();
	}
	
}
