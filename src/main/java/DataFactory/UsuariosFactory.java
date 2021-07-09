package DataFactory;

import java.util.Properties;

import Pojos.Usuario;
import core.FileProperties;

public class UsuariosFactory {
	
	static Properties prop = FileProperties.getProp("Usuarios.properties");
		
	public static Usuario inserirUsuarioValido() {
		Usuario usu = new Usuario();
		usu.setNome(prop.getProperty("nome"));
		usu.setUltimoNome(prop.getProperty("ultimoNome"));
		usu.setEmail(prop.getProperty("email"));
		usu.setEndereco(prop.getProperty("endereco"));
		usu.setUniversidade(prop.getProperty("universidade"));
		usu.setProfissao(prop.getProperty("profissao"));
		usu.setGenero(prop.getProperty("genero"));
		usu.setIdade(prop.getProperty("idade"));
		return usu;
		
	}

}
