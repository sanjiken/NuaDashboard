function CtrlCnx(angularbeanUserCnx,$scope,$cookies,$window) {
	
	
	$cookies.put('email',"null");
	$cookies.put('id',"null");
	$cookies.put('userName',"null");
	$cookies.put('numtel',"null");
	$cookies.put('adress',"null");
	$cookies.put('role',"null");
	var vm = this;
	vm.angularbeanUserCnx = angularbeanUserCnx;

	console.log("im in User Connection ctrl thank you !! ");

	

	
	
	$scope.searchUserJs = function(data) {

		if (data.email == null || data.email == undefined || data.email == "") {
			$scope.resUserSearsh == "mail invalid !!!";
		} else if (data.password == null || data.password == undefined
				|| data.password == "") {
			$scope.resUserSearsh == "password null !!!";
		} else {
			vm.angularbeanUserCnx.userSearsh(data).then(function(resUserSearsh) {
				console.log("RES userSearsh : "+ resUserSearsh);
						
			
						$scope.resUserSearsh = resUserSearsh;

						if ($scope.resUserSearsh == "Succes") {
							// get user information
							console.log("im in succes");
							vm.angularbeanUserCnx.getUserConnected(data).then(function(userConnected) {
										console.dir(userConnected);
										
								
										$scope.findUser = userConnected;
										
										console.dir($scope.findUser);
										console.log("ooo" + $scope.findUser.isActivate);
										
										$cookies.put('email',$scope.findUser.email);
										$cookies.put('id',$scope.findUser.id);
										$cookies.put('userName',$scope.findUser.userName);
										$cookies.put('numtel',$scope.findUser.numtel);
										$cookies.put('adress',$scope.findUser.adress);
										$cookies.put('role',$scope.findUser.role);
										
										if($scope.findUser.isActivate == true && $scope.findUser.isDeleted == false)
										{
										$window.location.href ="index.html";
										}else{
									     console.log(" ne pas encore ajouter aux membres ");
									     
										}
										
							});
							
						
							
						}

					})
		}

	}

}
