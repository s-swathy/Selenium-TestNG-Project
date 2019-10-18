package TestngFiles;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginVerification extends HomePageValidation {
	
	public WebDriver driver ; 
	
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\VMware_Automation_Workspace\\NewProject\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		PageValidation(driver);
	}
	
	@Test(priority=1)
	public void LoginPage(){
		
		System.out.println("Url Launches Successfully");
		String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("The page titlt is:"+actualTitle);
		
		
	}
	@Test(priority=2)
	public void VerifyLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//driver.findElement(By.xpath("//*[@id='btnLogin']"));
		PageValidation(driver);
		System.out.println("Successfully entered the home page");
		VerifyHomePage(driver);
	}
	@Test(priority=3)
	public void VerifyMenu1() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		System.out.println("Successfully entered the Admin subpage");
		Admin(driver);
		//AdminSubMenu1(driver);
		
	}
	@Test(priority=4)
	public void VerifyMenu2() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		System.out.println("Successfully entered the PIM subpage");
		PIM(driver);
	}
	@Test(priority=5)
	public void VerifyMenu3() {
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		System.out.println("Successfully entered the Leave subpage");
		Leave(driver);
	}
	@Test(priority=6)
	public void VerifyMenu4() {
		driver.findElement(By.id("menu_time_viewTimeModule")).click();
		System.out.println("Successfully entered the Time subpage");
		Time(driver);
	}
	@Test(priority=7)
	public void VerifyMenu5() {
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		System.out.println("Successfully entered the Recruitment subpage");
		Recruitment(driver);
	}
	@Test(priority=8)
	public void VerifyMenu6() {
		driver.findElement(By.id("menu__Performance")).click();
		driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();
		Performance(driver);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		System.out.println("Successfully entered the Directory subpage");
		Directory(driver);
	}
	@Test(priority=9)
	public void VerifyMenu7() {
		driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		System.out.println("Successfully entered the Maintenance subpage");
		Maintenance(driver);
	}	
		
		
		//String value=driver.findElement(By.className(menu).click();
		//System.out.println(value);
	
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	
	}
	
	
	

}
