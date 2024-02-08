package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_RegisterPage extends PageBase {

    public P01_RegisterPage(WebDriver driver){
        super(driver);
    }

    private final By logo = By.cssSelector("[class=\"logo pull-left\"]");
    public WebElement getLogo(){
        return driver.findElement(logo);
    }

    private final By signup = By.cssSelector("a[href=\"/login\"]");
        public void signUp(){
         driver.findElement(signup).click();
    }

    private final By newUserSignUp = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2");
        public WebElement getNewUserSignUp(){
            return driver.findElement(newUserSignUp);
    }

    private final By nameField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
        public void enterName(String name){
             driver.findElement(nameField).sendKeys(name);
    }

    private final By emailField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
        public void enterEmail(String email){
             driver.findElement(emailField).sendKeys(email);
    }

    private final By signUpBtn = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
    public void ClickOnSignUpBtn(){
        driver.findElement(signUpBtn).click();
    }

    private final By  accountInformation  = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2");
    public String TextAccountInformation(){
        return driver.findElement(accountInformation).getText();
    }
    private final By  male  = By.cssSelector("[for=\"id_gender1\"]");
    private final By  female  = By.cssSelector("[for=\"id_gender2\"]");
    public void genderMale(){
         driver.findElement(male).click();
    }
    public void genderFemale(){
         driver.findElement(female).click();
    }
    private final By  password  = By.id("password");
    public void setPassword(String pass ){
        driver.findElement(password).sendKeys(pass);
    }

    private final By dropdownDays = By.id("days");
    public void selectDay(String day){

        // Create a Select object using the dropdown element
        Select dropdown = new Select(driver.findElement(dropdownDays));
        // Select by value attribute
        dropdown.selectByValue(day);

    }
    private final By dropdownMonth = By.id("months");

    public void selectMonth(String month){

        // Create a Select object using the dropdown element
        Select dropdown = new Select(driver.findElement(dropdownMonth));
        // Select by value attribute
        dropdown.selectByVisibleText(month);

    }
    private final By dropdownYear = By.id("years");

    public void selectYear(String year){

        // Create a Select object using the dropdown element
        Select dropdown = new Select(driver.findElement(dropdownYear));
        // Select by value attribute
        dropdown.selectByVisibleText(year);

    }
    private final By newsletter = By.id("newsletter");
    public void checkNews(){
        driver.findElement(newsletter).click();
    }
    private final By partners = By.id("optin");
    public void checkPartners(){
        driver.findElement(partners).click();
    }

    private final By firstNameField = By.id("first_name");
    public void setFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    private final By lastNameField = By.id("last_name");
    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    private final By companyField = By.id("company");
    public void setCompany(String companyName){
        driver.findElement(companyField).sendKeys(companyName);
    }
    private final By addressField = By.id("address1");
    public void setAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    private final By dropdownCountry = By.id("country");
    public void selectCountry(String country){

        // Create a Select object using the dropdown element
        Select dropdown = new Select(driver.findElement(dropdownCountry));
        // Select by value attribute
        dropdown.selectByVisibleText(country);
    }
    private final By stateField = By.id("state");
    public void setStateField(String state){
        driver.findElement(stateField).sendKeys(state);
    }
    private final By cityField = By.id("city");
    public void setCityField(String city){
        driver.findElement(cityField).sendKeys(city);
    }
    private final By zipCodeField = By.id("zipcode");
    public void setZipCode(String zipcode){
        driver.findElement(zipCodeField).sendKeys(zipcode);
    }
    private final By mobileNumberField = By.id("mobile_number");
    public void setMobileNumber(String mobile){
        driver.findElement(mobileNumberField).sendKeys(mobile);
    }
    private final By createAccBtn = By.cssSelector("[data-qa=\"create-account\"]");
    public void createAcc(){
        driver.findElement(createAccBtn).click();
    }
    public void FillOutRegistrationForm(){
        //genderFemale();
        setPassword("12345679");
        selectDay("31");
        selectMonth("August");
        selectYear("1996");
        checkNews();
        checkPartners();
        setFirstName("Shrouk");
        setLastName("Ali");
        setCompany("Testing");
        setAddress("Giza");
        selectCountry("Canada");
        setStateField("Canada");
        setCityField("Giza");
        setZipCode("1234");
        setMobileNumber("0123456789");
    }

    private final By  accountCreatedText  = By.xpath("//*[@id=\"form\"]/div/div/div/h2");
    public String TextAccountCreatedOrDeleted(){
        return driver.findElement(accountCreatedText).getText();
    }
    private final By continueBtn = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
    public void continueBtn(){
        driver.findElement(continueBtn).click();
    }
    private final By LoggedInText = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]");
    public String TextLoggedIn(){
        return driver.findElement(LoggedInText).getText();
    }
    private final By deleteBtn = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    public void deleteAcc(){
         driver.findElement(deleteBtn).click();
    }


}
