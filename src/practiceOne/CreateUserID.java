package practiceOne;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\junab\\Documents\\Drivers\\chromedriver.exe");

		ChromeDriver chrome = new ChromeDriver();
		String homePage = "http://www.google.com";
		
		chrome.get(homePage);
		chrome.manage().window().maximize();
		chrome.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		chrome.findElementByXPath("//*[@id=\"dLabellogin\"]/span").click();
		chrome.findElementByXPath("//*[@id=\"jqSignup\"]").click();
		
		Thread.sleep(3000);

		chrome.findElementByXPath("//*[@id=\"txtEmail\"]").sendKeys("hotman3@gmail.com");
		chrome.findElementByXPath("//*[@id=\"txtUserName\"]").sendKeys("hotman2023");
		chrome.findElementByXPath("//*[@id=\"txtPassword\"]").sendKeys("manhot23");
		chrome.findElementByXPath("//*[@id=\"txtCnfPassword\"]").sendKeys("manhot203");
		Thread.sleep(3000);

		chrome.findElementByXPath("//*[@id=\"txtFirstName\"]").sendKeys("Hot");
		chrome.findElementByXPath("//*[@id=\"txtLastName\"]").sendKeys("Man");
		chrome.findElementByXPath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input").sendKeys("Hotman 123 regan blvd");
		chrome.findElementByXPath("//*[@id=\"btnRegister\"]").click();


		Thread.sleep(3000);
		
		chrome.findElementByXPath("//*[@id=\"dLabel\"]/span");
		
		

		//WebElement element = chrome.findElement(By.id(""));
		
		
		
		chrome.quit();
	}

}
