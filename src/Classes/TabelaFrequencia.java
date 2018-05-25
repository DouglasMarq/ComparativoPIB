package Classes;

import java.util.ArrayList;

public class TabelaFrequencia {

    Formulas c1 = new Formulas();
    Ler_Arquivo c2 = new Ler_Arquivo();
    private ArrayList<String> FiArray = new ArrayList<String>();
    private ArrayList<String> FacArray = new ArrayList<String>();
    private ArrayList<Float> FRArray = new ArrayList<Float>();  
    private float[] FrDados = new float[51];
    private ArrayList<String>ListaCSV = c2.getListaCSV();
    private ArrayList<Float>FracArray = new ArrayList<Float>();
    private ArrayList<Double>XXBarrado = new ArrayList<Double>();
    private ArrayList<Double>XXBarradoVezes = new ArrayList<Double>();
    private ArrayList<Double>XXBarradoVezesAoQuadrado = new ArrayList<Double>();
    private int i;
    private float ensurement = 2;
    private float FloatDiv;
    private String[] Rol = new String[50];
    private double MediaPib;
    private double AoQuadrado;
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getFi(){
        return FiArray;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getFac(){
        return FacArray;
    }
    
    //transfere esse vetor para a outra classe
    public float[] getFr(){
        return FrDados;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<Float> getFrac(){
        return FracArray;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<Double> getXXBarrado(){
        return XXBarrado;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<Double> getXXBarradoVezes(){
        return XXBarradoVezes;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<Double> getXXBarradoVezesAoQuadrado(){
        return XXBarradoVezesAoQuadrado;
    }
    
    //Formula do Fi
    public void Fi(){
        for(i=0;i<51;i++){
            FiArray.add("1");
        }
        FiArray.add("50");
    }
    
    //Formula do Fac
    public void Fac(){   
        for(i=1;i<51;i++){
            FacArray.add(String.valueOf(i));
        }
    }
    
    //Formula do Fr
    public void Fr(){
        Fi();
        for(i=0;i<51;i++){
            FRArray.add(Float.parseFloat(FiArray.get(i)));
            FloatDiv = FRArray.get(i) / Float.parseFloat(FiArray.get(51));
            FloatDiv *= 100;
            FrDados[i] = FloatDiv;
        }
    }
    
    //Formula do Frac
    public void Frac(){
       Fr();
       FracArray.clear();
       FracArray.add(ensurement);
       for(i=0;i<50;i++){
           if(FracArray.get(0) <= 0){
           FracArray.add(FrDados[i]);
           } else {
           FracArray.add(FrDados[i] + FracArray.get(i));
           }
       }
   }
    
    //Formula do X-XBarrado
    public void XXBarrado(){
       c1.Medias();
       c2.lerarquivocsv();
       MediaPib = c1.getMediaPib();
       for(i=0;i<50;i++){
           String[] separador = ListaCSV.get(i).split(";");
           MediaPib = Double.parseDouble(separador[3]) - MediaPib;
           MediaPib = Math.abs(MediaPib);
           XXBarrado.add(MediaPib);
       }
   }
    
    //Formula do X-XBarrado*fi
    public void XXBarradoVezes(){
       c1.Medias();
       c2.lerarquivocsv();
       MediaPib = c1.getMediaPib();
       for(i=0;i<50;i++){
           String[] separador = ListaCSV.get(i).split(";");
           MediaPib = Double.parseDouble(separador[3]) - MediaPib;
           MediaPib = Math.abs(MediaPib);
           MediaPib = MediaPib*Double.parseDouble(FiArray.get(i));
           XXBarradoVezes.add(MediaPib);
       }
   }
    
    //Formula do X-XBarrado²*Fi
    public void XXBarradoVezesAoQuadrado(){
       c1.Medias();
       c2.lerarquivocsv();
       MediaPib = c1.getMediaPib();
       for(i=0;i<50;i++){
           String[] separador = ListaCSV.get(i).split(";");
           MediaPib = Double.parseDouble(separador[3]) - MediaPib;
           MediaPib = Math.abs(MediaPib);
           AoQuadrado = Math.pow(MediaPib,2);
           AoQuadrado = AoQuadrado*Double.parseDouble(FiArray.get(i));
           XXBarradoVezesAoQuadrado.add(AoQuadrado);
       }
   }
}
