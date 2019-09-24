package simplejavaProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaProject {
	
	
    public static void main(String[] args) throws MalformedURLException {
     // System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\git\\SimpleProject\\SimpleProject\\chromedriver.exe");
	  //  WebDriver driver=new ChromeDriver();
	    new DesiredCapabilities();
        URL serverurl = new URL("http://108.179.223.107:4444");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
    driver.get("http://www.google.com");
	    
		
		
		
	}
}
