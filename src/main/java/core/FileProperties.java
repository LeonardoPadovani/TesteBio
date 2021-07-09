package core;


import java.io.FileInputStream;
import java.util.Properties;

public class FileProperties {
	
		
	public static Properties getProp(String arquivo)  {
		Properties props = new Properties();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/DateProperties/" + arquivo);
			props.load(file);
		}catch(Exception ex) {
			System.out.println("erro ao carregar o arquivo: " + arquivo + " - "  + ex.getMessage());	
		}
		
		return props;

	}
	
	
	
}