package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_sel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://demoqa.com/alerts";
		   System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		   ChromeDriver	 d=new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("promtButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("welcome to selenium");
		Thread.sleep(2000);
		alt.accept();
		 
		WebElement text=d.findElement(By.id("promptResult"));
		System.out.println(text.getText());
		 
		 
		   }
		 
		}

	}

}
