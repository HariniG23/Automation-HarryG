package Com.Amazon;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@smoke", format = "html:target",dryRun = false)

public class CucumberRunTest  {
}
