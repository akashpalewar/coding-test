## Getting Started

To get you started you can simply clone the `coding-test` repository and install the dependencies:

### Prerequisites

You need git to clone the `coding-test` repository. 


### Clone `coding-test`

Clone the `coding-test` repository using git:

```
git clone https://github.com/crackthehack/coding-test.git
cd coding-test
```
### Install Dependencies

We have two kinds of dependencies in this project: tools and Angular framework code. The tools help
us manage and test the application.

* We get the tools we depend upon via `npm`, the [Node package manager][npm].
* We get the Angular code via `bower`, a [client-side code package manager][bower].
* In order to run the end-to-end tests, you will also need to have the
  [Java Development Kit (JDK)][jdk] installed on your machine. Check out the section on
  [end-to-end testing](#e2e-testing) for more info.

We have preconfigured `npm` to automatically run `bower` so we can simply do:

```
npm install
```

Behind the scenes this will also call `bower install`. After that, you should find out that you have
two new folders in your project.

* `node_modules` - contains the npm packages for the tools we need
* `app/bower_components` - contains the Angular framework files

*Note that the `bower_components` folder would normally be installed in the root folder but
`angular-seed` changes this location through the `.bowerrc` file. Putting it in the `app` folder
makes it easier to serve the files by a web server.*

*********************************************
for some reason it is creating bower_components out side of app folder.
Please cut copy and paste bower_components from out side of app folder into app folder
*********************************************

### Run the Application

We have preconfigured the project with a simple development web server. The simplest way to start
this server is:

```
npm start
```

Now browse to the app at http://localhost:8000/#!/home


## Directory Layout

```
app/                    --> all of the source files for the application
  app.css               --> default stylesheet
  components/           --> all app specific modules
    version/              --> version related components
      version.js                 --> version module declaration and basic "version" value service
      version_test.js            --> "version" value service tests
      version-directive.js       --> custom directive that returns the current app version
      version-directive_test.js  --> version directive tests
      interpolate-filter.js      --> custom interpolation filter
      interpolate-filter_test.js --> interpolate filter tests
  home/                --> the view1 view template and logic
    home.html            --> the home page template for teh app
    home.js              --> the controller logic
    home_test.js         --> tests of the controller
  directive/                --> the directves view template and logic
    addSomething.html        --> add new item template
    addItem.js              --> the js logic foor adding new item
    modlaDialog.hmtl       --> genric template for simple modal. Not using UI bootstrap to avoid complexity
    modalDialog.js         --> js logic for pop modal
    serachTable.html      --> display list of items
    searchTable.js       --> logic for diaplying items in a table. Its also has methods for inline edit, delete
  app.js                --> main application module
  index.html            --> app layout file (the main html template file of the app)
  index-async.html      --> just like index.html, but loads js files asynchronously
karma.conf.js         --> config file for running unit tests with Karma
e2e-tests/            --> end-to-end tests
  protractor-conf.js    --> Protractor config file
  scenarios.js          --> end-to-end scenarios to be run by Protractor
```



