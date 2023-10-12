package check_Box_tests;

import browser.Browser;
import main_pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.elements.ElementsPage;

public class Check_Box_Test {
    private WebDriver driver;
    private MainPage mainPage;

    @BeforeClass
    public void beforeClass(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        //mainPage.openStartPage();
    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
    @Test
    public void step_01(){
        mainPage.openUrl("https://demoqa.com/checkbox");
        mainPage.setCheckBox("Home", true);
        Assert.assertTrue(mainPage.getCheckBoxState("Home"));

    }
}
