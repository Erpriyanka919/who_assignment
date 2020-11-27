import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment_1 {
	

	public static WebDriver driver = null;
		
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjects\\who-academy\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
  //To navigate to url 
     driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
     driver.navigate().refresh();
        
  //To click on Add Element button
   WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));  
   addButton.click();

  //To remove Delete button
   WebElement removeButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
   System.out.println(removeButton.getText() + " is added");
   removeButton.click();
   
   try   
      {
	   Assert.assertEquals(removeButton.isDisplayed(), null);
	  } 
       catch (StaleElementReferenceException e) {
	   System.out.println("Delete button is removed");
	  }
   driver.close();
}
}
