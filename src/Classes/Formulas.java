package Classes;

import java.text.NumberFormat;
import java.util.ArrayList;


public class Formulas {
    
    Ler_Arquivo c1 = new Ler_Arquivo();
    private ArrayList<String> ListaCSV = c1.getdados2();
    private int i;
    private Double[] variancia = new Double[50];
    private Double[] desvio = new Double[50];
    private double MedianaPib;
    private double MediaPib;
    private double SomaPib = 0;
    private double varianciadouble;
    private double desvioPadrao;
    private double desviodouble;
    NumberFormat nf = NumberFormat.getInstance();
    
    /*public double getMediaPib(){
        return MediaPib;
    }*/
    
    public void Medias(){
      //mediapib
      c1.lerarquivocsv();
      for(i=0;i<ListaCSV.size();i++){
          String[] PibTotal = ListaCSV.get(i).split(";");
          SomaPib = SomaPib+Double.parseDouble(PibTotal[2]);
      }
      MediaPib = SomaPib/5;
      System.out.println("Media = " + nf.format(MediaPib));
      
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / (5);
          //System.out.println(String.valueOf(variancia[i]));
      }
        //medianapib
            String[] div = ListaCSV.get(3).split(";");
            MedianaPib = Double.parseDouble(div[2]);
            System.out.println("Mediana = " + nf.format(MedianaPib));
    }
    
    public void Variancia(){
        
       c1.lerarquivocsv();
       for(i=0; i < ListaCSV.size();i++){
            String[] soma = ListaCSV.get(i).split(";");
            SomaPib = Double.parseDouble(soma[2]) + SomaPib;
        } 
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / 5;
      }
      for(i=0;i<ListaCSV.size();i++){
          varianciadouble = (Double) (variancia[i] + varianciadouble);
          //System.out.println(i + "-" + nf.format(variancia[i]));
      }
          System.out.println("Variancia: " + nf.format(varianciadouble));
    }
    
    public void Desviopadrao(){
       c1.lerarquivocsv();
       Medias();
        
      for(i=0;i<ListaCSV.size();i++){
          String[] soma2 = ListaCSV.get(i).split(";");
          desvio[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / 5;
      }
      for(i=0;i<ListaCSV.size();i++){
          desviodouble = (Double) (desvio[i] + desviodouble);
      }
          desvioPadrao = Math.sqrt(desviodouble);
          System.out.println("Desvio Padrão: " + nf.format(desvioPadrao));
    }
}
