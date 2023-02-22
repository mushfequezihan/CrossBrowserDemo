package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class TestDemo {

	@Test
	public void titleCheck() throws MalformedURLException {
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.139:4444"), caps);
		
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"), caps);
		
		driver.get("https://rahulshettyacademy.com");
		org.testng.Assert.assertTrue(driver.getTitle().matches("Selenium*"));
		
		//testing GIT demo
		
		//I am adding from infoy laptop
	}
	 
}
