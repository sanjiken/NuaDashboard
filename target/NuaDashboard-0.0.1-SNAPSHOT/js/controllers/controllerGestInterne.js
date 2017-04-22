function InternCtrl(angularbeanGesInterne,$scope,$cookies,$window) {
	
	var isUser = $cookies.get('email');
	var isSA=$cookies.get('isSA');
	var role=$cookies.get('role');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
		$scope.alertEror=false;
	}
	
	var vm =this;
	vm.angularbeanGesInterne=angularbeanGesInterne;
	console.log("im in controlleur gestion d'intern");
	vm.angularbeanGesInterne.getInternTT().then(function(internTT) {
			console.dir(internTT);
			console.log("im in get intern");
			$scope.findIntern = internTT;
		});	
	
	$scope.suppInternJs=function(data){
		console.dir(data);
		vm.angularbeanGesInterne.suppbeanIntern(data).then(function(suppIntern){
			console.log("im in supp intern");
			$scope.suppIntern=suppIntern;
			if(suppIntern=="succes")
			$scope.alertEror=true;
				
			vm.angularbeanGesInterne.getInternTT().then(function(internTT){
				$scope.findIntern=internTT;
			});
			

	});
	}
	
	
	$scope.editInternJs=function(data){
		$scope.alertEdit=false;
		console.dir(data);
		vm.angularbeanGesInterne.editbeanIntern(data).then(function(editIntern){
			console.log("im in edit intern");
			$scope.editInt=editIntern;
			$scope.alertEdit=true;
			
			vm.angularbeanGesInterne.getInternTT().then(function(internTT){
				$scope.findIntern=internTT;
			});
			

	});
	}
	
	
	$scope.alertDesact=false;
   $scope.desactiveInternJs=function(data){
	console.log("im in active intern");
		console.dir(data);
		vm.angularbeanGesInterne.desactivebeanIntern(data).then(function(activeIntern){
			console.log("im in active intern");
			$scope.desact=activeIntern;
			$scope.alertDesact=true;
		
				
			vm.angularbeanGesInterne.getInternTT().then(function(internTT){
				$scope.findIntern=internTT;
			});
			

	});
	}
	
	
}