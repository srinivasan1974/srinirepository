package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClasssep {
public static WebDriver driver = null;
public static WebDriver getBrowser() throws Throwable {
	loadProperties();
	 String browser = p.getProperty("browser");
	 if (browser.equalsIgnoreCase("chrome"))
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\UmaG\\eclipse-workspace\\BSepSriniCucu\\src\\test\\java\\driversep\\chromedriver.exe");
	  driver = new ChromeDriver();}
	 else if (browser.equalsIgnoreCase("firefox"))
	{System.setProperty("webdriver.gecko.firefox","C:\\Users\\UmaG\\eclipse-workspace\\BSepSriniCucu\\src\\test\\java\\driversep\\geckodriver.exe");
			driver = new ChromeDriver();}
	 		return driver;
}
	
	public static Properties p;
	public static Properties loadProperties() throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\UmaG\\eclipse-workspace\\BSepSriniCucu\\src\\main\\java\\config\\Congfigsep.properties");
		p = new Properties();
		p.load(fis);
		return p;
		}
	
	public static void clickOnElement(WebElement signin_Btn) {
		signin_Btn.click();
	}
	public static void inputValueElement(WebElement element, String string) {
		element.sendKeys(string);
	}
	
		public static void mouseOverAction(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		}

		// frame
		public static void moveToFrame(WebElement iframelement) {
			driver.switchTo().frame(iframelement);
		}

		public static void selectByVisiTxt(WebElement selelement,String string ) {
			Select s = new Select(selelement);
			s.selectByVisibleText(string);
		}
		public static void selectByIndex(WebElement selelement,int index ) {
			Select s = new Select(selelement);
			s.selectByIndex(index);
		}
		public static void selectByValue(WebElement selelement,String str ) {
			Select s = new Select(selelement);
			s.selectByValue(str);
		}
		public static void screenshot(String sname) throws Throwable {
			TakesScreenshot t = (TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des = new File(".\\ScreenShot" + sname + ".png");
			FileUtils.copyFile(src, des);
			
		}

		public static void scrolldown() {
			JavascriptExecutor sd = (JavascriptExecutor)driver;
			sd.executeScript("window.scrollBy(0,300)");
		}
		public static void implicitWait() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		public void close() {
			//driver.quit();
		}
		
}
