import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tatocc {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nehasingh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://10.0.1.86/tatoc");
	driver.findElement(By.linkText("Basic Course")).click();
	driver.findElement(By.xpath("//div[@class='greenbox']")).click();
	 
	}

}
