import java.util.ArrayList;

import javax.sql.CommonDataSource;

public class condicionales {
    ArrayList<String> conditionals = new ArrayList<String>();    

    public String condicionales(ArrayList x){
        conditionals=x;
        String asnwer = "";
        ArrayList<String> temporal = new ArrayList<String>();
        ArrayList<String> executable = new ArrayList<String>();
        
        predicate predicate = new predicate ();
        SetQ setQ = new SetQ();
        Translate t = new Translate();
        
        for(int i=0; i<conditionals.size()-1;i++){
            if(conditionals.get(i).equals("cond")){
                for(int j=i+1; j<=conditionals.size()-1;j++){
                    if(conditionals.get(j).equals(")")){
                        temporal.add(conditionals.get(j));
                        for(int k=j+1; k<=conditionals.size()-1;k++){
                            executable.add(conditionals.get(k));
                        }
                        j=conditionals.size()-1;
                    }
                    else{
                        temporal.add(conditionals.get(j));
                    }
                }
            }
        }
        boolean execu=predicate.GreaterLessEqual(temporal);
        String e ="";
        if(execu==true){
            answer = t.translating(exectuable);
            return answer;
        }
        return "";
    }
}
