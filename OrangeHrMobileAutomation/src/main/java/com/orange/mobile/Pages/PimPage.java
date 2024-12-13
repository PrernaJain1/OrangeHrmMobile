package com.orange.mobile.Pages;

import com.orange.mobile.Base.BaseClass;
import com.orange.mobile.Utility.UtilClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.time.Duration;

public class PimPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy(xpath = "//android.widget.TextView[@text=\"\uF479\"]")
    public WebElement hamBurgerIcon;

    @FindBy(xpath = "(//android.widget.Image[@text=\"profile picture\"])[2]")
    public WebElement pimModule;

    @FindBy(xpath = "//android.widget.TextView[@text=\"PIM\"]")
    public WebElement pimDisplay;

    @FindBy (xpath = "//android.widget.Button[@text=\"\uF4FE Add\"]")
    public WebElement addButton;

    @FindBy (xpath = "")
    public WebElement firstName;

    @FindBy (xpath = "")
    public WebElement lastName;

    @FindBy (xpath = "")
    public WebElement employeeId;

    @FindBy(xpath = "")
    public WebElement saveButton;

    public PimPage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void navigationPim() throws MalformedURLException, InterruptedException {
        hamBurgerIcon.click();
        pimModule.click();
    }

    public void addEmployee(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        addButton.click();
        firstName.sendKeys("Prerna");
        lastName.sendKeys("Jain");
        employeeId.sendKeys("1234");
        saveButton.click();
    }
}
