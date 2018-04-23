package CorpAlto;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestNG {

	  @Test (groups = {"regression"})
  public void login() {
	  System.out.println("login successfull");
  }

  @Test (groups = {"regression"})
  public void recharge()
  {
	  System.out.println("choose to recharge");
  }
  
  @BeforeGroups("regression")
  public void logout()
  {
//	  int i;
//	  for(i=0;i<5;i++){
//		  	  
		  System.out.println("logout");
  }
  
  @Test (groups = {"regression"})
  public void airtelrecharge1()
  {
	  System.out.println("select airtel rechrge");
  }
  @Test (groups = {"regression"})
  public void bsnkrecharge()
  {
	  System.out.println("sbsnk rechrge");
  }
  @Test (groups = {"regression"})
  public void idearecharge()
  {
	  System.out.println("idea rechrge");
  }
  }

