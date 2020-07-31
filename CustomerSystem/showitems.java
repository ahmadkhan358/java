import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class showitems implements ActionListener
{
    static JFrame win=new JFrame("ITEMS");
    static JButton bac=new JButton("<");
    static Container con=win.getContentPane();
    static JPanel back=new JPanel();
    static JScrollBar jsb=new JScrollBar(1,20,20,10,100);
    static JTextField itemid=new JTextField();
    static JTextField itemdesc=new JTextField();
    static JTextField purchase=new JTextField();
    static JTextField sold=new JTextField();
    static int flag=0;

    static JLabel mainlabel;
    static JLabel jl=new JLabel("     ID     ");
    static JLabel jl1=new JLabel("     DESCRIPTION          ");
    static JLabel jl2=new JLabel(" PUR Rs/= ");
    static JLabel jl3=new JLabel("SOLD Rs/= ");

    static JLabel dellabel=new JLabel("     ENTER ITEM ID:     ");
    static JTextField deltext=new JTextField(15);


               static String sn="";
               static String sn1="";
               static String sn2="";
               static String sn3="";
               static String space;

   public static void reader(int user)          //from other classes
     {
       if( user == 1 || user == 5)  mainlabel=new JLabel("                   ITEMS VIEW FORM                                  ");
       if( user == 2 || user == 4)  mainlabel=new JLabel("          ITEMS VIEW FORM                     ");



       try
        {
                 flag=0;
                 FileReader filr=new FileReader("items.txt");
                 BufferedReader br=new BufferedReader(filr);

      mainlabel.setForeground(Color.red);
      jl.setForeground(Color.white);
      jl1.setForeground(Color.white);
      jl2.setForeground(Color.white);
      jl3.setForeground(Color.white);

      back.add(bac);
      back.add(mainlabel);
      back.add(jl);
      back.add(jl1);
      if(user == 1 || user == 5) back.add(jl2);
      back.add(jl3);
              sn="";
              sn1="";
              sn2="";
              sn3="";


                      while(sn!=null)
                         {

                            sn=br.readLine();
                            sn1=br.readLine();
                            sn2=br.readLine();
                            sn3=br.readLine();

                            createframe(u);
                        //   show(user);
                                      if(user <= 3)  {flag=1;   show(user);  }



                         else if((s7.equals(sn) || s8.equals(sn1) || (s7.equals(sn) && s8.equals(sn1))) && user == 5)
                            {flag=1;  show(user); }

                          else if((s7.equals(sn) || s8.equals(sn1) || (s7.equals(sn) && s8.equals(sn1))) && user == 4)
                                                {flag=1;  show(user); }
                           else{}
                       }
                    //  if(flag == 0)
                    //    {  win.dispose(); JOptionPane.showMessageDialog(null,"Records Not Found...!");}

         }
       catch(IOException e)
       {
         JOptionPane.showMessageDialog(null,"File Not Found....");
         mainmenu.win.dispose();
         mainmenu.initialization();
         mainmenu.createframe(user);

       }


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




  public static void initialization()
  {
   win=new JFrame("ITEMS");
   bac=new JButton("<");
   con=win.getContentPane();
   back=new JPanel();
   jsb=new JScrollBar(1,20,20,10,100);
   itemid=new JTextField();
   itemdesc=new JTextField();
   purchase=new JTextField();
   sold=new JTextField();

   jl=new JLabel("     ID     ");
   jl1=new JLabel("     DESCRIPTION          ");
   jl2=new JLabel(" PUR Rs/= ");
   jl3=new JLabel("SOLD Rs/= ");
              sn="";
              sn1="";
              sn2="";
              sn3="";



  }

  public static void show(int user)
       {


                showvalues(user);


     }

  public static void createframe(int user)
     {

            if(user == 1 || user == 5)   win.setBounds(150,150,400,350);
            if(user == 2 || user == 4)   win.setBounds(150,150,320,350);


      win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
      win.setResizable(false);
      
        back.setBackground(Color.gray);

        bac.addActionListener(new showitems());

                   back.setLayout(new FlowLayout(20,15,15));

                 con.add(back);

                  con.add(jsb,BorderLayout.EAST);  //add scrollbar



      win.setVisible(true);
     }

   public static void showvalues(int user)
     {


              itemid=new JTextField(sn,5);
              itemdesc=new JTextField(sn1,10);
              purchase=new JTextField(sn2,5);
              sold=new JTextField(sn3,5);

              itemid.setForeground(Color.darkGray);
              itemdesc.setForeground(Color.darkGray);
              purchase.setForeground(Color.darkGray);
              sold.setForeground(Color.darkGray);


                  back.add(itemid);
                  back.add(itemdesc);
                  if(user == 1 || user == 5)
                  back.add(purchase);
                  back.add(sold);






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