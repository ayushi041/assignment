package comprehensive;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HotelManagement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe"); 
		WebDriver driver =new FirefoxDriver(); 
		 driver.get("https://www.eazydiner.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		  driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		 driver.findElement(By.id("allow")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		 driver.findElement(By.xpath("//input[@class='input input-mobile']")).sendKeys("7581976349");
		 driver.findElement(By.xpath("//button[@class='button bold']")).click();
		 System.out.println("Otp is send");
		 }

}
