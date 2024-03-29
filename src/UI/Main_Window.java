package UI;

/**
 *
 * @author Douglas
 */
public class Main_Window extends javax.swing.JFrame {

    //Instancia as janelas para poder serem criadas
    ArrayListShow c1 = new ArrayListShow();
    jTabelaFreq c2 = new jTabelaFreq();
    GraficoBarra c3 = new GraficoBarra();
    GraficoTorta c4 = new GraficoTorta();
                
    public Main_Window() {
        initComponents();
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
        ListarDadosBtn = new javax.swing.JButton();
        TabelaFreqBtn = new javax.swing.JButton();
        GraficoBarraBtn = new javax.swing.JButton();
        GraficoTortaBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ComparativoPIB");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListarDadosBtn.setText("Listagem de Dados");
        ListarDadosBtn.setContentAreaFilled(false);
        ListarDadosBtn.setFocusPainted(false);
        ListarDadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarDadosBtnActionPerformed(evt);
            }
        });

        TabelaFreqBtn.setText("Tabela Frequencia");
        TabelaFreqBtn.setContentAreaFilled(false);
        TabelaFreqBtn.setFocusPainted(false);
        TabelaFreqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaFreqBtnActionPerformed(evt);
            }
        });

        GraficoBarraBtn.setText("Grafico em Barra");
        GraficoBarraBtn.setContentAreaFilled(false);
        GraficoBarraBtn.setFocusPainted(false);
        GraficoBarraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoBarraBtnActionPerformed(evt);
            }
        });

        GraficoTortaBtn.setText("Grafico em Torta");
        GraficoTortaBtn.setContentAreaFilled(false);
        GraficoTortaBtn.setFocusPainted(false);
        GraficoTortaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficoTortaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ListarDadosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TabelaFreqBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GraficoBarraBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(GraficoTortaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarDadosBtn)
                    .addComponent(GraficoBarraBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TabelaFreqBtn)
                    .addComponent(GraficoTortaBtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarDadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarDadosBtnActionPerformed
        //Mostra a janela Listar Dados
        c1.setVisible(true);
    }//GEN-LAST:event_ListarDadosBtnActionPerformed

    private void TabelaFreqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaFreqBtnActionPerformed
        //Mostra a janela Da Tabela Frequencia
        c2.setVisible(true);
    }//GEN-LAST:event_TabelaFreqBtnActionPerformed

    private void GraficoBarraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoBarraBtnActionPerformed
        //Mostra a janela de Grafico em Barra
        c3.setVisible(true);
    }//GEN-LAST:event_GraficoBarraBtnActionPerformed

    private void GraficoTortaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficoTortaBtnActionPerformed
        //Mostra a janela de Grafico em Torta
        c4.setVisible(true);
    }//GEN-LAST:event_GraficoTortaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GraficoBarraBtn;
    private javax.swing.JButton GraficoTortaBtn;
    private javax.swing.JButton ListarDadosBtn;
    private javax.swing.JButton TabelaFreqBtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
