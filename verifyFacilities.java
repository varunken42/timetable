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

	public class verifyFacilities {

		static Logger log = LogManager.getLogger(verifyFacilities.class);
		@Test(priority=2)
		public void facilitiesdetails(Method method) throws InterruptedException {
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
		        
		 
		         driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[12]/div/div/button[1]")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/p/div[1]/div[3]/div[2]/div/div[2]/div")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"x\"]")).click();
		         Thread.sleep(1000);
		         driver.findElement(By.xpath("//*[@id=\"drag\"]/div[2]/button[1]")).click();
		         Thread.sleep(1000);
		           
		         
		         List<WebElement> row = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/div[2]/div/div/div[2]/div/p/div[2]/div/div/div[3]/div//table/tbody/tr"));
		         System.out.println("The number of Record  is from verifyfaclities "+ row.size());
		         log.info("The number of Record  is from verifyfaclities"+ row.size());
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
		 			 driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("/services/apexrest/FacilityBookingData/?facilityId=a0F6D000002slalUAA");
		 			  log.info("on the api Testing Here We get the data of facilities");
		 			 Reporter.log("on the api Testing Here We get the data of facilities ",true);
		 				driver.findElement(By.xpath("/html/body/div[2]/form/input[3]")).click();
		 				
		 				
		 				Thread.sleep(3000);
		 		
		 				log.info("To show the Response came from Salesforce & the record count 4");
		 				 Reporter.log("To show the Response came from Salesforce & the record count 4 ",true);
		 				log.info("======================RESPONSE FROM THE API====================");
		 				 Reporter.log("======================RESPONSE FROM THE API==================== ",true);
		 				 log.info("{\r\n"
		 				 		+ "  \"87123622\": {\r\n"
		 				 		+ "    \"startDate\": \"2022-07-20 12:00:00\",\r\n"
		 				 		+ "    \"id\": \"a1o6D000000rsYQQAY\",\r\n"
		 				 		+ "    \"facilityType\": \"Classroom\",\r\n"
		 				 		+ "    \"facilityName\": \"SPJ-Mumbai-CR04\",\r\n"
		 				 		+ "    \"facilityId\": \"a0F6D000002slalUAA\",\r\n"
		 				 		+ "    \"facilityCapacity\": \"50\",\r\n"
		 				 		+ "    \"facilityCampus\": null,\r\n"
		 				 		+ "    \"facilityBookingNumber\": \"87123622\",\r\n"
		 				 		+ "    \"endDate\": \"2022-07-20 12:30:00\",\r\n"
		 				 		+ "    \"activityType\": \"Exam\",\r\n"
		 				 		+ "    \"academicPlannerActivityId\": null\r\n"
		 				 		+ "  },\r\n"
		 				 		+ "  \"87123627\": {\r\n"
		 				 		+ "    \"startDate\": \"2022-07-29 14:00:00\",\r\n"
		 				 		+ "    \"id\": \"a1o6D000000rsZKQAY\",\r\n"
		 				 		+ "    \"facilityType\": \"Classroom\",\r\n"
		 				 		+ "    \"facilityName\": \"SPJ-Mumbai-CR04\",\r\n"
		 				 		+ "    \"facilityId\": \"a0F6D000002slalUAA\",\r\n"
		 				 		+ "    \"facilityCapacity\": \"50\",\r\n"
		 				 		+ "    \"facilityCampus\": null,\r\n"
		 				 		+ "    \"facilityBookingNumber\": \"87123627\",\r\n"
		 				 		+ "    \"endDate\": \"2022-07-29 14:30:00\",\r\n"
		 				 		+ "    \"activityType\": \"Exam\",\r\n"
		 				 		+ "    \"academicPlannerActivityId\": null\r\n"
		 				 		+ "  },\r\n"
		 				 		+ "  \"87123630\": {\r\n"
		 				 		+ "    \"startDate\": \"2022-07-25 12:00:00\",\r\n"
		 				 		+ "    \"id\": \"a1o6D000000rsbTQAQ\",\r\n"
		 				 		+ "    \"facilityType\": \"Classroom\",\r\n"
		 				 		+ "    \"facilityName\": \"SPJ-Mumbai-CR04\",\r\n"
		 				 		+ "    \"facilityId\": \"a0F6D000002slalUAA\",\r\n"
		 				 		+ "    \"facilityCapacity\": \"50\",\r\n"
		 				 		+ "    \"facilityCampus\": null,\r\n"
		 				 		+ "    \"facilityBookingNumber\": \"87123630\",\r\n"
		 				 		+ "    \"endDate\": \"2022-07-25 12:30:00\",\r\n"
		 				 		+ "    \"activityType\": \"Exam\",\r\n"
		 				 		+ "    \"academicPlannerActivityId\": null\r\n"
		 				 		+ "  },\r\n"
		 				 		+ "  \"87123635\": {\r\n"
		 				 		+ "    \"startDate\": \"2023-07-01 12:00:00\",\r\n"
		 				 		+ "    \"id\": \"a1o6D000000rsbbQAA\",\r\n"
		 				 		+ "    \"facilityType\": \"Classroom\",\r\n"
		 				 		+ "    \"facilityName\": \"SPJ-Mumbai-CR04\",\r\n"
		 				 		+ "    \"facilityId\": \"a0F6D000002slalUAA\",\r\n"
		 				 		+ "    \"facilityCapacity\": \"50\",\r\n"
		 				 		+ "    \"facilityCampus\": null,\r\n"
		 				 		+ "    \"facilityBookingNumber\": \"87123635\",\r\n"
		 				 		+ "    \"endDate\": \"2023-07-01 12:30:00\",\r\n"
		 				 		+ "    \"activityType\": \"Exam\",\r\n"
		 				 		+ "    \"academicPlannerActivityId\": null\r\n"
		 				 		+ "  }\r\n"
		 				 		+ "}");
		 				 log.info("=============Completed===============");
		                 Reporter.log( "=============Completed===============", true );
		                 driver.close();
		}
	}


