package Brainium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Swiggy.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        
        //TC-01
        WebElement Location = driver.findElement(By.xpath("//input[@type='text']"));
        driver.findElement(By.className("LukWG")).click();

        
        //TC-02 sEARCH
        driver.findElement(By.linkText("Search")).click();
        driver.findElement(By.className("_2BJMh")).sendKeys("Biriyani",(Keys.ENTER));
        
        //TC-03 OFFERS
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]/div/a")).click();
        
        //TC-04 HELP
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[3]/div/a")).click();
        
        //TC-05 cart
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/div[1]/div/a")).click();
        
        //TC-06 SEE RESTAURANT
        driver.findElement(By.xpath("//div[@class='_3pgCg']")).click();
        
        //TC-07 Restarant
       driver.findElement(By.xpath("//*[@id=\"all_restaurants\"]/div/div[2]/div[1]/div/div[1]/div[2]/a/div/div[1]/div[2]/div[1]")).click();
        
       //TC-08 add
       driver.findElement(By.xpath("//div[@class='_1RPOp']")).click();
       driver.findElement(By.className("_38xdN")).click();
       
       //TC-09 +
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='_1ds9T _2Thnf']")).click();
       
       //TC-11 I WILL CHOOSE
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='b0G1m']")).click();
       
       //TC-12 ADD ITEM OF I LL CHOOSE
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[@class='_38xdN']")).click();
       
       //TC-13 -
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='_29Y5Z _2od4M']")).click();
       
       //TC -14 2nd time use + this button
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='_1ds9T _2Thnf']")).click();
       
       //TC-15 REPEAT LAST
      Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='_2-MHS']")).click();
       
       //TC-16 2nd time use - button
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='_29Y5Z _2od4M']")).click();
       
       //TC - 17 checkout
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='_1gPB7']")).click();
       
       //TC-18
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
//       driver.findElement(By.xpath("//input[@class='_381fS']")).sendKeys("123456789");
//       driver.findElement(By.id("name")).sendKeys("Brainium Information Technologies");
//       driver.findElement(By.id("email")).sendKeys("brainium123@gmail.com");
//       driver.findElement(By.id("password")).sendKeys("123456789brainium@");
//       
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div[2]/form/div[2]/a")).click();
//	
       
       //TC-19
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div[1]")).click();
//	   driver.findElement(By.xpath("//input[@class='_381fS']")).sendKeys("123456789");
//	   driver.findElement(By.xpath("//a[@class='_2REYC']")).click();
	
       
       //TC-20
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[@class='_3dNWs _1AS3P']")).click();
       driver.findElement(By.id("building")).sendKeys("Sector-v");
       driver.findElement(By.id("landmark")).sendKeys("Saltlake");
       driver.findElement(By.xpath("//div[@class='sf8jl']")).click();
       driver.findElement(By.xpath("//a[@class='_2sd1x']")).click();
       
       
       
	}

}
