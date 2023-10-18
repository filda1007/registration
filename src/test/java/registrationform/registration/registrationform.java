package registrationform.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Register.php");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Filda");
		WebElement address= driver.findElement(By.id("address"));
		address.sendKeys("Rosevila,Kochi,Pincode-682506");
		WebElement gender = driver.findElement(By.id("female"));
		gender.click();
		WebElement reading = driver.findElement(By.id("reading"));
		reading.click();
		WebElement music = driver.findElement(By.id("music"));
		music.click();
		Select country = new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		country.selectByValue("Canada");
		Select city = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/select[2]")));
		city.selectByVisibleText("Toronto");
		
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"registration-form\"]/button"));
		submit.click();
		
		

	}

}
