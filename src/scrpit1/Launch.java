package scrpit1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.Assert;

public class Launch {
	public static void main(String[] args)  throws InterruptedException {
//		set path for chrome driver
		System.setProperty("webdriver.chromedriver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	********	 Launch the application in Chrome browser******
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
//  *********    Maximize the browser *********
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//   *******   validate the browser title *******
		System.out.println(driver.getTitle());
		String PageTime = driver.findElement(By.xpath("//b[contains(text(),'Apr 6, 2020')]")).getText();
		System.out.println(PageTime);
		System.out.println(SysTime.main());
		if (PageTime == SysTime.main())
				{
			System.out.println("System Time and WebPage are same");
				}
		else
		  {
			System.out.println("System Time and WebPage are not same");
		   };
		   Thread.sleep(5000);
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			System.out.println(driver.getTitle());
			
//   *********   Validate if login is successful by checking for text "FlightFinder" ******  
		String bodyText = driver.findElement(By.tagName("body")).getText();
//		Assert.assertTrue("Text not found!", bodyText.contains("Flight Finder"));
		if (bodyText.contains("Flight Finder") )
		{System.out.println("Webpage conatins text 'Flight Finder'");}
		else{System.out.println("Webpage doesn't conatins text 'Flight Finder'");};
//	***********	Select the values: **********
		driver.findElement(By.xpath("//select[@name='fromPort']//option[contains(text(),'London')]")).click();
		driver.findElement(By.xpath("//select[@name='toPort']//option[contains(text(),'New York')]")).click();
		driver.findElement(By.cssSelector("tr:nth-child(9) td:nth-child(2) font:nth-child(1) font:nth-child(2) > input:nth-child(2)")).click();
	    driver.findElement(By.name("findFlights")).click();
	    
 //**************	    Validate if we have landed in "SelectFlight page **************
//	    Assert.assertTrue("Select a Flight: Mercury Tours", driver.getTitle().contains("Flight Finder"));
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("reserveFlights")).click();
//	    if ( driver.getTitle() == "Book a Flight: Mercury Tours")
	  	    driver.findElement(By.name("passFirst0")).sendKeys("John");
	    	driver.findElement(By.name("passLast0")).sendKeys("Peter");
	    	driver.findElement(By.name("creditnumber")).sendKeys("123456");
	    	driver.findElement(By.name("buyFlights")).click();
		    driver.close();
		
		}

}
