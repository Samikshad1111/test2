package Stepd;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"Stepd"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReport/report.json","html:target/cucumber-report.html"},
tags="@regression"
//"@smoke"
//"@sanity"
//"@regression
//pom
//Devloper
//Corporate
//Enterprise
)
public class TESTRUNNER {

}
