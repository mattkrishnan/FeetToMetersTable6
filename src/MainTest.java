import static org.junit.Assert.*;

/**
 * @author Tushar Balarajan
 * CSC 201-004N
 * Professor Tanes Kanchanawanchai
 */
public class MainTest {
    @org.junit.Test
    public void footToMeter(){
        double expected = 30.5;
        assertEquals("The test failed", expected, Main.footToMeter(100), .1);
    }


    @org.junit.Test
    public void meterToFoot(){
        double expected = 327.9;
        assertEquals("The test failed", expected, Main.meterToFoot(100), .01);

        /* WHEN WORKING WITH DOUBLES OR FLOAT  USE ANOTHER PARAM TO ALLOW DELTA */
    }

}