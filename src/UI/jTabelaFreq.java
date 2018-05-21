package UI;

import Classes.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Douglas
 */
public class jTabelaFreq extends javax.swing.JFrame {

    Ler_Arquivo c1 = new Ler_Arquivo();
    TabelaFrequencia c2 = new TabelaFrequencia();
    Formulas c3 = new Formulas();
    private ArrayList<String> ListaPaisMoeda = c1.getListaCSV();
    private ArrayList<String> Fi = c2.getFi();   
    private ArrayList<String> FacTab = c2.getFac();
    private ArrayList<Float> FracTab = c2.getFrac();
    private ArrayList<Double> XXBarrado = c2.getXXBarrado();
    private ArrayList<Double> XXBarradoVezes = c2.getXXBarradoVezes();
    private ArrayList<Double> XXBarradoVezesAoQuadrado = c2.getXXBarradoVezesAoQuadrado();
    float[] FrTab = c2.getFr();
    NumberFormat nf = NumberFormat.getInstance();
    
    private int i;
    
    public jTabelaFreq() {
        initComponents();
        ArrayParaTabela();
        FormulasParaTabela();
    }
    
    public void FormulasParaTabela(){
        c3.Variancia();
        //c3.Desviopadrao();
        c3.Medias();
        c3.DesvioMedio();
        c3.CoefienteVariacao();
        MediaTxtField.setText(String.valueOf(nf.format(c3.getMediaPib())));
        MedianaTxtField.setText(String.valueOf(nf.format(c3.getMedianaPib())));
        DesvioPadraoTxtField.setText(String.valueOf(nf.format(c3.getDesvioPadrao())));
        VarianciaTxtField.setText(String.valueOf(nf.format(c3.getVariancia())));
        DesvioMedioTxtField.setText(String.valueOf(nf.format(c3.getDesvioM())));
        CoeVariTxtField.setText(String.valueOf(nf.format(c3.getCoeficienteVariacao())));
    }
    
    public void ArrayParaTabela(){
        //Modifica o tamanho das colunas da tabela
        jTable1.getColumnModel().getColumn(0).setMinWidth(120);
        jTable1.getColumnModel().getColumn(1).setMinWidth(135);
        jTable1.getColumnModel().getColumn(2).setMinWidth(30);
        jTable1.getColumnModel().getColumn(3).setMinWidth(160);
        jTable1.getColumnModel().getColumn(4).setMinWidth(30);
        jTable1.getColumnModel().getColumn(5).setMinWidth(40);
        jTable1.getColumnModel().getColumn(6).setMinWidth(40);
        jTable1.getColumnModel().getColumn(7).setMinWidth(140);
        jTable1.getColumnModel().getColumn(8).setMinWidth(140);
        jTable1.getColumnModel().getColumn(9).setMinWidth(250);
        
        c1.lerarquivocsv();
        c2.Fi();
        c2.Fac();
        c2.Fr();
        c2.Fac();
        c2.Frac();
        c2.XXBarrado();
        c2.XXBarradoVezes();
        c2.XXBarradoVezesAoQuadrado();
        
        c3.Medias();
        //Cria o objeto vetor data
        Object Data[] = new Object[11];
        //Cria o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for(i=0; i<50;i++){
            String[] addTabela = ListaPaisMoeda.get(i).split(";");
            //Coleta informações para a tabela
            Data[0] = addTabela[0];
            Data[1] = nf.format(Double.parseDouble(addTabela[2]));
            Data[2] = Fi.get(i);
            Data[3] = nf.format(Double.parseDouble(addTabela[2]));
            Data[4] = FacTab.get(i);
            Data[5] = FrTab[i];
            Data[6] = FracTab.get(i);
            Data[7] = nf.format(XXBarrado.get(i));
            Data[8] = nf.format(XXBarradoVezes.get(i));
            Data[9] = nf.format(XXBarradoVezesAoQuadrado.get(i));
            //Adiciona a tabela
            model.addRow(Data);
        }
        for(i=0;i<1;i++){
            //Adiciona a ultima linha da tabela
            Data[0] = "";
            Data[1] = "";
            Data[2] = Fi.get(51);
            Data[3] = nf.format(c3.getSomaPib());
            Data[4] = "";
            Data[5] = "100%";
            Data[6] = "";
            Data[7] = nf.format(c3.getMediaPib());
            Data[8] = Fi.get(51);
            Data[9] = "";
            //Adiciona a tabela
            model.addRow(Data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MediaTxtField = new javax.swing.JTextField();
        ModaTxtField = new javax.swing.JTextField();
        MedianaTxtField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VarianciaTxtField = new javax.swing.JTextField();
        DesvioPadraoTxtField = new javax.swing.JTextField();
        DesvioMedioTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CoeVariTxtField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "País", "Xi", "Fi", "Xi*Fi", "Fac", "Fr", "Frac", "|X-X|", "|X-X|*Fi", "|X-X|²*Fi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel1.setText("Produto Interno Bruto dos paises em dólares americanos.");

        jLabel2.setText("Média:");

        jLabel3.setText("Moda:");

        jLabel4.setText("Mediana:");

        MediaTxtField.setEditable(false);

        ModaTxtField.setEditable(false);
        ModaTxtField.setText("Não há");

        MedianaTxtField.setEditable(false);

        jLabel5.setText("Desvio Médio:");

        jLabel6.setText("Variância:");

        jLabel7.setText("Desvio padrão:");

        VarianciaTxtField.setEditable(false);

        DesvioPadraoTxtField.setEditable(false);

        DesvioMedioTxtField.setEditable(false);
        DesvioMedioTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesvioMedioTxtFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Coeficiente de Variância:");

        CoeVariTxtField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MediaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(MedianaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ModaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DesvioMedioTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DesvioPadraoTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(VarianciaTxtField))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CoeVariTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 555, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MediaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DesvioMedioTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ModaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(VarianciaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CoeVariTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(MedianaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(DesvioPadraoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DesvioMedioTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesvioMedioTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesvioMedioTxtFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jTabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jTabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jTabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jTabelaFreq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jTabelaFreq().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoeVariTxtField;
    private javax.swing.JTextField DesvioMedioTxtField;
    private javax.swing.JTextField DesvioPadraoTxtField;
    private javax.swing.JTextField MediaTxtField;
    private javax.swing.JTextField MedianaTxtField;
    private javax.swing.JTextField ModaTxtField;
    private javax.swing.JTextField VarianciaTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
