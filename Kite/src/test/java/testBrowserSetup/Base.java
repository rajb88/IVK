package testBrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
		
		}
		public static WebDriver openIEtBrowser() {
		System.setProperty("webdriver.ie.driver", "\\src\\test\\resources\\browser\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		return driver;
		}
		
		public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\browser\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
		}
		
		public static WebDriver openMozillaBrowser() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
}
}
