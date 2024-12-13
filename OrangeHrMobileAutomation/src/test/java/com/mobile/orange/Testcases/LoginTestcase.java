package com.mobile.orange.Testcases;

import com.orange.mobile.Base.BaseClass;
import com.orange.mobile.Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTestcase extends BaseClass {

    @Test (description = "Verify successful login")
    public void successfulLogin() throws InterruptedException, IOException {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.searchBar();
        loginPage.login();
        Thread.sleep(5000);
        assertEquals(loginPage.dashBoard.getText(),"Dashboard");
        tearDown();
    }

    @Test ( description = "Verify Forgot Password link")
    public void forgotPassword() throws InterruptedException, IOException {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.searchBar();
        loginPage.forgotPasswordLink();
        assertEquals(loginPage.resetPassword.getText(),"Reset Password");
        tearDown();
    }

    @Test(description = "Verify logout functionality")
    public void logoutVerification() throws InterruptedException, IOException {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.searchBar();
        loginPage.login();
        Thread.sleep(5000);
        assertEquals(loginPage.dashBoard.getText(),"Dashboard");
        loginPage.logout();
        Thread.sleep(5000);
        assertEquals(loginPage.loginText.getText(),"Login");
        tearDown();
    }
}
