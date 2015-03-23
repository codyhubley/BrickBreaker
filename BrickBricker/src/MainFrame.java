
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class MainFrame extends JFrame {
    
    public MainFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); 
        setLocation(280,15);
        setSize (950, 650);
        setVisible(true);
        MainMenuPanel theMainMenu = new MainMenuPanel(this);
        add(theMainMenu);
    }
    
}
