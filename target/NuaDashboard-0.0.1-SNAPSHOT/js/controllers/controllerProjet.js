function projetCtrl(angularbeanProjet,$scope,$cookies,$window) {
	
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
<<<<<<< HEAD
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
 		}else {
 			
 			vm.angularbeanProjet.addProjetBean(data).then(function(msgProjetAdd){
 				
 				$scope.response= " "+msgProjetAdd;
				console.log("im after addProjetbean");
				
 			});
 		}
     
     } 
}
=======
	var isSA=$cookies.get('isSA');
	$scope.supAD=isSA;
	
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
    			 console.log("liste de projet pour admin :");
    			 console.dir(searchProjetAdmin);
    			 $scope.superUser= true;
		
    		     });
     }else if(role =="CTL" ){
    	 console.log("i am : " + role)
 		 vm.angularbeanProjet.searchbeanProjetClient($cookies.get('id')).then(function (searchProjetClient){
 			 $scope.searchProjetClient = searchProjetClient;
 			console.log("liste de projet pour client :");
 			 	console.dir(searchProjetClient);
 			 	$scope.client=true;
 		 });
      }else{
    	  console.log("i am : " + role)
    	  vm.angularbeanProjet.searchbeanProjetInterne($cookies.get('id')).then(function (searchProjetInterne){
  			 $scope.searchProjetInterne = searchProjetInterne;
  			console.log("liste de projet pour interne :");
  			console.dir(searchProjetInterne);
  			
  			 	$scope.interne=true;
  		 });  
	  
  }
     /*
      * to choose Intern and client
      */
 		vm.angularbeanProjet.getClientTT().then(function(clientTT) {
 			console.log("tt le client");
 			console.dir(clientTT);
 			$scope.findClient = clientTT;
 		});	
 		vm.angularbeanProjet.getInternTT().then(function(internTT) {
 			console.log("tt le interne");
 			console.dir(internTT);
 			$scope.findIntern = internTT;
 		});	
  
 		 $scope.newe =false;
 		 $scope.newprojetJs = function(){
 			$scope.newe=true; 
 			 
 		 }
     $scope.addProjetCtrlJs = function(data){
    	 console.log("info de projet a ajouter");
    	 console.log(data);
    	 if(data.projetName == null || data.projetName == undefined || data.projetName  == ""){
 			$scope.response = "Vous n'avez spécifiez votre projet Name "
 		}else if(data.propriete == null || data.propriete == undefined || data.propriete  == ""){
 			$scope.response = "Vous n'avez spécifiez votre propriete "
 		}else {
 			
 			vm.angularbeanProjet.addProjetBean(data).then(function(msgProjetAdd){
 				
 				$scope.response= " "+msgProjetAdd;
				console.log("im after addProjetbean");
				
 			});
 		}
     
     } 

     
    $scope.edit=false;
    $scope.projetedit = {};
     $scope.editprojetJs = function(data){
    	 console.log("info projet pas encore modifier");
    	 console.dir(data);
    	 $scope.idprojetedit=data;
    	
    		  $scope.edit=true;	
    		  $scope.projetedit.projetName=data.projetName;
    		  $scope.projetedit.propriete=data.propriete;
    		  $scope.projetedit.support=data.support;
    		  $scope.projetedit.idClient=data.idClient;
    		  $scope.projetedit.idInterne=data.idInterne;
    		  console.log("data.idClient : " + data.idClient);
    		  console.log("$scope.projetedit.idClient : " + $scope.projetedit.idClient);
    		  
    		  console.log("data.idInterne: " + data.idInterne);
    		  console.log("$scope.projetedit.idInterne : " +  $scope.projetedit.idInterne);
    		  
    		  
    	
    	 }
    	 
    
    $scope.editProjetCtrlJs=function(data){
    	 console.log("info projet a  modifier");
    	 console.dir(data);
    	vm.angularbeanProjet.editprojetJsBean(data,$scope.idprojetedit.id).then(function(msgProjetedit){ 
    		$scope.editprojet=msgProjetedit;
    		console.log("im in edit projet");
    		$scope.editprojet= " "+msgProjetedit;
    		
    		
    	});
    }

	
}
>>>>>>> branch 'master' of https://github.com/sanjiken/NuaDashboard.git
