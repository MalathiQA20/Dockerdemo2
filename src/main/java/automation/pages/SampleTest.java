package automation.pages;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\malat\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(.,'Women')]"))));
		Actions actions = new Actions(driver);
    	actions.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Women')]"))).build().perform();
    	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("T-shirts"))));
    	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	//actions.click(driver.findElement(By.linkText("T-shirts"))).build().perform();
    	driver.findElement(By.linkText("T-shirts")).click();
		/*driver.findElement(By.linkText("Sign in")).click();;
		driver.findElement(By.id("email_create")).sendKeys("georgiafrank@yahoo.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//int count = driver.findElements(By.xpath("//input[type='radio']")).size();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("id_gender1"))));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String genderString = driver.findElement(By.id("id_gender1")).getText();
		List<WebElement> radiobuttons = driver.findElements(By.name("id_gender"));
	
		int count = radiobuttons.size();
		System.out.println(genderString);
		System.out.println(count);
		for(WebElement radioButton:radiobuttons) {
			System.out.println(radioButton.getText());
			if(radioButton.getAttribute("value").equals("2")) {
				radioButton.click();
			}
		}
		driver.findElement(By.id("customer_firstname")).sendKeys("Tom");
		//Select valueSelect = new Select(driver.findElement(By.id("days")));
    	//valueSelect.selectByValue("12");
    	
    	Select valueSelect1 = new Select(driver.findElement(By.id("months")));
    	valueSelect1.getOptions().stream().forEach(option->System.out.println(option));
    	//valueSelect1.getOptions().stream().anyMatch(option->option.getAttribute("value").matches("March"));
    	//valueSelect1.getOptions().stream().filter(option->option.getAttribute("value").matches("1987")).forEach(option->option.click());
    	/*List<WebElement> dropDownElements = valueSelect1.getOptions();
    	//System.out.println(dropDownElements);
    	for (WebElement ele:dropDownElements) {
    		if(ele.getText().contains("March")) {
    			String valueString = ele.getAttribute("value");
    			valueSelect1.selectByValue(valueString);
    		}
    	}*/
    	//valueSelect1.selectByVisibleText("March");*/
        //driver.close();
	}

}
