function SommaireCtrl(angularbeanSommaire,$scope,$cookies,$window) {

	var isUser = $cookies.get('email');
	var isSA=$cookies.get('isSA');
	var role=$cookies.get('role');
	if(isUser == null || isUser == "" || isUser == "null" || isUser == undefined || isUser == "undefined"){
		console.log("im not logged ");
		$window.location.href ="pages-login.html";
	
	}
	
	
	var vm =this;
	vm.angularbeanSommaire=angularbeanSommaire;
	console.log("im in controlleur de page sommaire");
	
	
	 vm.angularbeanSommaire.searchbeanProjet().then(function (searchProjet){
		 $scope.searchProjet = searchProjet;
		 console.log(searchProjet);
	

	     });
	
	
	
	
}