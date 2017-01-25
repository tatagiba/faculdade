/**
 * 
 */
angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/movies-web/rest/actor').
        then(function(response) {
            $scope.greeting = response.data;
        });
});
angular.module('pesquisa', [])
.controller('pesquisaIndividual', function($scope, $http, $location) {
    $http.get('http://localhost:8080/movies-web/rest/actor').
        then(function(response) {
        	
            $scope.greeting = response.data;
        });
});

angular.module('myApp', [])
.controller('customersCtrl', function($scope, $location) {
    $scope.myUrl = $location;
});