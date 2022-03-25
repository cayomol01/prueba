import java.util.ArrayList;
import java.util.Set;

public class parametros {
    public boolean Parameter(String key, ArrayList<String> parameter) {
        SetQ SetQ = new SetQ();
        Translate translate = new Translate();
        boolean answer = false;
        ArrayList<String> prueba = parameter;
        String a = SetQ.VariableGet(parameter.get(1));
        if(a!= null && parameter.size()<=3){
            answer = true;
            System.out.println("Parámetro correcto");
        }
        else{
        for(int i = 0; i<parameter.size(); i++){
            if(parameter.get(i).equals("+") || parameter.get(i).equals("-") || parameter.get(i).equals("/") || parameter.get(i).equals("*") || parameter.get(i).equals("(")){
                System.out.println("Enviado a traductor");
                String keyy = GiveMeKey(prueba);
                String returnn = translate.translator(parameter);
                SetQ.replaceSetQ(keyy, returnn);
                return answer;
            }else{
                String aaa = parameter.get(i);
                int interr = Integer.parseInt(aaa);
            }
        }
    }
    return answer;
    }
    public String GiveMeKey(ArrayList<String> key){
        SetQ SetQ = new SetQ();
        String pf = null;
        System.out.println("La llave es: "+key);
        for(int i = 0; i<key.size()-1;i++){
            pf = key.get(i);
            String a = SetQ.VariableGet(pf);
            if(a!=null){
                return pf;
            }
        }
        return pf;
    }
}
