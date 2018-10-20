package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


import br.com.aviator.pages.BasePage;
import br.com.aviator.pages.HomePage;

public class RunnerTest {
	
	private WebDriver driver;
	static HomePage homepage;

	@Before
	public void setUp() {
	driver = BasePage.createChrome();
	
	
	} 
	//
	@Test
	public void acessarPesquisar() throws InterruptedException {
	new HomePage(driver).pesquisaPrincipal();
	new HomePage(driver).clicarPesquisa();
		
	}
		
	}
	
	



