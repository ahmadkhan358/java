import java.util.Hashtable;

public class HashTableBuiltIn {

    public static void main(String[] args) {
        Hashtable<String, Integer> tab = new Hashtable<>();

        tab.put("ahmad", 21);
        tab.put("aqib", 13);
        tab.put("ahamd", 31);

        System.out.println(tab.toString());

    }
}
