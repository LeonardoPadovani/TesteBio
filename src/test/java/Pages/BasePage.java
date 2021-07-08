package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public BasePage(final WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 30);
		PageFactory.initElements(this.driver, this);
	}

	public void esperarElemento(WebElement elemento) {
		this.wait.until((d) -> elemento.isDisplayed());
	}
	
	

}
