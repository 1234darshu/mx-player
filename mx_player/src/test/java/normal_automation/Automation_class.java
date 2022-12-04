package normal_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Automation_class {
	
	public String mxurl = "https://www.mxplayer.in/ ";
	// initialize the HtmlReporter
	String K;
	// initialize the HtmlReporter
	ExtentHtmlReporter htmlReporter;
	//initialize ExtentReports and attach the HtmlReporter
	ExtentReports extent;
	//creating tests
	ExtentTest test;
	WebDriver driver;
	@BeforeTest
	public void newadministration() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(mxurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	//@Test
	public void TestCase2() throws InterruptedException {
		test=extent.createTest("checking the search functionality");
	driver.findElement(By.xpath("//*[@class='hc_search'] ")).click();
	test.pass("user is able to click search option");
	}
	
	//@Test
	public void TestCase3() throws InterruptedException {
		test=extent.createTest("checking the web show functionality");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='sc_categories']/a[1]")).click();
		driver.navigate().back();
		test.pass("user is able to click web shows option");
	}
	//@Test
	public void TestCase4() throws InterruptedException {
		test=extent.createTest("checking the movies functionality");
		driver.findElement(By.xpath("//*[@class='sc_categories']/a[2]")).click();
		driver.navigate().back();
		test.pass("user is able to click movies option");
	}
	
	//@Test
	public void TestCase5() throws InterruptedException {
		test=extent.createTest("checking the short films functionality");
		driver.findElement(By.xpath("//*[@class='sc_categories']/a[3]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@href='#close']")).click();
		test.pass("user is able to click short films option");
	}
	
	@Test
	public void TestCase6() throws InterruptedException {
		test=extent.createTest("checking the Go ADD free functionality");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='hc_go-ad-free']")).click();
		test.pass("user is able to click Go Add free option");
	}
	
	@Test
	public void TestCase7() throws InterruptedException {
		test=extent.createTest("checking the Go ADD free functionality");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='plans']/div[4]")).click();
		test.pass("user is able to click Go Add free option");
		
	}
	
	@Test
	public void TestCase8() throws InterruptedException {
		test=extent.createTest("checking the Go ADD free functionality");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='options']/div[2]")).click();
		test.pass("user is able to click Go Add free option");
	}
	
	@Test
	public void TestCase9() throws InterruptedException {
		test=extent.createTest("checking the Go ADD free functionality");
		driver.findElement(By.xpath("//*[@class='options']/div[3]")).click();
		test.pass("user is able to click Go Add free option");
		}
	
	@AfterTest
	public void atest() {
	driver.close();
	extent.flush();
}
}


