package org.home;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/"

        },
        glue = {
                "org.home.steps"
        },
        tags = "@e2e_success"
)
public class AppTest {

}
