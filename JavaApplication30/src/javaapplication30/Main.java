/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import Animacion.Animacion;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author tonyj
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        pcen.setVisible(false);
        /*Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int)d.getWidth();
        int alto = (int)d.getHeight();*/
        Animacion.mover_izquierda(0, -270, 1, 9, panelIZ);
        plog.setBackground(new java.awt.Color(0, 0, 0,160));
        txtuser.setOpaque(false);
        txtuser.setBounds(50, 30, 90, 40);
        txtpass.setOpaque(false);
        txtpass.setBounds(50, 30, 90, 40);
        lblicon.setVisible(false);

        //puser.setOpaque(false);
        ImageIcon ic2 = new ImageIcon(getClass().getResource("/img/Muebles-modulares-vs-muebles-a-medida.jpg"));
        Icon ics2 = new ImageIcon(ic2.getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(), Image.SCALE_DEFAULT));
        lblimg.setIcon(ics2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelIZ = new javax.swing.JPanel();
        pven = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pcen = new javax.swing.JPanel();
        plog = new javax.swing.JPanel();
        lblnom = new javax.swing.JLabel();
        lblnom1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        panelAR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIZ.setBackground(new java.awt.Color(51, 51, 51));

        pven.setBackground(new java.awt.Color(51, 51, 51));
        pven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pvenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pvenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pvenMouseExited(evt);
            }
        });
        pven.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-money-48.png"))); // NOI18N
        pven.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ventas Del Dia");
        pven.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, 60));

        javax.swing.GroupLayout panelIZLayout = new javax.swing.GroupLayout(panelIZ);
        panelIZ.setLayout(panelIZLayout);
        panelIZLayout.setHorizontalGroup(
            panelIZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIZLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelIZLayout.setVerticalGroup(
            panelIZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIZLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pven, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(662, Short.MAX_VALUE))
        );

        jPanel3.add(panelIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 730));

        pcen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(pcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1090, 730));

        plog.setBackground(new java.awt.Color(0, 0, 0));

        lblnom.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        lblnom.setForeground(new java.awt.Color(255, 255, 255));
        lblnom.setText("Contraseña");

        lblnom1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        lblnom1.setForeground(new java.awt.Color(255, 255, 255));
        lblnom1.setText("Usuario");

        txtpass.setBackground(new java.awt.Color(0, 0, 0));
        txtpass.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtpass.setCaretColor(new java.awt.Color(51, 51, 51));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });

        txtuser.setBackground(new java.awt.Color(51, 51, 51));
        txtuser.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtuser.setCaretColor(new java.awt.Color(51, 51, 51));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plantilla-login_1017-6719.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout plogLayout = new javax.swing.GroupLayout(plog);
        plog.setLayout(plogLayout);
        plogLayout.setHorizontalGroup(
            plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogLayout.createSequentialGroup()
                .addGroup(plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(plogLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addGroup(plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(plogLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        plogLayout.setVerticalGroup(
            plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(plogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel3.add(plog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 850, 560));

        panelAR.setBackground(new java.awt.Color(0, 0, 0));
        panelAR.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelARMouseDragged(evt);
            }
        });
        panelAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelARMousePressed(evt);
            }
        });
        panelAR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelAR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, 20));

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-menu-30.png"))); // NOI18N
        lblicon.setText("jLabel2");
        lblicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliconMouseClicked(evt);
            }
        });
        lblicon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbliconKeyPressed(evt);
            }
        });
        panelAR.add(lblicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 30, -1));

        jPanel3.add(panelAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));
        jPanel3.add(lblimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1090, 730));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xx,xy;
    private void panelARMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelARMousePressed
        xx = evt.getX();
        xy= evt.getY();
    }//GEN-LAST:event_panelARMousePressed

    private void panelARMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelARMouseDragged
        int x=evt.getXOnScreen();
        int y= evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_panelARMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lbliconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbliconKeyPressed
       
    }//GEN-LAST:event_lbliconKeyPressed
    public void iz(){
        if (panelIZ.getX()==0) {
           Animacion.mover_izquierda(0, -270, 1, 2, panelIZ); 
        }else {
           Animacion.mover_derecha(-270,0, 1, 2, panelIZ);
        }
    }
    private void lbliconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliconMouseClicked
        iz();
    }//GEN-LAST:event_lbliconMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        
    }//GEN-LAST:event_txtpassKeyReleased

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped

    }//GEN-LAST:event_txtpassKeyTyped

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserKeyReleased

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserKeyTyped

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plantilla2.jpg"))); 
        
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plantilla-login_1017-6719.jpg"))); 
    }//GEN-LAST:event_jLabel2MouseExited

    private void pvenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pvenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pvenMouseClicked

    private void pvenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pvenMouseEntered
        pven.setBackground(new java.awt.Color(0,102,0));
    }//GEN-LAST:event_pvenMouseEntered

    private void pvenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pvenMouseExited
       pven.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_pvenMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       lblicon.setVisible(true);
       plog.setVisible(false);
         pcen.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblnom1;
    private javax.swing.JPanel panelAR;
    private javax.swing.JPanel panelIZ;
    private javax.swing.JPanel pcen;
    private javax.swing.JPanel plog;
    private javax.swing.JPanel pven;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
