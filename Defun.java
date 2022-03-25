import java.lang.reflect.Array;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;

public class Defun {
    static HashMap <String, ArrayList<String>> Defundss = new HashMap<>();
    public static void SaveDefun(ArrayList<String> function){
        parameter param = new parameter();
        Translate translate = new Translate();
        String name = function.get(2);
        function.remove(0);
        function.remove(0);
        function.remove(0);

        ArrayList<String> parameter = new ArrayList<String>();
        ArrayList<String> content = new ArrayList<String>();
        int left = 0;

        for(int i=0;i<function.size()-1;i++){
            if(function.get(i).equals(")")){
                parameter.add(function.get(i));
                left = i;
                i = function.sie()-1;
            }
            else{
                parameter.add(function.get(i));
            }
        }
        for (int i = left+1; i<= function.size()-1;i++){
            content.add(function.get(i));
        }
        Stirng enterParam = " ";
        for(int v = 0; v<= parameter.size()-1; v++){
            enterParam = enterParam + parameter.get(v);
        }
        String nameParameter = name + enterParam;
        Defundss.put(nameParameter, content);

        boolean execute = param.Parameter(name, parameter);
        if(execute ==true){
            System.out.println("El parámetro existe");
            translate.translating(content);
        }
        else{
            System.out.println("No existe el parámetro!");
        }
    }
    public static String CallFinalDefun(ArrayList<String> x) {
        Parameter param = new parameter();
        Translate translate = new Translate();
        ArrayList<String> content = new ArrayList<String>();
        ArrayList<String> parameter = new ArrayList<String>();
        boolean found = false;
        String returnn = "";

        for(String key: Defundss.keySet()){
            boolean q = true;
            int i = 0;
            String pf = "";

            while(z == true){
                char letter = key.charAt(i);
                String letter2 = letter + "";
                if(letter2.equals("(")){
                    q = false;
                }
                else{
                    pf = pf + letter2;
                }
                i++;
            }
            String zz = x.get(0)+" ";
            if(zz.equals(pf)){
                found = true;
                content = Defundss.get(key);
            }
            if(found==true){
                for(int j= 1; j<x.size();j++){
                    if(x.get(j).equals(")")){
                        parameter.add(x.get(j));
                        j = x.size()-1;
                        param.getParameter(key, parameter);
                        returnn = translate.translating(content);
                    }
                    else{
                        parameter.add(x.get(j));
                    }
                }
            }
        }
        return returnn;
    }
    public boolean Existing(ArrayList<String> x){
        boolean answer = false;
        int i=0;
        for(String key: Defundss.keySet()){
            if(x.get(i).equals(key)){
                answer = true;
                return answer;
            }
            i++;
        }
        return answer;
    }
    public boolean ExistingString(String x){
        x = x+ " ";
        boolean answer = false;
        for(String key: Defundss.keySet()){
            boolean q = true;
            int i = 0;
            String pf = " ";
            while(q == true){
                char letter = key.charAt(i);
                String letter2 = letter + "";
                if(letter2.equals("(")){
                    q = false;
                }
                else{
                    pf = pf+letter2;
                }
                i++;
            }
            if(x.equals(pf)){
                answer = true;
                return answer;
            }
        }
        return answer;
    }
}
