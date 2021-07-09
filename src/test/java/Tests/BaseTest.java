package Tests;

import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
	
	
	@BeforeMethod
	public void goToHome() {
		open("https://automacaocombatista.herokuapp.com/");
	}
	
	

}
