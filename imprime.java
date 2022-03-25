import java.util.ArrayList;
public class imprime {
    imprime(ArrayList<String> data){
        for(int i = 0; i<data.size()-1; i++){
            if(data.get(i).equals("print")){
                for(int j=i+2; j<=data.size()-1;j++){
                    if(data.get(j).equals(")")){
                        j=data.size()-1;
                    }
                    else{
                        System.out.println(datos.get(j)+" ");
                    }
                }
            }
        }
    }
}
