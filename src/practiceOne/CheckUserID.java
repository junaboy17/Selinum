package practiceOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUserID {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\junab\\Documents\\Drivers\\chromedriver.exe");

		ChromeDriver chrome = new ChromeDriver();
		String homePage = "http://www.google.com";
		
		chrome.get(homePage);
		chrome.manage().window().maximize();
		chrome.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		chrome.findElementByXPath("//*[@id=\"dLabellogin\"]/span").click();
		chrome.findElementByXPath("//*[@id=\"username\"]").sendKeys("hotman2020");
		chrome.findElementByXPath("//*[@id=\"password\"]").sendKeys("manhot20");
		chrome.findElementById("jqLogin").click();
		Thread.sleep(5000);
		
		WebElement name = chrome.findElementByXPath("//*[@id=\"dLabel\"]/span");
		
			if(name.toString().equalsIgnoreCase("HOT MAN")) { 
				System.out.println("Test Pass");
			}
			else {
				System.out.println("Test .Failed");
			}
		
		
			
			
		
	chrome.quit();


	}

}
