 
package com.practice;

 import javax.swing.*;
 import java.awt.*; 
import java.text.SimpleDateFormat;
import java.util.Date;
 

public class MyWindow extends JFrame
{
    private JLabel heading;
    
    private JLabel clockLabel;
    
    private Font font = new Font ("",Font.BOLD,35);    MyWindow()
    {
        
        super.setTitle( "CLOCK");
        super.setSize(300,300);
        super.setLocation(100,100);
        this.createGUI();
        this.startClock();
        super.setVisible( true);
    }
    
    public void createGUI()

    {
        
        //gui
        
        heading = new JLabel ("DIGITAL CLOCK");
        
        clockLabel = new JLabel("clock");
        
        heading.setFont(font);
        clockLabel.setFont(font);
        
        
        
        
        
        this.setLayout(new GridLayout(2,1));
        
        this.add(heading);
        
        this.add(clockLabel);
        
    }
    
    public void startClock()
  
    {
        
        
       Thread t = new Thread()
               
       {
           
           public void run()
                   
           {
               try
               
               {
                   
                   while(true)
                       
                   {
                       
                       Date d = new Date();
                       
                       SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
                       
                       String dateTime = sfd.format(d);
                       
                       clockLabel.setText(dateTime);
                       
                      // Thread.sleep( 1000);
                   Thread.currentThread().sleep(1000);
                   
                   }
                   

               } catch (InterruptedException e)
                   
               {
                   
                   e.printStackTrace();
               }
               
           }
           
       };
       
t.start();

    }
    
}
           
       
                  
                       
                       
                   
               
               
               
    
                
         
          
      

    
