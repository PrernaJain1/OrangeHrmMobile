package com.mobile.orange.Testcases;

import com.orange.mobile.Base.BaseClass;
import com.orange.mobile.Pages.LoginPage;
import com.orange.mobile.Pages.PimPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class PimTestCase extends BaseClass {

    @Test(description = "Verify navigation to PIM module")
    public void navigationPimModule() throws InterruptedException, IOException {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.searchBar();
        loginPage.login();
        Thread.sleep(5000);
        assertEquals(loginPage.dashBoard.getText(),"Dashboard");
        PimPage pimPage = new PimPage(driver);
        pimPage.navigationPim();
        assertEquals(pimPage.pimDisplay.getText(),"PIM");

    }

    @Test( description = "Add a new employee with valid details")
    public void addNewEmployee() throws InterruptedException, IOException {
        setUp();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.searchBar();
        loginPage.login();
        Thread.sleep(5000);
        assertEquals(loginPage.dashBoard.getText(),"Dashboard");
        PimPage pimPage = new PimPage(driver);
        pimPage.addEmployee();



    }

    @Test(description = "Search for an existing employee")
    public void searchExistingEmployee() throws InterruptedException, IOException {
        setUp();


    }



//    @Test(enabled = true, description = "Try to add employee by clicking on add button in employee list",priority = 10)
    public void addEmployeeClickButton() throws InterruptedException, IOException {
        setUp();


    }

//    @Test(enabled = true, description = "Try to delete an employee by clicking on delete button in employee list",priority = 10)
    public void deleteEmployeeClickButton() throws InterruptedException, IOException {
        setUp();


    }

//    @Test(enabled = true, description = "Employee should not be deleted  by clicking on cancel button in employee list",priority = 10)
    public void employeeNotDeleteOnCancel() throws InterruptedException, IOException {
        setUp();


    }

    //    @Test(enabled = true, description = "Add a new employee with missing details",priority = 9)
//    public void addNewEmployeeMissingDetails() throws InterruptedException, IOException {
//        setUp();
//    }
}
