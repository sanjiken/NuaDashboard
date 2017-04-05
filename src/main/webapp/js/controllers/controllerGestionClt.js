function gestionclientCtrl (angularbeanclient, $scope, $cookies, $window){
	var isAd = $cookies.get('email');
	if(isAd==null||isAd=='null'|| isAs == ""|| isAs == undefined || isAs == "undefined"){
		console.log("im not logged");
		$window.location.href="gestion_client.html";
	}
	var vm=this;
	vm.angularbeanClient=angularbeanClient;
	$scope.superUser=false;
	var role=$cookies.get('role');
	if (role=="SA"){
		console.log("i am :"+role)
		vm.angularbeanClient.searchbeanClient($cookies.get('id')).then(function (searchClient){
    			 $scope.searchClient = searchClient;
    			 console.log(searchClient);
    			 $scope.superUser= true;
		
    		     });
		
		}
	 $scope.deletClientCtrlJs=function(data){
					 console.log(data)
	         if(data.isdelete==true || data.isdelete==true)
				{
					$scope.response=("notre client n'est pas encore supprimé")
					}
				else{
					vm.angularbeanClient.deletclientBean(data).then(function(msgClientDelet){
						$scope.response=" "+msgClientDelet;
						console.log("im after deletClientbean");
							});
				}
				}
	}
}