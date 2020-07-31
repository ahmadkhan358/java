import java.util.Scanner;

public class StudentData {

    private String name;
    private int marks;

    public StudentData(String n, int m) {
        name = n;
        marks = m;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }


    // function for sorting of data in descending order
    public static StudentData[] sortDescendingOrder(StudentData[] sData) {
        // bubble sort algorithm
        for(int i=0; i<10 - 1; i++){
            for(int j=0; j<10 - i - 1; j++){
                StudentData d1 = sData[j];
                StudentData d2 = sData[j+1];

                if(d1.getMarks() < d2.getMarks()){
                    StudentData temp = d1;
                    sData[j] = d2;
                    sData[j+1] = temp;
                }
            }
        }
        return sData;
    }

    // printing the list
    public static void printList(StudentData[] list){
        for(int i=0; i<10; i++){
            StudentData data = list[i];
            System.out.println("Name : " + data.getName() + ", Marks : " + data.getMarks());
        }
    }

    // this function checks the string
    public static String isStr(String s) {
        String message = "";
        // checks whether the string is empty or not
        if(!s.equals("")){

            // checks the string using regular expression
            if(!s.matches("[a-zA-Z][a-zA-Z ]+")){
                message = "Please enter a valid name with alphabets only";
            }
        }else{
            message = "Please enter your name";
        }
        return message;
    }

    // this function checks the integer
    public static String checkMarks(int marks){
        String message = "";
        // range of integer from 0 to 100
        if(marks < 0 || marks > 100){
            message = "Marks should be less than or equal to 100 and greater than or equal to 0";
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // array of 10 students
        StudentData[] sDataList = new StudentData[10];

        for (int i = 0; i < 10; i++) {
            String studentName = "";
            String validStudentName = "";
            int studentMarks = 0;
            String validStudentMarks = "";

            int studentNumber = i+1;


            // getting input of student name
            System.out.print("Enter name of student " + studentNumber + " : ");
            studentName = scan.next();
            validStudentName = isStr(studentName);
            if (!validStudentName.equals("")){
                System.out.println(validStudentName);
                break;
            }


            // valid integer check
            try{

                // getting input of student marks
                System.out.print("Enter marks of student " + studentNumber + " : ");
                studentMarks = scan.nextInt();
                System.out.println();
            }catch(Exception e){
                System.out.println("Please enter a valid number");
                break;
            }

            // number between 0 to 100 check
            validStudentMarks = checkMarks(studentMarks);

            if(!validStudentMarks.equals("")){
                System.out.println(validStudentMarks);
                break;
            }

            // creating a new student
            StudentData data = new StudentData(studentName, studentMarks);

            // appending new student to the array
            sDataList[i] = data;
        }

        System.out.println();
        System.out.println("Printing unsorted list");
        System.out.println();
        printList(sDataList);
        System.out.println();
        System.out.println("Sorting the data");
        sDataList = sortDescendingOrder(sDataList);
        System.out.println();
        System.out.println("Data sorted");
        System.out.println();
        System.out.println("Printing sorted list");
        System.out.println();
        printList(sDataList);



    }
}