package VotingSystem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class VotingSystem {
    public static void main(String[] args) 
    {
       JFrame f = new JFrame("E-Voting System");
        f.setVisible(true);
        f.setSize(370,450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //LABEL 
        JLabel lab = new JLabel("Welcome To E-Voting System");
        JLabel lab1 = new JLabel("                 Enter Your Information To Proceed             ");
        
        //METHOD TO ADD IMAGE
        ImageIcon a = new ImageIcon("C:\\Users\\h_hai\\Downloads\\v.jpg");
        JLabel jl = new JLabel("", a, JLabel.CENTER);
        
        //TEXT FIELD
        JButton k = new JButton("Name");
        JTextField text = new JTextField(20);
        
       JButton l = new JButton("NIC Number"); 
        JTextField text1= new JTextField(20);
      
        //BUTTON
        JButton b1 = new JButton("PROCEED");
        //PANEL 
        JPanel p = new JPanel();
        p.add(jl);
        p.add(lab);
        p.add(lab1,BorderLayout.EAST);
       p.add(k);
        p.add(text);
        p.add(l);
        p.add(text1);
        p.add(b1);
        JPanel p1 = new JPanel();
        
         
       
        f.add(p);
       
        f.add(p,BorderLayout.SOUTH);
        
    //ACTION LISTENER FOR BUTTON (PROCEED)
    b1.addActionListener(new ActionListener(){     
        public void actionPerformed(ActionEvent e)
        {  
           f.dispose();
                 JFrame cr = new JFrame("The Parties");
                cr.setVisible(true);
                cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cr.setSize(700,700);
                
                JButton x = new JButton("The List Of Parties For Vote");
                //METHOD FOR IMAGE
                ImageIcon ii = new ImageIcon("C:\\Users\\h_hai\\Downloads\\images.jpg");
                JLabel jl = new JLabel("", ii, JLabel.CENTER);
                
                ImageIcon c = new ImageIcon("C:\\Users\\h_hai\\Downloads\\pm;.jpg");
                JLabel j2 = new JLabel("", c, JLabel.CENTER);
                
                ImageIcon b = new ImageIcon("C:\\Users\\h_hai\\Downloads\\PPP.jpg");
                JLabel j3 = new JLabel("", b, JLabel.CENTER);
                
                ImageIcon i = new ImageIcon("C:\\Users\\h_hai\\Downloads\\pq.jpg");
                JLabel j4 = new JLabel("", i, JLabel.CENTER);
                
                JPanel p = new JPanel();
                JPanel p1 = new JPanel();
                //TWO BUTTONS
                JButton b2 = new JButton("Proceed To Vote");
                JButton a1 = new JButton("PTI");
                JButton a2 = new JButton("PML-N GO NAWAZ GO"); 
                JButton a3 = new JButton("PPP");
                JButton a4 = new JButton("PML-Q");
                p.add(x,BorderLayout.NORTH); 
                p.add(jl);
                p.add(a1);
                p.add(j2);
                p.add(a2);
                p.add(j3);
                p.add(a3);
                p.add(j4);
                p.add(a4);
                p.add(b2);

               
                cr.add(p);
                 a1.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                   JFrame f2 = new JFrame("PTI");
            f2.setSize(300,250);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            
            JPanel p2 = new JPanel();
            JButton a10 = new JButton("Back");
            JLabel j8= new JLabel("Chairman	Imran Khan\n");
JLabel j16;
                    j16 = new JLabel("Vice chairman	Shah Mehmood Qureshi\n" );
JLabel j9= new JLabel("Founded	25 April 1996\n" );
JLabel j10= new JLabel("Headquarters	Sector G-6/4\n" );
JLabel j11= new JLabel("Islamabad, Pakistan\n" );
JLabel j12= new JLabel("Student Wing	Insaf Student Federation\n" );
JLabel j13= new JLabel("Youth Wing	Insaf Youth Wing\n" );
JLabel j14= new JLabel("Women Wing	Insaf Women Wing\n" );
JLabel j15= new JLabel("Membership  (2013)	10 million (worldwide)");

p2.add(j8);
p2.add(j16);
p2.add(j9);
p2.add(j10);
p2.add(j11);
p2.add(j12);
p2.add(j13);
p2.add(j14);
p2.add(j15);
p2.add(a10);
a10.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                  cr.setVisible(true);
                  f2.dispose();
                }});
f2.add(p2);
                }});
                 a2.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                   JFrame f2 = new JFrame("PML-N");
            f2.setSize(400,250);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            
            JPanel p2 = new JPanel();
            JButton a10 = new JButton("BACK");
            JLabel j8= new JLabel("President GO Nawaz GO\n");
JLabel j16;
                    j16 = new JLabel("Leader in Senate	Raja Zafar ul Haq\n" );
