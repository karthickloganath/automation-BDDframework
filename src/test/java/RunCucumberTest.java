import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
        plugin = { "pretty", "html:target/cucumber-login-html-report", "json:target/cucumber-login-report.json" },
        monochrome = true,
        glue= {"steps"})
public class RunCucumberTest {

}
