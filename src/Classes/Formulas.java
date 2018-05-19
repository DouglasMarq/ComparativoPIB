package Classes;

import java.text.NumberFormat;
import java.util.ArrayList;


public class Formulas {

    Ler_Arquivo c1 = new Ler_Arquivo();
    private ArrayList<String> ListaPIB = c1.getdados2();
    private ArrayList<String> ListaPIB2 = new ArrayList<String>();
    private ArrayList<String> ListaPais = new ArrayList<String>();
    private int i;
    private Double[] variancia = new Double[50];
    private Double[] desvio = new Double[50];
    private Double[] desvioMedio = new Double[50];
    private double MedianaPib;
    private double MediaPib;
    private double SomaPib;
    private double desvioM;
    private double varianciadouble;
    private double desvioPadrao;
    private double desviodouble;
    private double coeficienteVariacao;
    private boolean calcular = true;
    NumberFormat nf = NumberFormat.getInstance();
    
    public double getMediaPib() {
        return MediaPib;
    }

    public double getSomaPib() {
        return SomaPib;
    }
    
    public double getMedianaPib(){
        return MedianaPib;
    }

    public Double[] getDesvioMedio() {
        return desvioMedio;
    }

    public double getDesvioM() {
        return desvioM;
    }
    
    public double getVariancia(){
        return varianciadouble;
    }
    
    public double getDesvioPadrao(){
        return desvioPadrao;
    }
    
    public double getCoeficienteVariacao() {
        return coeficienteVariacao;
    }
    
    public ArrayList<String> getListaPIB2(){
        return ListaPIB2;
    }
    
    public ArrayList<String> getListaPais(){
        return ListaPais;
    }
    
    public void Paises(){
        c1.lerarquivocsv();
        for(i=0;i<ListaPIB.size();i++){
            String[] Paises = ListaPIB.get(i).split(";");
            ListaPais.add(Paises[0]);
        }
    }
    
    public void Medias(){
      c1.lerarquivocsv();
      SomaPib = 0.0;
      for(i=0;i<ListaPIB.size();i++){
          String[] PibTotal = ListaPIB.get(i).split(";");
          SomaPib = SomaPib+Double.parseDouble(PibTotal[2]);
      }
      MediaPib = 0.0;
      MediaPib = SomaPib/50;
      
      for(i=0;i<ListaPIB.size();i++){
          String[] soma2 = ListaPIB.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / (5);
          ListaPIB2.add(soma2[2]);
          //System.out.println(String.valueOf(variancia[i]));
      }
      
        //medianapib
            String[] div = ListaPIB.get(24).split(";");
            MedianaPib = Double.parseDouble(div[2]);
    }
    
    public void DesvioMedio() {
      c1.lerarquivocsv();
      Medias();
      for(i=0;i<ListaPIB.size();i++){
          String[] soma2 = ListaPIB.get(i).split(";");
          desvioMedio[i] = (Double.parseDouble(soma2[2]) - MediaPib) / ListaPIB.size();
      }
      for(i=0;i<ListaPIB.size();i++){
         desvioM = (Double) (desvioM + desvioMedio[i]);
   }
        //System.out.println(desvioM);
    }
    
    public void Variancia(){
        
       c1.lerarquivocsv();
       for(i=0; i < ListaPIB.size();i++){
            String[] soma = ListaPIB.get(i).split(";");
            SomaPib = Double.parseDouble(soma[2]) + SomaPib;
        } 
        
      for(i=0;i<ListaPIB.size();i++){
          String[] soma2 = ListaPIB.get(i).split(";");
          variancia[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / 5;
      }
      for(i=0;i<ListaPIB.size();i++){
          varianciadouble = (Double) (variancia[i] + varianciadouble);
          //System.out.println(i + "-" + nf.format(variancia[i]));
      }
          //System.out.println("Variancia: " + nf.format(varianciadouble));
    }
    
    public void Desviopadrao(){
       c1.lerarquivocsv();
       Medias();
        
      for(i=0;i<ListaPIB.size();i++){
          String[] soma2 = ListaPIB.get(i).split(";");
          desvio[i] =  Math.pow((Double.parseDouble(soma2[2]) - MediaPib),2) / 5;
      }
      for(i=0;i<ListaPIB.size();i++){
          desviodouble = (Double) (desvio[i] + desviodouble);
      }
          desvioPadrao = Math.sqrt(desviodouble);
          //System.out.println("Desvio Padrão: " + nf.format(desvioPadrao));
    }  
    
    public void CoefienteVariacao() {
        Medias();
        Desviopadrao();
        
        coeficienteVariacao = (Double) (desvioPadrao / MediaPib) * 100;
    }

    
}
