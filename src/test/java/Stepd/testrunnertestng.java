package Stepd;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",glue={"Stepdefinations"},
monochrome = true,
plugin = {"html:target/cucumber.html","json:target/cucumber.json"},
tags="sanity")

//"@regression"
//"@smoke"
//pom
//Devloper
//Corporate
//Enterprise

public class testrunnertestng {

}
