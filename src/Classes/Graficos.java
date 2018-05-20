package Classes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Graficos {
    NumberFormat nf = NumberFormat.getInstance();
    Formulas c7 = new Formulas();
    private double SomaPib;
    private int i;
    private ArrayList<String> ListaPIBAuxiliar = c7.getListaPIBAuxiliar();
    private ArrayList<String> ListaPais = c7.getListaPais();
    
    
    //Criação do gráfico de barra
    public void graficobarra(){
        c7.Medias();
        c7.Paises();
        DefaultCategoryDataset ds = new DefaultCategoryDataset();
        for(i = 0;i<ListaPIBAuxiliar.size();i++){
            SomaPib = Double.parseDouble(ListaPIBAuxiliar.get(i));
        ds.addValue(SomaPib, "PIB Total", ListaPais.get(i));
        }
        
        JFreeChart grafico = ChartFactory.createBarChart3D("Soma do PIB", "Paises", 
        "PIB", ds, PlotOrientation.VERTICAL, true, true, false);
        
        OutputStream arquivo = null;
        try {
            //arquivo gerado na pasta src do netbeans, indo para a pasta IMG
            arquivo = new FileOutputStream("src\\IMG\\graficobarra.png");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ChartUtilities.writeChartAsPNG(arquivo, grafico, 5000, 800);
        } catch (IOException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Criação do gráfico de setores.
    public void graficotorta(){
        c7.Medias();
        c7.Paises();
        DefaultPieDataset dspie = new DefaultPieDataset();
        for(i = 0;i<ListaPIBAuxiliar.size();i++){
            SomaPib = Double.parseDouble(ListaPIBAuxiliar.get(i));
        dspie.setValue(ListaPais.get(i), SomaPib);
        }
        
        JFreeChart graficotorta = ChartFactory.createPieChart("Soma do PIB", 
        dspie,true,true,false);
        
        OutputStream arquivo = null;
        try {
            //arquivo gerado na pasta src do netbeans, indo para a pasta IMG
            arquivo = new FileOutputStream("src\\IMG\\graficotorta.png");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ChartUtilities.writeChartAsPNG(arquivo, graficotorta, 1024, 860);
        } catch (IOException ex) {
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
