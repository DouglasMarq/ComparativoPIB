package Classes;

import UI.Main_Window;

public class Main_Class {

    public static void main(String[] args) {
        
        //Tenta criar os graficos antes de o Swing aparecer, para evitar problemas futuros.
        Graficos c4 = new Graficos();
        c4.graficobarra();
        c4.graficotorta();

        //Cria a janela Main_Window
        Main_Window JanelaPrincipal = new Main_Window();
        JanelaPrincipal.setVisible(true);
    }
    
}
