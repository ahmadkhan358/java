import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class searchitem implements ActionListener
{
      static int flag=0;    //   if flag=1 login from admin=2 login from customer... 
      static JFrame win=new JFrame("Search Menu...");
      static JFrame win2=new JFrame("Main Menu...");

      static Container con=win.getContentPane();
      static Container con2=win2.getContentPane();

      static JLabel  jl=new JLabel("                      Search Menu                     ");
      static JLabel  jl5=new JLabel("                           Search Menu                             ");

      static JButton byid=new JButton     ("            Search By ID            ");
      static JButton byname=new JButton      ("         Search By Name        ");
      static JButton bynameid=new JButton    ("    Search By Name & ID    ");
      static JButton back=new JButton    ("              Main Menu              ");

      static JLabel jl2=new JLabel("ENTER ITEM ID:           ");
      static JTextField   id=new JTextField(10);

      static JLabel jl3=new JLabel("ENTER ITEM NAME:    ");
      static JTextField   id1=new JTextField(10);

      static JButton search=new JButton    ("       Search        ");
      static JButton bac=new JButton    ("         Back      ");

    public static void init2()
      {
         win2=new JFrame("Main Menu...");
            con2=win2.getContentPane();
            jl2=new JLabel("      ENTER  ID:               ");
            jl3=new JLabel("      ENTER  NAME:        ");
            jl5=new JLabel("                           Search Menu                             ");
            id=new JTextField(10);
            id1=new JTextField(10);
            search=new JButton    ("       Search        ");
            bac=new JButton    ("         Back      ");
     

      }


    public static void init()
       {
             win=new JFrame("Search Menu...");
             con=win.getContentPane();
             jl=new JLabel("                      Search Menu                     ");

             byid=new JButton     ("            Search By ID            ");
             byname=new JButton      ("         Search By Name        ");
             bynameid=new JButton    ("    Search By Name & ID    ");
             back=new JButton    ("              Main Menu              ");

       }


     public static void searchcriteria(int user)
        {
            init2();
            jl2.setForeground(Color.white);
            jl3.setForeground(Color.white);            


           if(user  ==  1)       //user == 1 by id
                        {


                           win2.setBounds(150,150,300,170);
                           win2.setResizable(false);
                             con2.add(jl5);
                             con2.add(jl2);
                             con2.add(id);
                
                             con2.add(search);
                             con2.add(bac);

                           con2.setBackground(Color.gray);
                           con2.setLayout(new FlowLayout(10,20,20));
                           win2.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
                           win2.setVisible(true);
                         }

           if(user  ==  2)         // search by name & id
                        {

                        win2.setBounds(150,150,300,210);
                        win2.setResizable(false);
                             con2.add(jl5);
                             con2.add(jl2);
                             con2.add(id);
                             con2.add(jl3);
                             con2.add(id1);

                             con2.add(search);
                             con2.add(bac);

                           con2.setBackground(Color.gray);
                           con2.setLayout(new FlowLayout(10,20,20));
                           win2.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
                           win2.setVisible(true);
                         }

          if(user  ==  3)         // search by name
                        {

                        win2.setBounds(150,150,300,170);
                        win2.setResizable(false);
                        win2.remove(jl2);
                        win2.remove(id);
                             con2.add(jl5);
                             con2.add(jl3);
                             con2.add(id1);

                             con2.add(search);
                             con2.add(bac);

                           con2.setBackground(Color.gray);
                           con2.setLayout(new FlowLayout(10,20,20));
                           win2.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
                           win2.setVisible(true);
                         }

       

                                   search.addActionListener(new searchitem());
                                   bac.addActionListener(new searchitem());
                         
         }


    public static void searchmainform(int user)
      {

         flag=user;
         win.setBounds(150,150,220,240);
         win.setResizable(false);
         win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
           con.setLayout(new FlowLayout(15,15,15));
           con.add(jl);
           con.add(byid);
           con.add(byname);
           con.add(bynameid);
           con.add(back);

                            back.addActionListener(new searchitem());
                            byid.addActionListener(new searchitem());
                            byname.addActionListener(new searchitem());
                            bynameid.addActionListener(new searchitem());

         win.setVisible(true);
      }


      public void actionPerformed(ActionEvent e)
        {
            Object src=e.getSource();
          
              if(src == byid)
                  {   id.setText(""); id1.setText(""); searchcriteria(1);  }

              if(src == bac)
                   {  win2.dispose();  }

              if( src == back )
                   {   win.dispose();  init2();}

              if(src == bynameid)
                   {    id.setText(""); id1.setText(""); searchcriteria(2);    }

              if(src == byname)
                   {   id.setText(""); id1.setText(""); searchcriteria(3);    }

              if( src == search && (flag == 4  || flag == 5))  //for searching items
                 {
                    showitems.initialization();
                    String o=id.getText();
                    String p=id1.getText();
                    showitems.search_item(o,p,flag);
                 }

              if( src == search && (flag == 6 || flag == 7))  //for searching customers
                 {
                    showcustomers.initialization();
                    String o=id.getText();
                    String p=id1.getText();
                    showcustomers.search_item(o,p,flag);
                 }




        }

} 