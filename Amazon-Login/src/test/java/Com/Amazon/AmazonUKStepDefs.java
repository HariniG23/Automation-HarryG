package Com.Amazon;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;
public class AmazonUKStepDefs extends DriverManager {


    @Given("^I'm in homepage$")
    public void i_m_in_homepage() throws Throwable {


    }

    @When("^I clicks on login button$")
    public void i_clicks_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();

    }

    @When("^I enters data with name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enters_data_with_name_and(String Username, String Password) throws Throwable {
        driver.findElement(By.id("ap_email")).sendKeys(Username);
        driver.findElement(By.id("ap_password")).sendKeys(Password);
        driver.findElement(By.id("signInSubmit")).click();

    }

    @Then("^user should login successfully$")
    public void user_should_login_successfully()  {

      Boolean LogInCheck = driver.getPageSource().contains("abc12345678");
      assertTrue(LogInCheck);
    }
}
