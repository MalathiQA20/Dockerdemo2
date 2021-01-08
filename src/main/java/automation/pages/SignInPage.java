package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(linkText ="Sign in")
    private WebElement signInButton;
    
    @FindBy(id = "email")
    private WebElement emailIdElement;
    
    @FindBy(id = "passwd")
    private WebElement paswordElement;
    
    @FindBy(id = "SubmitLogin")
    private WebElement signInElement;
    
    public SignInPage(WebDriver driver) {
    	this.driver = driver;
    	this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    
    public void goTo()
    {
        this.driver.get("http://automationpractice.com/index.php");
        this.wait.until(ExpectedConditions.visibilityOf(this.signInButton));
    }
    
    public void customerSignIn(String email,String pwd) {
    	this.signInButton.click();
    	this.wait.until(ExpectedConditions.visibilityOf(this.emailIdElement));
    	this.emailIdElement.sendKeys(email);
    	this.paswordElement.sendKeys(pwd);
    	this.signInElement.click();
    }

}
