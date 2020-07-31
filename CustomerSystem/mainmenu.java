import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class mainmenu implements ActionListener
{
      static int flag=0;    //   if flag=1 login from admin=2 login from customer... 
      static JFrame win=new JFrame("Main Menu...");
      static Container con=win.getContentPane();
      static JLabel  jl=new JLabel("                                        MAIN MENU                    ");
      static JButton enter=new JButton     ("     Enter Customer     ");
      static JButton view=new JButton      ("     View Customer      ");
      static JButton delete=new JButton    ("   Delete Customer     ");
      static JButton search=new JButton    ("   Search Customer    ");
      static JButton items=new JButton     ("         Show Items         ");
      static JButton enteritems=new JButton("          Enter Items        ") ;
      static JButton deleteitem=new JButton("         Delete Items        ");
      static JButton searchitems=new JButton("         Search Items     ");
      static JButton logout=new JButton     ("                                       LogOut                                            ");

    public static void initialization()
       {
           win=new JFrame("Main Menu...");
           con=win.getContentPane();
           jl=new JLabel("                                        MAIN MENU                    ");
           enter=new JButton     ("     Enter Customer     ");
           view=new JButton      ("     View Customer      ");
           delete=new JButton    ("   Delete Customer     ");
           search=new JButton    ("   Search Customer    ");
           items=new JButton     ("         Show Items         ");
           searchitems=new JButton("         Search Items    ");
           enteritems=new JButton("          Enter Items        ") ;
           deleteitem=new JButton("         Delete Items        ");
           logout=new JButton     ("                                       LogOut                                            ");

        }

     public static void createframe(int user)
        {
           initialization();
           win.dispose();


           if(user  ==  1)
                        {
                           flag=user;
                            labelform(user);
                           win.setBounds(150,150,380,310);
                           win.setResizable(false);
                           con.setBackground(Color.darkGray);
                           con.setLayout(new FlowLayout(10,15,15));
                           win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
                           win.setVisible(true);
                         }

           if(user  ==  2)
                        {  flag=user;
                         labelform(user);
                         win.setBounds(150,150,380,220);
                         win.setResizable(false);
                         con.setBackground(Color.darkGray);
                         con.setLayout(new FlowLayout(10,15,15));
                         win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
                         win.setVisible(true);
                         }
         }



      public static void labelform(int user)
         {


            if (user == 1)
                  {     flag=user;
                      jl=new JLabel("                                       ADMIN MAIN MENU                    ");

jl.setForeground(Color.white);
                      con.add(jl);
                      con.add(enter);
                      con.add(view);
                      con.add(delete);
                      con.add(search);
                      con.add(items);
                      con.add(enteritems);
                      con.add(deleteitem);
                      con.add(searchitems);
                      con.add(logout);
                      win.pack();

                  }


              if (user == 2)
                  {    flag=user;
                      jl=new JLabel("                                 CUSTOMERS MAIN MENU                    ");

jl.setForeground(Color.white);
                      con.add(jl);

                      con.add(view);

                      con.add(search);
                      con.add(items);
                      con.add(searchitems);
                      con.add(logout);
                      win.pack();

                  }

                     enter.addActionListener(new mainmenu());
                     view.addActionListener(new mainmenu());
                     delete.addActionListener(new mainmenu());
                     search.addActionListener(new mainmenu());
                     searchitems.addActionListener(new mainmenu());                     
                     items.addActionListener(new mainmenu());
                     enteritems.addActionListener(new mainmenu());
                     deleteitem.addActionListener(new mainmenu());
                     logout.addActionListener(new mainmenu());


         }



      public void actionPerformed(ActionEvent e)
        {
            Object src=e.getSource();

              if(src == logout)
                 {
                    win.setVisible(false);
                    win.dispose();
                    intro2.win.dispose();
                    intro2.label();
                 }

              if( src == items && flag == 1)
                 {
                   showitems.initialization();
                   showitems.createframe(flag);
                   showitems.reader(flag);
                 }

              if( src == items && flag == 2)
                 {
                    showitems.initialization();
                    showitems.createframe(flag);
                    showitems.reader(flag);
                 }

                if( src == view && flag == 1)
                 {
                   showcustomers.initialization();

                   showcustomers.reader(flag);
                 }

                 if( src == view && flag == 2)
                 {
                   showcustomers.initialization();
                   showcustomers.reader(flag);
                 }

              if( src == enter)
                {
                    mainmenu.win.dispose();
                    main_customers_entry.Initilization();
                    main_customers_entry.createform();

                }

              if( src == search)
                {
                     searchitem.init();
                     searchitem.init2();
                     searchitem.searchmainform(6);

                }

              if( src == searchitems)
                {

                   if(flag == 2)
                    { searchitem.init(); searchitem.init2(); searchitem.searchmainform(4);  }

                    if(flag == 1)
                    { searchitem.init(); searchitem.init2();  searchitem.searchmainform(5);  }
                }

              if( src == delete)
                {
                     deleteitems.win.dispose();
                     deleteitems.initialization();
                     deleteitems.deletemainform(2);

                }
              if( src == deleteitem)
                {
                     deleteitems.win.dispose();
                     deleteitems.initialization();
                     deleteitems.deletemainform(1);

                }

              if( src == enteritems)
                {
                 win.dispose();
                  Entry_form_main.Initilization1();
                  Entry_form_main.createform1();
                  Entry_form_main.Labelform1();

                }  
               


        }

} 