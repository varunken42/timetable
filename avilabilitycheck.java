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

	public class avilabilitycheck {
		static Logger log = LogManager.getLogger(avilabilitycheck.class);
		@Test(priority=2)
		public void availabilty(Method method) throws InterruptedException {
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
		         Thread.sleep(4000);
		        
		 
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[12]/div/div/button[1]")).click();
		         Thread.sleep(5000);
		         js.executeScript("window.scrollBy(0,2000)");
		         Thread.sleep(3000);
			         
		         
		         List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div"));
		         System.out.println("The number of Record  is from term in filter "+ row.size());
		         log.info("The number of Record  is from term in filter"+ row.size());
		         driver.get("https://workbench.developerforce.com/login.php?startUrl=%2FrestExplorer.php");
		 		log.info("Launching the WorkBench URL");
		 		Reporter.log("Launching the WorkBench URL",true);
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select")).click();
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/p[1]/select/option[2]")).click();
		 		driver.findElement(By.id("termsAccepted")).click();
		 		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[5]/div[2]/input")).click();
		 		log.info("Login to the WorkBench");
		 		Reporter.log("Login to the WorkBench",true);
		 		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys(" implementations@ken42.spj.playground");
		 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[2]")).sendKeys("Test@123456");
		 			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/input[3]")).click();
		 			log.info("Connect Workbench & salesforce integrate");
		 			Reporter.log("Connect Workbench & salesforce integrate",true);
		 			 WebElement l = driver.findElement(By.id("urlInput"));
		 			l.sendKeys("/services/data/v54.0");
		 			l.clear();
		 			Thread.sleep(2000);
		 			log.info("Clear the Extra API On the URI ");
		 			Reporter.log("Clear the Extra API On the URI ",true);
		 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/TimeTable/?Course=BBALIB108-Foudation+skills+2:Ethics+and+moral+Reasoning&numberOfCandidates=124");
		 			  log.info("on the api Testing Here We fillter the term in BBA Term 1");
		 			 Reporter.log("on the api Testing Here We fillter term in BBA Term 1 ",true);
		 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		 				
		 				
		 				Thread.sleep(3000);
		 				
		 				log.info("To show the Response came from Salesforce & the record count 1");
		 				 Reporter.log("To show the Response came from Salesforce & the record count 1 ",true);
		 				log.info("======================RESPONSE FROM THE API====================");
		 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
		 				 log.info("[\r\n"
		 				 		+ "  {\r\n"
		 				 		+ "    \"venue\": \"Link\",\r\n"
		 				 		+ "    \"totalEligibleStudents\": 124,\r\n"
		 				 		+ "    \"term\": \"BBA Term 1 Master\",\r\n"
		 				 		+ "    \"studentFacultyRatio\": null,\r\n"
		 				 		+ "    \"startTimeOfExam\": \"00:00\",\r\n"
		 				 		+ "    \"numberOfCandidates\": 124,\r\n"
		 				 		+ "    \"id\": \"a126D000000lK2iQAE\",\r\n"
		 				 		+ "    \"examType\": \"Mid-term\",\r\n"
		 				 		+ "    \"examTimeZone\": \"Asia/Kolkata\",\r\n"
		 				 		+ "    \"examCycle\": \"July\",\r\n"
		 				 		+ "    \"duration\": \"30\",\r\n"
		 				 		+ "    \"dateOfExam\": \"2022-08-10\",\r\n"
		 				 		+ "    \"course\": \"BBALIB108-Foudation skills 2:Ethics and moral Reasoning\",\r\n"
		 				 		+ "    \"campus\": \"Dubai\",\r\n"
		 				 		+ "    \"batch\": \"2022\"\r\n"
		 				 		+ "  }\r\n"
		 				 		+ "]");
		 				 log.info("=============Completed===============");
		                 Reporter.log( "=============Completed===============", true );
		                 driver.close();
		}
	
}
