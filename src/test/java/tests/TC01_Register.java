package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_RegisterPage;

public class TC01_Register extends TestBase {


    @Test(priority = 1)
    public void verifyHomePageIsVisible() {
        // Assert that the logo element is displayed
        Assert.assertTrue(registerPage.getLogo().isDisplayed(), "Home page is not visible. Logo element not found.");
    }
    @Test(priority = 2)
    public void navigateToRegisterLink(){
        registerPage.signUp();
        Assert.assertTrue(registerPage.getNewUserSignUp().isDisplayed(), "Register page is not visible. Form title element not found.");
    }

    @Test(priority = 3)
    public void signUpWithValidData(){
        registerPage.enterName("Shrouk");
        registerPage.enterEmail("Test1996@test.com");
        registerPage.ClickOnSignUpBtn();
        Assert.assertEquals(registerPage.TextAccountInformation(), "ENTER ACCOUNT INFORMATION");
    }
    @Test(priority = 4)
    public void fillOutRegistrationForm(){
        registerPage.FillOutRegistrationForm();
        registerPage.createAcc();
        Assert.assertEquals(registerPage.TextAccountCreatedOrDeleted(), "ACCOUNT CREATED!");

    }
    @Test(priority = 5)
    public void navigateToUserPage(){
        registerPage.continueBtn();
        Assert.assertTrue(registerPage.TextLoggedIn().contains("Logged in as"));
    }
    @Test(priority = 6)
    public void DeleteAccount(){
        registerPage.deleteAcc();
        Assert.assertEquals(registerPage.TextAccountCreatedOrDeleted(), "ACCOUNT DELETED!");
        registerPage.continueBtn();

    }


}
