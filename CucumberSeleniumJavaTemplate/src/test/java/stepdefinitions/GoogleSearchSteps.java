package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import utils.DriverFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoogleSearchSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("I open the Google homepage")
    public void i_open_google_homepage() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(query);
        searchBox.submit();
    }

    @Then("the page title should start with {string}")
    public void the_page_title_should_start_with(String titleStart) {
        assertTrue(driver.getTitle().startsWith(titleStart));
        driver.quit();
    }
}