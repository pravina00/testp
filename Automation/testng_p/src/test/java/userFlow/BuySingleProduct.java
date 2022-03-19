package userFlow;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BuySingleProduct {
	


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        System.out.println("buy sell test p1");
        Thread.sleep(2000);
    }

    @Test
    public void paymentTest() throws InterruptedException {
        System.out.println("buy sell_test p0");
        System.out.println();
        Thread.sleep(2000);
    }


}