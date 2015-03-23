
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class Splash extends JFrame{
    
    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private ImageIcon theSplashImage;
    
    public Splash(){
        
        this.initCustomComponents();
        this.setSize(950, 650);
        this.setLocationRelativeTo(null);
        //imagePanel.setBackground(Color.decode("#EFE3AF"));
    }
    
    public void initCustomComponents(){
        
        theSplashImage = new ImageIcon("Splash.jpg");
        imageLabel.setIcon(theSplashImage);
        imagePanel.add(imageLabel);
        this.getContentPane().add(imagePanel);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}