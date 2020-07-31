import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class main_customers_entry implements ActionListener
{
	static JFrame win;
	static Container con;
	static JLabel L1;
	static JButton new1;	
	static JButton save;
	static JButton search;
	static JButton mainform;
	static JButton cancel;
	static JLabel L2;
	static JLabel L3;
	static JLabel L4;
	static JLabel L5;
	static JLabel L6;
	static JLabel L7;
	static JLabel L8;
	static JLabel L9;
	static JTextField t1;
	static JTextField t2;
	static JTextField t3;
	static JTextField t4;
	static JTextField t5;
	static JTextField t6;
	static JTextField t7;
	static JTextField t8;
		
	public static void createform()
	{
   Initilization();
   
		win.setBounds(150,150,375,400);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.getContentPane().setBackground(Color.gray);
    win.setResizable(false);
		FlowLayout flow=new FlowLayout(15,0,15);

		con.setLayout(flow);

    labelform();

	new1.addActionListener(new main_customers_entry());
  save.addActionListener(new main_customers_entry());
	cancel.addActionListener(new main_customers_entry());
  mainform.addActionListener(new main_customers_entry());
  search.addActionListener(new main_customers_entry());
		win.setVisible(true);
	}

public static void Initilization()
	{
  win=new JFrame("Customers");
  con=win.getContentPane();
	L1=new JLabel("                                            CUSTOMER'S FORM                                               ");
	 new1=new JButton("New");	
	 save=new JButton("Save");
	 search=new JButton("Search");
	 mainform=new JButton("Main Form");
	 cancel=new JButton("Cancel");
	L2=new JLabel("    Custmer ID:            ");
	L3=new JLabel("    Order:                      ");
	L4=new JLabel("    Customer Name:  ");
	L5=new JLabel("    Price:                       ");
	L6=new JLabel("    Address:                 ");
	L7=new JLabel("    Discount:                ");
	L8=new JLabel("    Contact:                  ");
	L9=new JLabel("    Total Price:            ");
	t1=new JTextField("",20);
	t2=new JTextField("",20);
	t3=new JTextField("",20);
	t4=new JTextField("",20);
	t5=new JTextField("",20);
	t6=new JTextField("",20);
	t7=new JTextField("",20);
	t8=new JTextField("",20);

	}

public static void labelform()
	{
	con.add(L1);
	con.add(new1);
	con.add(save);
	con.add(search);
	con.add(mainform);
	con.add(cancel);
	con.add(L2);
	con.add(t1);
	con.add(L3);
	con.add(t2);
	con.add(L4);
	con.add(t3);
	con.add(L5);
	con.add(t4);
	con.add(L6);
	con.add(t5);
	con.add(L7);
	con.add(t6);
	con.add(L8);
	con.add(t7);
	con.add(L9);
	con.add(t8);
	}

public static void savetofile() throws Throwable
   {
      FileWriter fr=new FileWriter("customers.txt",true);
      BufferedWriter bw=new BufferedWriter(fr);

      String s=t1.getText();
      String s2=t2.getText();
      String s3=t3.getText();
      String s4=t4.getText();
      String s5=t5.getText();
      String s6=t6.getText();
      String s7=t7.getText();
      String s8=t8.getText();

          bw.write(s);
          bw.newLine();
          bw.write(s2);
          bw.newLine();
          bw.write(s3);
          bw.newLine();
          bw.write(s4);
          bw.newLine();
          bw.write(s5);
          bw.newLine();
          bw.write(s6);
          bw.newLine();
          bw.write(s7);
          bw.newLine();
          bw.write(s8);
          bw.newLine();

    bw.close();
   }



public void actionPerformed(ActionEvent e)
	{
		Object ob=e.getSource();

		if( ob == new1)
	{
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");


	}
		if( ob == save )
    {
                try
                {
                savetofile();
                t1.setText("");
            		t2.setText("");
                t3.setText("");
	             	t4.setText("");
	            	t5.setText("");
            		t6.setText("");
            		t7.setText("");
	            	t8.setText("");
                }
             catch(Throwable b){}



   	}
		if( ob == search )
	{

                     searchitem.init();
                     searchitem.init2();
                     searchitem.searchmainform(6);


	}
		if( ob == mainform )
	{

      win.dispose();
     mainmenu.win.dispose();
     mainmenu.initialization();
     mainmenu.createframe(1);



	}
		if( ob ==cancel )
	{

		win.dispose();
	}
       }


}