/*Interrumpe el proceso de evaluación de expresiones*/
import java.util.ArrayList;
public class quote {
    public void Quote(ArrayList<String>x) {
        String print = "";
        for(int i=1; i<x.size()-1;i++){
            print = print + x.get(i) + "";
        }
        System.out.println(print);
    }
}
