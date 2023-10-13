package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test(description="perform Login")
  public void LoginMethod()
  {
	  System.out.println("it is use to perform login");
  }
  
  @Test(description="User created",dependsOnMethods = "LoginMethod")
  public void createUserMethod()
  {
	  System.out.println("it is use to user created");  
  }
  
  @Test(description="Perform Logout",dependsOnMethods = "createuserMethod")
  public void LogoutMethod()
  {
	  System.out.println("it is use to perform logout");  
  }
}
