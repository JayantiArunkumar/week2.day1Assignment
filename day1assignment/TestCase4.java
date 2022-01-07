package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jayanti@gmail.com");
		email.sendKeys("Jayu",Keys.TAB);
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Jayu",Keys.TAB);
		WebElement defaultText = driver.findElement(By.name("username"));
		String defaultText1= defaultText.getAttribute("value");
		System.out.println(defaultText1);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement disable = driver.findElement(By.xpath("//input[@disabled='true']"));
		if(disable.isDisplayed())
			System.out.println("This webElement is Disabled");
		else
			System.out.println("This webElement is not Disabled");
		
		
       
	}

}
