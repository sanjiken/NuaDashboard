function InternCtrl(angularbeanGesInterne,$scope,$cookies,$window) {
	
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
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
	});
	}
}