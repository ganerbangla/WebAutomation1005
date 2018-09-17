package helper_classes;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SetDriver {
	public static WebDriver webDriver;
	public String browser;

	
	@Before
	public void beforeTest(Scenario scenario) throws Exception {
		System.out.println("Before test....");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");  // For Windows
		webDriver = new ChromeDriver();
	}
	

	@After
	public void afterTest(Scenario scenario) {
		System.out.println("After test....");
		webDriver.quit();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void deleteCookies(WebDriver driver) {
        Set<Cookie> cookies = driver.manage().getCookies();
        driver.manage().deleteAllCookies();
        if (!cookies.isEmpty()) {
            System.out.println(cookies.size());
            Iterator<Cookie> iter= driver.manage().getCookies().iterator();
            while(iter.hasNext()){
                Cookie C = iter.next();
              //  System.out.println(C.getName()+"\n" + C.getPath()+"\n"+ C.getDomain()+"\n"+C.getValue()+"\n"+C.getExpiry());
            }
            cookies.clear();
            System.out.println(cookies.size());
        }
    }
}