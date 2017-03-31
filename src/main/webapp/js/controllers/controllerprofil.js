function profilCtrl(angularbeanUserInsc, $scope , $cookies){
	console.log("im in profile ctrl thank you !! ");
	var isUser = $cookies.get('email');
	console.log("this is cookies empty : "+ isUser);
	if(isUser == null || isUser == ""){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	$scope.emailuser = $cookies.get('email');
	$scope.adruser=$cookies.get('adress');
	$scope.numuser=$cookies.get('numtel');
	
	
	
}