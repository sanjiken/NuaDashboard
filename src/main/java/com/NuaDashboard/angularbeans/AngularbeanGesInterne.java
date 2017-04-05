package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.modelInterneResult;
import com.NuaDashboard.service.InternEntityService;

import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

public class AngularbeanGesInterne {

	@Inject
	ModelQuery modelQuery;

	@Inject
	InternEntityService InternEntityService;	
	

	
	@Get
	@NGReturn(model = "internTT")
	public List<modelInterneResult> getInternTT(){
		return InternEntityService.searchInternTTService();
	}
	
	@Get
	@NGReturn(model = "suppIntern")
	public String suppbeanIntern(Integer id){
		return InternEntityService.suppInternService(id);
	}
	
	

	
	
}
