package Classes;

import java.util.ArrayList;
import UI.jTabelaFreq;

public class TabelaFrequencia {

    private ArrayList<String> FiArray = new ArrayList<String>();
    private ArrayList<String> FacArray = new ArrayList<String>();
    private ArrayList<Float> FRArray = new ArrayList<Float>();  
    private float[] FrDados = new float[51];
    private ArrayList<Float>FracArray = new ArrayList<Float>();
    private int i;
    private float ensurement = 2;
    private float FloatDiv;
    
    public ArrayList<String> getFi(){
        return FiArray;
    }
    
    public ArrayList<String> getFac(){
        return FacArray;
    }
    
    public float[] getFr(){
        return FrDados;
    }
    
    public ArrayList<Float> getFrac(){
        return FracArray;
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
    
   public void Fr(){
        Fi();
        for(i=0;i<51;i++){
            FRArray.add(Float.parseFloat(FiArray.get(i)));
            FloatDiv = FRArray.get(i) / Float.parseFloat(FiArray.get(51));
            FloatDiv *= 100;
            FrDados[i] = FloatDiv;
        }
    }
   public void Frac(){
       Fr();
       FracArray.clear();
       FracArray.add(ensurement);
       for(i=0;i<50;i++){
           if(FracArray.get(0) <= 0){
           FracArray.add(FrDados[i]);
           } else {
           FracArray.add(FrDados[i] + FracArray.get(i));
           System.out.println(String.valueOf(FracArray.get(i)));
           }
       }
   }
}
