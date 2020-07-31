import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class Entry_form_main implements ActionListener
{
      static JFrame win1=new JFrame("ENTRY FORM");
      static Container con1=win1.getContentPane();
      static JButton new1;
      static JButton save1;
      static JButton search1;
      static JButton mainform1;
      static JButton cancel1;
      static JLabel LL1;
      static JLabel LL2;
      static JLabel LL3;
      static JLabel LL4;
      static JLabel LL5;
      static JButton back;
      static JTextField TT1;
      static JTextField TT2;
      static JTextField TT3;
      static JTextField TT4;
      static JPanel buttonpannel=new JPanel();


      public static void Initilization1()
      {
       win1=new JFrame("ENTRY FORM");
       new1=new JButton("New ");
       save1=new JButton("Save");
       search1=new JButton("Search");
       mainform1=new JButton("Main Form");
       cancel1=new JButton("Cancel");
       LL1=new JLabel("                                            ITEM ENTRY FROM                                     ");
       LL2=new JLabel("Item ID                  ");
       LL3=new JLabel("Discription           ");
       LL4=new JLabel("Purchase Price  ");
       LL5=new JLabel("Sold Price            ");
       back =new JButton("<");
       TT1=new JTextField("",20);
       TT2=new JTextField("",20);
       TT3=new JTextField("",20);
       TT4=new JTextField("",20);
       buttonpannel=new JPanel();


      }

       public static  void Labelform1()
       {
         con1.add(LL1);
         con1.add(buttonpannel);
            buttonpannel.add(new1);
            buttonpannel.add(save1);
            buttonpannel.add(search1);
            buttonpannel.add(mainform1);
            buttonpannel.add(cancel1);
         con1.add(LL2);

         con1.add(TT1);
         con1.add(LL3);
         con1.add(TT2);
         con1.add(LL4);
         con1.add(TT3);
         con1.add(LL5);
         con1.add(TT4);

       }

       public static  void createform1()
       {
         win1.setBounds(200,200,390,280);
         win1.setResizable(false);
         win1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         con1=win1.getContentPane();
         con1.setBackground(Color.gray);
         buttonpannel.setBackground(Color.gray);
         FlowLayout flow=new FlowLayout(20,10,10);
         con1.setLayout(flow);
         buttonpannel.setLayout(new FlowLayout(0,0,15));
         Labelform1();
         win1.setVisible(true);


          new1.addActionListener(new Entry_form_main());
	        save1.addActionListener(new Entry_form_main());
	        search1.addActionListener(new Entry_form_main());
	        mainform1.addActionListener(new Entry_form_main());
	        cancel1.addActionListener(new Entry_form_main());



       }

   public static void savetofile() throws Throwable
   {
      FileWriter fr=new FileWriter("items.txt",true);
      BufferedWriter bw=new BufferedWriter(fr);

      String s=TT1.getText();
      String s2=TT2.getText();
      String s3=TT3.getText();
      String s4=TT4.getText();

          bw.write(s);
          bw.newLine();
          bw.write(s2);
          bw.newLine();
          bw.write(s3);
          bw.newLine();
          bw.write(s4);
          bw.newLine();

    bw.close();
   }




    public void actionPerformed(ActionEvent e)
    {
        Object ob=e.getSource();

        if(ob == new1)
        {
           TT1.setText("");
           TT2.setText("");
           TT3.setText("");
           TT4.setText("");


        }
        if(ob == save1)
        {
           try
           {
             savetofile();
             TT1.setText("");
             TT2.setText("");
             TT3.setText("");
             TT4.setText("");
            }
             catch(Throwable b){}
        }
        if(ob == search1)
        {
             searchitem.init();
             searchitem.init2();
             searchitem.searchmainform(5);

        }
        if(ob == mainform1)
        {
             win1.dispose();
             mainmenu.win.dispose();
             mainmenu.initialization();
             mainmenu.createframe(1);

        }
        if(ob == cancel1)
        {
            win1.dispose();

        }

    }

}


