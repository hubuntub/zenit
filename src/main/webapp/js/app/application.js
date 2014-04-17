'use strict';

var zenitApp = angular.module('zenitApp', [ 'ngRoute' ]);
// ngRoute is not defined, I don't know where it comes from
// var zenitApp = angular.module('zenitApp', [ ngRoute ]);
zenitApp.controller('mainController', function($scope) {
	$scope.message = 'Welcome to Zenit';
	console.log("mainController");
});
zenitApp.controller('userController', function($scope, User) {
	$scope.name = "Users";
	$scope.users = User.query();
});
// Routes are used with ng-view (maybe we can name it, etc.. but I don't know
// Each provider [.when(..)] define an "anchor uri"
// i.e. '/users' will be in the location bar /#/users
// It is not related to the api or anything
zenitApp.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/test', {
		templateUrl : 'views/test.html',
		controller : TestController
	});
	$routeProvider.when('/another', {
		// Here we use the same html file as view, but you can
		// do pretty much anything you want
		templateUrl : 'views/test.html',
		controller : AnotherController
	});
	// You can a a default one (but doesn't seems to work :P)
	$routeProvider.otherwise('/test');
} ]);
function TestController($scope) {
	$scope.avar = "test";
}
function AnotherController($scope) {
	$scope.avar = "another";
}
/*
// The following is not needed
angular.element(document).ready(function() {
	angular.bootstrap(document, [ 'zenitApp' ]);
});
*/
