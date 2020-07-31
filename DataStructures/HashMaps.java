import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();

        map.put(1, "ahmad");
        map.put(2, "eman");
        map.put(3, "aqib");
        map.put(4, "khadija");
        int calculations = 0;

        for (Integer key: map.keySet()) {
            calculations++;
            System.out.println(map.get(key));
        }

        System.out.println(calculations);
    }
}
