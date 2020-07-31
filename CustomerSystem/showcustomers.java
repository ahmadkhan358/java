import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;


public class showcustomers implements ActionListener
{
    static JFrame win=new JFrame("ITEMS");
    static JButton bac=new JButton("<");
    static Container con=win.getContentPane();
    static JPanel back=new JPanel();
    static JScrollBar jsb=new JScrollBar(1,20,20,10,100);
    static JTextField id=new JTextField();
    static JTextField name=new JTextField();
    static JTextField contact=new JTextField();
    static JTextField price=new JTextField();
    static JTextField address=new JTextField();
  
    static JLabel mainlabel;
    static JLabel jl=new JLabel("     ID       ");
    static JLabel jl1=new JLabel("        Customer Name                ");
    static JLabel jl2=new JLabel("   Contact #    ");
    static JLabel jl3=new JLabel("     Purchase ");
    static JLabel jl4=new JLabel("           Address                        ");
               static String sn="";
               static String sn1="";
               static String sn2="";
               static String sn3="";
               static String sn4="";
               static String sn5="";
               static String sn6="";
               static String sn7="";

               static String space;

   public static void reader(int user)          //from other classes
     {
       if( user == 1 || user == 6)  mainlabel=new JLabel("                                                        CUSTOMERS VIEW FORM                                                                                  ");
       if( user == 2 || user == 7)  mainlabel=new JLabel("                         CUSTOMERS VIEW FORM                        ");


       try
        {

                 FileReader filr=new FileReader("customers.txt");
                 BufferedReader br=new BufferedReader(filr);

      mainlabel.setForeground(Color.red);
      jl.setForeground(Color.white);
      jl1.setForeground(Color.white);
      jl2.setForeground(Color.white);
      jl3.setForeground(Color.white);
      jl4.setForeground(Color.white);

      back.add(bac);
      back.add(mainlabel);
      back.add(jl);
      back.add(jl1);
      back.add(jl3);
    if(user == 1 || user == 6)   back.add(jl2);
    if(user == 1 || user == 6)  back.add(jl4);
        int flag=0;

                 while(sn!=null)
                   {

                      sn=br.readLine();
                      sn1=br.readLine();
                      sn2=br.readLine();
                      sn3=br.readLine();
                      sn4=br.readLine();
                      sn5=br.readLine();
                      sn6=br.readLine();
                      sn7=br.readLine();

                           createframe(user);
                      //   show(user);
                            if(user <= 3)  {flag=1;   show(user);  }
                       //                                  System.out.println("Readddd");




                            else if(s7.equals(sn) && s8.equals(sn2) )
                                                {flag=1;  show(user); }

                            else if(s7.equals(sn))
                            {
                              flag=1;  show(user);

                            }

                           else if(s8.equals(sn2))
                            { flag=1;  show(user); }

                                         else {}

                    }
                   //  if(flag == 0)
                     //   {  win.dispose(); JOptionPane.showMessageDialog(null,"Records Not Found...!");}


         }
       catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"File Not Found....");
                mainmenu.win.dispose();
                mainmenu.initialization();
                mainmenu.createframe(user);
        }


     }


  public static void initialization()
  {
   win=new JFrame("ITEMS");
   bac=new JButton("<");
   con=win.getContentPane();
   back=new JPanel();
   jsb=new JScrollBar(1,20,20,10,100);
   id=new JTextField();
   name=new JTextField();
   contact=new JTextField();
   price=new JTextField();


              sn="";
              sn1="";
              sn2="";
              sn3="";
              sn4="";
              sn5="";
              sn6="";
              sn7="";
             


  }   

  public static void show(int user)
       {


                showvalues(user);
          if(user == 1)
             {
                      System.out.println(sn);
                      System.out.println(sn1);
                      System.out.println(sn2);
                      System.out.println(sn3);


             }
          if(user == 2)
             {
                      System.out.println(sn);
                      System.out.println(sn1);
                      System.out.println(sn3);

             }   

     }

  public static void createframe(int user)
     {

      if(user == 1 || user == 6)   win.setBounds(100,100,670,450);
      if(user == 2 || user == 7)   win.setBounds(100,100,380,450);



      win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
      win.setResizable(false);
        back.setBackground(Color.gray);

        bac.addActionListener(new showcustomers());

                   back.setLayout(new FlowLayout(20,15,15));
                   con.add(back);


                  con.add(jsb,BorderLayout.EAST);  //add scrollbar



      win.setVisible(true);
     }


    static String s7,s8;
     static int u;

  public static void search_item(String s9,String s10,int u1)
     {           // if 4 from user
                //if 5 from admin
         s7=s9;
         s8=s10;
         u=u1;


         reader(u);



     }


   public static void showvalues(int user)
     {


              id=new JTextField(sn,5);
              name=new JTextField(sn2,15);
   if(user == 1 || user == 6)           contact=new JTextField(sn6,10);
              price=new JTextField(sn5,5);
   if(user == 1 || user == 6)           address=new JTextField(sn4,15);

              id.setForeground(Color.darkGray);
              name.setForeground(Color.darkGray);
              contact.setForeground(Color.darkGray);
              price.setForeground(Color.darkGray);
              address.setForeground(Color.darkGray);

                  back.add(id);
                  back.add(name);


                back.add(price);
         if(user == 1 || user == 6)         back.add(contact);
         if(user == 1 || user == 6)         back.add(address);
                  back.add(bac,FlowLayout.LEFT);
     } 


   public void actionPerformed(ActionEvent e)
     {
          Object src=new Object();
          src=e.getSource();

            if(src == bac)
              {
                  win.dispose();

              }

     }

}
