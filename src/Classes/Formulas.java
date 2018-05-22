package Classes;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Formulas {

    Ler_Arquivo c1 = new Ler_Arquivo();
    private ArrayList<String> ListaPIB = c1.getListaCSV();
    private ArrayList<String> ListaPIBAuxiliar = new ArrayList<String>();
    private ArrayList<String> ListaPais = new ArrayList<String>();
    private int i;
    private Double[] VarianciaVetor = new Double[50];
    private Double[] DesvioVetor = new Double[50];
    private Double[] DesvioMedioVetor = new Double[50];
    private double MedianaPib;
    private double MediaPib;
    private double SomaPib;
    private double DesvioMedio;
    private double varianciadouble;
    private double DesvioPadrao;
    private double DesvioDouble;
    private double CoeficienteVariacao;
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
        return DesvioMedioVetor;
    }

    public double getDesvioM() {
        return DesvioMedio;
    }
    
    public double getVariancia(){
        return varianciadouble;
    }
    
    public double getDesvioPadrao(){
        return DesvioPadrao;
    }
    
    public double getCoeficienteVariacao() {
        return CoeficienteVariacao;
    }
    
    public ArrayList<String> getListaPIBAuxiliar(){
        return ListaPIBAuxiliar;
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
    
    // Calcula as medias dos dados e a Mediana
    public void Medias(){
        c1.lerarquivocsv();
        SomaPib = 0.0;
        for(i=0;i<ListaPIB.size();i++){
          String[] PibTotal = ListaPIB.get(i).split(";");
          SomaPib = SomaPib+Double.parseDouble(PibTotal[3]);
        }
        MediaPib = 0.0;
        MediaPib = SomaPib/ListaPIB.size();
        for(i=0;i<ListaPIB.size();i++){
          String[] soma2 = ListaPIB.get(i).split(";");
          VarianciaVetor[i] =  Math.pow((Double.parseDouble(soma2[3]) - MediaPib),2) / (5);
          ListaPIBAuxiliar.add(soma2[3]);
        }
        //medianapib
        String[] div = ListaPIB.get(24).split(";");
        MedianaPib = Double.parseDouble(div[3]);
    }
    
    // Calcula o Desvio Medio 
    public void DesvioMedio() {
        c1.lerarquivocsv();
        Medias();
        for(i=0;i<ListaPIB.size();i++){
            String[] soma2 = ListaPIB.get(i).split(";");
            DesvioMedioVetor[i] = Math.abs((Double.parseDouble(soma2[3]) - MediaPib) / ListaPIB.size());
        }
        for(i=0;i<ListaPIB.size();i++){
            DesvioMedio = (Double) (DesvioMedio + DesvioMedioVetor[i]);
        }
   }
    
    // Calcula Variancia 
    public void Variancia(){
        c1.lerarquivocsv();
        Medias();
        for(i=0; i < ListaPIB.size();i++){
            String[] soma = ListaPIB.get(i).split(";");
            SomaPib = Double.parseDouble(soma[3]) + SomaPib;
        } 
        for(i=0;i<ListaPIB.size();i++){
            String[] soma2 = ListaPIB.get(i).split(";");
            VarianciaVetor[i] =  Math.pow((Double.parseDouble(soma2[3]) - MediaPib),2) / ListaPIB.size();
        }
        for(i=0;i<ListaPIB.size();i++){
            varianciadouble = (Double) (VarianciaVetor[i] + varianciadouble);
        }
        DesvioPadrao = Math.sqrt(varianciadouble);
        CoeficienteVariacao = (DesvioPadrao / MediaPib) * 100;
    }
    
    // Calcula o Desvio Padrão
    /*public void Desviopadrao(){
        c1.lerarquivocsv();
        Medias();
        for(i=0;i<ListaPIB.size();i++){
            String[] soma2 = ListaPIB.get(i).split(";");
            DesvioVetor[i] =  Math.pow((Double.parseDouble(soma2[3]) - MediaPib),2) / 5;
        }
        for(i=0;i<ListaPIB.size();i++){
            DesvioDouble = (Double) (DesvioVetor[i] + DesvioDouble);
        }
        DesvioPadrao = Math.sqrt(DesvioDouble);
    }*/  
    
    // Calcula o coeficiente de variação 
    public void CoefienteVariacao() {
        Medias();
        //Desviopadrao();
        //CoeficienteVariacao = (Double) (DesvioPadrao / MediaPib) * 100;
    }
}
