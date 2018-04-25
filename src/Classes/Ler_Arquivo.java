package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ler_Arquivo {
    
    
   
    public void lerarquivocsv(){
        
        File arquivoCSV = new File(getClass().getResource("arquivo.csv").getFile());
        
        try{
            
            String linhasarquivo = new String();
            
            ArrayList<String> Listateste = new ArrayList<String>();
            
            Scanner leitor = new Scanner(arquivoCSV);
            
            //leitor.nextLine();
            
            while(leitor.hasNextLine()){
                //linhasarquivo = leitor.nextLine();
                
                Listateste.add(leitor.nextLine());
                
                //System.out.println(Listateste);
            }
            
            System.out.println(Listateste);
            
        } catch(FileNotFoundException e){
            
        }
        
    }
}