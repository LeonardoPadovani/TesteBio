package Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import com.codeborne.selenide.Condition;

import DataFactory.UsuariosFactory;
import Pages.HomePage;
import Pages.UsuariosPage;
import Pojos.Usuario;

public class UsuarioTests extends BaseTest{
	
	private Usuario usuario = new Usuario();
	private HomePage home = new HomePage();
	private UsuariosPage usuariosPage = new UsuariosPage();

	
	@Test
	public void tesInserirUsuario() {
		usuario = UsuariosFactory.inserirUsuarioValido();
		home.clicarBtnComecarAutomacaoWeb();
		home.clicarMenuFormulario();
		home.clicarSubMenuCriarUsuarios();
		usuariosPage.inserirNovoUsuario(usuario);
		String msg = usuariosPage.getMsgIncluidoSucesso(); 
		assertEquals(msg, "Usuário Criado com sucesso");
		
		home.clicarMenuFormulario();
		home.clicarSubMenuListaUsuarios();
		usuariosPage.itens().findBy(Condition.text(usuario.getNome())).shouldBe(Condition.visible);
		usuariosPage.consultarUsuario(usuario.getEmail());
		
		String nome = usuariosPage.GetNome();
		String ultimoNome = usuariosPage.GetUltimoNome();
		
		assertEquals(nome, "Nome: " + usuario.getNome());
		assertEquals(ultimoNome, "Ultimo Nome: " + usuario.getUltimoNome());
		
	}
	

}
