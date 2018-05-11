package Classes;

import UI.Main_Window;
import java.util.ArrayList;

public class Main_Class {

    public static void main(String[] args) {
        
        //Tenta criar os graficos antes de o Swing aparecer.
        Graficos c4 = new Graficos();
        c4.graficobarra();
        c4.graficotorta();
        
        //Cria a janela Main_Window e coloca ela na posição 750x350
        Main_Window JanelaPrincipal = new Main_Window();
        JanelaPrincipal.setLocation(750, 350);
        JanelaPrincipal.setVisible(true);
    }
    
}
