package tests.Day14_testNGFreamwork;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("İlk test calisti");
    }

    @Test(priority = 8)
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }

    @Test(priority = 9)
    public void ucuncuTest(){
        System.out.println("üçüncü test calisti");
    }

}
