package Amazon_Brainium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Brainium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     //Cancel and Return Is The Same Option. So, I am Doing Both.
	     //First Is For The Buy Product.
	     //2nd Is The Cancel Product.
	     //3rd Is The Return Product.
	     
try {
	     driver.get("https:\\amazon.in");
	     
	     
	     //Sign In
	     driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	     driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123456789");
	     driver.findElement(By.xpath("//input[@id='continue']")).click();
	     
	     //Search Box Navigate
	     
	     //First
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shirt", Keys.ENTER);
	     Thread.sleep(2000);
	     //Shirt Navigate
	     driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div[1]/div/span/a/div/div[2]/img")).click();
	     Thread.sleep(2000);
         //Buy Now Button
	     driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	     Thread.sleep(2000);
	     //Amazon Pay Later
	     driver.findElement(By.xpath("//span[@id='pp-VBsChM-175']")).click();
	     Thread.sleep(2000);
         //Pay In Next Month
	     driver.findElement(By.xpath("//*[@id=\"pp-VBsChM-181\"]/span/span/input")).click();
	     Thread.sleep(2000);
         //Continue
         driver.findElement(By.xpath("//*[@id=\"pp-VBsChM-123\"]/span/input")).click();
	     //Place Order
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@class='a-button-text place-your-order-button']")).click();
	     
         //Second
         //Cancel The Item
	     driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
	     driver.findElement(By.xpath("//a[@id='Cancel-items_1']")).click();
         driver.findElement(By.xpath("//input[@class='a-button-input']")).click();   
	     
	     
	     //Test Case
	     
         //Third
	     //Navigate The Return Link	     	   
	     driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
	     //Return The Product
	     driver.findElement(By.xpath("//*[@id=\"Return-items_1\"]")).click();
	     //Dropdown
	     WebElement DropDown =  driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
	     Select sel = new Select(DropDown);
	     
	     //Select Value
	     sel.selectByValue("{\"stringVal\":\"RO_CR-DAMAGED_BY_CARRIER\"}");
	     
	     //Continue For The Return
	     driver.findElement(By.xpath("//*[@id=\"items-section-continue-button\"]/span/input")).click();
}
catch (NoSuchElementException e) {
	System.out.println("Yes! I can say where is the Exception.");
	System.out.println(e);
}
	catch (StaleElementReferenceException h) {
		System.out.println("No");
		System.out.println(h);
	}


 finally {
System.out.println("All Are Done");
}

	}
}