JLabel j9= new JLabel("Leader in Assembly	Nawaz Sharif\n" );
JLabel j10= new JLabel("Secretary General	Iqbal Zafar Jhagra\n" );
JLabel j11= new JLabel("Founder	Fida Mohammad Khan\n" );
JLabel j12= new JLabel("Founded	1993\n" );
JLabel j13= new JLabel("Preceded by	Islami Jamhoori Ittehad\n" );
JLabel j14= new JLabel("Headquarters	Central Secretariat, Islamabad Capital Venue\n" );

p2.add(j8);
p2.add(j16);
p2.add(j9);
p2.add(j10);
p2.add(j11);
p2.add(j12);
p2.add(j13);
p2.add(j14);
p2.add(a10);
a10.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                 cr.setVisible(true);
                  f2.dispose();
                  
                }});
f2.add(p2);
                }});
                                 a3.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                   JFrame f2 = new JFrame("PPP");
            f2.setSize(400,250);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            
            JPanel p2 = new JPanel();
            JButton a10 = new JButton("BACK");
            JLabel j8= new JLabel("President	Asif Ali Zardari\n");
JLabel j16;
                    j16 = new JLabel("Chairperson: Bilawal Bhutto Zardari\n" );
JLabel j9= new JLabel("Leader in National Assembly: Khurshid Shah\n" );
JLabel j10= new JLabel("Leader in Senate: Aitzaz Ahsan\n" );
JLabel j11= new JLabel("Founder: Zulfikar Ali Bhutto\n" );
JLabel j12= new JLabel("Founded: 30 November 1967, Lahore\n" );
JLabel j13= new JLabel("Sindh Assembly: 95 / 168\n" );
JLabel j14= new JLabel("Punjab Assembly: 8 / 371\n" );

p2.add(j8);
p2.add(j16);
p2.add(j9);
p2.add(j10);
p2.add(j11);
p2.add(j12);
p2.add(j13);
p2.add(j14);
p2.add(a10);
a10.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                 cr.setVisible(true);
                  f2.dispose();
                  
                }});
f2.add(p2);
                }});
               a4.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                   JFrame f2 = new JFrame("PML-Q");
            f2.setSize(400,250);
            f2.setVisible(true);
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
            
            JPanel p2 = new JPanel();
            JButton a10 = new JButton("BACK");
            JLabel j8= new JLabel("President	Shujaat Hussain\n");
JLabel j16;
                    j16 = new JLabel("Secretary-General	Tariq Bashir Cheema\n" );
JLabel j9= new JLabel("Spokesperson	Kamil Ali Agha\n" );
JLabel j10= new JLabel("Founder	Mian Muhammad Azhar\n" +
"Shujaat Hussain\n" );
JLabel j11= new JLabel("Founded	20 July 2002\n" );
JLabel j12= new JLabel("Split from	Pakistan Muslim League (N)\n" );
JLabel j13= new JLabel("Headquarters	Parliament lodges, Parliament House, Islamabad\n" );
JLabel j14= new JLabel("Youth wing	PML Youth Wing\n" );

p2.add(j8);
p2.add(j16);
p2.add(j9);
p2.add(j10);
p2.add(j11);
p2.add(j12);
p2.add(j13);
p2.add(j14);
p2.add(a10);
a10.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                 cr.setVisible(true);
                  f2.dispose();
                  
                }});
f2.add(p2);
                }});               
                b2.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
                   

         JFrame jf = new JFrame("VOTE");
        
        
      
        jf.setSize(300,350);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JPanel jp = new JPanel();
        ImageIcon a = new ImageIcon("C:\\Users\\h_hai\\Downloads\\vot.png");
        JLabel j = new JLabel("", a, JLabel.CENTER);
        JButton b5 = new JButton("Proceed");
          jp.add(j);
          jp.add(b5);
          jf.add(jp);
  
                 b5.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed(ActionEvent e) 
                
                {
int pti = 0, pmln = 0, ppp =0,pmlq=0 ;
            int x,y;
            String vote;
            for( x=1; x<=20; ++x){
                vote = JOptionPane.showInputDialog("ENTER YOUR VOTE\n 1: PTI\n2: PMLN\n3: PPP\n4: PMLQ");
                y=Integer.parseInt(vote);
                switch (y) {
                    case 1:
                        ++pti;
                        break;
                    case 2:
                        ++pmln;
                        break;
                    case 3:
                        ++ppp;
                        break;
                        case 4:
                        ++pmlq;
                        break;
                    default: JOptionPane.showMessageDialog(null, "Sorry You can only give vote to 4 parties");
                        break;
                }
            }
            if(pti>pmln && pti > ppp && pti > pmlq)
                JOptionPane.showMessageDialog(null,"PTI WIN");
            else if(pmln > pmlq && pmln>pti && pmln>ppp)
                JOptionPane.showMessageDialog(null,"PMLN WIN");
            else if (ppp>pmlq && ppp>pti && ppp>pmln)
                JOptionPane.showMessageDialog(null,"PPP WIN");
            else 
                JOptionPane.showMessageDialog(null,"PMLQ WIN");
                }});           
    }
});
    }});
}
}
    
