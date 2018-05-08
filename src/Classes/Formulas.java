package Classes;

import java.text.NumberFormat;
import java.util.ArrayList;


public class Formulas {
    
    Ler_Arquivo c1 = new Ler_Arquivo();
    private ArrayList<String> ListaCSV = c1.getdados2();
    private int i;
    private Double[] variancia = new Double[50];
    private String MedianaPib;
    private double MediaPib;
    private double SomaPib;
    private double varianciafloat;
    private double desvioPadrao;
    private Double teste;
    NumberFormat nf = NumberFormat.getInstance();
    
    public void Variancia(){
        c1.somapib();
        
       
       for(i=0; i < ListaCSV.size();i++){
            String[] soma = ListaCSV.get(i).split(";");
            SomaPib = Double.parseDouble(soma[2]) + SomaPib;
        }
      
      //mediapib
      MediaPib = SomaPib/5;  
      System.out.println("Media = " + MediaPib);
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / (5);
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
            SomaPib = Double.parseDouble(soma[2]) + SomaPib;
        } 
        
      MediaPib = SomaPib/5;  
      System.out.println("Media = " + nf.format(MediaPib));
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / 5;
          //variancia[i] =  (Double.parseDouble(soma2[0]) - MediaPib);
      }
      for(i=0;i<ListaCSV.size();i++){
          varianciafloat = (Double) (variancia[i] + varianciafloat);
          System.out.println(i + "-" + nf.format(variancia[i]));
      }
          desvioPadrao = Math.sqrt(varianciafloat);
          System.out.println("Variancia: " + nf.format(varianciafloat));
          System.out.println("Desvio Padrão: " + nf.format(desvioPadrao));
    }
}
