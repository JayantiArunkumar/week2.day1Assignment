package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select dropDown1=new Select(dd1);
		dropDown1.selectByIndex(2);
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2=new Select(dd2);
		dropDown2.selectByVisibleText("Appium");
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select dropDown3=new Select(dd3);
		dropDown3.selectByValue("3");
		
		
		
		WebElement dd4 = driver.findElement(By.className("dropdown"));
		Select dropDown4=new Select(dd3);
		int size=dropDown4.getOptions().size();
		System.out.println("The size of dropdown: "+(size-1));
		
	driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Loadrunner");
		
	WebElement disable = driver.findElement(By.xpath("//select[@multiple]"));
	if(disable.isDisplayed())
		System.out.println("This webElement is Disabled");
	else
		System.out.println("This webElement is not Disabled");
	
		
		
		
		
		
		
	}

}
