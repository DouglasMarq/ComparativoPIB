package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ler_Arquivo {
    private ArrayList<String> ListaCSV = new ArrayList<String>();
    private ArrayList<String> ListaCSVAuxiliar = new ArrayList<String>();
    private int i;
    String csvArquivo = "C:\\Users\\Gabriel\\Documents\\GitHub\\ComparativoPIB\\src\\Classes\\PIB.csv";
    Double[] variancia = new Double[50];
    String[] lervalor = new String[50];
    NumberFormat nf = NumberFormat.getInstance();
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getListaCSV(){
        return ListaCSV;
    }
    
    //transfere essa arraylist para a outra classe
    public ArrayList<String> getListaCSVAuxiliar(){
        return ListaCSVAuxiliar;
    }
    
    public void lerarquivocsv(){
        //abre o arquivo no mesmo diretorio/cria o arquivo
        ListaCSV.clear();
       
        //Tenta ler o arquivo e capturar algum erro
        try{
            // Lê  o arquivo csv
            BufferedReader conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
            //cria scanner para ler arquivo
            Scanner leitor = new Scanner(conteudoCSV);
            //adiciona as linhas do arquivo CSV para a arraylist
            while(leitor.hasNextLine()){
                //Adiciona proxima linha a lista
                ListaCSV.add(leitor.nextLine());
            }
        } catch(FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi encontrado o arquivo na pasta raiz do programa.");
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "Não obtive acesso ao arquivo");
        }
        
        for (i=0; i < ListaCSV.size();i++){
            String[] separator = ListaCSV.get(i).split(";");
            lervalor[0] = separator[3];
            ListaCSVAuxiliar.add(lervalor[0]);
        }
    }
}