function indexCtrl($scope,$cookies,$window){
	console.log("im in index ctrl thank you !! ");
	var isUser = $cookies.get('email');
	if(isUser == null || isUser == ""){
		$window.location.href ="http://localhost:8090/NuaDashboard/pages-login.html";
	}
	
	
	
	
	
}