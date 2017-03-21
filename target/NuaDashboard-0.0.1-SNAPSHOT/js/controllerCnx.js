function CtrlCnx(angularbeanUserCnx, $scope) {

	var vm = this;
	vm.angularbeanUserCnx = angularbeanUserCnx;

	$scope.searchUserJs = function(data) {

		if (data.email == null || data.email == undefined || data.email == "") {
			$scope.resUserSearsh == "mail invalid !!!";
		} else if (data.password == null || data.password == undefined
				|| data.password == "") {
			$scope.resUserSearsh == "password null !!!";
		} else {
			vm.angularbeanUserCnx.userSearsh(data).then(
					function(resUserSearsh) {
						$scope.resUserSearsh = resUserSearsh;

						if ($scope.resUserSearsh == "succes") {
							// get user information
							vm.angularbeanUserCnx.getUserConnected(data).then(
									function(userConnected) {

										$scope.findUser = userConnected;

									});

						}

					})
		}

	}

}
