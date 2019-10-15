package actions;

import java.io.Writer;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

	private WebDriver driver;

	public Actions(WebDriver driver) {
		this.driver = driver;
	}
	
	//Find Element By CSS Selector
	public WebElement FindByCssSelector(String element)
	{
		By css = By.cssSelector(element);
		WebElement cssElement = driver.findElement(css);	
			return cssElement;
	}
	
	//Find Element By Id
	public WebElement findById(String idElement) {

		WebElement element = driver.findElement(By.id(idElement));
			return element;
	}

	//Find Element By Name
	public WebElement findByName(String nameElement) {

		WebElement element = driver.findElement(By.name(nameElement));
			return element;
	}

	//Find Element By Class
	public WebElement findByClass(String className) {

		WebElement element = driver.findElement(By.className(className));
			return element;
	}
	
	//Find Element By Xpath
	public WebElement FindByXpath(String xpathValue)
	{
		WebElement element = driver.findElement(By.xpath(xpathValue));
			return element;
	}
	
	//Assert that compare expected text value x element text value
	public void AssertTextValue(String expectedTextValue, WebElement element) {
		Assert.assertEquals(expectedTextValue, element.getText());
	}
	
	//Assert element is visible
	// Return true or false
	public boolean AssertElementIsVisible(WebElement element) {
		if (element.isDisplayed())
			return true;
		else
			Exception("Element Not Found");
			return false;
	}
	

	private void Exception(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
