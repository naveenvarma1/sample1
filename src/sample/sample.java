package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/Users/mhossain/Desktop/chromedriver");
		System.setProperty("webdriver.chrome.driver","C:/Users/naveen/workspace/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

}