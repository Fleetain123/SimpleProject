package simplejavaProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaProject {
	
	
    public static void main(String[] args) throws MalformedURLException {
    	

   	 WebDriver driver;
   	String Directory = System.getProperty("user.dir");
   	System.out.println(Directory);
   	String str=	System.getProperty("os.name");//
   	System.out.println(str);
   	if(str.equals("Windows 8.1")){
   		System.setProperty("webdriver.chrome.driver", Directory+"/chromedriver.exe");
   		driver = new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://www.google.com/");
   	}
   	else{
   		if(str.equals("CentOS Linux")) {
   			System.setProperty("webdriver.chrome.driver",Directory+"/chromedriver");
   			   driver=new ChromeDriver();
   			  driver.manage().window().maximize();
   			driver.get("https://www.google.com/");
   	}
   			
   	}
   	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
     /*// System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\git\\SimpleProject\\SimpleProject\\chromedriver.exe");
	  //  WebDriver driver=new ChromeDriver();
	    new DesiredCapabilities();
        URL serverurl = new URL("http://108.179.223.107:4444");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(serverurl,capabilities);
    driver.get("http://www.google.com");}*/
	    
		
		
		
	
}
