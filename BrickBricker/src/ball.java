
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class ball extends JButton{
    
     int x_pos = 400;
     int y_pos =  500;
     int width = 30;
     int height = 30;
     Image myImage;
     Rectangle rect;

		public ball()
		{	
                   
                 rect = new Rectangle(x_pos,y_pos,width,height);   
         
                }                      
		}
