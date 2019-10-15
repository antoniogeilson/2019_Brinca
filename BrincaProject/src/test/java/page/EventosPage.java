package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Actions;

public class EventosPage {

	private Actions actions;

	public EventosPage(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	private WebElement checkEventosPage() {		
		
		String cssElement = "#__next>main>article>header>h2";
			return actions.FindByCssSelector(cssElement);
	}
	
	
	private WebElement checkPageItems()
	{
		String cssElement = "#__next>main>article>section";
			return actions.FindByCssSelector(cssElement);
	}
	
	public void eventosContent() {
				
		//Check Page Title
		String contentTitle = "Eventos";		
		actions.AssertTextValue(contentTitle, checkEventosPage());
		
		//Check Page Item.
		actions.AssertElementIsVisible(checkPageItems());
		
	}
		
}