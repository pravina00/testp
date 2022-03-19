package t1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testmethod {

	 @BeforeClass
	    public void initWebDriver(){
	        System.out.println("Webdriver initialized - before class_test method");
	    }

	    @AfterClass
	    public void quitWebDriver(){
	        System.out.println("Webdriver closed. - after class_test_method");
	    }

    @Test
    public void paymentTest() throws InterruptedException {
        System.out.println("Hello");
        System.out.println();
        Thread.sleep(2000);
    }

}
