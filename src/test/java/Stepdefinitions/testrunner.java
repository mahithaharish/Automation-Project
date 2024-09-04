package Stepdefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(tags= "",features={"src/test/resources/Features/login.feature"},
glue=("Stepdefinitions"),plugin= {})
public class testrunner extends AbstractTestNGCucumberTests{

}
