function MsgCtrl(angularbeanMsg,$scope,$cookies,$window) {
	
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	

	var vm=this;
	vm.angularbeanMsg=angularbeanMsg;
	
	$scope.client=false;
	$scope.interne=false;
	$scope.superUser=false;
	$scope.idAct = $cookies.get('id');
	var role = $cookies.get('role');
	if(role =="SA" ){
	console.log("i am : " + role)
	vm.angularbeanMsg.getInternTTClient().then(function(IntClt) {
		console.dir(IntClt);
		console.log("im in get interne et client pour le super user");
		$scope.superUser=true;
		$scope.findIntClt = IntClt;
	});	
	}else if(role =="CTL" ){
		 console.log("i am : " + role);
		 vm.angularbeanMsg.getInternTTSa().then(function(IntSa) {
			 $scope.client=true;
				console.dir(IntSa);
				$scope.findIntSa = IntSa;
				console.log("im in get interne se super user pour le client");
				
			});	
		
	}else {
		 console.log("i am : " + role);
		 vm.angularbeanMsg.getInternTTClientSa().then(function(IntSaClt) {
				console.dir(IntSaClt);
				console.log("im in get interne et super user et client pour le interne");
				$scope.interne=true;
				$scope.findIntSaClt = IntSaClt;
			});
		
		
	}
	
	

	
	 $scope.contacterJs = function(data,idAct){
		 var idAct = $cookies.get('id');
			console.log("id of actor2"+ idAct);
		 console.log("id of receptor ");
    	 console.dir(data);
    	 console.log("id of actor"+ idAct);
    	 
    	 $scope.idRcpt = data;
 			vm.angularbeanMsg.getbeanMsgActor(data,idAct).then(function(msgUser){
 				console.log("list de message du moi avec receptor")
 				console.dir(msgUser);
 				$scope.msgUserAct = msgUser;
				console.log("im after getbeanMsg");
				
 			});
 		}
     
   
	
	 
	 $scope.addMsgJs = function(data){
		 var idAct = $cookies.get('id');
    	 console.log("contenu message"+ data);
    	 console.log("id actor :"+ idAct);
    	 console.log("id reseptor :"+ $scope.idRcpt);
 			vm.angularbeanMsg.addbeanMsg(data,idAct,$scope.idRcpt).then(function(msgUser){
 				$scope.msg = msgUser;
				console.log("im after addbeanMsg");
				
			//	vm.angularbeanMsg.getbeanMsg(idRcpt,idAct).then(function(msgUser){
	 				//$scope.msgUserAct = msgUser;
					//console.log("im after getbeanMsg2");
					
	 		//	});
 			});
 		}
     
	 
	
}