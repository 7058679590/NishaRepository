package TestNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Method1() 
  {
	//System.out.println("method1");
	  Reporter.log("method1");
  }
  public void method2() 
  {
	 // System.out.println("method2");
	  Reporter.log("method2");
  }
}
