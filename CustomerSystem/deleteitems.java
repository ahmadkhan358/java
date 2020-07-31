import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;
import java.io.*;

public class deleteitems implements ActionListener
{
      static int flag=0;    //   if flag=1 login from admin=2 login from customer...
      static JFrame win=new JFrame("Delete Menu...");
      static Container con=win.getContentPane();
      static JLabel  jl=new JLabel("                                Delete Menu                    ");
      static JLabel jl2=new JLabel("        ENTER ID:            ");
      static JTextField   id=new JTextField(10);
      static JButton delete=new JButton("       Delete      ");
      static JButton bac=new JButton("        Back         ");
      static FileReader filr;
      static BufferedReader br;
      static FileWriter fr;
      static BufferedWriter bw;
      static File f;
      static File f2;
      
               static String sn="";
               static String sn1="";
               static String sn2="";
               static String sn3="";
               static String sn4="";
               static String sn5="";
               static String sn6="";
               static String sn7="";


    public static void initialization()
      {
         win=new JFrame("Delete Menu...");
         con=win.getContentPane();
         JLabel  jl=new JLabel("                                Delete Menu                    ");
         JLabel jl2=new JLabel("        ENTER ID:            ");
         JTextField   id=new JTextField(10);
         delete=new JButton("       Delete      ");
         bac=new JButton("        Back         ");
      }

   public static void deletemainform(int user)
      {
        flag=user;
         win.setBounds(150,150,290,160);
         win.setResizable(false);
         win.setDefaultCloseOperation(win.DISPOSE_ON_CLOSE);
         con.setLayout(new FlowLayout(15,15,15));

                con.add(jl);
                con.add(jl2);
                con.add(id);
                con.add(delete);
                con.add(bac);

                delete.addActionListener(new deleteitems());
                bac.addActionListener(new deleteitems());

         win.setVisible(true);
      }


  public static void deleteitem(String item_id)
     {


       try
        {
                filr=new FileReader("items.txt");
                br=new BufferedReader(filr);



                 sn="*";sn1="*";sn2="*";sn3="*";
                        while(sn!=null)
                         {

                            sn=br.readLine();
                            sn1=br.readLine();
                            sn2=br.readLine();
                            sn3=br.readLine();



                            if(sn.equals(item_id)) {}
                            else
                               {
                                    fr=new FileWriter("temp.txt",true);
                                    bw=new BufferedWriter(fr);

                                    if(sn.equals(null)){}
                                    else
                                     {
                                                                             bw.write(sn);
                                       bw.newLine();
                                       bw.write(sn1);
                                       bw.newLine();
                                       bw.write(sn2);
                                       bw.newLine();
                                       bw.write(sn3);
                                       bw.newLine();
                                       bw.close();
                                     }
                               }


                       }
                  br.close();



         }
       catch(IOException e)
        {
           
            showitems.win.dispose();
                mainmenu.win.dispose();
                mainmenu.initialization();
                mainmenu.createframe(1);
        }
      catch(NullPointerException e)
        {
               try{
                    br.close();
                    bw.close();
                 }

                catch(Throwable u)
                {

                }

       }


     }

 public void deletecustomers(String item_id)
  {
     
       try
        {
                filr=new FileReader("customers.txt");
                br=new BufferedReader(filr);



                 sn="*";sn1="*";sn2="*";sn3="*";
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


                            if(sn.equals(item_id)) {}
                            else
                               {
                                    fr=new FileWriter("temp1.txt",true);
                                    bw=new BufferedWriter(fr);

                                    if(sn.equals(null)){}
                                    else
                                     {
                                    
                                       bw.write(sn);
                                       bw.newLine();
                                       bw.write(sn1);
                                       bw.newLine();
                                       bw.write(sn2);
                                       bw.newLine();
                                       bw.write(sn3);
                                       bw.newLine();
                                       bw.write(sn4);
                                       bw.newLine();
                                       bw.write(sn5);
                                       bw.newLine();
                                       bw.write(sn6);
                                       bw.newLine();
                                       bw.write(sn7);
                                       bw.newLine();
                                     }
                               }


                       }
                  br.close();



         }
       catch(IOException e)
        {

                mainmenu.win.dispose();
                mainmenu.initialization();
                mainmenu.createframe(1);
        }
      catch(NullPointerException e)
        {
               try{
                    br.close();
                    bw.close();
                 }

                catch(Throwable u){}

       }



  }




      public void actionPerformed(ActionEvent e)
        {
            Object src=e.getSource();

              if(src == bac)
                  {
                    win.dispose();
                  }
              if(src == delete && flag == 1)    // to delete items
                 {
                     String i=id.getText();


                    f=new File("items.txt");
                    f2=new File("temp.txt");

                     if(!f.exists())
                          {
                           JOptionPane.showMessageDialog(null,"File Not Found... !");
                          }
                      else
                        {
                                  deleteitem(i);
                             if( (f.length()  ==  f2.length())  )
                                  {

                                     JOptionPane.showMessageDialog(null,"Record Not Found... !");

                                     f.delete();
                                     f2.renameTo(f);
                                     win.dispose();
                                     initialization();
                                     deletemainform(flag);
                                  }
                                 else
                                  {

                                      JOptionPane.showMessageDialog(null,"Record Deleted Successfull... !");
                                      f.delete();
                                      f2.renameTo(f);
                                      win.dispose();
                                      initialization();
                                      deletemainform(flag);
                                   }
                        }



                 }

              if(src == delete && flag == 2)     //to delete customers
                 {
                    String i=id.getText();


                    f=new File("customers.txt");
                    f2=new File("temp1.txt");
                  int c=0;

                     if(!f.exists())
                          {
                           JOptionPane.showMessageDialog(null,"File Not Found... !");
                          }
                      else
                        {
                                  deletecustomers(i);
                             if( (f.length()  ==  f2.length())  )
                                  {

                                     JOptionPane.showMessageDialog(null,"Record Not Found... !");

                                     f.delete();
                                     f2.renameTo(f);
                                     win.dispose();
                                     initialization();
                                     deletemainform(flag);
                                  }
                                 else
                                  {

                                      JOptionPane.showMessageDialog(null,"Record Deleted Successfull... !");
                                      f.delete();
                                      f2.renameTo(f);
                                      win.dispose();
                                      initialization();
                                      deletemainform(flag);
                                   }
                        }

                 }




        }

}