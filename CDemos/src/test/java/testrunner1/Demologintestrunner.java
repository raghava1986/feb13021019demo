package testrunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\training_H1b.06.15\\Selenium\\CDemos\\src\\test\\java\\featurefolder1"
,glue= {"stepdefination"}
,plugin= {"pretty","json.target/cucumber-reports/Cucumber.json"},
monochrome=true)
public class Testrunner {

}
