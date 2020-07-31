import java.util.Scanner;
// member class
public class Member {

    // class attributes
    private String name;
    private int age;
    private String phone;
    private String city;
    private double salary;

    public Member(){}

    public Member(String n, int a, String p, String c, double s) {
        name = n;
        age = a;
        phone = p;
        city = c;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public double getSalary() {
        return salary;
    }


    public void printData(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone : " + phone);
        System.out.println("City : " + city);
        System.out.println("Salary : " + salary);
    }


    // searchBySpecialization function
    public void searchBySpecialization(Employee[] emps){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter specialization to search : ");
        String spec = scan.nextLine();
        for(Employee e: emps){

            if(e.getSpecialization().equals(spec)){
                e.printData();
            }
        }
    }


    // searchBySalary function
    public void searchBySalary(Employee[] emps){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter maximum salary : ");
        int max = scan.nextInt();
        System.out.print("Enter minimum salary : ");
        int min = scan.nextInt();

        for(Employee e: emps){
            if(e.getSalary() < max && e.getSalary() > min && e.getAge() < 50){
                e.printData();
            }
        }
    }

    public static void main(String[] args) {
        Member member = new Member();

        // objects of employee class
        Employee[] emps = {
                new Employee("paul", 30, "12345", "san francisco", 400, "web"),
                new Employee("andy", 32, "134405", "los angeles", 420, "react native"),
                new Employee("mark", 29, "1633685", "new orleans", 350, "web"),
                new Employee("susan", 25, "18324", "los angeles", 350, "front end"),
                new Employee("sean", 35, "1739225", "california", 450, "web")
        };

        for(Employee e: emps){
            e.printData();
        }

        // objects of manager class
        Manager[] mana ={
                new Manager("carlo", 48, "98765", "las vegas", 900, "information technology"),
                new Manager("henry", 50, "2324423", "nevada", 1000, "finance"),
                new Manager("finn", 45, "423423", "new york", 1000, "information technology"),
                new Manager("white", 47, "126457123", "new orleans", 900, "HR")
        };

        for(Manager m: mana){
            m.printData();
        }

        member.searchBySpecialization(emps);
        member.searchBySalary(emps);

    }
}

