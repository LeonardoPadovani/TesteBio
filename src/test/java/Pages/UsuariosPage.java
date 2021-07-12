package Pages;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import Pojos.Usuario;
import Tests.BaseTest;

public class UsuariosPage extends BaseTest{
	
		
	public void SetNome(String nome) {
		$("#user_name").sendKeys(nome);
	}
	
	public void SetUltimoNome(String ultimoNome) {
		$("#user_lastname").sendKeys(ultimoNome);
	}
	
	public void SetEmail(String email) {
		$("#user_email").sendKeys(email);
	}
	
	public void SetEndereco(String endereco) {
		$("#user_address").sendKeys(endereco);
	}
	
	public void SetUniversidade(String universidade) {
		$("#user_university").sendKeys(universidade);
	}
	
	public void SetProfissao(String profissao) {
		$("#user_profile").sendKeys(profissao);
	}
	
	public void SetGenero(String genero) {
		$("#user_gender").sendKeys(genero);
	}
	
	public void SetIdade(String idade) {
		$("#user_age").sendKeys(idade);
	}
	
	public String GetNome() {
		return $("body div[class='row'] div[class='row'] p:nth-child(1)").getText();
	}
	
	public String GetUltimoNome() {
		return $("body div[class='row'] div[class='row'] p:nth-child(2)").getText();
	}
	
	public String GetEmail() {
		return $("body div[class='row'] div[class='row'] p:nth-child(3)").getText();
	}
	
	public String GetEndereco() {
		return $("body div[class='row'] div[class='row'] p:nth-child(4)").getText();
	}
	
	public String GetUniversidade() {
		return $("body div[class='row'] div[class='row'] p:nth-child(5)").getText();
	}
	
	public String GetProfissao() {
		return $("body div[class='row'] div[class='row'] p:nth-child(6)").getText();
	}
	
	public String GetGenero() {
		return $("body div[class='row'] div[class='row'] p:nth-child(7)").getText();
	}
	
	public String GetIdade() {
		return $("body div[class='row'] div[class='row'] p:nth-child(8)").getText();
	}
	
	public void clicarBtnCriar() {
		$("input[value='Criar']").click();
	}
	
	public void clicarBtnVoltar() {
		$(By.linkText("Voltar")).click();
	}
	
	public void inserirNovoUsuario(Usuario usu) {
		SetNome(usu.getNome());
		SetUltimoNome(usu.getUltimoNome());
		SetEmail(usu.getEmail());
		SetEndereco(usu.getEndereco());
		SetUniversidade(usu.getUniversidade());
		SetProfissao(usu.getProfissao());
		SetGenero(usu.getGenero());
		SetIdade(usu.getIdade());
		clicarBtnCriar();									
	}
	
	public String getMsgIncluidoSucesso() {
		String msg = $("#notice").getText();
		return msg;
	}
	
	
	public ElementsCollection itens () {
		return $$("table tbody tr");
				
	}
	
		
	public void consultarUsuario(String email) {
		ElementsCollection item = $$("table tbody tr");
		item.find(Condition.text(email)).find("tbody tr td:nth-child(9)").click();
		
		
	}
	

}
