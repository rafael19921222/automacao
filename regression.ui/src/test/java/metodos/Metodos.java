package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);

		} catch (Exception e) {
			System.err.println("Erro ao tentar escrever no elemento" + elemento);
		}

	}

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();

		} catch (Exception e) {
			System.err.println("Erro ao tentar clicar no elemento" + elemento);
		}
	}

	public void currentUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a url desejada" + urlDesejada);

		}

	}

	public void validarTexto(By elemento, String mensagemEsperada) {
		try {
			String msgCapturada = driver.findElement(elemento).getText();
			assertEquals(mensagemEsperada, msgCapturada);
		} catch (Exception e) {
			System.err.println("Erro ao tentar validar a mensagem" + mensagemEsperada);
		}
	}

}
