package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ler_Arquivo {
    
    //cria a arraylist
    public ArrayList<String> ListaCSV = new ArrayList<String>();
    public ArrayList<String> ListaCSV2 = new ArrayList<String>();
    private long SomaPib;
    private int i;
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getdados(){
        return ListaCSV2;
    }
    
    public void lerarquivocsv(){
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
            ListaCSV2.add(ListaCSV.get(i).replace(";", " - "));
        }
    }
    
    public void lerpib(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        File arquivoCSV = new File(getClass().getResource("arquivo.csv").getFile());

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
            ListaCSV2.add(ListaCSV.get(i).replace(";", " - "));
            System.out.println(ListaCSV2.get(i));
        }
    }
    
    public void somapib(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        File arquivoCSV = new File(getClass().getResource("arquivo.csv").getFile());

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
        
        for(i=0; i < ListaCSV.size();i++){
            String[] soma = ListaCSV.get(i).split(";");
            SomaPib = Long.parseLong(soma[2]) + SomaPib;
        }
    }
}