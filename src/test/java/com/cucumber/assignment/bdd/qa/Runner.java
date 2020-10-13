package com.cucumber.assignment.bdd.qa;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", dryRun = false, strict=true, tags="@booking",plugin = {"json:target/Ameena.json","pretty"} )
public class Runner
{

}
