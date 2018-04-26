package Classes;

import java.util.ArrayList;
import UI.jTabelaFreq;

public class TabelaFrequencia {

    public ArrayList<String> FiArray = new ArrayList<String>();
    public ArrayList<String> FacArray = new ArrayList<String>();
    public ArrayList<String> FRArray = new ArrayList<String>();
                      
    private int i;
    private Long FloatDiv;
    
    public ArrayList<String> getFi(){
        return FiArray;
    }
    
    public ArrayList<String> getFac(){
        return FacArray;
    }
    
    public ArrayList<String> getFr(){
        return FRArray;
    }
    
    public void Fi(){
        for(i=0;i<51;i++){
            FiArray.add("1");
        }
        FiArray.add("50");
    }
    
    public void Fac(){   
        for(i=1;i<51;i++){
            FacArray.add(String.valueOf(i));
        }
    }
    
   /*public void FR(){
        for(i=0;i<51;i++){
            FRArray.add("1");
            FloatDiv = Long.parseLong(FRArray.get(i)) + FloatDiv;
            System.out.println(FloatDiv);
        }
    }*/
}
