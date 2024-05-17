package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import runner.Executa;
import utils.MassaDeDados;
import utils.Mensagens;

public class LoginTeste {
	
	Metodos metodos = new Metodos ();
	Elementos el = new Elementos ();
	MassaDeDados massa = new MassaDeDados();
	Mensagens msg = new Mensagens();

	@Given("que esteja na tela de login")
	public void queEstejaNaTelaDeLogin() {
		Executa.abrirNavegador();

	}

	@Given("preencher o ususario")
	public void preencherOUsusario() {
		metodos.escrever(el.name,massa.standard_user);

	}

	@Given("preencher a senha")
	public void preencherASenha() {
		metodos.escrever(el.password,massa.secret_sauce);

	}

	@When("realizar o login")
	public void realizarOLogin() {
		metodos.clicar(el.btnlogin);

	}

	@Then("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		metodos.currentUrl("https://www.saucedemo.com/inventory.html");

	}

	@Given("preencher o ususario bloqueado")
	public void preencherOUsusarioBloqueado() {
		metodos.validarTexto(el.msgBlock,msg.msgBlock );

	}

	@Then("sistema apresenta mensagem de ususario bloqueado")
	public void sistemaApresentaMensagemDeUsusarioBloqueado() {

	}

	@Given("preencher com ususario invalido")
	public void preencherComUsusarioInvalido() {

	}

	@Given("preencher a senha invalido")
	public void preencherASenhaInvalido() {

	}

	@Then("sistema apresenta mensagem de ususario e senha invalida")
	public void sistemaApresentaMensagemDeUsusarioESenhaInvalida() {

	}

	@Given("nao preencher nenhum dado")
	public void naoPreencherNenhumDado() {
		
	}

	@Then("sistema apresenta mensagem de ususario em branco")
	public void sistemaApresentaMensagemDeUsusarioEmBranco() {
		
	}

}
