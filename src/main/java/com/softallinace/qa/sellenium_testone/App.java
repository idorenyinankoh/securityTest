package com.softallinace.qa.sellenium_testone;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class App 
{
	@SuppressWarnings("unused")
	
	public void testing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\iankoh.SOFTALLIANCE\\Documents\\sellenium drivers\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://juice-shop.herokuapp.com/");
		if (true) {
			driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		}else {
			System.out.println("nothing");
		}

		driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//button[@id='navbarLoginButton']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", ele);

		Thread.sleep(6000);

		WebElement elem = driver.findElement(By.xpath("//a[contains(text(),'Not yet a customer?')]"));
		//	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", elem);

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='emailControl']")).sendKeys("1test@mailinator.com");
		driver.findElement(By.xpath("//input[@id='passwordControl']")).sendKeys("11111111");
		driver.findElement(By.xpath("//input[@id='repeatPasswordControl']")).sendKeys("11111111");
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]"+
				"/app-register[1]/div[1]/mat-card[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")).click();
		Thread.sleep(2000);
		//WebElement eleme = 
		driver.findElement(By.xpath("//span[contains(text(),' maiden name? ')]")).click();


		driver.findElement(By.xpath("//input[@id='securityAnswerControl']")).sendKeys("test");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)");

		WebElement eleme = 
				driver.findElement(By.xpath("//button[@id='registerButton']"));

		jse.executeScript("arguments[0].click()", eleme);

		//			driver.findElement(By.xpath("//div[contains(text(),'Michael Ankoh')]")).click();
		//			if (true) {
		//				driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		//			}else {
		//				System.out.println("nothing");
		//			}
	}
	@SuppressWarnings("unused")
	@Test
	public void juiceLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\iankoh.SOFTALLIANCE\\Documents\\sellenium drivers\\chromedriver_win32\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://juice-shop.herokuapp.com/#/login");
		if (true) {
			driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		}else {
			System.out.println("nothing");
		}
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@juice-sh.op");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Me want it!')]")).click();
		driver.findElement(By.xpath("//app-root[@ng-version='11.2.9']/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]"
				+ "/app-search-result[1]/div[1]/div[1]/div[2]/mat-grid-list[1]/div"
				+ "[1]/mat-grid-tile[2]/figure[1]/mat-card[1]/div[2]/button[1]/span[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Your Basket')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-root[@ng-version='11.2.9']/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-basket"
				+ "[1]/mat-card[1]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-38']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-39']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-root[@ng-version='11.2.9']/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-payment[1]"
				+ "/mat-card[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Place your order and pay')]")).click();
//		driver.findElement(By.xpath(null)).click();
		
		
	}
}
