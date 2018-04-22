package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ler_Arquivo {
    
    
   
    void arquivocsv(){
        
        File arquivoCSV = new File(getClass().getResource("arquivo.csv").getFile());
        
        try{
            
            String linhasarquivo = new String();
            
            Scanner leitor = new Scanner(arquivoCSV);
            
            leitor.nextLine();
            
            while(leitor.hasNext()){
                linhasarquivo = leitor.nextLine();
                
                System.out.println(linhasarquivo);
            }
            
        } catch(FileNotFoundException e){
            
        }
        
    }
}