import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TicTakToe6 
{
int x,y,a,b;
int i;
String aaa1="";String bbb2="";
int n=0;
int m=0;
int aa,bb,cc,dd,ee,ff,gg,hh,ii;
int aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii;
int w,z;
JButton b800=new JButton("800*500");
JButton b1200=new JButton("1200 X 800");
JButton b1300=new JButton("1300 x 850");
JButton b1400=new JButton("1400 x 900");
JButton b1500=new JButton("1500 x 950");
JButton b1600=new JButton("1600 X 1000");
JFrame pp1=new JFrame(" Launch");
ImageIcon ii1=new ImageIcon("rec\\mm1.png");
JLabel ll1=new JLabel(ii1);
ImageIcon ii2=new ImageIcon("rec\\ng.png");
ImageIcon ii3=new ImageIcon("rec\\bg2.jpg");
ImageIcon ii4=new ImageIcon("rec\\bg3.jpg");
ImageIcon ii5=new ImageIcon("rec\\start.png");
ImageIcon ii6=new ImageIcon("rec\\bg1.jpg");
ImageIcon win=new ImageIcon("rec\\win.jpg");
ImageIcon ii7=new ImageIcon("rec\\x.jpg");
ImageIcon ii8=new ImageIcon("rec\\o.png");
ImageIcon ii9=new ImageIcon("rec\\turn.png");
ImageIcon ii10=new ImageIcon("rec\\bg4.jpg");
ImageIcon ii11=new ImageIcon("rec\\start.png");
ImageIcon ii12=new ImageIcon("rec\\bg5.jpg");
ImageIcon ii13=new ImageIcon("rec\\back.png");
JLabel ll4=new JLabel(ii3);
JButton mm=new JButton(ii1);
JFrame pp2=new JFrame("      Tic Tak Toe");
JButton mb1=new JButton(ii2);
JLabel ll5=new JLabel(ii4);
JFrame pp3=new JFrame();
JLabel ll6=new JLabel(ii6);
JTextField tt1=new JTextField();
JTextField tt2=new JTextField();
JLabel ll2=new JLabel("X");
JLabel ll3=new JLabel("O");
JButton gb1=new JButton(ii5);
JButton Back1=new JButton(ii3);
JButton Back2=new JButton(ii4);
JFrame pp4=new JFrame();
JButton b1=new JButton();
JButton breplay=new JButton("REPLAY");
JButton b2=new JButton();
JButton b3=new JButton();
JButton b4=new JButton();
JButton b5=new JButton();
JButton b6=new JButton();
JButton b7=new JButton();
JButton b8=new JButton();
JButton b9=new JButton();
JLabel bl1=new JLabel(ii7);
JLabel bl2=new JLabel(ii7);
JLabel bl3=new JLabel(ii7);
JLabel bl4=new JLabel(ii7);
JLabel bl5=new JLabel(ii7);
JLabel bl6=new JLabel(ii7);
JLabel bl7=new JLabel(ii7);
JLabel bl8=new JLabel(ii7);
JLabel bl9=new JLabel(ii7);
JLabel bl11=new JLabel(ii8);
JLabel bl12=new JLabel(ii8);
JLabel bl13=new JLabel(ii8);
JLabel bl14=new JLabel(ii8);
JLabel bl15=new JLabel(ii8);
JLabel bl16=new JLabel(ii8);
JLabel bl17=new JLabel(ii8);
JLabel bl18=new JLabel(ii8);
JLabel bl19=new JLabel(ii8);
JLabel l8=new JLabel(ii9);
JLabel l2=new JLabel(ii9);
JButton MainMenu=new JButton(ii1);
JButton BackPlay=new JButton(ii13);
JLabel COMMENU1MENU=new JLabel(ii10);
ImageIcon comp1=new ImageIcon("rec\\COMPUTER.png");
ImageIcon player1=new ImageIcon("rec\\PLAYER.png");
JButton player=new JButton(player1);
JButton comp=new JButton(comp1);
JLabel tttt=new JLabel("Created by Virendra Verma & Zaid Haider");
JButton XCOMMENU1=new JButton(ii7);
JButton OCOMMENU1=new JButton(ii8);
JFrame pp6=new JFrame();
JFrame pp7=new JFrame();
JFrame pp8=new JFrame();
JTextField tt3=new JTextField();
JTextField tt4=new JTextField();
JButton Submit1=new JButton(ii11);
JButton Submit2=new JButton(ii11);
JLabel BACKGROUND5=new JLabel(ii12);
JLabel Chosexo=new JLabel("CHOSE YOUR CHOICE");
        void Launch()
        {
           pp1.setLayout(null);
            pp1.setVisible(true);
            b800.setVisible(false);
            b1200.setVisible(true);
            b1300.setVisible(true);
            b1400.setVisible(true);
            b1500.setVisible(true);
            b1600.setVisible(true);
            pp1.setLayout(null);
            pp1.setBounds(130,50,400,400);
            b800.setBounds(0,0,100,50);
            b1200.setBounds(0,0,110,50);
            b1300.setBounds(0,50,110,50);
            b1400.setBounds(0,100,110,50);
            b1500.setBounds(0,150,110,50);
            b1600.setBounds(0,200,110,50);

            pp1.add(b800);
            pp1.add(b1200);
            pp1.add(b1300);
            pp1.add(b1400);
            pp1.add(b1500);
            pp1.add(b1600);
            b800.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e1)
                {
                    x=800;y=500;
                    Main();
                }
            }
            );
             b1200.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    x=1200;y=700;
                    Main();
                }
            }
            );
             b1300.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    x=1300;y=750;
                    Main();
                }
            }
            );
             b1400.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    x=1400;y=800;
                    Main();
                }
            }
            );
             b1500.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e2)
                {
                    x=1500;y=850;
                    Main();
                }
            }
            );
             b1600.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    x=1600;y=900;
                    Main();
                }
            }
            );
            
            
            
            
            
            
        }
    void Main()
    {
       
        a=0;b=-1;
        w=300;z=200;
        aaa=0;bbb=0;ccc=0;ddd=0;eee=0;fff=0;ggg=0;hhh=0;iii=0;

aa=0;bb=0;cc=0;dd=0;ee=0;ff=0;gg=0;hh=0;ii=0;

pp1.setVisible(false);

        pp2.setVisible(true);
        ll1.setVisible(true);
        mb1.setVisible(true);
        mm.setVisible(true);
        ll1.setVisible(false);
        ll4.setVisible(true);
        tttt.setVisible(true);
        Back1.setVisible(false);
        player.setVisible(false);
        comp.setVisible(false);

        pp2.setLayout(null);
        ll1.setLayout(null);
        mb1.setLayout(null);
        Back1.setBounds(0,0,x,y);
        ll4.setBounds(0,0,x,y);
        tttt.setBounds(((x/2)+190),((y/2)+250),240,50);
        mm.setBounds(((x/2)-190),((y/2)-250),220,60);
        ll1.setBounds(((x/2)-280),((y/2)-650),200,100);
        mb1.setBounds(((x/2)-180),((y/2)-150),190,50);
        player.setBounds(((x/2)+50),((y/2)-125),110,50);
        comp.setBounds(((x/2)+25),((y/2)-175),160,50);
        ll1.setBounds(0,0,x,y);

        pp2.setBounds(0,0,x,y);

        ll4.add(mb1);
        pp2.add(Back1);
        Back1.add(mb1);
        Back1.add(mm);
        ll4.add(ll1);
        pp2.add(mm);
        pp2.add(player);
        pp2.add(comp);
        pp2.add(tttt);
        pp2.add(ll1);
        pp2.add(ll4);
        pp2.add(mb1);
        pp2.add(ll1);
        ll4.add(mb1);
        mb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent d)
            {
                player.setVisible(true);
                comp.setVisible(true);
                player.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    Player();
                }
            }
            );
            comp.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    COMMENU1();
                }
            }
            );
               
            }
        }
        );
    }
     void Player()
    {
        pp2.setVisible(false);
        pp3.setLayout(null);
        Back2.setVisible(true);
        pp3.setVisible(true);
        ll5.setVisible(true);
        ll2.setVisible(true);
        pp3.setBackground(Color.WHITE);
        ll3.setVisible(true);
        tt1.setVisible(true);
        tt2.setVisible(true);
        gb1.setVisible(true);
        Back2.setBounds(0,0,x,y);
        pp3.setBounds(0,0,x,y);
        ll5.setBounds(0,0,x,y);
        gb1.setBounds(((x/2)-50),((y/2)+50),110,50);
        tt1.setBounds(((x/2)-150),((y/2)-50),100,30);
        tt2.setBounds(((x/2)+50),((y/2)-50),100,30);
        ll2.setBounds(((x/2)-100),((y/2)-100),50,50);
        ll3.setBounds(((x/2)+100),((y/2)-100),50,50);
        pp3.add(ll5);
        pp3.add(Back1);
        ll5.add(ll2);
        ll5.add(ll3);
        ll5.add(ll3);
        ll5.add(tt2);
        ll5.add(tt1);
        ll5.add(gb1);
        ll5.add(ll2);
        ll5.add(ll3);
        

        gb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent d)
            {
                Play();
            }
        }
        );
    }
        void Play()
    {
        a=0;b=-1;
        aa=0;bb=0;cc=0;dd=0;ee=0;ff=0;gg=0;hh=0;ii=0;
        aaa=0;bbb=0;ccc=0;ddd=0;eee=0;fff=0;ggg=0;hhh=0;iii=0;
        ImageIcon win=new ImageIcon("rec\\Winner.jpg");
        JLabel il=new JLabel(win); 
        pp3.setVisible(false);
        pp4.setVisible(true);
        pp4.setLayout(null);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        b5.setVisible(true);
        b6.setVisible(true);
        b7.setVisible(true);
        b8.setVisible(true);
        b9.setVisible(true);
        ll6.setVisible(true);
        MainMenu.setVisible(true);
        BackPlay.setVisible(true);
        ll6.setBounds(0,0,x,y);
        BackPlay.setBounds(0,0,100,50);
        b1.setBounds(((x/2)-225),((y/2)-225),150,150);
        b2.setBounds(((x/2)-75),((y/2)-225),150,150);
        b3.setBounds(((x/2)+75),((y/2)-225),150,150);
        b4.setBounds(((x/2)-225),((y/2)-75),150,150);
        b5.setBounds(((x/2)-75),((y/2)-75),150,150);
        b6.setBounds(((x/2)+75),((y/2)-75),150,150);
        b7.setBounds(((x/2)-225),((y/2)+75),150,150);
        b8.setBounds(((x/2)-75),((y/2)+75),150,150);
        b9.setBounds(((x/2)+75),((y/2)+75),150,150);
        l8.setBounds(((x/2)+400),((y/2)+200),100,50);
        l2.setBounds(((x/2)-400),((y/2)+200),100,50);
        pp4.setBounds(0,0,x,y);
        ll6.add(BackPlay);
        ll6.add(b1);
        pp4.add(ll6);
        ll6.add(b2);
        ll6.add(b3);
        ll6.add(b4);
        ll6.add(b5);
        ll6.add(b6);
        ll6.add(b7);
        ll6.add(b8);
        ll6.add(b9);
        ll6.add(l8);
        ll6.add(l2);
        JLabel l1=new JLabel(""+a);
        JLabel l3=new JLabel(""+b);
        aaa1=tt1.getText();
        bbb2=tt2.getText();
        for( i=0;i<=10;i++)
            {
                l2.setVisible(false);
                l8.setVisible(true);
                JLabel player1=new JLabel();
                player1.setText(aaa1);
                        player1.setBounds(((x/2)-450),((y/2)-200),150,150);
                        player1.setVisible(true);
                        ll6.add(player1);
                        JLabel player2=new JLabel();
                        player2.setText(bbb2);
                        player2.setBounds(((x/2)+400),((y/2)-200),150,150);
                        player2.setVisible(true);
                        ll6.add(player2);
                        
                if(m%2==0)
                    {

                        a=a+2;
                        l1.setVisible(true);
                        l3.setVisible(false);
                        l1.setBounds(((x/2)-50),((y/2)-400),50,50);
                        ll6.add(l1);
                        
                        
                        
                        
                    }
                    else
                    {
                        b=b+2;
                        l1.setVisible(false);
                        l3.setVisible(true);
                        l1.setBounds(((x/2)-50),((y/2)-400),50,50);
                        ll6.add(l1);
                        
                       }
                    m++;
                        b1.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                               
                                b1.setVisible(false);
                                bl1.setVisible(true);
                                bl1.setLayout(null);
                                bl1.setBounds(((x/2)-225),((y/2)-225),150,150);
                                ll6.add(bl1);
                                aa=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                               b1.setVisible(false);
                                bl11.setVisible(true);
                                bl11.setBounds(((x/2)-225),((y/2)-225),150,150);
                                ll6.add(bl11);
                                aaa=1; 
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                        }
                    }
                        );
                         b2.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b2.setVisible(false);
                                bl2.setVisible(true);
                                bl2.setBounds(((x/2)-75),((y/2)-225),150,150);
                                ll6.add(bl2);
                                bb=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                              b2.setVisible(false);
                                bl12.setVisible(true);
                                bl12.setBounds(((x/2)-75),((y/2)-225),150,150);
                                ll6.add(bl12);
                                bbb=1; 
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                            
                        }
                        );
                         b3.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b3.setVisible(false);
                                bl3.setVisible(true);
                                bl3.setBounds(((x/2)+75),((y/2)-225),150,150);
                                ll6.add(bl3);
                                cc=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                               b3.setVisible(false);
                                bl13.setVisible(true);
                                bl13.setBounds(((x/2)+75),((y/2)-225),150,150);
                                ll6.add(bl13);
                                ccc=1; 
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b4.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b4.setVisible(false);
                                bl4.setVisible(true);
                                bl4.setBounds(((x/2)-225),((y/2)-75),150,150);
                                ll6.add(bl4);
                                dd=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                                b4.setVisible(false);
                                bl14.setVisible(true);
                                bl14.setBounds(((x/2)-225),((y/2)-75),150,150);
                                ll6.add(bl14);
                                ddd=1;
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b5.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b5.setVisible(false);
                                bl5.setVisible(true);
                                bl5.setBounds(((x/2)-75),((y/2)-75),150,150);
                                ll6.add(bl5);
                                ee=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                                b5.setVisible(false);
                                bl15.setVisible(true);
                                bl15.setBounds(((x/2)-75),((y/2)-75),150,150);
                                ll6.add(bl15);
                                eee=1;
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b6.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                
                               {
                                b6.setVisible(false);
                                bl6.setVisible(true);
                                bl6.setBounds(((x/2)+75),((y/2)-75),150,150);
                                ll6.add(bl6);
                                ff=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                               b6.setVisible(false);
                                bl16.setVisible(true);
                                bl16.setBounds(((x/2)+75),((y/2)-75),150,150);
                                ll6.add(bl16);
                                fff=1; 
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b7.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b7.setVisible(false);
                                bl7.setVisible(true);
                                bl7.setBounds(((x/2)-225),((y/2)+75),150,150);
                                ll6.add(bl7);
                                gg=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                                b7.setVisible(false);
                                bl17.setVisible(true);
                                bl17.setBounds(((x/2)-225),((y/2)+75),150,150);
                                ll6.add(bl17);
                                ggg=1;
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b8.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b8.setVisible(false);
                                bl8.setVisible(true);
                                bl8.setBounds(((x/2)-75),((y/2)+75),150,150);
                                ll6.add(bl8);
                                hh=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                                b8.setVisible(false);
                                bl18.setVisible(true);
                                bl18.setBounds(((x/2)-75),((y/2)+75),150,150);
                                ll6.add(bl18);
                                hhh=1;
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                         b9.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent d)
                            {
                                if(n%2==0)
                                {
                                b9.setVisible(false);
                                bl9.setVisible(true);
                                bl9.setBounds(((x/2)+75),((y/2)+75),150,150);
                                ll6.add(bl9);
                                ii=1;
                                l2.setVisible(true);
                                l8.setVisible(false);
                            }
                            else
                            {
                                b9.setVisible(false);
                                bl19.setVisible(true);
                                bl19.setBounds(((x/2)+75),((y/2)+75),150,150);
                                ll6.add(bl19);
                                iii=1;
                                l8.setVisible(true);
                        l2.setVisible(false);
                            }
                            n++;
                            }
                        }
                        );
                        if(aa==bb&&bb==cc)
                        {
                            il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(aa==dd&&dd==gg)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(aa==ee&&ee==ii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(dd==ee&&ee==ff)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(gg==hh&&hh==ii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(bb==ee&&ee==hh)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(cc==ee&&ee==gg)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(cc==ff&&ff==ii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                    
                   
                       
                    
                        
                        
                        
                         
                         
                         
                        
                         
                         
                         
                      
                        else if(aaa==bbb&&bbb==ccc)
                        {
                            il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(aaa==ddd&&ddd==ggg)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(aaa==eee&&eee==iii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(ddd==eee&&eee==fff)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(ggg==hhh&&hhh==iii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(bbb==eee&&eee==hhh)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(ccc==eee&&eee==ggg)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        else if(ccc==fff&&fff==iii)
                        {
                             il.setVisible(true);
                            il.setBounds(0,0,200,100);
                            ll6.add(il);
                        }
                        if(i==9)
                        {
                            breplay.setVisible(false);
                            breplay.setBounds(0,0,100,50);
                            ll6.add(breplay);
                            
                           
                        }
                        BackPlay.addActionListener(new ActionListener()
                        {
                            public void actionPerformed(ActionEvent e3)
                            {
                               pp4.setVisible(false);
                                    Main();
                                }
                            }
                            );
                        
                    }
                    
                }
    
          void Replay()
          {
              breplay.addActionListener(new ActionListener()
              {
                  public void actionPerformed(ActionEvent ff)
                  {
                     
                      Play();
                    }
                    
                }
                );
            }
            
            void COMMENU1()
            {
                pp6.setVisible(true);
                pp2.setVisible(false);
                XCOMMENU1.setVisible(true);
                OCOMMENU1.setVisible(true);
                COMMENU1MENU.setVisible(true);
                Chosexo.setVisible(true);
                pp6.setLayout(null);
                pp6.setBounds(0,0,x,y);
                COMMENU1MENU.setBounds(0,0,x,y);
                Chosexo.setBounds(((x/2)-450),((y/2)-350),400,200);
                XCOMMENU1.setBounds(((x/2)-450),((y/2)-250),200,200);
                OCOMMENU1.setBounds(((x/2)+250),((y/2)-250),200,200);
                pp6.add(COMMENU1MENU);
                COMMENU1MENU.add(XCOMMENU1); 
                COMMENU1MENU.add(OCOMMENU1);
                COMMENU1MENU.add(Chosexo);
                XCOMMENU1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    COMMENU2();
                }
            }
            );
            OCOMMENU1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    COMMENU3();
                }
            }
            );
            }
