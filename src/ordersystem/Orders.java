/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ordersystem;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ak
 */
public class Orders extends javax.swing.JFrame {

    String name_sch,sql;
    public Orders() {
        initComponents();
        setLocationRelativeTo(this);
        
        btnState(1, 0, 0, 0);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtOrder_no = new javax.swing.JTextField();
        txtCust_name = new javax.swing.JTextField();
        txtOrder_add = new javax.swing.JTextField();
        txtOrder_dateS = new javax.swing.JTextField();
        txtOrder_dateE = new javax.swing.JTextField();
        txtOrder_nts = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnOrder_del = new javax.swing.JButton();
        btnOrder_edt = new javax.swing.JButton();
        btnOrder_sav = new javax.swing.JButton();
        btnOrder_new = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder_show = new javax.swing.JTable();
        txtOrder_sch = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 19));

        txtOrder_no.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtOrder_no.setForeground(new java.awt.Color(51, 51, 51));
        txtOrder_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrder_no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtOrder_no.setFocusable(false);
        txtOrder_no.setName("txtOrder_no"); // NOI18N
        jPanel3.add(txtOrder_no);

        txtCust_name.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtCust_name.setForeground(new java.awt.Color(51, 51, 51));
        txtCust_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCust_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtCust_name.setName("txtCust_name"); // NOI18N
        jPanel3.add(txtCust_name);

        txtOrder_add.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtOrder_add.setForeground(new java.awt.Color(51, 51, 51));
        txtOrder_add.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrder_add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtOrder_add.setName("txtOrder_add"); // NOI18N
        jPanel3.add(txtOrder_add);

        txtOrder_dateS.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtOrder_dateS.setForeground(new java.awt.Color(51, 51, 51));
        txtOrder_dateS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrder_dateS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtOrder_dateS.setName("txtOrder_dateS"); // NOI18N
        txtOrder_dateS.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtOrder_dateSCaretUpdate(evt);
            }
        });
        txtOrder_dateS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrder_dateSKeyPressed(evt);
            }
        });
        jPanel3.add(txtOrder_dateS);

        txtOrder_dateE.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtOrder_dateE.setForeground(new java.awt.Color(51, 51, 51));
        txtOrder_dateE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrder_dateE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtOrder_dateE.setName("txtOrder_dateE"); // NOI18N
        jPanel3.add(txtOrder_dateE);

        txtOrder_nts.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtOrder_nts.setForeground(new java.awt.Color(51, 51, 51));
        txtOrder_nts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrder_nts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtOrder_nts.setName("txtOrder_nts"); // NOI18N
        jPanel3.add(txtOrder_nts);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 13));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("رقم الطلب");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("اسم الزبون ");
        jPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("العنوان");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("تاريخ الطلب");
        jPanel2.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("إنتهاء الطلب");
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ملاحظات");
        jPanel2.add(jLabel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 13, 0));

        btnOrder_del.setBackground(new java.awt.Color(0, 51, 51));
        btnOrder_del.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnOrder_del.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder_del.setText("حذف");
        btnOrder_del.setBorder(null);
        btnOrder_del.setName("btnOrder_del"); // NOI18N
        btnOrder_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder_delActionPerformed(evt);
            }
        });
        jPanel5.add(btnOrder_del);

        btnOrder_edt.setBackground(new java.awt.Color(0, 51, 51));
        btnOrder_edt.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnOrder_edt.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder_edt.setText("تعديل ");
        btnOrder_edt.setBorder(null);
        btnOrder_edt.setName("btnOrder_edt"); // NOI18N
        btnOrder_edt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder_edtActionPerformed(evt);
            }
        });
        jPanel5.add(btnOrder_edt);

        btnOrder_sav.setBackground(new java.awt.Color(0, 51, 51));
        btnOrder_sav.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnOrder_sav.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder_sav.setText("حفظ");
        btnOrder_sav.setBorder(null);
        btnOrder_sav.setName("btnOrder_sav"); // NOI18N
        btnOrder_sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder_savActionPerformed(evt);
            }
        });
        jPanel5.add(btnOrder_sav);

        btnOrder_new.setBackground(new java.awt.Color(0, 51, 51));
        btnOrder_new.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnOrder_new.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder_new.setText("جديد");
        btnOrder_new.setBorder(null);
        btnOrder_new.setName("btnOrder_new"); // NOI18N
        btnOrder_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder_newActionPerformed(evt);
            }
        });
        jPanel5.add(btnOrder_new);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tblOrder_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ملاحظات", "إنتهاء الطلب", "تاريخ الطلب", "العنوان", "الاسم ", "رقم الطلب"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder_show.setToolTipText("");
        tblOrder_show.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblOrder_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblOrder_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrder_showMouseClicked(evt);
            }
        });
        tblOrder_show.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblOrder_showPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrder_show);

        txtOrder_sch.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtOrder_sch.setForeground(new java.awt.Color(102, 102, 102));
        txtOrder_sch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtOrder_sch.setText("بحث");
        txtOrder_sch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        txtOrder_sch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtOrder_schCaretUpdate(evt);
            }
        });
        txtOrder_sch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOrder_schFocusLost(evt);
            }
        });
        txtOrder_sch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrder_schKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addComponent(txtOrder_sch))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtOrder_sch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrder_savActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder_savActionPerformed
        
        if (!(txtCust_name.getText().isBlank() || txtOrder_dateS.getText().isBlank())){
            String cust_name,order_add,order_date_start,order_date_end,order_nots,sql;
            cust_name=txtCust_name.getText();
            order_add=txtOrder_add.getText();
            order_date_start=txtOrder_dateS.getText();
            order_date_end=txtOrder_dateE.getText();
            order_nots=txtOrder_nts.getText();
            sql="insert into orders(cust_name,order_add,start_date,end_date,nots) "
                    + "values('"+cust_name+"','"+order_add+"','"+order_date_start+"','"+order_date_end+"','"+order_nots+"');";
            if (txtOrder_dateE.getText().isBlank()){
                sql="insert into orders(cust_name,order_add,start_date,nots) "
                    + "values('"+cust_name+"','"+order_add+"','"+order_date_start+"','"+order_nots+"');";
            }
            if (DB.Calldb.saveData(sql)){
                JOptionPane.showMessageDialog(null, "تم الحفظ بنجاح.");
                
                txtState();
                
                btnState(0, 1, 0, 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "لم تتم العملية.");
                
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى ملئ الحقول المطلوبة.");
        }
        refreshTable(tblOrder_show);
    }//GEN-LAST:event_btnOrder_savActionPerformed

    private void btnOrder_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder_delActionPerformed
        if (!txtOrder_no.getText().isBlank()){
        int order_no;
        String sql;
        order_no=Integer.valueOf(txtOrder_no.getText());
        sql="delete from orders where order_no="+order_no+";";
        
         if (DB.Calldb.deleteData(sql)){
            JOptionPane.showMessageDialog(null, "تم الحذف بنجاح.");
            txtState();
            
            btnState(0,1,0,0);
        }
        else{
            JOptionPane.showMessageDialog(null, "لم تتم العملية.");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى ملئ حقل الرقم.");
        }
        refreshTable(tblOrder_show);
    }//GEN-LAST:event_btnOrder_delActionPerformed

    private void btnOrder_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder_newActionPerformed
        
        txtState();
        
        btnState(0, 1, 0, 0);
        
    }//GEN-LAST:event_btnOrder_newActionPerformed

    private void btnOrder_edtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder_edtActionPerformed
        if (!(txtCust_name.getText().isBlank() || txtOrder_no.getText().isBlank() || txtOrder_dateS.getText().isBlank())){
            String cust_name,order_add,order_date_start,order_date_end,order_nots,sql;
            int order_no;
            
            cust_name=txtCust_name.getText();
            order_add=txtOrder_add.getText();
            order_date_start=txtOrder_dateS.getText();
            order_date_end=txtOrder_dateE.getText();
            order_nots=txtOrder_nts.getText();
            order_no=Integer.valueOf(txtOrder_no.getText());
            
            
            sql="update orders set cust_name='"+cust_name+"',"
                    + "order_add='"+order_add+"',"
                    + "start_date='"+order_date_start+"',"
                    + "end_date='"+order_date_end+"',"
                    + "nots='"+order_nots+"' where order_no='"+order_no+"';";
            if (txtOrder_dateE.getText().isBlank()){
               sql="update orders set cust_name='"+cust_name+"',"
                    + "order_add='"+order_add+"',"
                    + "start_date='"+order_date_start+"',"
                    + "nots='"+order_nots+"' where order_no='"+order_no+"';";
            }
            
            if (DB.Calldb.updateData(sql)){
                JOptionPane.showMessageDialog(null, "تم التعديل بنجاح.");
                
                txtState();
                
                btnState(0, 1, 0, 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "لم تتم العملية.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى ملئ كل الحقول.");
            
        }
        refreshTable(tblOrder_show);
    }//GEN-LAST:event_btnOrder_edtActionPerformed

    private void tblOrder_showPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblOrder_showPropertyChange
        refreshTable(tblOrder_show);
    }//GEN-LAST:event_tblOrder_showPropertyChange

    private void tblOrder_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrder_showMouseClicked
        if (tblOrder_show.getSelectedRow()>-1){
             
            int r=tblOrder_show.getSelectedRow();
            
            
            txtOrder_no.setText(String.valueOf(tblOrder_show.getValueAt(r, 5)));
            txtCust_name.setText(String.valueOf(tblOrder_show.getValueAt(r, 4)));
            txtOrder_add.setText(String.valueOf(tblOrder_show.getValueAt(r, 3)));
            txtOrder_dateS.setText(String.valueOf(tblOrder_show.getValueAt(r, 2)));
            txtOrder_dateE.setText(String.valueOf(tblOrder_show.getValueAt(r, 1)));
            txtOrder_nts.setText(String.valueOf(tblOrder_show.getValueAt(r, 0)));
            
            btnState(1, 0, 1, 1);
             
         }
    }//GEN-LAST:event_tblOrder_showMouseClicked

    private void txtOrder_schCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtOrder_schCaretUpdate
       name_sch=txtOrder_sch.getText();
       sql="select * from orders where cust_name like '%"+name_sch+"%';";
       DB.Calldb.showData(sql, tblOrder_show);
    }//GEN-LAST:event_txtOrder_schCaretUpdate

    private void txtOrder_schKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrder_schKeyPressed
        if (txtOrder_sch.getText().equals("بحث")){
           txtOrder_sch.setText("");
       }
    }//GEN-LAST:event_txtOrder_schKeyPressed

    private void txtOrder_schFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrder_schFocusLost
        if (txtOrder_sch.getText().equals("")){
            txtOrder_sch.setText("بحث");
            refreshTable(tblOrder_show);
        }
        txtOrder_sch.setEditable(true);
    }//GEN-LAST:event_txtOrder_schFocusLost

    private void txtOrder_dateSCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtOrder_dateSCaretUpdate
        
    }//GEN-LAST:event_txtOrder_dateSCaretUpdate

    private void txtOrder_dateSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrder_dateSKeyPressed
        
    }//GEN-LAST:event_txtOrder_dateSKeyPressed

    public static void refreshTable(JTable table){
       String sql;
        sql="select * from orders;";
        
        DB.Calldb.showData(sql, table);
    }
    public void btnState(Integer n,int s,int e,int d) {
            btnOrder_new.setEnabled(MainForm.numberToBool(n));
            btnOrder_sav.setEnabled(MainForm.numberToBool(s));
            btnOrder_edt.setEnabled(MainForm.numberToBool(e));
            btnOrder_del.setEnabled(MainForm.numberToBool(d));
          
    }
    private void txtState(){
        txtOrder_no.setText("");
        txtCust_name.setText("");
        txtOrder_add.setText(""); 
        txtOrder_dateS.setText("");
        txtOrder_dateE.setText("");
        txtOrder_nts.setText("");
    }
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
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder_del;
    private javax.swing.JButton btnOrder_edt;
    private javax.swing.JButton btnOrder_new;
    private javax.swing.JButton btnOrder_sav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder_show;
    private javax.swing.JTextField txtCust_name;
    private javax.swing.JTextField txtOrder_add;
    private javax.swing.JTextField txtOrder_dateE;
    private javax.swing.JTextField txtOrder_dateS;
    private javax.swing.JTextField txtOrder_no;
    private javax.swing.JTextField txtOrder_nts;
    private javax.swing.JTextField txtOrder_sch;
    // End of variables declaration//GEN-END:variables
}
