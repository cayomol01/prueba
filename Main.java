import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        Read r = new Read();
        Translate t = new Translate();
        ArrayList<ArrayList<String>> Data = new ArrayList<>();
        
        Data = r.decode("data.txt");
        for (int i= 0; i<Data.size(); i++){
            ArrayList<String> text = new ArrayList<>();
            if(Data.get(i).get(1).equals("defun")){
                int index = i;
                int num = 0;
                    while(true){
                        for(int j = 0; j<Data.get(i).size();j++){
                            if(Data.get(i).get(j).equals("(")){
                                num++;
                            }
                            else if(Data.get(i).get(j).equals(")")){
                                num--;
                            }
                        }
                        i++;
                        if(num==0){
                            break;
                        }
                    }
                    for(int j= index; j<i;j++){
                        for(int k = 0; k<Data.get(j).size();k++){
                            text.add(Data.get(j).get(k));
                        }
                    }
                }else{
                    text = Data.get(i);
                } 
                t.translator(text);
                }    
            }
        {}
        
    } 
