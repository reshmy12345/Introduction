package Package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.com/");
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Browser launched successfully");
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Dress");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Shirts");
		System.out.println("Successfully added");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"a-autoid-2-announce\"]")).click();
		WebElement staticdropdown= driver.findElement(By.xpath("//*[@name=\"quantity\"]"));
		Select dropDown=new Select(staticdropdown);
		dropDown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		driver.quit();
		
		
		//Select class
		
		/*WebElement staticfropdown= driver.findElement(By.xpath(""));
		Select dropdown=new Select(staticfropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		*/
	}

}
