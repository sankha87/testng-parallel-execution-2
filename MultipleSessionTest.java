package testGuru99MultipleSession;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSessionTest {
    @Test    
    public void executSessionOne(){				//First session of WebDriver
        System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/V4/");		  //Goto guru99 site
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");   
        }
    
    @Test    
        public void executeSessionTwo(){          //Second session of WebDriver 
        System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");		  //Goto guru99 site
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2"); 
        }
        
    @Test    
        public void executSessionThree(){        //Third session of WebDriver  
        System.setProperty("webdriver.chrome.driver","C:\\browser drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");		  //Goto guru99 site
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");        
        }        
}
