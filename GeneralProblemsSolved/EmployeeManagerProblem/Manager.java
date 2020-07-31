// manager class
public class Manager extends Member {
    private String department;

    public String getDepartment() {
        return department;
    }

    public Manager(String n, int a, String p, String c, double s, String d){
        super(n, a, p, c, s);
        department = d;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Department : " + department);
        System.out.println();
    }
}
