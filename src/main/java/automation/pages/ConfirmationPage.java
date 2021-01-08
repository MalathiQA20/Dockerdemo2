package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {
	
	private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(xpath = "//p[@class='info-account']")
    private WebElement confirmationMessage;
	
	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
		this.wait=new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
	}
	
	public String confirmationText() {
		this.wait.until(ExpectedConditions.visibilityOf(this.confirmationMessage));
		System.out.println(confirmationMessage.getText());
		return confirmationMessage.getText();
	}

}
