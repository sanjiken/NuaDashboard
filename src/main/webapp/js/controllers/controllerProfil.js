function profilCtrl(angularbeanProfil, $scope , $cookies){
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	
	{
	
    $scope.emailuser = $cookies.get('email');
	$scope.adruser=$cookies.get('adress');
	$scope.numuser=$cookies.get('numtel');
	}

	var vm=this;
	vm.angularbeanProfil=angularbeanProfil;
	

	
$scope.client=false;
$scope.interne=false;
$scope.superUser=false;

var role = $cookies.get('role');
 if(role =="SA" ){
	 console.log("i am : " + role)
		 vm.angularbeanProfil.searchbeanProfilAdmin($cookies.get('id')).then(function (searchProfilAdmin){
			 $scope.searchProfilAdmin = searchProfilAdmin;
			 console.log(searchProfilAdmin);
			 $scope.superUser= true;
	
		     });
 }
 else if(role =="CTL" ){
	 console.log("i am : " + role)
		 vm.angularbeanProfil.searchbeanProfilClient($cookies.get('id')).then(function (searchProfilClient){
			 $scope.searchProfilClient = searchProfilClient;
	
			 	console.dir($scope.searchProfilClient);
			 	$scope.client=true;
		 });
  }
 else{
	  console.log("i am : " + role)
	  vm.angularbeanProfil.searchbeanProfilInterne($cookies.get('id')).then(function (searchProfilInterne){
			 $scope.searchProfilInterne = searchProfilInterne;
		
			 	console.log("im in projet cotroller in searchbeanProjet pour interne");
			 	$scope.interne=true;
		 });  
  

	}
 
} 
 
