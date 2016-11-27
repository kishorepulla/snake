/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p kishore
 */
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author p kishore
 */
public class Snake27 implements KeyListener{

    /**
     * @param args the command line arguments
     */
   static Snake27 kk= new Snake27();
   static Panel_ k= new Panel_();
   
  static int c=0;
  static boolean collision=false;
    public static void main(String[] args) {
       
         
         
     //Runnable coll= new mainloop();   
         
         
       
        JFrame j= new JFrame("kishore");
        j.setSize(500, 500);
        j.setResizable(true);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       k.addKeyListener(kk);
        j.add(k);
        
               

        
        while(true&&!collision){
            try {
                
               
                k.repaint();
                collision=k.checkCollision();
                if((k.pk[k.length-1][0]==k.fx)&&(k.pk[k.length-1][1]==k.fy-4||k.pk[k.length-1][1]==k.fy-3||k.pk[k.length-1][1]==k.fy-2||k.pk[k.length-1][1]==k.fy-1||k.pk[k.length-1][1]==k.fy||k.pk[k.length-1][1]==k.fy+1||k.pk[k.length-1][1]==k.fy+2||k.pk[k.length-1][1]==k.fy+3||k.pk[k.length-1][1]==k.fy+4))
               {
                 
                    k.increase();
                    k.fi=(int) (Math.random()*100);
                    k.fx=k.fi*5;
                    k.fi=(int) (Math.random()*100);
                    k.fy=k.fi*5;
                    
                  //  k.isEaten=false;
               }
                Thread.sleep(80);
            } catch (InterruptedException ex) {
                Logger.getLogger(Snake27.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

      
        
         if(e.getKeyCode()==40&&k.ss[k.length-1]!='u')
         {
             
             
             k.pp[k.pk[k.length-1][0]][k.pk[k.length-1][1]]='d';
         }
        
        if(e.getKeyCode()==39&&k.ss[k.length-1]!='l')
         {
             k.pp[k.pk[k.length-1][0]][k.pk[k.length-1][1]]='r';
         }
        
        if(e.getKeyCode()==38&&k.ss[k.length-1]!='d')
         {
             k.pp[k.pk[k.length-1][0]][k.pk[k.length-1][1]]='u';
         }
        if(e.getKeyCode()==37&&k.ss[k.length-1]!='r')
         {
             k.pp[k.pk[k.length-1][0]][k.pk[k.length-1][1]]='l';
         }
         if(e.getKeyChar()=='i')
         {
             k.increase();
         }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

   

   

   

    
    
}
