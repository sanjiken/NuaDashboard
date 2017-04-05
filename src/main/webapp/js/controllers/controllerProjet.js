function projetCtrl(angularbeanProjet,$scope,$cookies,$window) {
	
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	var vm=this;
	vm.angularbeanProjet=angularbeanProjet;
	
	

	$scope.client=false;
	$scope.interne=false;
	$scope.superUser=false;

var role = $cookies.get('role');
     if(role =="SA" ){
    	 console.log("i am : " + role)
    		 vm.angularbeanProjet.searchbeanProjetAdmin($cookies.get('id')).then(function (searchProjetAdmin){
    			 $scope.searchProjetAdmin = searchProjetAdmin;
    			 console.log(searchProjetAdmin);
    			 $scope.superUser= true;
		
    		     });
     }else if(role =="CTL" ){
    	 console.log("i am : " + role)
 		 vm.angularbeanProjet.searchbeanProjetClient($cookies.get('id')).then(function (searchProjetClient){
 			 $scope.searchProjetClient = searchProjetClient;
		
 			 	console.dir($scope.searchProjetClient);
 			 	$scope.client=true;
 		 });
      }else{
    	  console.log("i am : " + role)
    	  vm.angularbeanProjet.searchbeanProjetInterne($cookies.get('id')).then(function (searchProjetInterne){
  			 $scope.searchProjetInterne = searchProjetInterne;
 		
  			 	console.log("im in projet cotroller in searchbeanProjet pour interne");
  			 	$scope.interne=true;
  		 });  
	  
  }
     /*
      * to choose Intern and client
      */
 		vm.angularbeanProjet.getClientTT().then(function(clientTT) {
 			console.dir(clientTT);
 			$scope.findClient = clientTT;
 		});	
 		vm.angularbeanProjet.getInternTT().then(function(internTT) {
 			console.dir(internTT);
 			$scope.findIntern = internTT;
 		});	
  
     $scope.addProjetCtrlJs = function(data){
    	 console.log(data);
    	 if(data.projetName == null || data.projetName == undefined || data.projetName  == ""){
 			$scope.response = "Vous n'avez spécifiez votre projet Name "
 		}else if(data.propriete == null || data.propriete == undefined || data.propriete  == ""){
 			$scope.response = "Vous n'avez spécifiez votre propriete "
 	    }else if(data.idClient == null || data.idClient == undefined || data.idClient  == ""){
            $scope.response = "Vous n'avez spécifiez votre idClient"
 		}else if(data.idInterne == null || data.idInterne == undefined || data.idInterne  == ""){
            $scope.response = "Vous n'avez spécifiez votre idInterne"
 		}else {
 			
 			vm.angularbeanProjet.addProjetBean(data).then(function(msgProjetAdd){
 				
 				$scope.response= " "+msgProjetAdd;
				console.log("im after addProjetbean");
				
 			});
 		}
     
     } 
}