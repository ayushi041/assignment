package comprehensive;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelManagement3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe"); 
		WebDriver driver =new FirefoxDriver(); 
		 driver.get("https://www.eazydiner.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		  driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		 driver.findElement(By.id("allow")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//a[@id='signup']")).click();
		 driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Anisha");
		 driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Jain");
		 driver.findElement(By.xpath("//input[@class='input input-mobile validate-signup unverified']")).sendKeys("136547896");
		 driver.findElement(By.xpath("//input[@class='input validate-signup signup_email']")).sendKeys("Anisha@gmail.com");
		 driver.findElement(By.xpath("//a[@id='send_otp']")).click();
		 System.out.println("system will show invalid mobile nymber");
		 

	}

}
