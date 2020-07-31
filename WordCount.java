import java.util.Scanner;

public class WordCount {

    private String inputStr;
    private char letter;

    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the paragraph");
        inputStr = scan.nextLine();

        if(inputStr.isEmpty()){
            System.out.println("Please enter a paragraph");
            System.exit(0);
        }
    }


    public int countWordsOfSpecificLetter(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the letter to find its words : ");

        letter = scan.next().charAt(0);
        int count = 0;
        String[] words = inputStr.split(" ");
        for(String w: words){
            if(w.charAt(0) == letter){
                count++;
            }
        }
        return count;
    }

    public char getLetter(){
        return letter;
    }

    public int totalWordsInPara(){
        String[] words = inputStr.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();
        wc.getInput();
        int wordsOfSpecificLetter = wc.countWordsOfSpecificLetter();
        int totalwords = wc.totalWordsInPara();
        System.out.println("Total words starts with " + wc.getLetter() + " : " + wordsOfSpecificLetter);
        System.out.println("Total words in paragraph : " + totalwords);
    }
}
