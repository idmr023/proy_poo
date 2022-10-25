package Interfaz;
import modelo.Producto;
import controlador.Tienda;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author idmr_
 */
public class frmTienda extends javax.swing.JFrame {
    Producto p = new Producto();
    controlador.Tienda obj = new controlador.Tienda();
        
    public frmTienda() {
        initComponents();
    }
       
    void print(){
        int nro=Integer.parseInt(txtCod.getText());
        Producto a=p.busca(nro);
        txtRes.append("Codigo del Producto: "+a.getCod());
        txtRes.append("\nNombre del producto: "+a.getNom_prod());
        txtRes.append("\nFecha de vencimiento: "+a.getFec_venc());
        txtRes.append("\nRestriccion: "+a.getRestricción());
        txtRes.append("\n");
    }

    void muestra_img(String producto){
        String ruta = new File("src").getAbsolutePath();
        ruta = ruta+"/main/java/img/"+producto+".jpg";
        ImageIcon img = new ImageIcon(ruta);
        Image imgsc = img.getImage().getScaledInstance(lbProducto.getWidth(), lbProducto.getHeight(), Image.SCALE_SMOOTH);
        lbProducto.setIcon(new ImageIcon(imgsc));
    }
    
    void muestra(){
        DefaultTableModel dt = (DefaultTableModel)Tabla1.getModel();
        dt.setRowCount(0);
        for (Producto p:obj.listado()) {
            Object v[]={p.getCod(),p.getNom_prod(),p.getCategoría(),p.getFec_venc()};
            dt.addRow(v);
        }
    }
    
        /*
    void muestraLácteos(){
        DefaultTableModel dt=(DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0); //limpia la tabla
        String tipo = " ";
        for(Producto x:p.getLis()){
        if (x instanceof Lácteos){
            tipo="Lácteos";
            Object v[]={x.getCod(), x.getNom_prod(), x.getFecha_venc(),x.getRestricción(), x.Ecat(), tipo};
            dt.addRow(v);
            }    
        }
    }
    
    void muestraLicores(){
        DefaultTableModel dt=(DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0); //limpia la tabla
        String tipo;
        for(Producto x:obj.getLis()){
        if (x instanceof Licores){
            tipo="Licores";
            Object v[]={x.getCod(), x.getNom_prod(), ((Licores) x).getPrecio(),  x.getFecha_venc(), x.getRestricción(),x.Ecat(), tipo};
            dt.addRow(v);
            }
        }
    }
    
    void muestraBebidas(){
    DefaultTableModel dt=(DefaultTableModel)tabla1.getModel();
    dt.setRowCount(0); //limpia la tabla
    String tipo;
    for(Producto x:obj.getLis()){
        if (x instanceof Bebidas){
            tipo="Bebidas";
            Object v[]={x.getCod(), x.getNom_prod(), x.getFecha_venc(),x.getRestricción(), x.Ecat(), tipo};
            dt.addRow(v);
            }
        }
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbProducto2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        rbLácteos = new javax.swing.JRadioButton();
        rbBebidas = new javax.swing.JRadioButton();
        rbLicores = new javax.swing.JRadioButton();
        rbTodo = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();
        btnLimp = new javax.swing.JToggleButton();
        lbProducto = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        txtProd = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtFecVenc = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        btnAdicion = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnCambia = new javax.swing.JButton();
        btnAnula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel15.setText("Usuario:");

        jLabel16.setText("Contraseña:");

        jButton1.setText("Ingresar");

        lbProducto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbProducto2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbProducto2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(lbProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(76, 76, 76)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbProducto2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("LOGIN", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("FILTRAR POR"));

        rbLácteos.setText("LÁCTEOS");
        rbLácteos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLácteosActionPerformed(evt);
            }
        });

        rbBebidas.setText("BEBIDAS");
        rbBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBebidasActionPerformed(evt);
            }
        });

        rbLicores.setText("LICORES");
        rbLicores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLicoresActionPerformed(evt);
            }
        });

        rbTodo.setText("TODO");
        rbTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbTodo)
                .addGap(33, 33, 33)
                .addComponent(rbLácteos)
                .addGap(41, 41, 41)
                .addComponent(rbBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbLicores)
                .addGap(180, 180, 180))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLácteos)
                    .addComponent(rbBebidas)
                    .addComponent(rbLicores)
                    .addComponent(rbTodo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "COD_PROD", "PRODUCTO", "PRECIO", "FECHA DE VENCIMIENTO", "RESTRICCIÓN", "CATEGORÍA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabla1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tabla1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("LISTADO", jPanel2);

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane3.setViewportView(txtRes);

        btnLimp.setText("LIMPIAR");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        lbProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbProducto.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbProductoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        jLabel9.setText("CODIGO DEL PRODUCTO");

        jToggleButton1.setText("BUSCAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jToggleButton1)
                        .addGap(42, 42, 42)
                        .addComponent(btnLimp))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(lbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jToggleButton1)
                    .addComponent(btnLimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("BUSCAR", jPanel3);

        jLabel20.setText("PRECIO");

        jLabel21.setText("FECHA DE VENCIMIENTO");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Producto", "Precio", "Fecha de vencimiento", "Categoría"
            }
        ));
        Tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Tabla1);

        btnAdicion.setText("Adición");
        btnAdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel19.setText("PRODUCTO");

        btnCambia.setText("Cambia");
        btnCambia.setEnabled(false);
        btnCambia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiaActionPerformed(evt);
            }
        });

        btnAnula.setText("Anular");
        btnAnula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProd, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecVenc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAdicion)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(25, 25, 25)
                        .addComponent(btnAnula)
                        .addGap(26, 26, 26)
                        .addComponent(btnCambia)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtFecVenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicion)
                    .addComponent(btnNuevo)
                    .addComponent(btnCambia)
                    .addComponent(btnAnula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("MODIFICAR DATOS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLácteosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLácteosActionPerformed

    }//GEN-LAST:event_rbLácteosActionPerformed

    private void rbBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBebidasActionPerformed

    }//GEN-LAST:event_rbBebidasActionPerformed

    private void rbLicoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLicoresActionPerformed

    }//GEN-LAST:event_rbLicoresActionPerformed

    private void rbTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodoActionPerformed

    }//GEN-LAST:event_rbTodoActionPerformed

    private void tabla1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabla1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla1AncestorAdded

    private void lbProducto2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbProducto2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProducto2AncestorAdded

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        txtRes.setText(null);
        txtCod.setText(null);
    }//GEN-LAST:event_btnLimpActionPerformed

    private void lbProductoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbProductoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbProductoAncestorAdded

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        /*int nro=Integer.parseInt(txtCod.getText());
        Producto a=obj.busca(nro);
        if(a==null){txtRes.setText("\nNo existe el nro\n"); return;}
        else if (a instanceof Lácteos){
            Lácteos L=(Lácteos)a;
            print();
            txtRes.append("Precio: "+L.getPrecio()+"\n\n");
        } else if(a instanceof Bebidas) {
            Bebidas B=(Bebidas)a;
            txtRes.append("Precio: "+B.getPrecio()+"\n\n");
            print();
        } else if(a instanceof Licores) {
            Licores LC=(Licores)a;
            txtRes.append("Precio: "+LC.getPrecio()+"\n\n");
            print();
        }*/

