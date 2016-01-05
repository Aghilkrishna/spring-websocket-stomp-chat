(function() {

	var app = angular.module('restAPITest', [ 'ngResource' ]);

	app.factory("AllBook", function($resource) {
		return $resource("/books/getAllBook/");
	});

	app.factory("SingleBook", function($resource) {
		return $resource("/books/getBookById/:id");
	});

	app.controller("showAllBooksCtrl", function($scope, AllBook) {
		AllBook.query(function(data) {
			$scope.books = data;
		});
	});

	app.controller("showSingleBookCtrl", function($scope, SingleBook, $window) {
		$scope.canShowBk = false;
		
		$scope.submit = function(bkId) {
	        SingleBook.get({id : bkId}, function(data) {
				$scope.book = data;
				$scope.canShowBk = true;
			});
	      };
	});

})();