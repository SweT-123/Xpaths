package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	       
	      driver.get("http://leaftaps.com/opentaps/control/login");
	      
	      driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	      driver.findElement(By.id("password")).sendKeys("crmsfa");
	      driver.findElement(By.className("decorativeSubmit")).click();
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Leads")).click();
	      driver.findElement(By.linkText("Create Lead")).click();
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Revathi");
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rev");
	      driver.findElement(By.name("departmentName")).sendKeys("CSE");
	      driver.findElement(By.name("description")).sendKeys("To create lead");
	      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("revathikumar717@gmail.com");
	      WebElement drop=driver.findElement(By.name("generalStateProvinceGeoId"));
	      Select op=new Select(drop);
	      op.selectByVisibleText("New York");
	      driver.findElement(By.name("submitButton")).click();
	      driver.findElement(By.className("subMenuButton")).click();
	      driver.findElement(By.name("description")).clear();
	      driver.findElement(By.name("importantNote")).sendKeys("Edited Lead");
	      driver.findElement(By.name("submitButton")).click();
	      
	      

	}

}
