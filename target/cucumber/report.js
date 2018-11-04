$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/homeScreen.feature");
formatter.feature({
  "line": 1,
  "name": "Click events functionality in ApiDemos app home screen",
  "description": "",
  "id": "click-events-functionality-in-apidemos-app-home-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 42849983022,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Dependencies is clickable",
  "description": "",
  "id": "click-events-functionality-in-apidemos-app-home-screen;dependencies-is-clickable",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Dependencies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is taken to the dependencies screen",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage_StepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 119301625,
  "status": "passed"
});
formatter.match({
  "location": "homePage_StepDef.click_on_dependencies()"
});
formatter.result({
  "duration": 522327786,
  "status": "passed"
});
formatter.match({
  "location": "homePage_StepDef.user_is_taken_to_the_dependencies_screen()"
});
formatter.result({
  "duration": 387881,
  "status": "passed"
});
formatter.after({
  "duration": 3551350915,
  "status": "passed"
});
formatter.uri("src/test/java/features/homeScreen_2.feature");
formatter.feature({
  "line": 1,
  "name": "Click events functionality in ApiDemos app home screen- Views",
  "description": "",
  "id": "click-events-functionality-in-apidemos-app-home-screen--views",
  "keyword": "Feature"
});
formatter.before({
  "duration": 35379355116,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Views is clickable",
  "description": "",
  "id": "click-events-functionality-in-apidemos-app-home-screen--views;views-is-clickable",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click on Views",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User is taken to the Views screen",
  "keyword": "Then "
});
formatter.match({
  "location": "homePage_StepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 450319,
  "status": "passed"
});
formatter.match({
  "location": "homePage_StepDef.click_on_views()"
});
formatter.result({
  "duration": 421104782,
  "status": "passed"
});
formatter.match({
  "location": "homePage_StepDef.user_is_taken_to_the_views_screen()"
});
formatter.result({
  "duration": 298502,
  "status": "passed"
});
formatter.after({
  "duration": 3625162188,
  "status": "passed"
});
});