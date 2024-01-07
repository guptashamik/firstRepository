import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v110.input.Input;
//import org.openqa.selenium.firefox.FirefoxDriver2;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.driver.chrome","C:\\Program Files\\Selenium Webdriver\\chromedriver_win32.chromedriver.exe");

 ChromeOptions options = new ChromeOptions();
 options.addArguments("--remote-allow-origins=*");
// options.setHeadless(true);

 WebDriver driver = new ChromeDriver(options);
 driver.manage().window().maximize();
 driver.get("https://demo.guru99.com/test/newtours/");
// driver.get("https://www.facebook.com/signup");
 driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("Hello World..................");
 
	/*
	 * driver.findElement(By.name("userName")).sendKeys("mercury");
	 * driver.findElement(By.name("password")).sendKeys("mercury");
	 * driver.findElement(By.name("submit")).click();
	 */
// System.out.println(driver.getTitle());
// System.out.println(driver.getCurrentUrl());
// System.out.println(driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b")).getText());
	
//driver.navigate().to("https://www.google.com/"); driver.navigate().back();
//driver.navigate().forward(); System.out.println(driver.getTitle());
	 	 
	/*
	 * driver.get("https://www.facebook.com/signup/"); WebElement female_radio =
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[7]/span/span/input"
	 * )); if (female_radio.isDisplayed() && !female_radio.isSelected()) {
	 * female_radio.click(); }
	 */

//driver.findElement(By.name("firstname")).sendKeys("FirstName");
//System.out.println("printed");
//driver.close();
 
// driver.close();
  Thread.sleep(5);
// driver.close();
	}

}
