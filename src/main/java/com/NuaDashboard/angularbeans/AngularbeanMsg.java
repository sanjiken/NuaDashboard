package com.NuaDashboard.angularbeans;

import java.util.List;

import javax.inject.Inject;

import com.NuaDashboard.entity.UserEntity;
import com.NuaDashboard.model.ListContactModelResult;

import com.NuaDashboard.model.modelMsgResult;
import com.NuaDashboard.service.MsgEntityService;

import angularBeans.api.AngularBean;
import angularBeans.api.NGPostConstruct;
import angularBeans.api.NGReturn;
import angularBeans.api.http.Get;
import angularBeans.util.ModelQuery;

@AngularBean
public class AngularbeanMsg {

	
	@Inject
	ModelQuery modelQuery;

	@Inject
	MsgEntityService MsgEntityService;	
	
	
	
	
	@Get
	@NGReturn(model = "IntClt")
	public  List<ListContactModelResult> getInternTTClient(){
		return MsgEntityService.searchIntClt();
	}
	
	
	@Get
	@NGReturn(model = "IntSa")
	public List<ListContactModelResult> getInternTTSa(){
		return MsgEntityService.searchIntSa();
	}
	
	@Get
	@NGReturn(model = "IntSaClt")
	public List<ListContactModelResult> getInternTTClientSa(){
		return MsgEntityService.searchIntSaClt();
	}
	
	
	
	@Get
	@NGReturn(model = "msgUser")
	public List<modelMsgResult> getbeanMsgActor(Integer idRecpt,Integer idActr ){
		return MsgEntityService.searchMsgTTService(idRecpt,idActr);
	}
	
	
	@Get
	@NGReturn(model = "msgUser")
	public String addbeanMsg(String contenu , Integer idAct , Integer idRcpt ){
		return MsgEntityService.addMsgService(contenu,idAct,idRcpt);
	}
	
	
	
	
}
