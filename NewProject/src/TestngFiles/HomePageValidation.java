package TestngFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePageValidation extends SubMenuVerification{
	
	
	
	public void PageValidation(WebDriver driver) {
		String currentURL = driver.getCurrentUrl();
		System.out.println("URL:"+currentURL);
		String pageContent = driver.findElement(By.tagName("body")).getText();
		if (pageContent.contains("This site can’t be reached")) {
			System.out.println("Failed : Page not found");
		}
		else {
			System.out.println("***Page loaded success***");
		}
	}
	
	public void VerifyHomePage(WebDriver driver) {
		String text = driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
		System.out.println("The Heading is: "+text);
		Assert.assertEquals(text,"Dashboard");
		if(text.equals("Dashboard")) {
		    System.out.println("TEST PASSED");
		} else {
		    System.out.println("TEST FAILED");
		}
	}	
	
		public void Admin(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"System Users");
			if(text.equals("System Users")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			AdminSubMenu1(driver);
			AdminSubMenu2(driver);
			
		}
		public void PIM(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Employee Information");
			if(text.equals("Employee Information")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
			
		}
		
		public void Leave(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Leave List");
			if(text.equals("Leave List")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
			
		}
		
		public void Time(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Select Employee");
			if(text.equals("Select Employee")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
			
		}
		
		public void Recruitment(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Candidates");
			if(text.equals("Candidates")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
			
		}
		
		public void Performance(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Performance Trackers");
			if(text.equals("Performance Trackers")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
		}
		
		public void Directory(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Search Directory");
			if(text.equals("Search Directory")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
			
		}
		public void Maintenance(WebDriver driver) {
			String text=driver.findElement(By.xpath("//div[contains(@class,'head')]/h1")).getText();
			
			System.out.println("The Heading is: "+text);
			Assert.assertEquals(text,"Purge Employee Records");
			if(text.equals("Purge Employee Records")) {
			    System.out.println("TEST PASSED");
			} else {
			    System.out.println("TEST FAILED");
			}
		}
		
		
}
