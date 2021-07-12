package Tests;

import org.testng.annotations.BeforeMethod;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
	
	
	@BeforeMethod
	public void goToHome() {
		Configuration.timeout = 3000;
		Configuration.startMaximized = true;
		open("https://automacaocombatista.herokuapp.com/");
	}
	
	

}
