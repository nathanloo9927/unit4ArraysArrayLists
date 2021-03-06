import javax.swing.JFrame;
import java.util.*;
/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author Nathan
 * @version 12/11/15
 */
public class RadarViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create the radar, set the monster location, and perform the initial scan
        final int ROWS = 100;
        final int COLS = 100;
        Radar radar = new Radar(ROWS, COLS);
        radar.setNoiseFraction(0.10);
        radar.scan();
        
        JFrame frame = new JFrame();
        
        frame.setTitle("Signals in Noise Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // asking the user if he/she wants to input the location of the monster or simply have the
        // computer set a random location
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.print("Would you like to input the location of the monster or randomly set it? (0 = set it, any integer = randomly set it): ");
        choice = in.nextInt();
        if (choice == 0)
        {
            // this is if the user chose to set the location
            int row, col;
            do
            {
                // do this while the user enters a value that is out of bounds of the grid row
                System.out.print("Set the location for the row of the monster: ");
                row = in.nextInt();
            } while (row >= ROWS || row < 0);
            do
            {
                // do this while the user enters a value that is out of bounds of the grid column
                System.out.print("Set the location for the column of the monster: ");
                col = in.nextInt();
            } while (col >= COLS || col < 0);
            radar.setMonsterLocation(row,col);
        }
        // a frame contains a single component; create the radar component and add it to the frame
        RadarComponent component = new RadarComponent(radar);
        frame.add(component);
        
        // set the size of the frame to encompass the contained component
        frame.pack();
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // perform 100 scans of the radar wiht a slight pause between each
        // after each scan, instruct the Java Run-Time to redraw the window
        for(int i = 0; i < 100; i++)
        {
            Thread.sleep(100); // sleep 100 milliseconds (1/10 second)
            
            radar.scan();
            
            frame.repaint();
        }
    }

}
