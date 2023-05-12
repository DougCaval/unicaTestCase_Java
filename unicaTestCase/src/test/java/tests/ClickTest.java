package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import address.WebAddress;
import pageObjects.LoginPage;

public class ClickTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	public void test() throws InterruptedException {
		
		String home = WebAddress.homeJohnWick1;
		driver.get(home);
		
		
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
        byte[] screenshotBytes = screenshot.getScreenshotAs(OutputType.BYTES);
        

        // Salvar o screenshot em um arquivo
        try {
            FileUtils.writeByteArrayToFile(new File("/home/dougcaval/eclipse-workspace/opensite/target/johnwick1.png"), screenshotBytes);
            System.out.println("Screem Shot John Wic 1!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o screenshot: " + e.getMessage());
        

        }
        
        
        
        
      
        
        
        
        
		
	}
}
