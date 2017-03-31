function projetCtrl(angularbeanProjet,$scope,$cookies,$window) {
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
var vm=this;
vm.angularbeanProjet=angularbeanProjet;
var role = $cookies.get('role');
     if(role =="SA" ){
    	 
    		 vm.angularbeanProjet.searchbeanProjetAdmin($cookies.get('id')).then(function (searchProjetAdmin){
    			 $scope.searchProjetAdmin = searchProjetAdmin;
		
    		     });
     }else if(role =="clee" ){
	  
 		 vm.angularbeanProjet.searchbeanProjetClient($cookies.get('id')).then(function (searchProjetClient){
 			 $scope.searchProjetClient = searchProjetClient;
		
 			 	console.log("im in projet cotroller in searchbeanProjet pour client");
	  
 		 });
      }else{
	  
    	  vm.angularbeanProjet.searchbeanProjetInterne($cookies.get('id')).then(function (searchProjetInterne){
  			 $scope.searchProjetInterne = searchProjetInterne;
 		
  			 	console.log("im in projet cotroller in searchbeanProjet pour interne");
 	  
  		 });  
	  
  }
}
	
	
