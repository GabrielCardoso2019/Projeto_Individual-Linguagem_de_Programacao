/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto_individual_gerenciador;

import com.sun.prism.paint.Color;
import java.util.Random;

/**
 *
 * @author gabri
 */
public class Gerenciador extends javax.swing.JFrame {

    /**
     * Creates new form Gerenciador
     */
    public Gerenciador() {
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
        pgbMemoria = new javax.swing.JProgressBar();
        pgbCpu = new javax.swing.JProgressBar();
        pgbDisco = new javax.swing.JProgressBar();
        lblCpu = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        btnLeitura = new javax.swing.JButton();
        lblMinimoCpu = new javax.swing.JLabel();
        lblMediaCpu = new javax.swing.JLabel();
        lblMaximoCpu = new javax.swing.JLabel();
        lblMinimoDisco = new javax.swing.JLabel();
        lblMediaDisco = new javax.swing.JLabel();
        lblMaximoDisco = new javax.swing.JLabel();
        lblMinimoMemoria = new javax.swing.JLabel();
        lblMediaMemoria = new javax.swing.JLabel();
        lblMaximoMemoria = new javax.swing.JLabel();
        lblMinimoValorCpu = new javax.swing.JLabel();
        lblMediaValorCpu = new javax.swing.JLabel();
        lblMaximoValorCpu = new javax.swing.JLabel();
        lblMinimoValorDisco = new javax.swing.JLabel();
        lblMediaValorDisco = new javax.swing.JLabel();
        lblMaximoValorDisco = new javax.swing.JLabel();
        lblMinimoValorMemoria = new javax.swing.JLabel();
        lblMediaValorMemoria = new javax.swing.JLabel();
        lblMaximoValorMemoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        pgbCpu.setForeground(new java.awt.Color(0, 0, 0));

        lblCpu.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblCpu.setText("CPU");

        lblDisco.setBackground(new java.awt.Color(0, 0, 0));
        lblDisco.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblDisco.setText("Disco");

        lblMemoria.setBackground(new java.awt.Color(0, 0, 0));
        lblMemoria.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMemoria.setText("Memória");

        btnLeitura.setBackground(new java.awt.Color(255, 51, 51));
        btnLeitura.setText("Fazer Leitura dos Dados");
        btnLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeituraActionPerformed(evt);
            }
        });

        lblMinimoCpu.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMinimoCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoCpu.setText("Mínimo:");

        lblMediaCpu.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMediaCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaCpu.setText("Média:");

        lblMaximoCpu.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMaximoCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoCpu.setText("Máximo:");

        lblMinimoDisco.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMinimoDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoDisco.setText("Mínimo:");

        lblMediaDisco.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMediaDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaDisco.setText("Média:");

        lblMaximoDisco.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMaximoDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoDisco.setText("Máximo:");

        lblMinimoMemoria.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMinimoMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoMemoria.setText("Mínimo:");

        lblMediaMemoria.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMediaMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaMemoria.setText("Média:");

        lblMaximoMemoria.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMaximoMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoMemoria.setText("Máximo:");

        lblMinimoValorCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoValorCpu.setText("0");

        lblMediaValorCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaValorCpu.setText("0");

        lblMaximoValorCpu.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoValorCpu.setText("0");

        lblMinimoValorDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoValorDisco.setText("0");

        lblMediaValorDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaValorDisco.setText("0");

        lblMaximoValorDisco.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoValorDisco.setText("0");

        lblMinimoValorMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMinimoValorMemoria.setText("0");

        lblMediaValorMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMediaValorMemoria.setText("0");

        lblMaximoValorMemoria.setForeground(new java.awt.Color(0, 0, 0));
        lblMaximoValorMemoria.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnLeitura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisco)
                    .addComponent(lblCpu)
                    .addComponent(lblMemoria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pgbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgbCpu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pgbDisco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMinimoCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMinimoValorCpu, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMinimoDisco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinimoValorDisco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMinimoMemoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinimoValorMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMediaMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMediaValorMemoria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMediaCpu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMediaValorCpu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMediaDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMediaValorDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMaximoCpu)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaximoValorCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaximoMemoria)
                                .addGap(25, 25, 25)
                                .addComponent(lblMaximoValorMemoria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaximoDisco)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaximoValorDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnLeitura)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCpu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pgbCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMinimoCpu)
                        .addComponent(lblMinimoValorCpu)
                        .addComponent(lblMediaCpu)
                        .addComponent(lblMediaValorCpu)
                        .addComponent(lblMaximoCpu)
                        .addComponent(lblMaximoValorCpu)))
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pgbDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMinimoDisco)
                        .addComponent(lblMinimoValorDisco)
                        .addComponent(lblMediaDisco)
                        .addComponent(lblMediaValorDisco)
                        .addComponent(lblMaximoDisco)
                        .addComponent(lblMaximoValorDisco))
                    .addComponent(lblDisco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pgbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMinimoMemoria)
                        .addComponent(lblMinimoValorMemoria)
                        .addComponent(lblMediaMemoria)
                        .addComponent(lblMediaValorMemoria)
                        .addComponent(lblMaximoMemoria)
                        .addComponent(lblMaximoValorMemoria))
                    .addComponent(lblMemoria))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*VALORES*/
    Integer maxCpu = 0,
            minCpu = 100,
            
            maxDisco = 0,
            minDisco = 100,
            
            maxMemoria = 0,
            minMemoria = 100;
    
    /*VALORES CPU*/
    Integer mediaCpu = 0,
            contadorCpu = 0,
            somaCpu = 0;
    
    /*VALORES DISCO*/
    Integer mediaDisco = 0,
            contadorDisco = 0,
            somaDisco = 0;
    
    /*VALORES MEMORIA*/
    Integer mediaMemoria = 0,
            contadorMemoria = 0,
            somaMemoria = 0;
    
    
    
    private void btnLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeituraActionPerformed
        
        /*CÓDIGO PARA CPU*/
        Random numCpu = new Random();
        Integer valorCPU = numCpu.nextInt(101);
        contadorCpu++;
              
 
        somaCpu = somaCpu + valorCPU;
        mediaCpu = somaCpu / contadorCpu;
        
        lblMinimoValorCpu.setText((minCpu) + "%");
        lblMediaValorCpu.setText(String.format("%d", valorCPU));
        lblMaximoValorCpu.setText((maxCpu) + "%");
        
        pgbCpu.setValue(valorCPU);
        pgbCpu.setStringPainted(true);
        
        if (valorCPU > maxCpu) {
            maxCpu = valorCPU;
        }
        
         if (valorCPU < minCpu) {
            minCpu = valorCPU;
        }
         
         lblMaximoValorCpu.setText(String.format("%d%%", maxCpu));
         lblMediaValorCpu.setText(String.format("%d%%", mediaCpu));
         lblMinimoValorCpu.setText(String.format("%d%%", minCpu));
        
            
        
        /*VALORES PARA DISCO*/    
        Random numDisco = new Random();
        Integer valorDisco = numDisco.nextInt(101);
        contadorDisco++;
              
 
        somaDisco = somaDisco + valorDisco;
        mediaDisco = somaDisco / contadorDisco;
        
        lblMinimoValorDisco.setText((minDisco) + "%");
        lblMediaValorDisco.setText(String.format("%d", valorDisco));
        lblMaximoValorDisco.setText((maxDisco) + "%");
        
        pgbDisco.setValue(valorDisco);
        pgbDisco.setStringPainted(true);
        
        if (valorDisco > maxDisco) {
            maxDisco = valorDisco;
        }
        
         if (valorDisco < minDisco) {
            minDisco = valorDisco;
        }
         
         lblMaximoValorDisco.setText(String.format("%d%%", maxDisco));
         lblMediaValorDisco.setText(String.format("%d%%", mediaDisco));
         lblMinimoValorDisco.setText(String.format("%d%%", minDisco));  
        
        
        /*VALORES PARA MEMORIA*/    
        Random numMemoria = new Random();
        Integer valorMemoria = numMemoria.nextInt(101);
        contadorMemoria++;
              
 
        somaMemoria = somaMemoria + valorMemoria;
        mediaMemoria = somaMemoria / contadorMemoria;
        
        lblMinimoValorMemoria.setText((minMemoria) + "%");
        lblMediaValorMemoria.setText(String.format("%d", valorMemoria));
        lblMaximoValorMemoria.setText((maxMemoria) + "%");
        
        pgbMemoria.setValue(valorMemoria);
        pgbMemoria.setStringPainted(true);
        
        if (valorMemoria > maxMemoria) {
            maxMemoria = valorMemoria;
        }
        
         if (valorMemoria < minMemoria) {
            minMemoria = valorMemoria;
        }
         
         lblMaximoValorMemoria.setText(String.format("%d%%", maxMemoria));
         lblMediaValorMemoria.setText(String.format("%d%%", mediaMemoria));
         lblMinimoValorMemoria.setText(String.format("%d%%", minMemoria));   
    }//GEN-LAST:event_btnLeituraActionPerformed

   
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
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerenciador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerenciador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeitura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCpu;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMaximoCpu;
    private javax.swing.JLabel lblMaximoDisco;
    private javax.swing.JLabel lblMaximoMemoria;
    private javax.swing.JLabel lblMaximoValorCpu;
    private javax.swing.JLabel lblMaximoValorDisco;
    private javax.swing.JLabel lblMaximoValorMemoria;
    private javax.swing.JLabel lblMediaCpu;
    private javax.swing.JLabel lblMediaDisco;
    private javax.swing.JLabel lblMediaMemoria;
    private javax.swing.JLabel lblMediaValorCpu;
    private javax.swing.JLabel lblMediaValorDisco;
    private javax.swing.JLabel lblMediaValorMemoria;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMinimoCpu;
    private javax.swing.JLabel lblMinimoDisco;
    private javax.swing.JLabel lblMinimoMemoria;
    private javax.swing.JLabel lblMinimoValorCpu;
    private javax.swing.JLabel lblMinimoValorDisco;
    private javax.swing.JLabel lblMinimoValorMemoria;
    private javax.swing.JProgressBar pgbCpu;
    private javax.swing.JProgressBar pgbDisco;
    private javax.swing.JProgressBar pgbMemoria;
    // End of variables declaration//GEN-END:variables
}
