package week3.day3.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver drive=new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		drive.get("https://www.ajio.com/");
		drive.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("watch" , Keys.ENTER);
		drive.findElement(By.xpath("//label[@for='Girls']")).click();
		drive.findElement(By.xpath("//label[@for='Girls - Watches']")).click();
		Thread.sleep(2000);
		//print the count of items
		String watchcount = drive.findElement(By.className("length")).getText();
		System.out.println("No of watch found : " +watchcount);
		System.out.println("List of Brands");
		//list of brands
		List<WebElement> brandList = drive.findElements(By.className("brands"));
		System.out.println("Size : " + brandList.size());
		for(WebElement webElement : brandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		//list of names of watch
		drive.findElement(By.xpath("//span[contains(text(),'brands')]")).click();
		List<WebElement> watchNameList = drive.findElements(By.className("brand"));
		System.out.println(" Size :" + watchNameList.size());
		System.out.println(" Names of the watches");
		for (WebElement webElement : watchNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
	}

}
