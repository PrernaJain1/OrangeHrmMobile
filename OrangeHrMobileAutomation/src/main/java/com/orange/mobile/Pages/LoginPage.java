package com.orange.mobile.Pages;

import com.orange.mobile.Base.BaseClass;
import com.orange.mobile.Utility.UtilClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginPage extends BaseClass {
	UtilClass utilClass;

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/signin_fre_continue_button\"]")
	public WebElement continueAs;

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/button_primary\"]")
	public WebElement yesIn;

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/ack_button\"]")
	public WebElement gotIt;

	@FindBy (xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]")
	public WebElement search;

	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.EditText")
	public WebElement userName;

	@FindBy(xpath = "//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText")
	public WebElement password;

	@FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
	public WebElement loginButton;

	@FindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.chrome:id/positive_button\"]")
	public WebElement okButton;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Dashboard\"]")
	public WebElement dashBoard;

	@FindBy(xpath = "(//android.widget.Image[@text=\"profile picture\"])[1]")
	public WebElement pictureDropdown;

	@FindBy(xpath = "//android.view.MenuItem[@text=\"Logout\"]")
	public WebElement logout;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Login\"]")
	public WebElement loginText;

	@FindBy(xpath = "//android.widget.TextView[@text=\"Forgot your password?\"]")
	public WebElement forgotPassword;

	@FindBy (xpath = "//android.widget.TextView[@text=\"Reset Password\"]")
	public WebElement resetPassword;

	public LoginPage(AndroidDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		utilClass = new UtilClass(driver);
	}

	public void searchBar() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		continueAs.click();
		Thread.sleep(3000);
		yesIn.click();
		gotIt.click();
		search.sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(10000);
	}

	public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		Thread.sleep(3000);
		okButton.click();
	}

	public void logout(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pictureDropdown.click();
		logout.click();
	}

	public void forgotPasswordLink(){
		forgotPassword.click();
	}
}
