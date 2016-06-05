'use strict';

/**
 * @ngdoc overview
 * @name keepGoing
 * @description
 * # keepGoingApp
 *
 * Main module of the application.
 */
angular
  .module('keepGoingApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .otherwise({
        redirectTo: '/'
      });
  });

$(document).ready(function () {
  $('.nav-option').on('click', function () {
    $('.nav-option').removeClass('active');
    $(this).addClass('active');
  })
});
