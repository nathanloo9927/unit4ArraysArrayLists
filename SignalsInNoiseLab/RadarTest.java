import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void checkIfMonsterIsInRightLocation1()
    {
        Radar radar = new Radar(100,100);
        int scanning = (int)(Math.random() * 1);
        int row = (int)(Math.random() * 100);
        int col = (int)(Math.random() * 100);
        radar.setMonsterLocation(row,col);
        radar.setNoiseFraction(0.05);
        for (int i = 0; i <= scanning; i++)
        {
            radar.scan();
        }
        int scanned = radar.getNumScans();
        int appeared = radar.getAccumulatedDetection(row,col);
        assertEquals(appeared,scanned);
    }
    
    @Test
    public void checkIfMonsterIsInRightLocation2()
    {
        Radar radar = new Radar(1000,1000);
        int scanning = (int)(Math.random() * 10);
        int row = (int)(Math.random() * 1000);
        int col = (int)(Math.random() * 1000);
        radar.setMonsterLocation(row,col);
        radar.setNoiseFraction(0.15);
        for (int i = 0; i <= scanning; i++)
        {
            radar.scan();
        }
        int scanned = radar.getNumScans();
        int appeared = radar.getAccumulatedDetection(row,col);
        assertEquals(appeared,scanned);
    }
}
