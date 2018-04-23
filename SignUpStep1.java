package CorpAlto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignUpStep1 {
	
	WebDriver driver;
	
	public void tarun() {
		
		System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
		
		driver = new FirefoxDriver();
	}
	
@Test
	public void loginpage() throws InterruptedException {
	tarun();
     driver.get("http://18.220.197.216/CorpAlto/#/Sign-Up");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#/Sign-Up-Code']")).click();
	}
@Test
	public void signupcode() throws InterruptedException {

	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("please let me in");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(@class,'sign-in-button')]//div[contains(@class, 'button')]")).click();
		Thread.sleep(2000);
	

//		// comapny name
	driver.findElement(By.name("company_name")).sendKeys("mastalto chk");
		// comapny address1
driver.findElement(By.xpath("//*[@id='form_view']/form/div[1]/div[2]/div[1]/div/input")).sendKeys("image hospital");
		// comapny address2

	driver.findElement(By.xpath("//*[@id='form_view']/form/div[1]/div[2]/div[2]/div/input")).sendKeys("hyderbad");
//		// city
		
	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[3]/div[1]/div/input")).sendKeys("Arizona");

		// Selecting Louisiana from dropdown
		WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[3]/div[2]/div/div[1]/div[1]/div[2]"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[18]/span/div/div/div")).click();
		Thread.sleep(1000);
		
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[3]/div[3]/div/input")).sendKeys("10026");
	
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[4]/div[1]/div/input")).sendKeys("Romy");
		
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[4]/div[3]/div/input")).sendKeys("corp");
		
		driver	.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[5]/div[1]/div/input")).sendKeys("mastaltochk@yopmail.com");
		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[5]/div[2]/div/input")).sendKeys("4567891324");
 driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[1]/div[6]/div/div[1]/input")).click();
driver.findElement(By.id("agreeToCambalt")).click();
//		
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/div/div/div/div[1]/form/div[2]/div/button")).click();
      Thread.sleep(2000);
//		driver.close();		
}
}


