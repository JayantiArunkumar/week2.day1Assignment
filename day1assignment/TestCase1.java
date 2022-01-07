package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		//setup Driver
		
				WebDriverManager.chromedriver().setup();
				
				//Launch the Driver
				
				ChromeDriver driver=new ChromeDriver();
				
				//Load the URL
				
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximise the Browser
				
				driver.manage().window().maximize();
				
				
				
				//Enter UserNAme
				WebElement userName = driver.findElement(By.id("username"));
				userName.sendKeys("DemoSalesManager");
				
				//Enter Password
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//click Login Button
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click on CRM/SFA
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Contacts")).click();
				
				driver.findElement(By.linkText("Create Contact")).click();
				
				WebElement firstName = driver.findElement(By.id("firstNameField"));
				firstName.sendKeys("Jayanti");
				String attribute = firstName.getAttribute("value");
				System.out.println("FirstName: "+attribute);
				
				driver.findElement(By.id("lastNameField")).sendKeys("Arunkumar");
				
				
				driver.findElement(By.name("submitButton")).click();
				
				//Get the title
				String title = driver.getTitle();
				System.out.println(title);
				
				
				
				driver.close();
				
				
				
				
				
	}

}
