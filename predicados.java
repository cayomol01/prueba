import java.util.ArrayList;
public class predicados {
    public ArrayList<String> removeP(ArrayList<String>x){
        ArrayList <String> answer = x;
        answer.remove(0);
        return answer;
    }
    public ArrayList predicados(ArrayList x){
        ArrayList <String> answer = new ArrayList<String>();
        answer = x;
        return answer;
    }
    public boolean atom(ArrayList x){
        boolean answer = false;
        ArrayList <String> data = new ArrayList<String>();
        data = removeP(x);
        int sizee = data.size() -2;
        if(sizee ==1){
            answer=true;
        }
        else{
            answer=false;
        }
        return answer;
    }
    public boolean list(ArrayList x){
        boolean answer=false;
        ArrayList <String> data = new ArrayList<String>();
        data = removeP(x);
        int sizee = data.size()-2;
        if(sizee !=1){
            answer=true;
        }
        else{
            answer=false;
        }
        return answer;
    }
    public boolean GreaterLessEqual(ArrayList<String>zz){
        SetQ SetQ = new SetQ();
        ArrayList <String> x = removeP(zz);
        boolean answer = true;
        ArrayList <Integer> data = new ArrayList<Integer>();
        int temp;
        for(int i = 1;i<x.size()-1;i++){
            try{
                String g = x.get(i);
                System.out.println(g);
                data.add(temp);
            }
            catch(Exception e){
                String g = x.get(i);
                System.out.println(g);
                String whilee = SetQ.VariableGet(g);
                temp = Integer.parseInt(whilee);
                data.add(temp);
            }
        }
        if(x.get(0).equals("equal")){
            if(data.get(0) ==data.get(1)){
                System.out.println(data.get(0)+" igual a "+data.get(1));
                answer = true;
            }else{
                System.out.println(data.get(0)+"no es igual "+data.get(1));
                answer = false;
            }
        }else if(x.get(0).equals(">")){
            if(data.get(0)>datos.get(1)){
                System.out.println(data.get(0)+"mayor que"+data.get(1));
                answer=true;
            }
            else{
                System.out.println(data.get(0)+"no mayor que"+data.get(1));
                answer=false;
            }
        }else if(x.get(0).equals("<")){
            if(data.get(0)>datos.get(1)){
                System.out.println(data.get(0)+"menor que"+data.get(1));
                answer=true;
            }
            else{
                System.out.println(data.get(0)+"no menor que"+data.get(1));
                answer=false;
        }
        return answer;
    }
}}
