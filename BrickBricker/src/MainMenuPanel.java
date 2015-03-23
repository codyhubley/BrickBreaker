
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
public class MainMenuPanel extends JPanel implements ActionListener{
    
    JButton play;
    JButton instructions;
    JButton exit;
    JLabel title;
    
    MainMenuPanel(){
        play = new JButton("Play");
        instructions = new JButton ("Instructions");
        exit = new JButton("Exit");
        title = new JLabel ("Brick Breaker");
        
        add(title);
        add(play);
        add(instructions);
        add(exit);
        
        play.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        GamePanel theGamePanel = new GamePanel();
        if(obj == play) 
          {
            remove(this);
            add(theGamePanel);
            revalidate();
            
          }
    }
    
}
