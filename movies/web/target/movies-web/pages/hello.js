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
.controller('pesquisaIndividual', function($scope, $http) {
    $http.get('http://localhost:8080/movies-web/rest/actor').
        then(function(response) {
            $scope.greeting = response.data;
        });
});

var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $location) {
    $scope.myUrl = $location.absUrl();
});