function CltCtrl(angularbeanGesClt,$scope,$cookies,$window) {
	var isUser = $cookies.get('email');
	var isSA=$cookies.get('isSA');
	var role=$cookies.get('role');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
		
}
	
	var vm =this;
	vm.angularbeanGesClt=angularbeanGesClt;	
	vm.angularbeanGesClt.getClt().then(function(CltTT) {
		console.dir(CltTT);
		console.log("im in get client");
		$scope.findClt = CltTT;
	});	
	
	
	$scope.alertEror=false;
	$scope.suppCltJs=function(data){
		console.dir(data);
		vm.angularbeanGesClt.suppbeanClt(data).then(function(suppClt){

			$scope.suppClient=suppClt;
			$scope.alertEror=true;
				
			vm.angularbeanGesClt.getClt().then(function(CltTT){
				$scope.findClt = CltTT;
			});
			

	});
	}
	
	

}