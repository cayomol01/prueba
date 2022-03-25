/*Realiza las operaciones aritméticas básicas
Diego Guillén 20812*/


import java.util.ArrayList;
import java.util.Collections;

public class oparitmetica {
    oparitmetica(){}
    int finalresult = -1;
    
    public int suma(int x, int y){
        int resultado = x+y;
        return resultado;
    }
    
    public int resta(int x, int y){
        int resultado = x-y;
        return resultado;
    }

    public int multiplicacion(int x, int y){
        int resultado = x*y;
        return resultado;
    }

    public int division(int x, int y){
        int resultado = x/y;
        return resultado;
    }

    public int operate(ArrayList<String> x){

        int resultado = -1;
        ArrayList <String> temporary = new ArrayList<String>();
        SetQ setQ = new SetQ();
        Defun Defun = new Defun();
        ArrayList<String> secondary = new ArrayList<String>();
        int counter = 0;
        Translator translator = new Translator();

        boolean good= x.isEmpty();
        while(good==false){
            String temp = x.get(x.size()-1).toString();
            x.remove(x.size()-1);
            good = x.isEmpty();

            int a = -1;
            int b = -1;

            if(temp.equals("+")){
                a = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                b = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                resultado = suma(a,b);
                temporal.add(resultado+"");
            }
            else if(temp.equals("-")){
                a = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                b = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                resultado = resta(a,b);
                temporal.add(resultado+"");
        }
            else if(temp.equals("*")){
                a = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                b = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                resultado = multiplicacion(a,b);
                temporal.add(resultado+"");
        }
            else if(temp.equals("/")){
                a = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                b = Integer.parseInt(temporal.get(0)+"");
                temporal.remove(0);
                resultado = division(a,b);
                temporal.add(resultado+"");
        }
            else if(temp.equals("(")){
                System.out.println("El sisttema ha encontado un paréntesis");
                String value = "";
                if(contador != 0){
                    for(int i= x.size()-1; i>0; i--){
                        if(x.get(i).equals(")")){
                            i=0;
                            value = parentesis(secundaria) + "";
                        }
                        else{
                            try{
                                Integer.parseInt(x.get(i));
                                secondary.add(x.get(i));
                            }
                            catch(Exception e){
                                String resu = setQ.VariableGet(x.get(i));
                                if(resul==null){
                                    boolean reu2 = Defun.ExistingString(x.get(i));
                                    if(resul2==true){
                                        boolean plom= false;
                                        ArrayList<String> sendtoDefun = new ArrayList<String>();
                                        sendtoDefun.add(x.get(i));
                                        for(int j=x.size()-1; j>0; j--){
                                            if(x.get(j).equals(sendtoDefun.get(0))){
                                                plom = true;
                                            }
                                            if(plom == true){
                                                if(x.get(j).equals(")")){
                                                    j = 0;
                                                }
                                                else{
                                                    sendtoDefun.add(x.get(j));
                                                    x.remove(x.size()-1);
                                                }
                                            }
                                        }
                                        sendtoDefun.remove(0);
                                        sendtoDefun.add(sendtoDefun.size(), ")");
                                        String regreso = Defun.CallFinalDefun(sendtoDefun);
                                        if(regreso.equals("")){
                                            i=0;
                                            return 2;
                                        }
                                        else{
                                            secondary.add(regreso);
                                            i=0;
                                        }
                                    }
                                    else{
                                        secondary.add(x.get(i));
                                    }
                                }
                                else{
                                    secondary.add(resul);
                                }
                            }
                            for(int f=0; f< secondary.size();f++){
                                temporary.add(secondary.get(f));
                            }
                            x.remove(x.size()-1);
                        }
                    }
                }
            }
            else{
                boolean t = true;
                try{
                    Integer.parseInt(temp);
                }
                catch(Exception e){
                    t = false;
                    String resul = setQ.Variableget(temp);
                    if(resul==null){
                        boolean resul2 = sendtoDefun.ExistingString(temp);
                        if(resul2==true){
                            ArrayList<String> sendtoDefun = new ArrayList<String>();
                            sendtoDefun.add(temp);
                            for(int o = x.size()-1; o>= 0; o--){
                                if(x.get(o).equals(")")){
                                    sendtoDefun.add(x.get(o));
                                    o = 0;
                            }
                            else{
                                sendtoDefun.add(x.get(o));
                            }
                        }
                        Defun.CallFinalDefun(sendtoDefun);
                    }
                    else {
                    }
                }
                else{
                    temporal.add(resul);
                }
            }
            if(t==true){
                temporary.add(temp+"");
            }
    }
    counter++;
}}}
