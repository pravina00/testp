package sauce_demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class happy_flow {
	@BeforeSuite
    public void Verifying_happyflow(){
        System.out.println("Verying happy flow of saucelabs demo");
    }

    @AfterSuite
    public void verifying_happyflow_success(){
        System.out.println("1 iteration of user happy flow is done succesfully");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("Open saucelabsdemo");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("verify thank you page ");
    }


    @BeforeClass
    public void initWebDriver(){
        System.out.println("login to user with valid credentials");
    }

   

    @BeforeMethod
    public void openBrowser(){
        System.out.println("Validate user logged in ");
    }

    
   
    
   
    @Test
    public void Add_to_cart() throws InterruptedException {
        System.out.println("click on add to cart");
        Thread.sleep(2000);
    }
    @Test
    public void verify_cart() throws InterruptedException {
        System.out.println("verify product in cart");
        Thread.sleep(2000);
    }
    @Test
    public void product_page() throws InterruptedException {
        System.out.println("verify product page for price and details");
        Thread.sleep(2000);
    }
    
    
}
