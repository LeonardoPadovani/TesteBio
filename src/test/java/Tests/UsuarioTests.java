package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

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
	}
	

}
