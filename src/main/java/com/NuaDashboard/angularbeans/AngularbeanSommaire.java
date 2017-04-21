package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.SommaireModelResult;
import com.NuaDashboard.service.SommaireEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanSommaire {
	@Inject
	ModelQuery modelQuery;

	@Inject
	SommaireEntityService SommaireEntityService;	
	
	
	
	
	@Get
	@NGReturn(model = "searchProjet")
	public  List<SommaireModelResult> searchbeanProjet(){
		return SommaireEntityService.SommaireService();
	}
	
	
}
