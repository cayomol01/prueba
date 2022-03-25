import java.util.HashMap;

public class SetQ {
    static HashMap <String, String> variables = new HashMap<>();
    public static void VariableSet(String key, String value) {
        variables.put(key, value);
    }
    public static void replaceSetQ(String key, String value) {
        variables.replace(key, value);
    }
    public static String VariableGet(String x){
        String answer = null;
        try{
            answer = variables.get(x);
            return answer;
        }
        catch(NullPointerException e){
            System.out.println("No existe el valor");
            return answer;
        }
    }
}
