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
		
        /*Comunicação do selenium com o webdriver para abrir o navegador
         * Versão do driver 111.0.5563.64 talvez seja necessário atualizar o chromedriver.
         * dependencias utilizadas são junit test e selenium-java
         */
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		//Código para permitir que qualquer origem externa faça solicitações ao navegador controlado remotamente, sem restrições.
		options.addArguments("-remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
        
		//Linha para inserir o site que deseja automatizar 
		driver.get("https://");
		
		//Linha para maximizar a tela do navegador
		driver.manage().window().maximize();
        
		//Linha para interagir com partes do site que você deseja escrever 
		driver.findElement(By.id("")).sendKeys("");
		
		//Linha que irá realizar o clique em botões de pesquisas
		driver.findElement(By.cssSelector("")).submit();
		
        //Linha de código para rodar a página para baixo e interagir com produto desejado 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		
		//Linha para clicar no local desejado
		driver.findElement(By.xpath("")).click();
		
		//Assert para validar se o produto selecionado é o que você interagiu
	    assertEquals("Resultado Esperado", "Resultado Atual");

	    //Linha para fechar o navegador após finalização de todas as validações desejadas
		driver.quit();

	}
}
