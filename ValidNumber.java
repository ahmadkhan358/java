import javax.swing.*;

public class ValidNumber {

    public static void main(String[] args) {
        int countValidNumber=0;
        int num;
        for(int i=0;i<100;i++){
            System.out.print("Enter a Positive Number:");
            String s1 = JOptionPane.showInputDialog("enter number",null);
            num = Integer.parseInt(s1);
            if(num>0){
                countValidNumber++;
            }else{
                System.out.println("Input is not valid");
            }
        }
        System.out.println("Valid Numbers Are:"+countValidNumber);
    }

}