void COMMENU2()
{
    pp7.setVisible(true);
    pp6.setVisible(false);
    pp2.setVisible(false);
    tt3.setVisible(true);
    pp7.setLayout(null);
    Submit1.setVisible(true);
    pp7.setBounds(0,0,x,y);
    BACKGROUND5.setVisible(true);
    BACKGROUND5.setBounds(0,0,x,y);
    Submit1.setBounds(((x/2)+100),((y/2)-100),110,50);
    tt3.setBounds(((x/2)-150),((y/2)-100),200,50);
    pp7.add(BACKGROUND5);
    BACKGROUND5.add(tt3);
    BACKGROUND5.add(Submit1);
    Submit1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    
                }
            }
            );
}
void COMMENU3()
{
    pp8.setVisible(true);
    pp6.setVisible(false);
    pp2.setVisible(false);
    tt4.setVisible(true);
    pp8.setLayout(null);
    Submit2.setVisible(true);
    pp8.setBounds(0,0,x,y);
    BACKGROUND5.setVisible(true);
    BACKGROUND5.setBounds(0,0,x,y);
    Submit2.setBounds(((x/2)+100),((y/2)-100),110,50);
    tt4.setBounds(((x/2)-150),((y/2)-100),200,50);
    pp8.add(BACKGROUND5);
    BACKGROUND5.add(tt4);
    BACKGROUND5.add(Submit2);
    Submit2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e3)
                {
                    
                }
            }
            );
}
            
public static void main(String args[])
{
TicTakToe6 ob=new TicTakToe6();
ob.Launch();
}
}


