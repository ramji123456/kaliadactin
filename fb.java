package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\itadmin\\eclipse-workspace\\Kaliselenium\\kalichrome\\chromedriver.exe");
		WebDriver WD = new ChromeDriver();
         WD.get("https://www.facebook.com/login/");
         WebElement SignUP = WD.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
         SignUP.click();
         Thread.sleep(2000);
         WebElement name = WD.findElement(By.name("firstname"));
         name.sendKeys("Kalirajan");
         Thread.sleep(2000);
         WebElement Lastname = WD.findElement(By.name("lastname"));
         Lastname.sendKeys("V");
         Thread.sleep(2000);
         WebElement Email = WD.findElement(By.name("reg_email__"));
         Email.sendKeys("9025380571");
         Thread.sleep(2000);
         WebElement Password = WD.findElement(By.xpath("//input [@name='reg_passwd__']"));
         Password.sendKeys("Kali@8126");
         Thread.sleep(2000);
          WebElement Day = WD.findElement(By.id("day"));
          Select S = new Select(Day);
          S.selectByValue("8");
          Thread.sleep(2000);
          WebElement Month = WD.findElement(By.id("month"));
          Select S2 = new Select(Month);
          S2.selectByVisibleText("Apr");
          Thread.sleep(2000);
          WebElement Year = WD.findElement(By.id("year"));
          Select S3 = new Select(Year);
          S3.selectByValue("1997");
          Thread.sleep(5000);
          WebElement Sex = WD.findElement(By.name("sex"));
          Sex.click();
          Thread.sleep(4000);
          WebElement Click = WD.findElement(By.name("websubmit"));
          Click.click();
	}

}
