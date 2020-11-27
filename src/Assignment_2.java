import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Assignment_2 {
	

	public static WebDriver driver = null;

		
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
    System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjects\\who-academy\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
  // To navigate to url 
     driver.get("https://the-internet.herokuapp.com/shifting_content/menu");
     Thread.sleep(3000);
     int id1X = driver.findElement(By.linkText("Portfolio")).getLocation().x; 
     driver.navigate().refresh();
     Thread.sleep(3000);
     int id2X = driver.findElement(By.linkText("Portfolio")).getLocation().x;
     assertEquals(id1X, id2X);
     
/*	  Screen screen = new Screen();
	  Pattern menu = new Pattern(".\\ImagesForTesting\\Menu.PNG");
      screen.wait(menu, 5);*/
      driver.close();

 

}
}
