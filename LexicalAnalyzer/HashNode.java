import java.util.ArrayList;
import java.util.List;

public class HashNode {
    public String token;
    public int scopeLevel;
    public String dataType;
    public int lowerBound;
    public int upperBound;
    public int lengthOfArray;
    public int numberOfParameters;
    public List<String> typesOfParams = new ArrayList<>();
    public String returnType;
    public Object value;
    public HashNode next;


    public HashNode(String tok, int sl, String dt, int lb,
                    int ub, int loa, int nop, List<String> top, String rt, Object v, HashNode n){
        token = tok;
        scopeLevel = sl;
        dataType = dt;
        lowerBound = lb;
        upperBound = ub;
        lengthOfArray = loa;
        numberOfParameters = nop;
        typesOfParams = top;
        returnType = rt;
        value = v;
        next = n;
    }


}
