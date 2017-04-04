function profilCtrl(angularbeanUserInsc, $scope , $cookies){
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	$scope.emailuser = $cookies.get('email');
	$scope.adruser=$cookies.get('adress');
	$scope.numuser=$cookies.get('numtel');
	
	
	
}