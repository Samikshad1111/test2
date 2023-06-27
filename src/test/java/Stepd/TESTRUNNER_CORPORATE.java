package Stepd;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
				glue={"Stepd"},
				monochrome=true,
				plugin= {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReport/report.json","html:target/cucumber-report.html"},
				tags="  @template"
				//"@sanity"
				//"@Corporate"
				 // @template
				)
public class TESTRUNNER_CORPORATE {

}
