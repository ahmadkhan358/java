// employee class
public class Employee extends Member {
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public Employee(String n, int a, String p, String c, double s, String sp){
        super(n, a, p, c, s);
        specialization = sp;
    }


    @Override
    public void printData() {
        super.printData();
        System.out.println("Specialization : " + specialization);
        System.out.println();
    }

}
