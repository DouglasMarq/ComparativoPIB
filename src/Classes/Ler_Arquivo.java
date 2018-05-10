package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ler_Arquivo {
    
    //cria a arraylist
    private ArrayList<String> ListaCSV = new ArrayList<String>();
    private ArrayList<String> ListaCSV2 = new ArrayList<String>();
    private ArrayList<String> ListaCSV3 = new ArrayList<String>();
    private ArrayList<String> ListaCSV4 = new ArrayList<String>();
    private ArrayList<String> ListaCSV5 = new ArrayList<String>();
    private int i;
    Double[] variancia = new Double[50];
    String[] lervalor = new String[50];
    NumberFormat nf = NumberFormat.getInstance();
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getdados(){
        return ListaCSV2;
    }
    
    public ArrayList<String> getdados2(){
        return ListaCSV;
    }
    
    public ArrayList<String> getdados4(){
        return ListaCSV4;
    }
    
    public ArrayList<String> getdados3(){
        return ListaCSV5;
    }
    
    public String[] getlervalor(){
        return lervalor.clone();
    }
    
    public void lerarquivocsv(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        ListaCSV.clear();
        File arquivoCSV = new File(getClass().getResource("PIB.csv").getFile());

        try{
            //cria scanner para ler arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //adiciona as linhas do arquivo CSV para a arraylist
            while(leitor.hasNextLine()){
                ListaCSV.add(leitor.nextLine());
            }
        } catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo na pasta raiz do programa.");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Não obtive acesso ao arquivo");
        }
        
        
    }
    
    public void lerpib(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        File arquivoCSV = new File(getClass().getResource("PIB.csv").getFile());

        try{
            //cria scanner para ler arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //adiciona as linhas do arquivo CSV para a arraylist
            while(leitor.hasNextLine()){
                ListaCSV.add(leitor.nextLine());
            }
        } catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo na pasta raiz do programa.");
        }
        
        for (i=0; i < ListaCSV.size();i++){
            String[] separator = ListaCSV.get(i).split(";");
            lervalor[0] = separator[2];
            ListaCSV4.add(lervalor[0]);
            //System.out.println(nf.format(Double.parseDouble(lervalor[0])));
        }
    }
    
    public void lerpibtabela(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        File arquivoCSV = new File(getClass().getResource("PIB(1).csv").getFile());

        try{
            //cria scanner para ler arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //adiciona as linhas do arquivo CSV para a arraylist
            while(leitor.hasNextLine()){
                ListaCSV5.add(leitor.nextLine());
            }
        } catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo na pasta raiz do programa.");
        }
        
        for (i=0; i < ListaCSV.size();i++){
            String[] separator = ListaCSV.get(i).split(";");
            //System.out.println(ListaCSV4.get(i));
        }
    }
}