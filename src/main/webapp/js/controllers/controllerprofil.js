function profilCtrl(angularbeanUserInsc, $scope , $cookies){
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	
	var isSA=$cookies.get('isSA');
	if(isSA== true){
		$scope.isqoui=true;
	}else{
		$scope.isqoui=false;
	}
	
	$scope.emailuser = $cookies.get('email');
	$scope.adruser=$cookies.get('adress');
	$scope.numuser=$cookies.get('numtel');
	
	
	
}