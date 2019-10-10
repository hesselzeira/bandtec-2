package com.mycompany.projeto.jdbc;

import java.time.LocalDateTime;
import org.springframework.jdbc.core.JdbcTemplate;

class tela extends javax.swing.JFrame {

    DadosConexao dadosConexao = new DadosConexao();

    JdbcTemplate jdbcTemplate
            = new JdbcTemplate(dadosConexao.getDataSource());

    public tela() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfOrigem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        btRegistrarLeitura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Qual a origem?");

        tfOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOrigemActionPerformed(evt);
            }
        });

        jLabel2.setText("Qual o valor?");

        tfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorActionPerformed(evt);
            }
        });

        btRegistrarLeitura.setText("Registrar leitura");
        btRegistrarLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarLeituraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfOrigem)
                            .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btRegistrarLeitura)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btRegistrarLeitura)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOrigemActionPerformed

    private void tfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorActionPerformed

    private void btRegistrarLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarLeituraActionPerformed
        jdbcTemplate.update(
                "insert into leitura (origem, valor, data_hora) "
                + " values (?,?,?)",
                tfOrigem.getText(), tfValor.getText(), LocalDateTime.now());
    }//GEN-LAST:event_btRegistrarLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrarLeitura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfOrigem;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
