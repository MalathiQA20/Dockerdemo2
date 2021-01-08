package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSelectionPage {
	private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(xpath = "//a[contains(.,'Women')]")
    private WebElement productheaderElement;
    
    @FindBy(linkText = "T-shirts")
    private WebElement categoryElement;
    
    @FindBy(linkText = "Add to cart")
    private WebElement cartButtonElement;
    
    @FindBy(xpath = "//a[contains(.,'Proceed to checkout')]")
    private WebElement proceedToCheckout;
    
    public ProductSelectionPage(WebDriver driver) {
    	this.driver = driver;
    	this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    
    public void orderProduct() {
    	this.wait.until(ExpectedConditions.visibilityOf(this.productheaderElement));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(this.productheaderElement).perform();
    	this.categoryElement.click();
    	
    	//actions.moveToElement(this.categoryElement).click().build().perform();
    	//this.categoryElement.click();
    	this.wait.until(ExpectedConditions.visibilityOf(this.cartButtonElement));
    	actions.moveToElement(this.cartButtonElement).click().build().perform();
    	this.wait.until(ExpectedConditions.visibilityOf(this.proceedToCheckout));
    	this.proceedToCheckout.click();
    	this.wait.until(ExpectedConditions.visibilityOf(this.proceedToCheckout));
    	this.proceedToCheckout.click();
    	
    	
    }

} 
