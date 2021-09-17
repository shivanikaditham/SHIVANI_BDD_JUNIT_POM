package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriver driver;

    //locators
    @FindBy(linkText = "Register")
    public WebElement registerLink;


    @FindBy(linkText = "Log in")
    public WebElement logInLink;


    @FindBy(id = "small-searchterms")
    public WebElement searchTextbox;

    @FindBy(className = "search-box-button")
    public WebElement searchButton;

    @FindBy(className = "ico-logout")
    public WebElement logoutLink;

    @FindBy(xpath = "//label[text()=\"Excellent\"]")
    public WebElement excellentOption;

    @FindBy(className = "vote-poll-button")
    public WebElement voteButton;

    @FindBy(id = "block-poll-vote-error-1")
    public WebElement pollerrormsg;



    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }

    //actions
    public void clickRegisterLink()
    {

        registerLink.click();
    }


    public void clickLoginLink()
    {
        logInLink.click();
    }

    public void enterSearchItem(String item)
    {
        searchTextbox.sendKeys(item);
    }


    public void clickSearchButton()
    {
        searchButton.click();
    }


    public void clickLogoutLink()
    {
        logoutLink.click();
    }


    public boolean verifyLogout()
    {
        return  logoutLink.isDisplayed();
    }
    public void clickonExcellentbutton()
    {
        excellentOption.click();
    }
    public void clickonVotebutton()
    {
        voteButton.click();
    }
    public String capturepollerrormsg()
    {
        WebDriverWait wait= new WebDriverWait(driver,50);
        wait.until(ExpectedConditions.visibilityOf(pollerrormsg));
        return pollerrormsg.getText();
    }






}