package PomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaObjectClass {

	WebDriver driver;
		public JavaObjectClass(WebDriver driver)
		{
			this.driver= driver;
		
		}



		By search= By.name("q");
		
		public WebElement Search()
		{
			return driver.findElement(search);
		}

}
