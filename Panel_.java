/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author p kishore
 */
class Panel_ extends JPanel {
    int fi,fx,fy;
     
   
    char[][] pp= new char[600][600];
  boolean dir=true;
  int length =2,j=0;
   char[] sss = new char[length];
    char[] ss= new char[length];
    char[][] color=new char[600][600];
    boolean[][] collision=new boolean[600][600];
    //int[][] pk= {{0,4},{5,4},{10,4},{15,4},{20,4},{25,4},{30,4},{35,4},{40,4},{45,4},{50,4},{55,4},{60,4},{65,4}};
    int[][] pk=new int[length][2];
    
    boolean finalcollision=false;
    public Panel_()
    {
         int ii;
         fi=(int) (Math.random()*80);
    fx=5*fi;
     fy=5*fi;
        // TODO code application logic here
        for(int i=0;i<length;i++)
        {
            ss[i]='r';
            
          
        }
        sss=ss;
        for(int i=0;i<length;i++)
        {
            pk[i][0]=j+i*5;
            pk[i][1]=4;
        }
      for(ii=0;ii<600;ii++)
   {
       for(int j=0;j<600;j++)
       {
           pp[ii][j]='0';
       }
   } 
      for(ii=0;ii<600;ii++)
   {
       for(int j=0;j<600;j++)
       {
           collision[ii][j]=false;
       }
   } 
       for(int i=0;i<length;i++)
          {
              collision[pk[i][0]][pk[i][1]]=true;
          }
        
    }
   
    @Override
    public void paintComponent(Graphics g)
    {
        int r=(int) (Math.random()*255);
        int g2=(int)(Math.random()*255);
        int b=(int)(Math.random()*255);
       
        
        
        g.clearRect(0, 0, 505, 505);
            g.setColor(new Color(r,g2,b));
        
            
          
            
        for(int i=length-1;i>=0;i--)
        {
            sss[i]=ss[i];
            if(pp[pk[i][0]][pk[i][1]]=='0')
            {
              
                
            if(ss[i]=='r')
            {
                if(i==length-1&&collision[pk[length-1][0]+5][pk[length-1][1]]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][0]=(pk[i][0]+5)%500;
                if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
                
                
            }
             if(ss[i]=='l')
            {
                if(i==length-1&&collision[pk[length-1][0]-5][pk[length-1][1]]==true)
                        {
                         finalcollision=true;   
                        }
                 
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                
                pk[i][0]-=5;
                 if(pk[i][0]<=0)
                {
                    pk[i][0]=500;
                }
                 if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
                                 

            }
              if(ss[i]=='d')
            {
               if(i==length-1&&collision[pk[length-1][0]][pk[length-1][1]+5]==true)
                        {
                         finalcollision=true;   
                        }
              
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][1]=(pk[i][1]+5)%500;
                if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
            }
               if(ss[i]=='u')
            {
                if(i==length-1&&collision[pk[length-1][0]][pk[length-1][1]-5]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][1]-=5;
                 if(pk[i][1]<=0)
                {
                    pk[i][1]=500;
                }
                 if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
                                 

            }
               if(!finalcollision||i!=length-1)
               g.fillRect(pk[i][0], pk[i][1], 4, 4);
                g.fillRect(fx,fy, 4, 4);
                
            }
            else
            {
                
               
               ss[i]= pp[pk[i][0]][pk[i][1]];
               
               if(i==0)
              {
pp[pk[i][0]][pk[i][1]]='0';
               }
                if(ss[i]=='r'&&sss[i]!='l')
            {
                if(i==length-1&&collision[pk[length-1][0]+5][pk[length-1][1]]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][0]=(pk[i][0]+5)%500;
                if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
            }
             if(ss[i]=='l'&&sss[i]!='r')
            {
                if(i==length-1&&collision[pk[length-1][0]-5][pk[length-1][1]]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][0]-=5;
                if(pk[i][0]<=0)
                {
                    pk[i][0]=500;
                }
                if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
            }
              if(ss[i]=='d'&&sss[i]!='u')
            {
                if(i==length-1&&collision[pk[length-1][0]][pk[length-1][1]+5]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][1]=(pk[i][1]+5)%500;
                if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }  
            }
               if(ss[i]=='u'&&sss[i]!='d')
            {
                if(i==length-1&&collision[pk[length-1][0]][pk[length-1][1]-5]==true)
                        {
                         finalcollision=true;   
                        }
               
                if(i==0)
                {
                    collision[pk[i][0]][pk[i][1]]=false;
                }
                pk[i][1]-=5;
                 if(pk[i][1]<=0)
                {
                    pk[i][1]=500;
                }
                 if(i==length-1)
                {
                    collision[pk[i][0]][pk[i][1]]=true;
                }
            }
               if(!finalcollision||i!=length-1)
               g.fillRect(pk[i][0], pk[i][1], 4, 4);

           g.fillRect(fx,fy, 4, 4);
                
            
            
               
            }
           
        }
            
        
       
        
       
      }
    
   
@Override
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    boolean checkCollision() {
      return finalcollision;    
    }

    void increase() 
    {
    
        int[][] pk2=new int[length+1][2];
        char[] ss2=new char[length+1];
       
        
        for(int i=0;i<length;i++)
        {
            pk2[i][0]=pk[i][0];
        pk2[i][1]=pk[i][1];
        ss2[i]=ss[i];
        }
        ss2[length]=ss[length-1];
        if(ss[length-1]=='r')
        {
            pk2[length][0]=pk[length-1][0]+5;
            pk2[length][1]=pk[length-1][1];
            
        }
        if(ss[length-1]=='l')
        {
            pk2[length][0]=pk[length-1][0]-5;
            pk2[length][1]=pk[length-1][1];
        }
        if(ss[length-1]=='u')
        {
            pk2[length][1]=pk[length-1][1]-5;
            pk2[length][0]=pk[length-1][0];
        }
        if(ss[length-1]=='d')
        {
            pk2[length][1]=pk[length-1][1]+5;
            pk2[length][0]=pk[length-1][0];
        }
        pk=pk2;
        ss=ss2;
        sss=ss;
        length+=1;
    }
   
        
    
}