package spjportal;

	import java.lang.reflect.Method;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;


public class edit {

		static Logger log = LogManager.getLogger(edit.class);
		@Test(priority=2)
		public void editdata(Method method) throws InterruptedException {
			System.out.println("\n Welcome \n");
		     log.info("=============Automate Testing============ ");
		     Reporter.log( "=============Automate Testing Start============", true );

		     WebDriverManager.chromedriver().setup();
			    ChromeDriver driver = new ChromeDriver();
		        JavascriptExecutor js = (JavascriptExecutor) driver;

			    log.info("=============Test name============: " + method.getName());  
			    Reporter.log( "=============Test name=======:"+method.getName(), true );

			    log.info("Launching chrome browser");
			    Reporter.log("Launching chrome browser");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				driver.get("https://sp-jain-playground-adminportal.ken42.com/");
				log.info("Launching the FrontEnd portal");
				Reporter.log( "Launching the FrontEnd portal", true );

				driver.manage().window().maximize();
				log.info("Maximize the Browser");
				Reporter.log( "Maximize the Browser", true );

				 driver.findElement(By.xpath("//span[.='Sign In']")).click();
		         Thread.sleep(2000);
		     	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[1]/div/button")).click();
		     	Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[3]/div[1]")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/div[3]/div[2]/div/div/ul/div[4]")).click();
		         Thread.sleep(3000);
		        
		 
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[11]/button")).click();
		         Thread.sleep(3000);
		         
				 
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[5]/div/div[2]/input")).sendKeys("07-09-2022");
		         Thread.sleep(3000);
		         
				 
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[6]/div/div[2]/input")).sendKeys("04:40:00");
		         Thread.sleep(3000);
		         
				 
		         driver.findElement(By.xpath("//*[@id=\"mui-component-select-duration\"]")).click();
		         Thread.sleep(3000);
		         driver.findElement(By.xpath("//*[@id=\"menu-duration\"]/div[3]/ul/li[3]")).click();
		         Thread.sleep(3000);
		         
		         
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[11]/button[1]")).click();
		         Thread.sleep(3000);


		 				 log.info("=============Completed===============");
		                 Reporter.log( "=============Completed===============", true );
		                 driver.close();
		}
	

}