        try{
            muestra_img(p.getNom_prod());
        }catch(Exception ex){}
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void Tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla1MouseClicked
        int fila = Tabla1.getSelectedRow();
        cod=Integer.parseInt(Tabla1.getValueAt(fila, 0).toString());
        txtProd.setText(Tabla1.getValueAt(fila, 1).toString());
        txtPre.setText(Tabla1.getValueAt(fila, 2).toString());
        txtFecVenc.setText(Tabla1.getValueAt(fila, 3).toString());
        btnCambia.setEnabled(true);  btnAdicion.setEnabled(false);
    }//GEN-LAST:event_Tabla1MouseClicked

    private void btnAdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionActionPerformed
        Producto p = new Producto();
        p.setNom_prod(txtProd.getText());
        p.setPrecio(Double.parseDouble(txtPre.getText()));
        p.setFec_venc(txtFecVenc.getText());
        p.setCategoría(p.categoría());
        obj.adicion(p);
        muestra();
    }//GEN-LAST:event_btnAdicionActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         txtProd.setText(""); txtFecVenc.setText(""); txtPre.setText(""); txtProd.requestFocus();
        muestra();btnAdicion.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed
    int cod;
    private void btnCambiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiaActionPerformed
        p.setCod(cod);
        p.setNom_prod(txtProd.getText());
        p.setPrecio(Double.parseDouble(txtPre.getText()));
        p.setFec_venc(txtFecVenc.getText());
        obj.modifica(p);
        muestra(); btnCambia.setEnabled(false);
    }//GEN-LAST:event_btnCambiaActionPerformed

    private void btnAnulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnulaActionPerformed
        if(JOptionPane.showConfirmDialog(null, "seguro anular", "borra",
            JOptionPane.YES_NO_OPTION)==0){
        obj.anular(cod);muestra();
        txtProd.setText(""); txtPre.setText("");
        txtFecVenc.setText("");btnAnula.setEnabled(false);
        }
    }//GEN-LAST:event_btnAnulaActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton btnAdicion;
    private javax.swing.JButton btnAnula;
    private javax.swing.JButton btnCambia;
    private javax.swing.JToggleButton btnLimp;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbProducto2;
    private javax.swing.JRadioButton rbBebidas;
    private javax.swing.JRadioButton rbLicores;
    private javax.swing.JRadioButton rbLácteos;
    private javax.swing.JRadioButton rbTodo;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtFecVenc;
    private javax.swing.JTextField txtPre;
    private javax.swing.JTextField txtProd;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
