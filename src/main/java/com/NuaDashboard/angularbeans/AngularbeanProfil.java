package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.model.ProjetModelResult;
import com.NuaDashboard.model.UserModelRequestAdd;
import com.NuaDashboard.model.UserModelRequestCnx;
import com.NuaDashboard.model.UserModelResultAdd;
import com.NuaDashboard.model.UserModelResultCnx;
import com.NuaDashboard.service.ProjectEntityService;
import com.NuaDashboard.service.UserEntityService;
import com.NuaDashboard.service.ProfilEntityService;
import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanProfil{

	@Inject
	ModelQuery modelQuery;

	@Inject
	ProfilEntityService ProfilEntityService;	
	
	@Get
	@NGReturn(model = "rescherchmail")
	public String mailSearsh(String email ){
		return ProfilEntityService.searchMail(email);
	}
	@Get
	@NGReturn(model = "searchProfilAdmin")
	public  List<ProjetModelResult>  searchbeanProfilAdmin(Integer role ){
		return ProfilEntityService.searchProfilServiceAdmin(role);
	}
	
	
	@Get
	@NGReturn(model = "searchProfilClient")
	public List<ProjetModelResult> searchbeanProfilClient(Integer role ){
		return ProfilEntityService.searchProfilServiceClient(role);
	}
	
	@Get
	@NGReturn(model = "searchProfilInterne")
	public List<ProjetModelResult> searchbeanProfilInterne(Integer role ){
		return ProfilEntityService.searchProfilServiceInterne(role);
	}
	
	@Get
	@NGReturn(model = "editProfil")
	public String editbeanUser(UserModelRequestAdd UserModelRequestAdd,Integer idUser){
		return ProfilEntityService.editUserService(UserModelRequestAdd,idUser);
	}
	
}


	