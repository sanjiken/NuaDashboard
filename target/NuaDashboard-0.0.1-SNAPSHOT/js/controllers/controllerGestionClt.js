function clientCtrl (angularbeanClient, $scope, $cookies, $window){
	var isUser = $cookies.get('role');
	if(isUser ==null||isUser == 'null'||isUser == ""|| isUser == undefined ||isUser == "undefined" ||isUser != "SA"){
		console.log("im not logged");
		$window.location.href="page-login.html";
	}
	var vm=this;
	vm.angularbeanClient=angularbeanClient;
	$scope.superUser=false;
	var role=$cookies.get('role');
	if (role=="SA"){
		console.log("i am :"+role)
		vm.angularbeanClient.searchbeanClient().then(function (searchClient){
    			 $scope.searchClient = searchClient;
    			 console.log(searchClient);
    			 $scope.superUser= true;
		
    		     });
		$scope.activateClient = function (data){
			vm.angularbeanClient.activateClient(data).then(function(activeMsg){
				console.log("im in activate client");
			$scope.activateClient=activateClient;
			if(activateClientactivateClient=="succes")
			$scope.alertEror=true;
			vm.angularbeanClient.searchbeanClient().then(function (searchClient){
				$scope.findClient=searchClient;
				
			
			});
			
		});
	}
	
	$scope.deleteClient=function(data){
		console.dir(data);
		vm.angularbeanClient.deleteClient(data).then(function(deletMsg){
			console.log("im in delete client");
			$scope.deleteClient=deleteClient;
			if(deleteClient=="succes")
			$scope.alertEror=true;
		   vm.angularbeanClient.searchbeanClient().then(function (searchClient){
				$scope.findClient=searchClient;
			});
		});
				
	
}
		
	
	}
}
	
	
