function CtrlInsc(angularbeanUserInsc, $scope, $window) {
	var vm = this;
	vm.angularbeanUserInsc = angularbeanUserInsc;

	console.log("im in Inscription ctrl thank you !! ");
	$scope.addUserCtrlJs = function(data){
		console.log(data);
		console.log("00000")
	    if(data.userName == null || data.userName == undefined || data.userName  == ""){
			$scope.response = "Vous n'avez spécifiez votre user name "
		}else if(data.password == null || data.password == undefined || data.password  == ""){
			$scope.response = "Vous n'avez spécifiez votre password "
		}else if(data.confPassword == null || data.confPassword == undefined || data.confPassword  == ""){
			$scope.response = "Vous n'avez spécifiez votre confirmation  password "
		}else if(data.email == null || data.email == undefined || data.email  == ""){
            $scope.response = "Vous n'avez spécifiez votre email"
		}else {
			vm.angularbeanUserInsc.mailSearsh(data.email).then(function(rescherchmail){
				$scope.rescherchmail = rescherchmail;
				console.log("im in mailSearch");
				if($scope.rescherchmail == "mailNotFound" ){
					console.log("mail not found in base then add user");
				     vm.angularbeanUserInsc.addUserBean(data).then(function(msgUserAdd){
						("this is the response for adding user : " + msgUserAdd);
						$scope.response= " "+msgUserAdd;
					console.log("im after adduserbean");
					
				 //	$window.location.href ="pages-login.html";
				 });
				     
				}else{
					$scope.response = "Vous avez spécifiez un email exist déja"
				}
				
		})
			}


		}
		
}