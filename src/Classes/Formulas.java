package Classes;

import java.util.ArrayList;


public class Formulas {
    
    Ler_Arquivo c1 = new Ler_Arquivo();
    private ArrayList<String> ListaCSV = c1.getdados2();
    private int i;
    private Double[] variancia = new Double[70];
    private String MedianaPib;
    private long MediaPib;
    private long SomaPib;
    private Double varianciadouble;
    private Double teste;
    
    public void Variancia(){
        c1.somapib();
       
       for(i=0; i < ListaCSV.size();i++){
            String[] soma = ListaCSV.get(i).split(";");
            SomaPib = Long.parseLong(soma[0]) + SomaPib;
        }
      
      //mediapib
      MediaPib = SomaPib/50;  
      System.out.println("Media = " + MediaPib);
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[0]) - MediaPib),2) / (49);
          System.out.println(String.valueOf(variancia[i]));
      }
        //x-x/²
        //medianapib
        MedianaPib = ListaCSV.get(25);
        System.out.println("Mediana = " + MedianaPib);
    }
    
    public void desviopadrao(){
       c1.somapib();
       
       for(i=0; i < ListaCSV.size();i++){
            String[] soma = ListaCSV.get(i).split(";");
            SomaPib = Long.parseLong(soma[0]) + SomaPib;
        } 
        
      MediaPib = SomaPib/50;  
      System.out.println("Media = " + MediaPib);
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[0]) - MediaPib),2) / (49);
      }
      for(i=0;i<ListaCSV.size();i++){
          varianciadouble = variancia[i] + varianciadouble;
          System.out.println(variancia[i]);
      }
          System.out.println(String.valueOf(varianciadouble));
    }
}
