'use strict';


/**
 * @ngdoc function
 * @name frontendApp.controller:CreateCtrl
 * @description
 * # CreateCtrl
 * Controller of the frontendApp
 */
angular.module('frontendApp')
  .controller('CreateCtrl', function ($scope, $http, $route, $location) {

    dealNavActive('create');

    $scope.submit = function () {
      $('.btn-sub').addClass('disabled');
      $http({
        method: 'POST',
        url: '/create',
        data: "name=" + $scope.projectname
      }).then(function (response) {
          alert("创建成功！");
          $route.reload('/');
        }, function () {
          alert('提交失败，服务器端可能出了一些问题，或者重新试试？');
          $location.path('/')
        });
    }
  });
