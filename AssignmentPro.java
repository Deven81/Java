package seleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumSoftware\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://audio.iamdave.ai/test-assignment.html");
		
		// Switch to Register Option
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        
        //fill All the Required Information
        driver.findElement(By.id("name")).sendKeys("devendra");
           
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dev@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("7065486");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//input[@id='pwd']) [2]")).sendKeys("devendra123");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("pwd2")).sendKeys("devendra123");
	    Thread.sleep(1000);
	    
	    // Click on Register
	    driver.findElement(By.xpath("//button[text()='Register']")).click();
	    

	}

}
