package Pages;

import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.By;


public class HomePage {
	
		
	public void clicarBtnComecarAutomacaoWeb() {
		$(By.xpath("//a[normalize-space()='Começar Automação Web']")).click();
	}
	
	public void clicarMenuFormulario() {
		$(By.linkText("Formulário")).click();
	}
	
	public void clicarSubMenuCriarUsuarios() {
		$(By.linkText("Criar Usuários")).click();
	}
	
	
	

}