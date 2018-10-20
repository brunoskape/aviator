package br.com.aviator.pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
				
	public void pesquisaPrincipal() throws InterruptedException {
		
		WebElement pesquisa = driver.findElement(By.id("nomes_alt"));
		pesquisa.sendKeys("camisa social");
				
	}
	
	public void clicarPesquisa() throws InterruptedException {
		
		
		driver.findElement(By.xpath("/html/body/header/div/div[1]/div/div[3]/form/div/a")).click();
	
		//implemenstar dps
		//String mensagem = driver.findElement(by);
//		assertTrue(mensagem.contains("aeaeae"));
		
	}
	
	
}
