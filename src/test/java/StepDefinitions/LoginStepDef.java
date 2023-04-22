package StepDefinitions;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginStepDef {
    private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
    private static String tittle;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://www.saucedemo.com");
    }

    @When("user gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        tittle = loginPage.getLoginPageTittle();
        System.out.println("Tittle is " + tittle);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String expectedTittleName) {
        Assert.assertEquals("Swag Labs",expectedTittleName);
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
       loginPage.enterUsername(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
       loginPage.enterPassword(string);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
       loginPage.clickOnLoginButton();
    }


}
