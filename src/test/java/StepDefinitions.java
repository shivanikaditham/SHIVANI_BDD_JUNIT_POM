import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions
{

    String homePageExpectedTitle = "nopCommerce demo store";
    String homePageActualTitle;
    String registerPageExpectedTitle= "nopCommerce demo store. Register";
    String registerPageActualTitle;
    String loginPageExpectedTitle = "nopCommerce demo store. Login";
    String loginPageActualTitle;
    String Expectederrormsg="Only registered users can vote.";
    String actualerrormsg;
    String ExpectedFirstnameererrorMsg="First name is required.";
    String actualFirstnameExpectedMsg;



    @Given("i navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        BasePage.navigateToUrl(url);
    }

    @Then("i should be navigated to home page")
    public void i_should_be_navigated_to_home_page()
    {
        homePageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
    }

    @When("i click on log in link from the nav bar")
    public void i_click_on_log_in_link_from_the_nav_bar()
    {
        BasePage.homePage.clickLoginLink();
    }

    @Then("i should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
        loginPageActualTitle = BasePage.getPageTitle();
        Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
    }

    @When("i enter email as {string}")
    public void i_enter_email_as(String email)
    {
        BasePage.loginPage.enterEmail(email);
    }

    @When("i enter password as {string}")
    public void i_enter_password_as(String password)
    {
        BasePage.loginPage.enterPassword(password);
    }

    @When("i click on log in button")
    public void i_click_on_log_in_button()
    {
        BasePage.loginPage.clickLogin();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
        BasePage.homePage.verifyLogout();
    }

    @When("i click on register link from the nav bar")
    public void i_click_on_register_link_from_the_nav_bar()
    {
        BasePage.homePage.clickRegisterLink();
    }

    @Then("i should be navigated to register page")
    public void i_should_be_navigated_to_register_page()

        {
            registerPageActualTitle = BasePage.getPageTitle();
            Assertions.assertEquals(registerPageExpectedTitle,registerPageActualTitle);
        }


    @When("i click on community poll and select excellent option")
    public void i_click_on_community_poll_and_select_excellent_option()
    {
        BasePage.homePage.clickonExcellentbutton();
    }

    @Then("the radio button of excellent should be selected")
    public void the_radio_button_of_excellent_should_be_selected()
    {

    }

    @When("i click on Vote button")
    public void i_click_on_vote_button()
    {
        BasePage.homePage.clickonVotebutton();
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed()
    {

        actualerrormsg = BasePage.homePage.capturepollerrormsg();
        Assertions.assertEquals(Expectederrormsg,actualerrormsg);
    }

    @Then("i should be printing error message into console")
    public void i_should_be_printing_error_message_into_console()
    {
        actualerrormsg=BasePage.homePage.pollerrormsg.getText();
    }
    @Then("i go to registration page")
    public void i_go_to_registration_page()
    {
        BasePage.homePage.clickRegisterLink();
    }
    @When("i click on register button")
    public void i_click_on_register_button()
    {
        BasePage.registerPage.clickRegisterButton();
    }

    @Then("i get error messages")
    public void i_get_error_messages() {

        actualFirstnameExpectedMsg=BasePage.registerPage.capturefirstnameErrormsg();
        System.out.println(actualFirstnameExpectedMsg);
        Assertions.assertEquals(actualFirstnameExpectedMsg,ExpectedFirstnameererrorMsg);

    }

    @Then("print all error messages to console")
    public void print_all_error_messages_to_console()
    {
        throw new io.cucumber.java.PendingException();
    }


}

