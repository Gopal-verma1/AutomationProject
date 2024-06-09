package FirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ngv40\\.cache\\selenium\\chromedriver\\win64\\122.0.6261.128\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		System.out.println("Tital of the page"+driver.getTitle());
	}

}
