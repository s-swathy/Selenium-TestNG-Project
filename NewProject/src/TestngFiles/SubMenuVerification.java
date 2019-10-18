package TestngFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SubMenuVerification {
	
	public void AdminSubMenu1(WebDriver driver) {
		
		driver.findElement(By.linkText("User Management")).click();
		
		
		driver.findElement(By.linkText("Users")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
		System.out.println("The Heading is: "+text);
		Assert.assertEquals(text,"System Users");
		if(text.equals("System Users")) {
		    System.out.println("TEST PASSED");
		} else {
		    System.out.println("TEST FAILED");
		}
	}
	public void AdminSubMenu2(WebDriver driver) {
		
		//clicks the job dropdown
		driver.findElement(By.id("menu_admin_Job")).click();
		
		//clicks the Job Titles in the dropdown
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		String text = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
		System.out.println("The Heading is: "+text);
		Assert.assertEquals(text,"Job Titles");
		if(text.equals("Job Titles")) {
		    System.out.println("TEST PASSED");
		} else {
		    System.out.println("TEST FAILED");
		}
		
		
		//clicks the job dropdown
		driver.findElement(By.id("menu_admin_Job")).click();
		//clicks the Pay Grades in the dropdown
		driver.findElement(By.linkText("Pay Grades")).click();
		String text1 = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
		System.out.println("The Heading is: "+text1);
		Assert.assertEquals(text1,"Pay Grades");
		if(text1.equals("Pay Grades")) {
		    System.out.println("TEST PASSED");
		} else {
		    System.out.println("TEST FAILED");
		}
								
	}
	

}
