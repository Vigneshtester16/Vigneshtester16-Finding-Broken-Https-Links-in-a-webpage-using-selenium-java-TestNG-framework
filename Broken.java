import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Broken {
	public WebDriver driver;
	 String path="D:\\chromedriver_win32 (6)\\chromedriver.exe";
	 String url="http://seeds2oil.net/";
	public int i;
	
	
	@Test
    public static void main() {
    	System.setProperty("webdriver.chrome.driver", path);
		  driver = new ChromeDriver();
		  driver.navigate().to(url);
		  driver.manage().window().maximize();
		   
		  
		  
		  

		  public void findbrokenlinks() {
				List<WebElement> links = driver.findElements(By.tagName("a"));
				
				System.out.println(links.size());
				
				for(int i= 0; i<links.size(); i++  );
				{
			
				WebElement element = links.get(i);	
				String url = element.getAttribute("href");
				
				URL link = new URL(url); 
				HttpURLConnection httpconn = (HttpURLConnection)link.openConnection();
				Thread.sleep(2000);
				httpconn.connect();
				int rescode = httpconn.getResponseCode();
				
				if (rescode >=400);
				{
					System.out.print(url + "-" + " is broken links" ); 	
				}
				
				else
				{
					
					System.out.print(url + "-" + " is valid links" ); 	
					
				}	
				}
					
			}	

		}
