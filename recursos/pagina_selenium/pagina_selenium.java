package pagina_selenium; 
import java.util.concurrent.TimeUnit;
import java.awt.event.InputEvent;
import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
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
	public void ingresarcontraseña() throws AWTException, InterruptedException{
		WebElement contrasena=driver.findElement(By.id("Password"));
		contrasena.sendKeys("Soydelleon93");
		WebElement submit=driver.findElement(By.id("btnLog"));
		submit.click();
		Thread.sleep(5000);
		Robot Robot = new Robot();
		Robot.mouseMove(100, 500);
		Thread.sleep(5000);
		Robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		Robot cisf=new Robot();
		Thread.sleep(5000);
		cisf.mouseMove(150, 560);
		cisf.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		cisf.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		Robot salir=new Robot();
		salir.mouseMove(1000, 200);
		Thread.sleep(2000);
		salir.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		salir.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		driver.quit();
		}
}
