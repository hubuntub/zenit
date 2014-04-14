angular.module('zenit', []).controller('MyController',
		[ '$scope', function($scope) {
			$scope.username = 'World';
		} ]);

angular.element(document).ready(function() {
	angular.bootstrap(document, [ 'zenit' ]);
});
