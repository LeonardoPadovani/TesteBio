package Pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;


public class HomePage {
	
		
	public void clicarBtnComecarAutomacaoWeb() {
		$(By.xpath("//a[normalize-space()='Come�ar Automa��o Web']")).click();
	}
	
	public void clicarMenuFormulario() {
		$(By.linkText("Formul�rio")).click();
	}
	
	public void clicarSubMenuCriarUsuarios() {
		$(By.linkText("Criar Usu�rios")).click();
	}
	
	
	

}