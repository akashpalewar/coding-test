var app = angular.module('myApp.ser.directives', []);
app.directive('addSomething', function($filter) {
  return {
    restrict: 'E',
    templateUrl: 'directive/addSomething.html',
    transclude: true,
    link: function(scope, element, attrs){
       scope.AddNew = function(){
        var count =scope.$parent.$parent.counter;
        scope.names.push( {'id':count++, 'name':scope.name,'description':scope.description} );
        scope.name="";
        scope.description="";
        scope.$parent.show = false;
        scope.$parent.$parent.counter++;
      };
       scope.cancel = function(){
         scope.$parent.show = false;
      };
    }
}

});