package CorpAlto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {
	WebDriver driverobj;
	
	public login(WebDriver driverobj) throws InterruptedException  
	{
//System.setProperty("webdriver.gecko.driver","/home/tarun/Documents/geckodriver");
		
//         this.driverobj = new FirefoxDriver();
		
		driverobj.get("http://18.220.197.216/CorpAlto/#/Sign-In");
		driverobj.manage().window().maximize();
		//employer id
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div/div[1]/input")).sendKeys("E1675484");
		//password
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div/div[2]/input")).sendKeys("123456");
		//submit
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div/div[3]/div/button")).click();
	Thread.sleep(2000);
	//Add Employee
		driverobj.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/button")).click();
		//first name
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/div[1]/div/input")).sendKeys("marrot");
		//last name
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[2]/div[3]/div/input")).sendKeys("emp");
		//email
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[3]/div[1]/div/input")).sendKeys("testauto@yopmail.com");
		//mobile number
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[3]/div[2]/div/input")).sendKeys("535353455543");
		//SSN
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[4]/div[1]/div/input")).sendKeys("789234567");
		//date picker
	//	driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[4]/div[2]/div/button")).click();
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[4]/div[2]/div/div[1]/input")).sendKeys("08/08/1986");
		Thread.sleep(1000);
		driverobj.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/div/div/div[6]/div/div[1]/button")).click();
		
		
		
	}
	}

