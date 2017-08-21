'use strict';
angular.module('myApp.home', ['ngRoute'])
.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/home', {
    templateUrl: 'home/home.html',
    controller: 'HomeCtrl'
  });
}])
.controller('HomeCtrl', [ '$scope', function($scope) {
	$scope.modalShown = false;
	$scope.search = '';
	$scope.counter=0;
  var count =$scope.counter;
	$scope.names = [{id:count++, name:"Chris", description:"test"}, {id:count++,name:"Calvin",description:"test"}];

	$scope.something = function() {
    	$scope.modalShown = !$scope.modalShown;
  	};
   
   $scope.hideModalCallback = function(dialogID){
   	$scope.modalShown = false;
   };

	
	$scope.search = '';
	$scope.counter=count;
 	
}]);
