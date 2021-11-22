package comprehensive;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HotelMangement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe"); 
		WebDriver driver =new FirefoxDriver(); 
		 driver.get("https://www.eazydiner.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
		  driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
		 driver.findElement(By.id("allow")).click();
		 driver.switchTo().defaultContent();
		 
		 driver.findElement(By.xpath("//span[text()='Search']")).click();
		 
		 System.out.println("Restorants should display");
		 
		 String HotelName=driver.findElement(By.xpath("(//h3[@class='grey res_name font-20 bold inline-block'])[1]")).getText();
		 System.out.println("Hotel name: "+ HotelName);
		 
		 driver.findElement(By.xpath("(//h3[@class='grey res_name font-20 bold inline-block'])[1]")).click();
		 String text=driver.findElement(By.xpath("//h2[text()='Connaught Clubhouse']")).getText();
		 if (HotelName.equalsIgnoreCase(text)){
			 System.out.println("Hotel name is same");
		 }
		 
		 System.out.println("Total Reviews : "+driver.findElement(By.xpath("//span[@class='text-blue pointer review_tab']")).getText());

		 
		
		
		
		
		
	}

}
