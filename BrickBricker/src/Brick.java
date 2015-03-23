
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cody
 */
 
public class Brick {

    
JButton[] brick;
int brickx[] = new int[45];
int bricky[] = new int[45];
int x = 15;
int y = 30;

  
 for (int i = 0; i < Brick.length; i++) 
 {
 Brick[i] = new Rectangle(brickx, bricky, 30, 10);
 if (i == 5) {
 brickx = 70;
 bricky = 62;
   }
   if (i == 9) {
    brickx = 100;
    bricky = 74;
   }
   brickx += 31;
  }
    
}
