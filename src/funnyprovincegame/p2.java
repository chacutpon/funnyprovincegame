/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funnyprovincegame;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class p2 extends javax.swing.JFrame {

    private int count;

    /**
     * Creates new form NewJFrame
     */
    public p2() {
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("ข้อที่ 1.จังหวัดอะไรช้างไม่ชอบ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 240, -1));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\New folder\\funnyprovincegame\\src\\image\\ดาวน์โหลด.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 180, 170));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\New folder\\funnyprovincegame\\src\\image\\ดาวน์โหลด.png")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 180, 170));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\New folder\\funnyprovincegame\\src\\image\\ดาวน์โหลด.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 170));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Desktop\\New folder\\funnyprovincegame\\src\\image\\panggha.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p2 myGame = new p2();
        String keyb = jTextField1.getText();
        switch(keyb){           
          case  "พังงา";
          JOptionPane.showMessageDialog(null,"correct");
          jLabel2.setVisible(false);
          jLabel3.setVisible(true);
          jTextField1.setText("");
          p4 form4 = new p4();
          form4.setVisible(true);
          setVisible(false); 
           break;
         
          default{         
            if(count==0){
                JOptionPane.showMessageDialog(null,"uncorrect ");
                jLabel2.setVisible(false);
                jLabel3.setVisible(true);
                count=1;
                jTextField1.setText("");
            }
            else if(count==1){
                JOptionPane.showMessageDialog(null,"uncorrect");
                jLabel3.setVisible(false);
                jLabel4.setVisible(true);
                count=2;
                jTextField1.setText("");
            }
             else if(count==2){
                JOptionPane.showMessageDialog(null,"uncorrect");
                jLabel4.setVisible(false);                
                count=3;
                jTextField1.setText(""); 
            }   
             else if(count==3){
                JOptionPane.showMessageDialog(null,"uncorrect");
                jLabel4.setVisible(false);                
                count=4;
                jTextField1.setText(""); 
                youlose formyoulose = new youlose();
                formyoulose.setVisible(true);
                setVisible(false); 
            }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new p2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
