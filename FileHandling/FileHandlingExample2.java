import java.io.*;
import java.util.Scanner;

public class FileHandlingExample2 {
    public void writeToFile(){
        String filename = "D:/newfile.txt";
        String text = "Pakistan , means the land of Pak, the land of purity, the land of peace and harmony," +
                " the land of pure heart people. The 1st Islamic and 7th Nuclear country in the world, the only" +
                " country who got independence in the night of blessings i.e 27th Ramadhan Mubarak (Shab-e-Qadar-" +
                " Master of all nights).";

        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(text);
            fw.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public int lengthOfFile(){
        String filename = "D:/newfile.txt";
        String text = "";
         try{
             FileReader fr = new FileReader(filename);
             Scanner scan = new Scanner(fr);
             while (scan.hasNextLine()){
                 text = scan.nextLine();
             }
             fr.close();
         }
         catch(IOException e){
             e.printStackTrace();
         }

         return text.length();
    }

    public int scanAWord(){
        int wordPak = 0;
        String filename = "D:/newfile.txt";
        String word = "";
        int wordCount = 0;

        try{
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while(scan.hasNext()){
                word = scan.next();
                if(word.equals("Pakistan")) wordCount++;
            }
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        return wordCount;
    }

    public void replaceAWord(String wordToReplace, String wordWithReplace){
        String filename = "D:/newfile.txt";
        String text = "";

        try{
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);
            while(scan.hasNextLine()) {
                text = scan.nextLine();
            }
            fr.close();

            text = text.replaceAll(wordToReplace, wordWithReplace);

            FileWriter fw = new FileWriter(filename);
            fw.write(text);
            fw.close();
            System.out.println("Replaced");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public void countWords(){
        String filename = "D:/newfile.txt";
        int a = 0, b = 0, c = 0;

        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while(scan.hasNext()){
                if(scan.next().equals("the")) a++;
                if(scan.next().equals("of")) b++;
                if(scan.next().equals("are")) c++;
            }
            fr.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("'the' occured " + a + " times");
        System.out.println("'of' occured " + b + " times");
        System.out.println("'and' occured " + c + " times");
    }


    public static void main(String[] args) {
        FileHandlingExample2 fhq3 = new FileHandlingExample2();
        //fhq3.writeToFile();
        System.out.println(fhq3.lengthOfFile());
        System.out.println("Pakistan occured " + fhq3.scanAWord() + " times in the file");
        fhq3.replaceAWord("Pakistan", "our Motherland");
        fhq3.countWords();
    }
}
