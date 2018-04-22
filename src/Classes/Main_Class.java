package Classes;

import UI.Main_Window;

public class Main_Class {


    public static void main(String[] args) {
               
        //instancia e chama a classe para ler o arquivo -- utilizado para testes
        Ler_Arquivo lerCSV = new Ler_Arquivo();
        lerCSV.arquivocsv();
        
        //Cria a janela Main_Window
        Main_Window JanelaPrincipal = new Main_Window();
        JanelaPrincipal.setVisible(true);
        
    }
    
}
