/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import Animacion.Animacion;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author tonyj
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    String id,nom,cantidadp,preciop,codigop,descp,tipop;
    db dab = new db();
    boolean v = false;
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        pcen.setVisible(false);
        /*Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int)d.getWidth();
        int alto = (int)d.getHeight();*/
        
        panelIZ.setVisible(false);
        Animacion.mover_izquierda(0, -270, 1, 9, panelIZ);
        plog.setBackground(new java.awt.Color(0, 0, 0,160));
        txtuser.setOpaque(false);
        txtuser.setBounds(50, 30, 90, 40);
        txtpass.setOpaque(false);
        txtpass.setBounds(50, 30, 90, 40);
        lblicon.setVisible(false);
        
        
         JTableHeader header = tabla.getTableHeader();
         header.setBackground(new java.awt.Color(238,238,221));
         //header.setForeground(Color.yellow)
         scroll.getViewport().setBackground(new java.awt.Color(238,238,221));

         JTableHeader header2 = tabla1.getTableHeader();
         header2.setBackground(new java.awt.Color(238,238,221));
         //header.setForeground(Color.yellow)
         scroll1.getViewport().setBackground(new java.awt.Color(238,238,221));
        
        //puser.setOpaque(false);
        ImageIcon ic2 = new ImageIcon(getClass().getResource("/img/Muebles-modulares-vs-muebles-a-medida.jpg"));
        Icon ics2 = new ImageIcon(ic2.getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(), Image.SCALE_DEFAULT));
        lblimg.setIcon(ics2);
        
        ImageIcon ic3 = new ImageIcon(getClass().getResource("/img/fn.jpeg"));
        Icon ics3 = new ImageIcon(ic3.getImage().getScaledInstance(lblimg1.getWidth(),lblimg1.getHeight(), Image.SCALE_DEFAULT));
        lblimg1.setIcon(ics3);
        
        
        
        
        
        pinfofac.setVisible(false);
    }
    public void limpiar(){
       DefaultTableModel tb =  (DefaultTableModel) tabla.getModel();
        int a = tabla.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
    public void limpiar2(){
       DefaultTableModel tb =  (DefaultTableModel) tabla1.getModel();
        int a = tabla1.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
    public void tab(){
        dab.tab(tabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        panelIZ = new javax.swing.JPanel();
        pven = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pven1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pven2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pcen = new javax.swing.JPanel();
        pcosas = new javax.swing.JPanel();
        pcont3 = new javax.swing.JPanel();
        pcontr = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtdescon = new javax.swing.JTextField();
        txtcodcon = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cmbtipocon = new javax.swing.JComboBox<>();
        txtcantcon = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtpreciocon = new javax.swing.JTextField();
        ptrabadd = new javax.swing.JPanel();
        pclii = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtpassadd1 = new javax.swing.JTextField();
        txtuseradd1 = new javax.swing.JTextField();
        txtnomcli = new javax.swing.JTextField();
        txtidencli = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        pus = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtpassadd = new javax.swing.JTextField();
        txtuseradd = new javax.swing.JTextField();
        txtsueldoadd = new javax.swing.JTextField();
        txtnomadd = new javax.swing.JTextField();
        txtidenadd = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pfac = new javax.swing.JPanel();
        pinfofac = new javax.swing.JPanel();
        pffac = new javax.swing.JPanel();
        lblsubt = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtcanfac = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        lbltot = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btfac = new javax.swing.JButton();
        pitfac = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbtipofac1 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtbus2 = new javax.swing.JTextField();
        scroll1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        txtc = new javax.swing.JLabel();
        pclientefac = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtbus = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblimg1 = new javax.swing.JLabel();
        plog = new javax.swing.JPanel();
        lblnom = new javax.swing.JLabel();
        lblnom1 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        panelAR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        lblpag = new javax.swing.JLabel();
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-user-male-48.png"))); // NOI18N
        pven.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Agregar");
        pven.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 60));

        pven1.setBackground(new java.awt.Color(51, 51, 51));
        pven1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pven1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pven1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pven1MouseExited(evt);
            }
        });
        pven1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-new-product-48.png"))); // NOI18N
        pven1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Inventario");
        pven1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 60));

        pven2.setBackground(new java.awt.Color(51, 51, 51));
        pven2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pven2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pven2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pven2MouseExited(evt);
            }
        });
        pven2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-money-48.png"))); // NOI18N
        pven2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Facturacion");
        pven2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 130, 60));

        javax.swing.GroupLayout panelIZLayout = new javax.swing.GroupLayout(panelIZ);
        panelIZ.setLayout(panelIZLayout);
        panelIZLayout.setHorizontalGroup(
            panelIZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIZLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pven, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(pven1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pven2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelIZLayout.setVerticalGroup(
            panelIZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIZLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pven2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pven1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pven, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );

        jPanel3.add(panelIZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 730));

        pcen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcosas.setBackground(new java.awt.Color(238, 238, 221));
        pcosas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcont3.setBackground(new java.awt.Color(238, 238, 221));
        pcont3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pcont3.setForeground(new java.awt.Color(102, 102, 102));
        pcont3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pcontr.setBackground(new java.awt.Color(238, 238, 221));
        pcontr.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Codigo:");
        pcontr.add(jLabel14);
        jLabel14.setBounds(50, 10, 111, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Tipo :");
        pcontr.add(jLabel15);
        jLabel15.setBounds(50, 220, 159, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Descripcion :");
        pcontr.add(jLabel16);
        jLabel16.setBounds(50, 280, 180, 50);

        txtdescon.setColumns(200);
        txtdescon.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtdescon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtdescon.setCaretColor(new java.awt.Color(51, 51, 51));
        txtdescon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodv1ActionPerformed(evt);
            }
        });
        txtdescon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprodv1KeyTyped(evt);
            }
        });
        pcontr.add(txtdescon);
        txtdescon.setBounds(230, 290, 187, 119);

        txtcodcon.setBackground(new java.awt.Color(238, 238, 221));
        txtcodcon.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtcodcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtcodcon.setCaretColor(new java.awt.Color(51, 51, 51));
        txtcodcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodv2ActionPerformed(evt);
            }
        });
        txtcodcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprodv2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprodv2KeyTyped(evt);
            }
        });
        pcontr.add(txtcodcon);
        txtcodcon.setBounds(230, 10, 190, 41);

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pcontr.add(jButton4);
        jButton4.setBounds(150, 440, 114, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Cantidad :");
        pcontr.add(jLabel22);
        jLabel22.setBounds(50, 140, 159, 40);

        cmbtipocon.setBackground(new java.awt.Color(204, 204, 204));
        cmbtipocon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escritorios", "archiveros", "bibliotecas", "estantes" }));
        pcontr.add(cmbtipocon);
        cmbtipocon.setBounds(230, 220, 190, 40);

        txtcantcon.setBackground(new java.awt.Color(238, 238, 221));
        txtcantcon.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtcantcon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtcantcon.setCaretColor(new java.awt.Color(51, 51, 51));
        txtcantcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantcontxtprodv1ActionPerformed(evt);
            }
        });
        txtcantcon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantcontxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantcontxtprodv1KeyTyped(evt);
            }
        });
        pcontr.add(txtcantcon);
        txtcantcon.setBounds(230, 140, 190, 41);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Precio :");
        pcontr.add(jLabel25);
        jLabel25.setBounds(50, 70, 159, 40);

        txtpreciocon.setBackground(new java.awt.Color(238, 238, 221));
        txtpreciocon.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtpreciocon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtpreciocon.setCaretColor(new java.awt.Color(51, 51, 51));
        txtpreciocon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreciocontxtprodv1ActionPerformed(evt);
            }
        });
        txtpreciocon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpreciocontxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciocontxtprodv1KeyTyped(evt);
            }
        });
        pcontr.add(txtpreciocon);
        txtpreciocon.setBounds(230, 70, 190, 41);

        pcont3.add(pcontr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 460, 510));

        ptrabadd.setBackground(new java.awt.Color(238, 238, 221));
        ptrabadd.setLayout(null);

        pclii.setBackground(new java.awt.Color(238, 238, 221));
        pclii.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Numero:");
        pclii.add(jLabel27);
        jLabel27.setBounds(120, 230, 190, 40);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Correo :");
        pclii.add(jLabel32);
        jLabel32.setBounds(120, 180, 192, 37);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Nombre :");
        pclii.add(jLabel33);
        jLabel33.setBounds(120, 70, 180, 40);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Cedula :");
        pclii.add(jLabel35);
        jLabel35.setBounds(120, 120, 200, 50);

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Listo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pclii.add(jButton6);
        jButton6.setBounds(180, 310, 160, 80);

        txtpassadd1.setBackground(new java.awt.Color(238, 238, 221));
        txtpassadd1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtpassadd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtpassadd1.setCaretColor(new java.awt.Color(51, 51, 51));
        txtpassadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassadd1txtprodv1ActionPerformed(evt);
            }
        });
        txtpassadd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassadd1txtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassadd1txtprodv1KeyTyped(evt);
            }
        });
        pclii.add(txtpassadd1);
        txtpassadd1.setBounds(260, 180, 180, 41);

        txtuseradd1.setBackground(new java.awt.Color(238, 238, 221));
        txtuseradd1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtuseradd1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuseradd1.setCaretColor(new java.awt.Color(51, 51, 51));
        txtuseradd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseradd1txtprodv2ActionPerformed(evt);
            }
        });
        txtuseradd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuseradd1txtprodv2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuseradd1txtprodv2KeyTyped(evt);
            }
        });
        pclii.add(txtuseradd1);
        txtuseradd1.setBounds(260, 230, 180, 41);

        txtnomcli.setBackground(new java.awt.Color(238, 238, 221));
        txtnomcli.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtnomcli.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnomcli.setCaretColor(new java.awt.Color(51, 51, 51));
        txtnomcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomclitxtprodv1ActionPerformed(evt);
            }
        });
        txtnomcli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomclitxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomclitxtprodv1KeyTyped(evt);
            }
        });
        pclii.add(txtnomcli);
        txtnomcli.setBounds(260, 70, 180, 41);

        txtidencli.setBackground(new java.awt.Color(238, 238, 221));
        txtidencli.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtidencli.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtidencli.setCaretColor(new java.awt.Color(51, 51, 51));
        txtidencli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidenclitxtprodv1ActionPerformed(evt);
            }
        });
        txtidencli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidenclitxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidenclitxtprodv1KeyTyped(evt);
            }
        });
        pclii.add(txtidencli);
        txtidencli.setBounds(260, 120, 180, 41);

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel38.setText("X");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        pclii.add(jLabel38);
        jLabel38.setBounds(540, 10, 20, 20);

        ptrabadd.add(pclii);
        pclii.setBounds(0, 0, 580, 470);

        pus.setBackground(new java.awt.Color(238, 238, 221));
        pus.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Usuario:");
        pus.add(jLabel19);
        jLabel19.setBounds(70, 60, 111, 40);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Contraseña :");
        pus.add(jLabel20);
        jLabel20.setBounds(70, 120, 192, 37);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Nombre :");
        pus.add(jLabel21);
        jLabel21.setBounds(70, 180, 180, 50);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Sueldo :");
        pus.add(jLabel23);
        jLabel23.setBounds(70, 300, 180, 50);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Identificacion :");
        pus.add(jLabel24);
        jLabel24.setBounds(70, 240, 200, 50);

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Listo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pus.add(jButton5);
        jButton5.setBounds(190, 400, 114, 50);

        txtpassadd.setBackground(new java.awt.Color(238, 238, 221));
        txtpassadd.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtpassadd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtpassadd.setCaretColor(new java.awt.Color(51, 51, 51));
        txtpassadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassaddtxtprodv1ActionPerformed(evt);
            }
        });
        txtpassadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassaddtxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassaddtxtprodv1KeyTyped(evt);
            }
        });
        pus.add(txtpassadd);
        txtpassadd.setBounds(290, 120, 179, 41);

        txtuseradd.setBackground(new java.awt.Color(238, 238, 221));
        txtuseradd.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtuseradd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuseradd.setCaretColor(new java.awt.Color(51, 51, 51));
        txtuseradd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuseraddtxtprodv2ActionPerformed(evt);
            }
        });
        txtuseradd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuseraddtxtprodv2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuseraddtxtprodv2KeyTyped(evt);
            }
        });
        pus.add(txtuseradd);
        txtuseradd.setBounds(290, 60, 179, 41);

        txtsueldoadd.setBackground(new java.awt.Color(238, 238, 221));
        txtsueldoadd.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtsueldoadd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtsueldoadd.setCaretColor(new java.awt.Color(51, 51, 51));
        txtsueldoadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldoaddtxtprodv1ActionPerformed(evt);
            }
        });
        txtsueldoadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsueldoaddtxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldoaddtxtprodv1KeyTyped(evt);
            }
        });
        pus.add(txtsueldoadd);
        txtsueldoadd.setBounds(290, 300, 179, 41);

        txtnomadd.setBackground(new java.awt.Color(238, 238, 221));
        txtnomadd.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtnomadd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnomadd.setCaretColor(new java.awt.Color(51, 51, 51));
        txtnomadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomaddtxtprodv1ActionPerformed(evt);
            }
        });
        txtnomadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnomaddtxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomaddtxtprodv1KeyTyped(evt);
            }
        });
        pus.add(txtnomadd);
        txtnomadd.setBounds(290, 180, 180, 41);

        txtidenadd.setBackground(new java.awt.Color(238, 238, 221));
        txtidenadd.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtidenadd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtidenadd.setCaretColor(new java.awt.Color(51, 51, 51));
        txtidenadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidenaddtxtprodv1ActionPerformed(evt);
            }
        });
        txtidenadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtidenaddtxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidenaddtxtprodv1KeyTyped(evt);
            }
        });
        pus.add(txtidenadd);
        txtidenadd.setBounds(290, 240, 179, 41);

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel37.setText("X");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        pus.add(jLabel37);
        jLabel37.setBounds(540, 10, 20, 20);

        ptrabadd.add(pus);
        pus.setBounds(0, 0, 570, 530);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ptrabadd.add(jButton1);
        jButton1.setBounds(310, 200, 180, 110);

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ptrabadd.add(jButton2);
        jButton2.setBounds(90, 200, 170, 110);

        pcont3.add(ptrabadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 570, 530));

        pfac.setBackground(new java.awt.Color(238, 238, 221));
        pfac.setLayout(null);

        pinfofac.setBackground(new java.awt.Color(238, 238, 221));
        pinfofac.setLayout(null);

        pffac.setBackground(new java.awt.Color(238, 238, 221));
        pffac.setLayout(null);

        lblsubt.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblsubt.setForeground(new java.awt.Color(0, 102, 0));
        lblsubt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsubtMouseClicked(evt);
            }
        });
        pffac.add(lblsubt);
        lblsubt.setBounds(280, 130, 160, 40);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Cantidad :");
        pffac.add(jLabel28);
        jLabel28.setBounds(120, 70, 160, 40);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Subtotal :");
        pffac.add(jLabel30);
        jLabel30.setBounds(120, 130, 160, 40);

        txtcanfac.setBackground(new java.awt.Color(238, 238, 221));
        txtcanfac.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtcanfac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtcanfac.setCaretColor(new java.awt.Color(51, 51, 51));
        txtcanfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcanfactxtprodv1ActionPerformed(evt);
            }
        });
        txtcanfac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcanfactxtprodv1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcanfactxtprodv1KeyTyped(evt);
            }
        });
        pffac.add(txtcanfac);
        txtcanfac.setBounds(280, 70, 150, 41);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Total :");
        pffac.add(jLabel31);
        jLabel31.setBounds(120, 190, 160, 40);

        lbltot.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbltot.setForeground(new java.awt.Color(0, 102, 0));
        pffac.add(lbltot);
        lbltot.setBounds(280, 190, 160, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        pffac.add(jLabel9);
        jLabel9.setBounds(540, 10, 20, 20);

        btfac.setBackground(new java.awt.Color(0, 0, 153));
        btfac.setForeground(new java.awt.Color(255, 255, 255));
        btfac.setText("Vender");
        btfac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacActionPerformed(evt);
            }
        });
        pffac.add(btfac);
        btfac.setBounds(210, 290, 130, 50);

        pinfofac.add(pffac);
        pffac.setBounds(20, 20, 570, 480);

        pitfac.setBackground(new java.awt.Color(238, 238, 221));
        pitfac.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        pitfac.add(jLabel8);
        jLabel8.setBounds(510, 10, 20, 20);

        cmbtipofac1.setBackground(new java.awt.Color(204, 204, 204));
        cmbtipofac1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escritorios", "archiveros", "bibliotecas", "estantes" }));
        cmbtipofac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtipofac1ActionPerformed(evt);
            }
        });
        pitfac.add(cmbtipofac1);
        cmbtipofac1.setBounds(200, 30, 190, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Tipo:");
        pitfac.add(jLabel29);
        jLabel29.setBounds(80, 30, 130, 29);

        txtbus2.setBackground(new java.awt.Color(238, 238, 221));
        txtbus2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        txtbus2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtbus2.setCaretColor(new java.awt.Color(51, 51, 51));
        txtbus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbus2txtprodv2ActionPerformed(evt);
            }
        });
        txtbus2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbus2txtprodv2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbus2txtprodv2KeyTyped(evt);
            }
        });
        pitfac.add(txtbus2);
        txtbus2.setBounds(200, 90, 190, 30);

        scroll1.setBorder(new javax.swing.border.MatteBorder(null));
        scroll1.setToolTipText("");
        scroll1.setInheritsPopupMenu(true);

        tabla1.setAutoCreateRowSorter(true);
        tabla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        tabla1.setForeground(new java.awt.Color(51, 51, 51));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Codigo","descripcion","cantidad","precio"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    tabla1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
    tabla1.setDropMode(javax.swing.DropMode.ON);
    tabla1.setGridColor(new java.awt.Color(0, 0, 0));
    tabla1.setRowSorter(null);
    tabla1.setSelectionBackground(new java.awt.Color(0, 153, 51));
    tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabla1MouseClicked(evt);
        }
    });
    scroll1.setViewportView(tabla1);

    pitfac.add(scroll1);
    scroll1.setBounds(30, 170, 490, 300);

    txtc.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    txtc.setForeground(new java.awt.Color(51, 51, 51));
    txtc.setText("Codigo");
    pitfac.add(txtc);
    txtc.setBounds(80, 90, 130, 29);

    pinfofac.add(pitfac);
    pitfac.setBounds(30, 20, 550, 490);

    pfac.add(pinfofac);
    pinfofac.setBounds(0, 10, 600, 520);

    pclientefac.setBackground(new java.awt.Color(238, 238, 221));
    pclientefac.setLayout(null);

    jLabel26.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
    jLabel26.setForeground(new java.awt.Color(51, 51, 51));
    jLabel26.setText("Identificacion :");
    pclientefac.add(jLabel26);
    jLabel26.setBounds(21, 20, 220, 40);

    txtbus.setBackground(new java.awt.Color(238, 238, 221));
    txtbus.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
    txtbus.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
    txtbus.setCaretColor(new java.awt.Color(51, 51, 51));
    txtbus.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtbustxtprodv2ActionPerformed(evt);
        }
    });
    txtbus.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            txtbustxtprodv2KeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            txtbustxtprodv2KeyTyped(evt);
        }
    });
    pclientefac.add(txtbus);
    txtbus.setBounds(259, 24, 179, 41);

    scroll.setBorder(new javax.swing.border.MatteBorder(null));
    scroll.setToolTipText("");
    scroll.setInheritsPopupMenu(true);

    tabla.setAutoCreateRowSorter(true);
    tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    tabla.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
    tabla.setForeground(new java.awt.Color(51, 51, 51));
    tabla.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
        },
        new String [] {
            "Identificaion","Nombre","Correo","Numero"
        }
    )
    {public boolean isCellEditable(int row, int column){return false;}}
    );
    tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
    tabla.setDropMode(javax.swing.DropMode.ON);
    tabla.setGridColor(new java.awt.Color(0, 0, 0));
    tabla.setRowSorter(null);
    tabla.setSelectionBackground(new java.awt.Color(0, 153, 51));
    tabla.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tablaMouseClicked(evt);
        }
    });
    scroll.setViewportView(tabla);

    pclientefac.add(scroll);
    scroll.setBounds(0, 110, 600, 390);

    pfac.add(pclientefac);
    pclientefac.setBounds(0, 0, 600, 520);

    pcont3.add(pfac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 520));

    pcosas.add(pcont3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 620, 560));

    lblimg1.setText("dss");
    pcosas.add(lblimg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 730));

    pcen.add(pcosas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1160, 730));

    jPanel3.add(pcen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 1090, 730));

    plog.setBackground(new java.awt.Color(0, 0, 0));
    plog.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    lblnom.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
    lblnom.setForeground(new java.awt.Color(255, 255, 255));
    lblnom.setText("Contraseña");
    plog.add(lblnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 239, -1, 30));

    lblnom1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
    lblnom1.setForeground(new java.awt.Color(255, 255, 255));
    lblnom1.setText("Usuario");
    plog.add(lblnom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 120, 30));

    txtuser.setBackground(new java.awt.Color(0, 0, 0));
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
    plog.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 201, -1));

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
    plog.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 349, 197, -1));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eye_30px.png"))); // NOI18N
    jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabel5MouseClicked(evt);
        }
    });
    plog.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 30, 30));

    txtpass.setBackground(new java.awt.Color(0, 0, 0));
    txtpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    txtpass.setForeground(new java.awt.Color(255, 255, 255));
    txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
    txtpass.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtpassActionPerformed(evt);
        }
    });
    plog.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 200, 30));

    jPanel3.add(plog, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 850, 570));

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

    lblpag.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    lblpag.setForeground(new java.awt.Color(255, 255, 255));
    panelAR.add(lblpag, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 300, 40));

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
        lblicon.setVisible(false);
        if (panelIZ.getX()==0) {
          Animacion.mover_izquierda(500, 300, 1, 2, pcont3);
          Animacion.mover_izquierda(0, -270, 1, 2, panelIZ); 
        }else {
            if (panelIZ.getX()==-270) {
                Animacion.mover_derecha(300,500, 1, 2, pcont3);
                Animacion.mover_derecha(-270,0, 1, 2, panelIZ);
            }
        }
        lblicon.setVisible(true);
    }
    public void ocul(){
        pcontr.setVisible(false);        
        ptrabadd.setVisible(false);
        pfac.setVisible(false);
    }
    
    private void lbliconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliconMouseClicked
        iz();
    }//GEN-LAST:event_lbliconMouseClicked

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
        ocul();
        ptrabadd.setVisible(true);
        lblpag.setText("Agregar");
        pclii.setVisible(false);
        pus.setVisible(false);
        habb();
                
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
                panelIZ.setVisible(true);
                ocul();
                //pcont3.setVisible(false);
                //pvent1.setVisible(true);
                //lblimg.setVisible(false);
                lblpag.setText("Bienvenido");
        /*try {
            int ok = dab.log(txtuser.getText(),txtpass.getText());
            if (ok==1) {
                lblicon.setVisible(true);
                plog.setVisible(false);
                pcen.setVisible(true);
                panelIZ.setVisible(true);
                ocul();
                //pcont3.setVisible(false);
                //pvent1.setVisible(true);
                //lblimg.setVisible(false);
                lblpag.setText("Bienvenido");
            }else{
             JOptionPane.showMessageDialog(null, "Error en los datos");
            }
        } catch (Exception e) {
            //error de datos
            JOptionPane.showMessageDialog(null, "Error del sistema");
        }*/
 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtprodv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv2KeyTyped

    private void txtprodv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodv2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv2KeyReleased

    private void txtprodv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv2ActionPerformed

    private void txtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv1KeyTyped

    private void txtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv1KeyReleased

    private void txtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodv1ActionPerformed

    private void pven1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven1MouseEntered
        pven1.setBackground(new java.awt.Color(0,102,0));
    }//GEN-LAST:event_pven1MouseEntered

    private void pven1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven1MouseExited
        pven1.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_pven1MouseExited

    private void txtpassaddtxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassaddtxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassaddtxtprodv1ActionPerformed

    private void txtpassaddtxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassaddtxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassaddtxtprodv1KeyReleased

    private void txtpassaddtxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassaddtxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassaddtxtprodv1KeyTyped

    private void txtuseraddtxtprodv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseraddtxtprodv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseraddtxtprodv2ActionPerformed

    private void txtuseraddtxtprodv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseraddtxtprodv2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseraddtxtprodv2KeyReleased

    private void txtuseraddtxtprodv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseraddtxtprodv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseraddtxtprodv2KeyTyped

    private void pven1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven1MouseClicked
       ocul();
       pcontr.setVisible(true);  
       //Animacion.mover_izquierda(940, 80, 1, 2, pcontr); 
       lblpag.setText("Control de Produccion");
    }//GEN-LAST:event_pven1MouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        v =!v;
         if (v==true) {
            txtpass.setEchoChar((char)0); //password = JPasswordField
         } else {
            txtpass.setEchoChar('\u25cf');
   }
    }//GEN-LAST:event_jLabel5MouseClicked
