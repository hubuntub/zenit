angular.module('zenit', []).controller('MyController',
		[ '$scope', function($scope) {
//			$scope.greetMe = 'World';
		} ]);

angular.element(document).ready(function() {
	angular.bootstrap(document, [ 'zenit' ]);
});