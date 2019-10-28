package ProvaKata8;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    String book = "\"1000.00\n"
            + "125 Market 125.45\n"
            + "126 Hardware 34.95\n"
            + "127 Video 7.45\n"
            + "128 Book 14.32\n"
            + "129 Gasoline 16.10\"";

    @Test
    public void Test(){

        App app = new App();
        assertEquals(App.balance(book), "\"Original_Balance:_1000.0\n" +
               "125_Market_125.45_Balance_874.55\n" +
                "126_Hardware_34.95_Balance_839.59\n"+
               "127_Video_7.45_Balance_832.14\n" +
               "128_Book_14.32_Balance_817.82\n" +
               "129_Gasoline_16.10_Balance_801.72\n" +
               "Total_expense__198.27\n" +
               "Average_expense__39.65\"");
    }
}