public void fa(){
    limpiar();
        limpiar2();
        tab();
        ocul();
        pfac.setVisible(true);  
        pclientefac.setVisible(true);
        pinfofac.setVisible(false);
        //Animacion.mover_izquierda(940, 80, 1, 2, pcontr); 
        lblpag.setText("Facturacion");
        dab.tab2(tabla1,"escritorios",txtc,txtbus2);
         pffac.setVisible(false);
}
    private void pven2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven2MouseClicked
        fa();
    }//GEN-LAST:event_pven2MouseClicked

    private void pven2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven2MouseEntered
        pven2.setBackground(new java.awt.Color(0,102,0));     
        
    }//GEN-LAST:event_pven2MouseEntered

    private void pven2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pven2MouseExited
        pven2.setBackground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_pven2MouseExited

    private void txtcantcontxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantcontxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantcontxtprodv1ActionPerformed

    private void txtcantcontxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantcontxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantcontxtprodv1KeyReleased

    private void txtcantcontxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantcontxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantcontxtprodv1KeyTyped

    private void txtsueldoaddtxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldoaddtxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoaddtxtprodv1ActionPerformed

    private void txtsueldoaddtxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldoaddtxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoaddtxtprodv1KeyReleased

    private void txtsueldoaddtxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldoaddtxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsueldoaddtxtprodv1KeyTyped

    private void txtnomaddtxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomaddtxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomaddtxtprodv1ActionPerformed

    private void txtnomaddtxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomaddtxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomaddtxtprodv1KeyReleased

    private void txtnomaddtxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomaddtxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomaddtxtprodv1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dab.agregartrab(txtidenadd.getText(),txtnomadd.getText(),txtuseradd.getText(),txtpassadd.getText(),txtsueldoadd.getText());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtidenaddtxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidenaddtxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenaddtxtprodv1ActionPerformed

    private void txtidenaddtxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidenaddtxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenaddtxtprodv1KeyReleased

    private void txtidenaddtxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidenaddtxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenaddtxtprodv1KeyTyped

    private void txtpreciocontxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciocontxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciocontxtprodv1ActionPerformed

    private void txtpreciocontxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciocontxtprodv1KeyReleased
    }//GEN-LAST:event_txtpreciocontxtprodv1KeyReleased

    private void txtpreciocontxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciocontxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciocontxtprodv1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
               dab.agregarInv(txtcodcon.getText(),txtdescon.getText(),txtcantcon.getText(),txtpreciocon.getText(),cmbtipocon.getSelectedItem().toString());

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtbustxtprodv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbustxtprodv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbustxtprodv2ActionPerformed

    private void txtbustxtprodv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbustxtprodv2KeyReleased
        limpiar();
        if(txtbus.getText().equalsIgnoreCase("")){
            tab();
        }else{
            dab.EscribirClienteBusqueda(tabla,txtbus.getText());
        }
    }//GEN-LAST:event_txtbustxtprodv2KeyReleased

    private void txtbustxtprodv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbustxtprodv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbustxtprodv2KeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int num=tabla.rowAtPoint(evt.getPoint());
        pclientefac.setVisible(false);
        pinfofac.setVisible(true);
        pitfac.setVisible(true);
        this.nom=tabla.getModel().getValueAt(num, 1).toString();
        this.id=tabla.getModel().getValueAt(num, 0).toString();
                
        //doc = tablah.getModel().getValueAt(num, 0).toString();
    }//GEN-LAST:event_tablaMouseClicked

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
         pffac.setVisible(true);
         pitfac.setVisible(false);
         int num=tabla1.rowAtPoint(evt.getPoint());
         this.cantidadp=tabla1.getModel().getValueAt(num, 2).toString();
         this.preciop=tabla1.getModel().getValueAt(num, 3).toString();
         this.codigop=tabla1.getModel().getValueAt(num, 0).toString();
         this.descp=tabla1.getModel().getValueAt(num, 1).toString();
         this.tipop=cmbtipofac1.getSelectedItem().toString();
         
    }//GEN-LAST:event_tabla1MouseClicked

    private void txtbus2txtprodv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbus2txtprodv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbus2txtprodv2ActionPerformed

    private void txtbus2txtprodv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbus2txtprodv2KeyReleased
        limpiar2();
        String p = cmbtipofac1.getSelectedItem().toString();
        //dab.tab2(tabla1,"escritorios",txtc,txtbus2);
        if(txtbus2.getText().equalsIgnoreCase("")){
            dab.tab2(tabla1,p,txtc,txtbus2);
        }else{
            dab.EscribirProductoBusqueda(tabla1, txtbus2.getText(),p);
        }
    }//GEN-LAST:event_txtbus2txtprodv2KeyReleased

    private void txtbus2txtprodv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbus2txtprodv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbus2txtprodv2KeyTyped

    private void cmbtipofac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtipofac1ActionPerformed
        String p = cmbtipofac1.getSelectedItem().toString();
        System.out.println("F ");
        limpiar2();
        dab.tab2(tabla1,p,txtc,txtbus2);
    }//GEN-LAST:event_cmbtipofac1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        pinfofac.setVisible(false);
        pclientefac.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txtcanfactxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcanfactxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcanfactxtprodv1ActionPerformed

    private void txtcanfactxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcanfactxtprodv1KeyReleased
        try {
            if (!txtcanfac.getText().equals("")) {
                int x = Integer.parseInt(txtcanfac.getText());
                int c = Integer.parseInt(this.cantidadp);
                if (c>=x && x!=0) {
                    btfac.setEnabled(true);
                    //cantidadp,preciop
                    int t = Integer.parseInt(this.preciop);
                    int to = t*x;
                    lblsubt.setText("₡"+to);
                    lbltot.setText("₡"+(to+(to*0.13)));
                }else{
                     lblsubt.setText("₡");
                     lbltot.setText("₡");
                     btfac.setEnabled(false);
                     JOptionPane.showMessageDialog(null, "la cantidad es erronea");
                }
            }else{
             lblsubt.setText("₡");
             lbltot.setText("₡");
             btfac.setEnabled(false);
            }
        } catch (Exception e) {
            btfac.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }//GEN-LAST:event_txtcanfactxtprodv1KeyReleased

    private void txtcanfactxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcanfactxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcanfactxtprodv1KeyTyped

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       pffac.setVisible(false);
       pitfac.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btfacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacActionPerformed
        dab.agregarInv(this.codigop,this.descp,"-"+txtcanfac.getText(),this.preciop, this.tipop);
        fa();
    }//GEN-LAST:event_btfacActionPerformed

    private void lblsubtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsubtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblsubtMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dab.agregarCli(txtidencli.getText(),txtnomcli.getText(),txtpassadd1.getText(),txtuseradd1.getText());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtpassadd1txtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassadd1txtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassadd1txtprodv1ActionPerformed

    private void txtpassadd1txtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassadd1txtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassadd1txtprodv1KeyReleased

    private void txtpassadd1txtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassadd1txtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassadd1txtprodv1KeyTyped

    private void txtuseradd1txtprodv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseradd1txtprodv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseradd1txtprodv2ActionPerformed

    private void txtuseradd1txtprodv2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseradd1txtprodv2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseradd1txtprodv2KeyReleased

    private void txtuseradd1txtprodv2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseradd1txtprodv2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseradd1txtprodv2KeyTyped

    private void txtnomclitxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomclitxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomclitxtprodv1ActionPerformed

    private void txtnomclitxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomclitxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomclitxtprodv1KeyReleased

    private void txtnomclitxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomclitxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomclitxtprodv1KeyTyped

    private void txtidenclitxtprodv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidenclitxtprodv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenclitxtprodv1ActionPerformed

    private void txtidenclitxtprodv1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidenclitxtprodv1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenclitxtprodv1KeyReleased

    private void txtidenclitxtprodv1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidenclitxtprodv1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidenclitxtprodv1KeyTyped

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        pus.setVisible(false);
        habb();
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        pclii.setVisible(false);
        habb();
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pus.setVisible(true);
        desb();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pclii.setVisible(true);
        desb();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void desb(){
        jButton1.setVisible(false);
        jButton2.setVisible(false);
       
    }
     public void habb(){
        jButton1.setVisible(true);
        jButton2.setVisible(true);
    }
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
    private javax.swing.JButton btfac;
    private javax.swing.JComboBox<String> cmbtipocon;
    private javax.swing.JComboBox<String> cmbtipofac1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblimg1;
    private javax.swing.JLabel lblnom;
    private javax.swing.JLabel lblnom1;
    private javax.swing.JLabel lblpag;
    private javax.swing.JLabel lblsubt;
    private javax.swing.JLabel lbltot;
    private javax.swing.JPanel panelAR;
    private javax.swing.JPanel panelIZ;
    private javax.swing.JPanel pcen;
    private javax.swing.JPanel pclientefac;
    private javax.swing.JPanel pclii;
    private javax.swing.JPanel pcont3;
    private javax.swing.JPanel pcontr;
    private javax.swing.JPanel pcosas;
    private javax.swing.JPanel pfac;
    private javax.swing.JPanel pffac;
    private javax.swing.JPanel pinfofac;
    private javax.swing.JPanel pitfac;
    private javax.swing.JPanel plog;
    private javax.swing.JPanel ptrabadd;
    private javax.swing.JPanel pus;
    private javax.swing.JPanel pven;
    private javax.swing.JPanel pven1;
    private javax.swing.JPanel pven2;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtbus;
    private javax.swing.JTextField txtbus2;
    private javax.swing.JLabel txtc;
    private javax.swing.JTextField txtcanfac;
    private javax.swing.JTextField txtcantcon;
    private javax.swing.JTextField txtcodcon;
    private javax.swing.JTextField txtdescon;
    private javax.swing.JTextField txtidenadd;
    private javax.swing.JTextField txtidencli;
    private javax.swing.JTextField txtnomadd;
    private javax.swing.JTextField txtnomcli;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtpassadd;
    private javax.swing.JTextField txtpassadd1;
    private javax.swing.JTextField txtpreciocon;
    private javax.swing.JTextField txtsueldoadd;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtuseradd;
    private javax.swing.JTextField txtuseradd1;
    // End of variables declaration//GEN-END:variables

    private void tap2(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
