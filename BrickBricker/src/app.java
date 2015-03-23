/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cwh5278
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash SplashScreen = new Splash();
        SplashScreen.setVisible(true);
        
        try{
        Thread.sleep(3000);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }     
        
        SplashScreen.setVisible(false);
        MainFrame theMainFrame = new MainFrame();
        }

}
