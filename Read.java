import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
   public ArrayList<ArrayList<String>> decode(String file){
       Scanner filee = new Scanner(System.in);
       try{
           filee = new Scanner(new File(file));
       }
       catch(FileNotFoundException e){
           System.out.println("");
           return null;
       }
       ArrayList<String> Lines = new ArrayList<>();
       filee.useDelimiter("\n");
       while(file.hasNext()){
           Stirng x = filee.next();
           Lines.add(x);
       }
       ArrayList<ArrayList<String>> Data = new ArrayList<>();
       filee.useDelimiter(" ");
       for(int i = 0; i<Lines.size();i++){
           ArrayList<String> temp = new ArrayList<>();
           String lineaTemp = Lines.get(i);
           filee = new Scanner(lineaTemp);
           while(filee.hasNext()){
               String x = filee.next();
               temp.add(x);
           }
           Data.add(temp);
       } 
       filee.close();
       return Data;
   } 
}
