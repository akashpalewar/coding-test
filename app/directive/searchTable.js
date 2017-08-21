var app = angular.module('myApp.directives', []);
app.directive('myDialog', ['$filter', function($filter) {
  return {
    restrict: 'E',
    templateUrl: 'directive/searchTable.html',
    transclude: true,
    scope: {
      items:"=",
      search:"=filter"
    },link: function(scope, element, attrs){
      scope.copyItem = {};
      scope.editing = false;
      scope.deleteItem = function($index){
        scope.items.splice($index, 1);
        scope.$parent.$parent.counter--;
      };
      scope.editItem =function(item){
        scope.editing = scope.items.indexOf(item);
        scope.copyItem = angular.copy(item);
      };
      scope.cancelEdit = function(index) {
        if (scope.editing !== false) {
            scope.items[scope.editing] = scope.copyItem;
            scope.editing = false;
        }       
      };
      scope.saveItem = function(index) {
        if (scope.editing !== false) {
            scope.items[scope.editing] = scope.copyItem;
            scope.editing = false;
        }       
    };
    }
}

}]);