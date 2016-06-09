'use strict';


/**
 * @ngdoc function
 * @name frontendApp.controller:CreateCtrl
 * @description
 * # CreateCtrl
 * Controller of the frontendApp
 */
angular.module('frontendApp')
  .controller('CreateCtrl', function ($scope) {
    
    dealNavActive('create');

    $scope.submit = function () {
      alert(123);
    }
  });
