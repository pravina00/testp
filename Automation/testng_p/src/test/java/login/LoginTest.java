package login;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    @BeforeSuite
    public void readProp(){
        System.out.println("Read env, base URL - before suite");
    }

    @AfterSuite
    public void generateReport(){
        System.out.println("Report is generated.- After suite");
    }


    @BeforeTest
    public void beforeTest(){
        System.out.println("Creating Test Data from DB - before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Cleanup Test Data from DB - After test ");
    }


    @BeforeClass
    public void initWebDriver(){
        System.out.println("Webdriver initialized - before class.");
    }

    @AfterClass
    public void quitWebDriver(){
        System.out.println("Webdriver closed. - after class");
    }

    @BeforeMethod
    public void openBrowser(){
        System.out.println("Browser is opened.- before method");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("Browser is closed - after method.");
    }
    @Test
    public void productPageTest() throws InterruptedException {
        System.out.println("Test login 1");
        Thread.sleep(2000);
    }
    @Test
    public void verify() throws InterruptedException {
        System.out.println("Test login 2");
        Thread.sleep(2000);
    }

   /* @Test(priority = 1)
   // public void loginTest() throws InterruptedException {
   //     System.out.println("Test login1");
      //  Thread.sleep(2000);
        //Assert.fail();
    }
    @Test
    public void productPageTest() throws InterruptedException {
        System.out.println("Test login 2");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void checkoutPageTest() throws InterruptedException {
        System.out.println("Test login3");
        Thread.sleep(2000);
    }
    

    @Test(priority = 2, enabled = false)
    public void addressTest() throws InterruptedException {
        System.out.println("Test login3");
        Thread.sleep(2000);
    }
    

    @Test(priority = -1)
    public void verifyProductPage() throws InterruptedException {
        System.out.println("Test login3");
        Thread.sleep(2000);
    }
*/


}
