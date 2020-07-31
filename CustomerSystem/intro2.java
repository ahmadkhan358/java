import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;


public class intro2 implements ActionListener
{

static JFrame win=new JFrame("Metro Cash & Carry Managment system");

static Container con=win.getContentPane();

	static JLabel toLabel = new JLabel();
	static JLabel loginLabel= new JLabel();

	 
	static JTextField usrname = new JTextField("",18);
	static JLabel pwd = new JLabel();

	static JPasswordField pwdField = new JPasswordField("",18);
		
	static JButton Loginbt = new JButton();
	static JButton Quit = new JButton();
		 	
		 
	static ImageIcon bg=new ImageIcon("wel.png");
        static JLabel image=new JLabel(bg);

  static JPanel jp=new JPanel();

  static int decision=0;


      public intro2()
         {

         }


   public static void label()

          {

           win.setBounds(100,70,800,625);
           win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
           win.setResizable(false);

           con.setLayout(null);
           con.setBackground(Color.black);

    	win.setBackground(Color.gray);

    	loginLabel.setBounds(500,100, 167,17);
    	loginLabel.getForeground();

	 toLabel.setText("UserName: ");
	 toLabel.setForeground(Color.white);
           con.add(toLabel);
    	toLabel.setBounds(480,300, 67, 12);

           con.add(usrname);
    	usrname.setBounds(600, 300, 150, 24);
	usrname.setToolTipText("Enter User-Name here");

		pwd.setText("Password:");
		pwd.setForeground(Color.white);
          con.add(pwd);
    	pwd.setBounds(480,350, 67, 12);


           con.add(pwdField);
    	pwdField.setBounds(600, 350, 150, 24);
	pwdField.setToolTipText("Enter your password here");


		Loginbt.setText("Login");
    	Loginbt.setActionCommand("login");
           con.add(Loginbt);
    	Loginbt.setBounds(560, 400, 90, 30);


		Quit.setText("Quit");
    	Quit.setActionCommand("Quit");
           con.add(Quit);
    	Quit.setBounds(655, 400, 90, 30);

           con.add(image);
        image.setBounds(0,0,800,600);


              Loginbt.addActionListener(new intro2());
              Quit.addActionListener(new intro2());


           win.setVisible(true);
          }


////////////////////////////////////////////////////////////////////////////////

      public void actionPerformed(ActionEvent e)
          {
               Object src=e.getSource();
           

                 if(src == Quit)
                   {
                       
 			usrname.setText("");
                        pwdField.setText("");
			win.dispose();
                    }
             


                 else if(src == Loginbt)
                    {
                           String u=usrname.getText();
                           String p=pwdField.getText();


                            if(u.equals("usman")&&p.equals("129"))
                                 { win.dispose(); decision=1; mainmenu.win.dispose(); mainmenu.createframe(decision);   }

                            else if(u.equals("customer"))
                                { win.dispose(); decision=2;   mainmenu.win.dispose();  mainmenu.initialization();  mainmenu.createframe(decision);  }

                            else
                                {

                                  JOptionPane.showMessageDialog(null,"Invalid User Name or Password...");
                               
                                }


                    }
	}
/////////////////////////////////////////////////////////////////////////////////////

}