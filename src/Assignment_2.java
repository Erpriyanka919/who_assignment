import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Assignment_2 {

	public static WebDriver driver = null; 
	
	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "D:\\SeleniumProjects\\who-academy\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
  //To navigate to base url 
		
		driver.get("https://the-internet.herokuapp.com/shifting_content/menu");
		
		
  //Save the Base Screen Screenshot		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".\\ImagesForTesting\\Menu.PNG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	  Screen screen=new Screen();
	  Pattern menu = new Pattern(".\\ImagesForTesting\\Menu.PNG");

  //To navigate to random url 
      System.out.println("TC-01 - To verify the UI alignment with Mode=Random");
 	  driver.get("https://the-internet.herokuapp.com/shifting_content/menu?mode=random");

  //Save the Random Screen Screenshot	
	  File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try 
	  {
			String current = ".\\ImagesForTesting\\Random_Image.PNG";
			FileUtils.copyFile(src1, new File(current));
			 

		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
  //TC-01 - To verify the UI alignment with Mode=Random

	    Finder f1=new Finder(screen.capture().getImage());
	    f1.find(menu);
	    if(f1.hasNext()){
	        Match m=f1.next();
	        System.out.println("Match found with Random Screen "+(m.getScore() * 100) +"%" + "\n");
	        f1.destroy();

	    }
	    
	    else{
	        System.out.println("No Match Found with Random Screen");
	    }
		
  //To navigate to UI alignment with pixel_shift=100
      System.out.println("TC-02 - To verify the UI alignment with pixel_shift=100");
 	  driver.get("https://the-internet.herokuapp.com/shifting_content/menu?pixel_shift=100");

  //Save the pixel_shift=100 Screen Screenshot	
	  File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try 
	  {
			FileUtils.copyFile(src2, new File(".\\ImagesForTesting\\PixelShift_Image.PNG"));
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

  //TC-02 - To verify the UI alignment with pixel_shift=100
		
	    Finder f2=new Finder(screen.capture().getImage());
	    f2.find(menu);
	    if(f2.hasNext()){
	        Match m=f2.next();
	        System.out.println("Match found with pixel_shift=100 Screen "+(m.getScore() * 100) +"%" + "\n");
	        f2.destroy();

	    }
	    
	    else{
	        System.out.println("No Match Found with pixel_shift=100 Screen");
	    }

  //To navigate to UI alignment with mode=random&pixel_shift=100
      System.out.println("TC-03 - To verify the UI alignment with mode=random&pixel_shift=100");
 	  driver.get("https://the-internet.herokuapp.com/shifting_content/menu?mode=random&pixel_shift=100");

  //Save the mode=random&pixel_shift=100 Screen Screenshot	
	  File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try 
	  {
			FileUtils.copyFile(src3, new File(".\\ImagesForTesting\\RandomPixelShift_Image.PNG"));
		}catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		

  //TC-03 - To verify the UI alignment with mode=random&pixel_shift=100
  	    Finder f3=new Finder(screen.capture().getImage());
	    f3.find(menu);
	    if(f3.hasNext()){
	        Match m=f3.next();
	        System.out.println("Match found with mode=random&pixel_shift=100 Screen "+(m.getScore() * 100) +"%" + "\n");
	        f3.destroy();

	    }
	    
	    else{
	        System.out.println("No Match Found with mode=random&pixel_shift=100 Screen");
	    }	
	    
	    //Refresh the screen
	      System.out.println("TC-04 - To verify the UI alignment with the base screen on selecting Refresh(F5)");
	      driver.get("https://the-internet.herokuapp.com/shifting_content/menu");
	      driver.navigate().refresh();

	  //Save the Screenshot	on selecting Refresh(F5)
		  File src4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  try 
		  {
				FileUtils.copyFile(src4, new File(".\\ImagesForTesting\\Refresh_Image.PNG"));
			}catch (IOException e4) {
				// TODO Auto-generated catch block
				e4.printStackTrace();
			}
			

	  //TC-04 - To verify the UI alignment with the base screen on selecting Refresh(F5)
	  	    Finder f4=new Finder(screen.capture().getImage());
		    f4.find(menu);
		    if(f4.hasNext()){
		        Match m=f4.next();
		        System.out.println("Match found on Refresh Screen "+(m.getScore() * 100) +"%" + "\n");
		        f4.destroy();

		    }
		    
		    else{
		        System.out.println("No Match Found on Refresh Screen");
		    }	
		
		
	}
	}
		

