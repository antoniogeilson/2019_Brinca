package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AnunciePage;
import page.AssocieSePage;
import page.EventosPage;
import page.FaleConoscoPage;
import page.HomePage;
import page.SejaVoluntarioPage;
import page.UtilidadesPage;
import page.QuemSomosPage;

public class BrincaSteps {

	private WebDriver driver;
	private String url = "https://2019-brinca.glacial.now.sh";
	
	private HomePage homePage;
	private AnunciePage anunciePage;
	private AssocieSePage associeSePage;
	private FaleConoscoPage faleConoscoPage;
	private SejaVoluntarioPage sejaVoluntarioPage;
	private UtilidadesPage utilidadesPage;
	private QuemSomosPage quemSomosPage;
	private EventosPage eventosPage;

	@Before
	public void Initialize() {
		
		driver = new ChromeDriver();
		driver.get(url);
	
		homePage = new HomePage(driver);
		anunciePage = new AnunciePage(driver);
		associeSePage = new AssocieSePage(driver);
		faleConoscoPage = new FaleConoscoPage(driver);
		sejaVoluntarioPage = new SejaVoluntarioPage(driver);
		utilidadesPage = new UtilidadesPage(driver);
		quemSomosPage = new QuemSomosPage(driver);
		eventosPage = new EventosPage(driver);
		
	}

	@After
	public void Finalize() {
		driver.quit();	
	}
	
	@Given("^I am on brinca Website$")
	public void iAmOnBrincaWebsite() throws Throwable {
		driver.navigate().to(url+"/");
	}

	@When("^I check header content$")
	public void iCheckHeaderContent() throws Throwable {
		homePage.checkHomePage();
	}

	@Then("^I can see header content$")
	public void iCanSeeHeaderContent() throws Throwable {
		homePage.checkHeaderContent();
	}
		
	@When("^I click on quem somos nos$")
	public void iClickOnQuemSomosNos() throws Throwable {
		driver.navigate().to(url+"/quem-somos");
	}

	@Then("^I can see quem somos page$")
	public void iCanSeeQuemSomosPage() throws Throwable {
	    quemSomosPage.quemSomosContent();
	}
	
	@When("^I click on eventos$")
	public void iClickOnEventos() throws Throwable {
		driver.navigate().to(url+"/eventos");
	}

	@Then("^I can see eventos page$")
	public void iCanSeeEventosPage() throws Throwable {
		eventosPage.eventosContent();
	}

	
	
	
}
