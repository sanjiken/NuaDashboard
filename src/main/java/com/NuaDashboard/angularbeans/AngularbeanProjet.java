package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.service.ProjectEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanProjet {

	@Inject
	ModelQuery modelQuery;

	@Inject
	ProjectEntityService projetEntityService;	
	
	
	
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
	
}
