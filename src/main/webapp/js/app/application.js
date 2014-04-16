'use strict';

angular.module('zenit', []).
	config(['$routteProvider', function($routeProvider) {
	$routeProvider.
		when('/users', {templateUrl:'views/users.html', controller:userListController}).
		otherwise({redirectTo:'/users'});
}]);
angular.module('zenit', []).controller('MyController',
		[ '$scope', function($scope) {
			$scope.username = 'World';
		} ]);

angular.element(document).ready(function() {
	angular.bootstrap(document, [ 'zenit' ]);
});
