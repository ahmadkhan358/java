package simplecalculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame {
    
    private JFrame frame = new JFrame("Simple Calculator");
    private JTextField text1 = new JTextField(40);
    private JTextField text2 = new JTextField(40);
    private JButton btnplus = new JButton("+");
    private JButton btnminus = new JButton("-");
    private JButton btnmultiply = new JButton("*");
    private JButton btndivide = new JButton("/");
    private JButton btnnine = new JButton("9");
    private JButton btneight = new JButton("8");
    private JButton btnseven = new JButton("7");
    private JButton btnsix = new JButton("6");
    private JButton btnfive = new JButton("5");
    private JButton btnfour = new JButton("4");
    private JButton btnthree = new JButton("3");
    private JButton btntwo = new JButton("2");
    private JButton btnone = new JButton("1");
    private JButton btnzero = new JButton("0");
    private JButton btnpoint = new JButton(".");
    private JButton btnequal = new JButton("=");
    private JButton btnAC = new JButton("AC");
    private JButton btnbackspace = new JButton("DEL");
  
    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        sc.assembleCalculator();
        sc.addFunctionality();
    }
 
    public void assembleCalculator(){
        frame.add(text1);
        frame.add(text2);
        frame.add(btnplus);
        frame.add(btnminus);
        frame.add(btnmultiply);
        frame.add(btndivide);
        frame.add(btnAC);
        frame.add(btnbackspace);
        frame.add(btnnine);
        frame.add(btneight);
        frame.add(btnseven);
        frame.add(btnsix);
        frame.add(btnfive);
        frame.add(btnfour);
        frame.add(btnthree);
        frame.add(btntwo);
        frame.add(btnone);
        frame.add(btnzero);
        frame.add(btnpoint);
        frame.add(btnequal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);   
    }
    
    public void addFunctionality(){
        EventHandling events = new EventHandling();
        
        btnplus.addActionListener(events);
        btnminus.addActionListener(events);
        btnmultiply.addActionListener(events);
        btndivide.addActionListener(events);
        btnAC.addActionListener(events);
        btnbackspace.addActionListener(events);
        btnnine.addActionListener(events);
        btneight.addActionListener(events);
        btnseven.addActionListener(events);
        btnsix.addActionListener(events);
        btnfive.addActionListener(events);
        btnfour.addActionListener(events);
        btnthree.addActionListener(events);
        btntwo.addActionListener(events);
        btnone.addActionListener(events);
        btnzero.addActionListener(events);
        btnpoint.addActionListener(events);
        btnequal.addActionListener(events);
    }
    
    public class EventHandling implements ActionListener{
        private double number1 = 0, number2 = 0;
        private String no1 = "", no2 = "", total = "";
        private char sign;
        private String equation = "";
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == btnnine){
                equation += "9";
                text1.setText(equation);
            }else if(e.getSource() == btneight){
                equation += "8";
                text1.setText(equation);
            }else if(e.getSource() == btnseven){
                equation += "7";
                text1.setText(equation);
            }else if(e.getSource() == btnsix){
                equation += "6";
                text1.setText(equation);
            }else if(e.getSource() == btnfive){
                equation += "5";
                text1.setText(equation);
            }else if(e.getSource() == btnfour){
                equation += "4";
                text1.setText(equation);
            }else if(e.getSource() == btnthree){
                equation += "3";
                text1.setText(equation);
            }else if(e.getSource() == btntwo){
                equation += "2";
                text1.setText(equation);
            }else if(e.getSource() == btnone){
                equation += "1";
                text1.setText(equation);
            }else if(e.getSource() == btnzero){
                equation += "0";
                text1.setText(equation);
            }else if(e.getSource() == btnpoint){
                equation += ".";
                text1.setText(equation);
            }else if(e.getSource() == btnplus){
                equation += "+";
                text1.setText(equation);
            }else if(e.getSource() == btnminus){
                equation += "-";
                text1.setText(equation);
            }else if(e.getSource() == btnmultiply){
                equation += "*";
                text1.setText(equation);
            }else if(e.getSource() == btndivide){
                equation += "/";
                text1.setText(equation);
            }else if(e.getSource() == btnequal){
                getnumbers();
                switch (sign) {
                    case '+':
                        total = String.valueOf(sum(number1, number2));
                        text2.setText(total);
                        break;
                    case '-':
                        total = String.valueOf(difference(number1, number2));
                        text2.setText(total);
                        break;
                    case '*':
                        total = String.valueOf(product(number1, number2));
                        text2.setText(total);
                        break;
                    case '/':
                        total = String.valueOf(division(number1, number2));
                        text2.setText(total);
                        break;
                    default:
                        break;
                }
            }else if(e.getSource() == btnAC){
                text1.setText("");
                equation = "";
                text2.setText("");
            }
            else if(e.getSource() == btnbackspace){
                int len = equation.length();
                equation = equation.substring(0, len-1);
                text1.setText(equation);
            }
            
        }
        
        public void getnumbers(){
            int len = equation.length();
            for(int i=0; i<len; i++){
                if(equation.charAt(i) == '+' || equation.charAt(i) == '-' || equation.charAt(i) == '*' || equation.charAt(i) == '/'){
                    sign = equation.charAt(i);
                    no1 = equation.substring(0, i);
                    no2 = equation.substring(i+1, len);
                    break;
                }
            }
            number1 = Double.parseDouble(no1);
            number2 = Double.parseDouble(no2);
        }
        
        public double sum(double  num1, double num2){
            return num1+num2;
        }
        
        public double difference(double num1, double num2){
            return num1-num2;
        }
        
        public double product(double num1, double num2){
            return num1*num2;
        }
        
        public double division(double num1, double num2){
            return num1/num2;
        }
    }
}