package week2.day1assignment;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Softonic");
		WebElement userName = driver.findElement(By.id("createLeadForm_firstName"));
		userName.sendKeys("Jayanti");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arunkumar");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/03/1992");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("0251");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("442");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Jayanti");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Jayanti@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("Jayanti@gmail.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Jayanti");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Jayu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("22 c");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("GreenFields");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("RockyHill");
		
		
		WebElement dd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select province=new Select(dd);
		province.selectByValue("CT");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("06067");
		WebElement cc = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(cc);
		
		country.selectByValue("USA");
		
		
	//driver.findElement(By.xpath("//select[@id = 'createLeadForm_generalPostalCode')]/(option[contains(text(), 'A')])[2]]")).click();

		
		//WebElement cc = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		
		String s= userName.getAttribute("value");
		System.out.println(s);
		
		String title=driver.getTitle();
		System.out.println(title);
		if(driver.getTitle().contains("Lead"))
			System.out.println("Print title is verified");
		else
			System.out.println("title is unverified");
		
		
	
	}

}
