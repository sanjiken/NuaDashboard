function indexCtrl($scope,$cookies,$window){
	console.log("im in index ctrl thank you !! ");
	var isUser = $cookies.get('email');
	console.log("this is cookies empty : "+ isUser);
	if(isUser == null || isUser == ""){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	}
	
	
	
	
	
}