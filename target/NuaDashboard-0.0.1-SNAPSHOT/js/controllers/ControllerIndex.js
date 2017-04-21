function indexCtrl($scope,$cookies,$window){
	
	var role=$cookies.get('role');
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	var isSA=$cookies.get('isSA');
	$scope.supAD=isSA;
	
	
		

	
	
}