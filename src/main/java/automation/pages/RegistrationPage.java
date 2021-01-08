package automation.pages;


import java.util.List;
import java.util.stream.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(linkText ="Sign in")
    private WebElement signInButton;
    
    @FindBy(id = "email_create")
    private WebElement emailElement;
    
    @FindBy(id ="SubmitCreate")
    private WebElement emailSubmitElement;
    
    @FindBy(id ="id_gender")
    private List<WebElement> gender;
    
    @FindBy(id ="customer_firstname")
    private WebElement firstName;
    
    @FindBy(id ="customer_lastname")
    private WebElement lastName;
         
    @FindBy(id ="passwd")
    private WebElement password;
    
    @FindBy(id ="days")
    private WebElement daysElement;
    
    @FindBy(id ="months")
    private WebElement monthElement;
    
    @FindBy(id ="years")
    private WebElement yearElement;
    
    @FindBy(id ="address1")
    private WebElement addressElement;
    
    @FindBy(id ="city")
    private WebElement cityElement;
    
    @FindBy(id ="id_state")
    private WebElement stateElement;
    
    @FindBy(id ="postcode")
    private WebElement postalCodeElement;
    
    @FindBy(id ="id_country")
    private WebElement country;
    
    @FindBy(id ="phone_mobile")
    private WebElement mPhoneElement;
    
    @FindBy(id ="submitAccount")
    private WebElement submit;
    
    public RegistrationPage(WebDriver driver) {
    	this.driver = driver;
    	this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    	
    }
    public void goTo()
    {
        this.driver.get("http://automationpractice.com/index.php");
        this.wait.until(ExpectedConditions.visibilityOf(this.signInButton));
    }
    
    public void registerNewUser(String emailAddress) {
    	this.signInButton.click();
    	this.wait.until(ExpectedConditions.visibilityOf(this.emailElement));
    	this.emailElement.sendKeys(emailAddress);
    	this.emailSubmitElement.click();
    }
    
    public void newUserInformation(String genderOption,String fname,String lname,String pwd,String day,String month,String year ) {
    	this.wait.until(ExpectedConditions.visibilityOf(this.firstName));
    	selectRadioButton(genderOption);
    	this.firstName.sendKeys(fname);
    	this.lastName.sendKeys(lname);
    	this.password.sendKeys(pwd);
    	selectDropDownList(day, this.daysElement);
    	selectDropDownList(month, this.monthElement);
    	selectDropDownList(year, this.yearElement);
       
    }
    
    public void addressDetails(String address,String city,String state,String postalCode,String countryString,String phoneNumber) {
    	this.addressElement.sendKeys(address);
    	this.cityElement.sendKeys(city);
    	selectDropDownList(state, this.stateElement);
    	this.postalCodeElement.sendKeys(postalCode);
    	selectDropDownList(countryString, this.country);
    	this.mPhoneElement.sendKeys(phoneNumber);
    	this.submit.click();
    	
    }
    
    public void selectRadioButton(String Option) {
    	for(WebElement radioButton:this.gender) {
			if(radioButton.getAttribute("value").equals(Option)) {
				radioButton.click();
			}
		}
    	   	
    }
    public void selectDropDownList(String text,WebElement element) {
    	Select valueSelect = new Select(element);
    	//valueSelect.getOptions().stream().anyMatch(option->option.getText().equals(text));
    	List<WebElement> dropDownElements = valueSelect.getOptions();
    	//dropDownElements.stream().filter(option->option.getAttribute("value").matches(text)).forEach(option->option.click());
    	for (WebElement ele:dropDownElements) {
    		if(ele.getText().contains(text)) {
    			String valueString = ele.getAttribute("value");
    			valueSelect.selectByValue(valueString);
    		}
    	}
    	
    }
    

}
