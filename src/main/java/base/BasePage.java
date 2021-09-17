package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;

public class BasePage
{

    public static WebDriver driver;

    public static HomePage homePage;

    public static RegisterPage registerPage;

    public static LoginPage loginPage;


    @Before
    public static void setUp()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        registerPage =  new RegisterPage(driver);
        loginPage = new LoginPage(driver);
    }



    @After
    public static void tearDown()
    {
        driver.quit();
    }


    public static void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public static String getPageTitle()
    {
        return driver.getTitle();
    }


}

