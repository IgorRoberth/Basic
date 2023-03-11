package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Teste {

	@Test
	public void abrirNavegador() {
		
        /*Comunica��o do selenium com o webdriver para abrir o navegador
         * Vers�o do driver 111.0.5563.64 talvez seja necess�rio atualizar
         * dependencias utilizadas junit test e selenium-java
         */
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		//C�digo para permitir que qualquer origem externa fa�a solicita��es ao navegador controlado remotamente, sem restri��es.
		options.addArguments("-remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        
		//Linha para inserir o site que deseja automatizar 
		driver.get("https://");
		
		//Linha para maximizar a tela do navegador
		driver.manage().window().maximize();
        
		//Linha para interagir com partes do site que voc� deseja escrever 
		driver.findElement(By.id("")).sendKeys("");
		
		//Linha que ir� realizar o clique em bot�es de pesquisas
		driver.findElement(By.cssSelector("")).submit();
		
        //Linha de c�digo para rodar a p�gina para baixo e interagir com produto desejado 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		//Linha para clicar no local desejado
		driver.findElement(By.xpath("")).click();
		
		//Assert para validar se o produto selecionado � o que voc� interagiu
	    assertEquals("Resultado Esperado", "Resultado Atual");

	    //Linha para fechar o navegador ap�s finaliza��o de todas as valida��es desejadas
		driver.quit();

	}
}