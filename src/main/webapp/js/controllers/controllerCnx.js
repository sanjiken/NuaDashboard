function CtrlCnx(angularbeanUserCnx,$scope,$cookies,$window) {

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

								
										var findUser = userConnected;
										console.log("im in getUserConnected");
										
										console.log("im in succes after getUserConnected");
										$cookies.put('email',findUser.email);
										$cookies.put('id',findUser.id);
										$cookies.put('id',findUser.userName);
										
											});
							
							
							$window.location.href ="index.html";
							
						}

					})
		}

	}

}
