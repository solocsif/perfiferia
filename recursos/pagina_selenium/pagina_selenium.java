package pagina_selenium; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagina_driver.pagina_driver;
import org.openqa.selenium.WebElement;
public class pagina_selenium extends pagina_driver{
	public void abrirnavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\javiercastillo\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	public void abrirperiticket() {
		driver.get("https://periticket.periferia-it.com/Account/Login");
	}
	public void ingresarcorreo() {
		WebElement correo=driver.findElement(By.id("Email"));
		correo.sendKeys("solocisf390@gmail.com");
		
	}
	public void ingresarcontraseña(){
		WebElement contrasena=driver.findElement(By.id("Password"));
		contrasena.sendKeys("Soydelleon93");
		WebElement submit=driver.findElement(By.id("btnLog"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		WebElement nomina=driver.findElement(By.xpath("(//a[contains(@href, \"javascript:document.getElementById('logoutForm').submit()\")])[2]"));
		nomina.click();
		}
}
