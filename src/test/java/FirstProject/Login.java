package FirstProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Login {
	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ngv40\\.cache\\selenium\\chromedriver\\win64\\122.0.6261.128\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ngv40\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co= new ChromeOptions();
		co.setBinary("C:\\Users\\ngv40\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    Thread.sleep(5000);
		
	    WebElement email =  driver.findElement(By.name("user-name"));
	    WebElement pass = driver.findElement(By.name("password"));
	    if(email.isDisplayed()&&email.isEnabled()){
			email.sendKeys("standard_user");
			
		}
		if(pass.isDisplayed()&& pass.isEnabled()) {
			pass.sendKeys("secret_sauce");
		}
		 driver.findElement(By.name("login-button")).click();
		 driver.findElement(By.id("react-burger-menu-btn")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.id("logout_sidebar_link")).click(); 
		 System.out.println("Tital of the page"+driver.getTitle());
		System.out.println("URL of the page"+ driver.getCurrentUrl());
		
		
		
		//driver.close();
		
	}

}


