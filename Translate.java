import java.util.ArrayList;

public class Translate {
    private quote q = new quote();
    private predicados p = new predicados();
    private oparitmetica a = new aritmetica();
    private SetQ s = new SetQ();
    private Defun d = new Defun();

    public String traducir(ArrayList<String> data) {
        
        String[] functions = {
            "+", "-", "/", "*", 
            "'", 
            "DEFUN", "SETQ", 
            "ATOM", "LIST", "EQUAL", "<", ">", 
            "COND", "print"
        };
        int function = 0; 

        for(int i = 0; i < data.size(); i++) { 
            for(int j = 0; j < functions.length; j++) { 
                if (data.get(i).equalsIgnoreCase(functions[j])) { 
                    function = j + 1; 
                    i = data.size(); 
                    j = functions.length; 
                }
            }
        }

        switch (function) { 
            case 1, 2, 3, 4: 
                System.out.println("Pertenece a las operaciones aritméticas");
                String num = a.decode(data);
                return num;
                
        
            case 5: 
                System.out.println("Es quote");
                q.quote(data);
                break;

            case 6: 
                System.out.println("Es Defun"); 
                boolean exists = d.Existent(data);
                if(exists == true){
                    System.out.println("Sí existe");
                    d.CallFinalDefun(data);
                }else{
                    System.out.println("No existe");
                    d.SaveDefun(data);
                }
               
                break;

            case 7: 
                System.out.println("SetQ");
                
                for(int b=0; b<data.size(); b++){
                    if(data.get(b).equals("setq")) {
                        String keyy= data.get(b+1);
                        String value= data.get(b+2);
                        s.VariableSet(keyy,value);
        
                    }
        
                }

                break;

            case 8: 
                System.out.println("Es ATOM");
                boolean resulAtom = p.atom(data);
                System.out.println("Atom: " + resulAtom);
                break;

            case 9: 
                System.out.println("LIST"); 
                boolean resulList = p.list(data);
                System.out.println("list: " + resulList);
                break;

            case 10: 
                System.out.println("EQUAL");
            
                String answer= p.GreaterLessEqual(data) +"";
                System.out.println(answer);
                break;

            case 11: 
                System.out.println("Es un menor que");

                answer= p.GreaterLessEqual(data) +"";
                System.out.println(answer);

                break;

            case 12:
                System.out.println("Mayor que");
  
                answer = p.GreaterLessEqual(data) +"";
                System.out.println(answer);
                
                break;

            case 13: 
                System.out.println("Condicional");
                conditional c = new conditional();
                String regre = c.conditional(data);
                return regre;
            
            case 14: 
                System.out.println("Imprime");
                imprime pr = new imprime(data);


                break;
        }

        return "";

    }
}

