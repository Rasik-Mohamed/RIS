import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alternativeSendkey {

	public static void main(String[] args) {
		// TO connect Chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\UDEMY\\Software\\chromedriver_win32\\chromedriver.exe");
		
		// To connect webdriver for chrome driver
		WebDriver driver = new ChromeDriver();
		
		// To open web page
		driver.get("https://www.google.com/");
		
		//To get and store object element into webelement 
		WebElement objElement = driver.findElement(By.xpath("//input[@type='text']"));

		// JavaScript Executor to enter text
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/* 2 Ways to enter data in text box using javascriptexecutor */ 
		  
		/*  Below are the 1st way to enter the data */
		js.executeScript("arguments[0].value='Polaris'", objElement);
		
		/*  Below are the 2nd way to enter the data		 */
		js.executeScript("arguments[0].value=arguments[1]", objElement,"Virtusa");
		
		//To the object value in run time
		String fromapp = objElement.getAttribute("value");
		
		//To print the output in console
		System.out.println(fromapp);
		
		//To close the current driver webpage
		driver.close();
		
		
		
				
				
				
		
		
		

	}

}
