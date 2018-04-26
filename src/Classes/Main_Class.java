package Classes;

import UI.Main_Window;
import java.util.ArrayList;

public class Main_Class {

    public static void main(String[] args) {
        
        //inicializa a leitura do arquivo e já prepara a lista 1, 2 e 3
        Ler_Arquivo c1 = new Ler_Arquivo();
        c1.lerpib();
        
        //Cria a janela Main_Window e coloca ela na posição 750x350
        Main_Window JanelaPrincipal = new Main_Window();
        JanelaPrincipal.setLocation(750, 350);
        JanelaPrincipal.setVisible(true);
        
    }
    
}
