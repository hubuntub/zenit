'use strict';

var zenitApp = angular.module('zenitApp', [ ngRoute ]);
zenitApp.controller('mainController', function($scope) {
	$scope.message = 'Welcome to Zenit';
	console.log("mainController");
});
zenitApp.controller('userController', function($scope) {
	$scope.users = [{
		User :{
			username: 'Houbeb',
			lastname: 'benothmene',
			dateOfBirth: 26/08/86 
		}, 
		User :{
			username: 'Nature',
			lastname: 'Demeester',
			dateOfBirth: 27/07/84 
		}
	}]
});
zenitApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/users', {
		templateUrl : 'views/users.html',
		controller : UserController
	});
} ]);
function UserController($scope, User) {
	$scope.message = "users";
}
angular.element(document).ready(function() {
	angular.bootstrap(document, [ 'zenitApp' ]);
});
