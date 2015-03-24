
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class Paddle extends JLabel{
    
    ImageIcon paddleIcon;
    
    Paddle(){
        paddleIcon = new ImageIcon("paddle.JPG");
        setIcon(paddleIcon);
        setBounds(new Rectangle(0, 430, 50, 50));
    }
    
}
