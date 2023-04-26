/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ordersystem;

import DB.Calldb;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jdk.jfr.Enabled;
import java.awt.event.*;

/**
 *
 * @author ak
 */
public class Groups extends javax.swing.JFrame {

    String name_sch,sql;
    public Groups() {
        initComponents();
        setLocationRelativeTo(this);
        
        btnState(1, 0, 0, 0);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnGroup_del = new javax.swing.JButton();
        btnGroup_edt = new javax.swing.JButton();
        btnGroup_sav = new javax.swing.JButton();
        btnGroup_new = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblGroup_no = new javax.swing.JLabel();
        lblGroup_name = new javax.swing.JLabel();
        lblGroup_nts = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtGroup_no = new javax.swing.JTextField();
        txtGroup_name = new javax.swing.JTextField();
        txtGroup_nts = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGroup_show = new javax.swing.JTable();
        txtGroup_sch = new javax.swing.JTextField();

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

        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 9));

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 9, 0));

        btnGroup_del.setBackground(new java.awt.Color(0, 51, 51));
        btnGroup_del.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnGroup_del.setForeground(new java.awt.Color(255, 255, 255));
        btnGroup_del.setText("حذف");
        btnGroup_del.setBorder(null);
        btnGroup_del.setName("btnGroup_del"); // NOI18N
        btnGroup_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroup_delActionPerformed(evt);
            }
        });
        jPanel6.add(btnGroup_del);

        btnGroup_edt.setBackground(new java.awt.Color(0, 51, 51));
        btnGroup_edt.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnGroup_edt.setForeground(new java.awt.Color(255, 255, 255));
        btnGroup_edt.setText("تعديل");
        btnGroup_edt.setBorder(null);
        btnGroup_edt.setName("btnGroup_edt"); // NOI18N
        btnGroup_edt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroup_edtActionPerformed(evt);
            }
        });
        jPanel6.add(btnGroup_edt);

        btnGroup_sav.setBackground(new java.awt.Color(0, 51, 51));
        btnGroup_sav.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnGroup_sav.setForeground(new java.awt.Color(255, 255, 255));
        btnGroup_sav.setText("حفظ");
        btnGroup_sav.setBorder(null);
        btnGroup_sav.setName("btnGroup_sav"); // NOI18N
        btnGroup_sav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroup_savActionPerformed(evt);
            }
        });
        jPanel6.add(btnGroup_sav);

        btnGroup_new.setBackground(new java.awt.Color(0, 51, 51));
        btnGroup_new.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnGroup_new.setForeground(new java.awt.Color(255, 255, 255));
        btnGroup_new.setText("جديد");
        btnGroup_new.setBorder(null);
        btnGroup_new.setName("btnGroup_new"); // NOI18N
        btnGroup_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGroup_newActionPerformed(evt);
            }
        });
        jPanel6.add(btnGroup_new);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1, 0, 13));

        lblGroup_no.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblGroup_no.setForeground(new java.awt.Color(0, 51, 51));
        lblGroup_no.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGroup_no.setText("رقم المجموعة");
        jPanel3.add(lblGroup_no);

        lblGroup_name.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblGroup_name.setForeground(new java.awt.Color(0, 51, 51));
        lblGroup_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGroup_name.setText("اسم المجموعة");
        jPanel3.add(lblGroup_name);

        lblGroup_nts.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        lblGroup_nts.setForeground(new java.awt.Color(0, 51, 51));
        lblGroup_nts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGroup_nts.setText("الملاحظات");
        jPanel3.add(lblGroup_nts);

        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 0, 9));

        txtGroup_no.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtGroup_no.setForeground(new java.awt.Color(51, 51, 51));
        txtGroup_no.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGroup_no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtGroup_no.setFocusable(false);
        txtGroup_no.setName("txtGroup_no"); // NOI18N
        txtGroup_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGroup_noActionPerformed(evt);
            }
        });
        jPanel4.add(txtGroup_no);

        txtGroup_name.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtGroup_name.setForeground(new java.awt.Color(51, 51, 51));
        txtGroup_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGroup_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtGroup_name.setName("txtGroup_name"); // NOI18N
        jPanel4.add(txtGroup_name);

        txtGroup_nts.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtGroup_nts.setForeground(new java.awt.Color(51, 51, 51));
        txtGroup_nts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGroup_nts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 1, true));
        txtGroup_nts.setName("txtGroup_nts"); // NOI18N
        jPanel4.add(txtGroup_nts);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblGroup_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الملاحظات", "اسم المجموعة", "رقم المجموعة"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGroup_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblGroup_show.setShowGrid(false);
        tblGroup_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGroup_showMouseClicked(evt);
            }
        });
        tblGroup_show.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblGroup_showPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(tblGroup_show);
        if (tblGroup_show.getColumnModel().getColumnCount() > 0) {
            tblGroup_show.getColumnModel().getColumn(0).setHeaderValue("الملاحظات");
            tblGroup_show.getColumnModel().getColumn(1).setHeaderValue("اسم المجموعة");
            tblGroup_show.getColumnModel().getColumn(2).setHeaderValue("رقم المجموعة");
        }

        txtGroup_sch.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtGroup_sch.setForeground(new java.awt.Color(102, 102, 102));
        txtGroup_sch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtGroup_sch.setText("بحث");
        txtGroup_sch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        txtGroup_sch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtGroup_schCaretUpdate(evt);
            }
        });
        txtGroup_sch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGroup_schFocusLost(evt);
            }
        });
        txtGroup_sch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGroup_schKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGroup_sch)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txtGroup_sch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(156, 156, 156))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGroup_edtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroup_edtActionPerformed
        
         if (!(txtGroup_name.getText().isBlank() || txtGroup_no.getText().isBlank())){
            String sql,group_name,group_nts;
            int group_no;
            group_name=txtGroup_name.getText();
            group_nts=txtGroup_nts.getText();
            group_no=Integer.valueOf(txtGroup_no.getText());
            sql="update groups set group_name='"+group_name+"',nots='"+group_nts+"' where group_no="+group_no+";";
            
            if (DB.Calldb.updateData(sql)){
                JOptionPane.showMessageDialog(null, "تم التعديل بنجاح.");
                txtGroup_no.setText("");
                txtGroup_name.setText(""); 
                txtGroup_nts.setText("");
                
                btnState(0, 1, 0, 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "لم تتم العملية.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى كل الحقول.");
            
        }
         refreshTable(tblGroup_show);

    }//GEN-LAST:event_btnGroup_edtActionPerformed

    private void txtGroup_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGroup_noActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtGroup_noActionPerformed

    private void btnGroup_savActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroup_savActionPerformed
        if (!txtGroup_name.getText().isBlank()){
            String sql,group_name;
            group_name=txtGroup_name.getText();
            String group_nts=txtGroup_nts.getText();
            sql="insert into groups(group_name,nots)values('"+group_name+"','"+group_nts+"');";
            
            if (DB.Calldb.saveData(sql)){
                JOptionPane.showMessageDialog(null, "تم الحفظ بنجاح.");
                txtGroup_no.setText("");
                txtGroup_name.setText(""); 
                txtGroup_nts.setText("");
                
                btnState(0, 1, 0, 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "لم تتم العملية.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى إدخال الأسم.");
        }
        refreshTable(tblGroup_show);
    }//GEN-LAST:event_btnGroup_savActionPerformed

    private void btnGroup_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroup_delActionPerformed
        
        if (!txtGroup_no.getText().isBlank()){
        int group_no;
        String sql;
        group_no=Integer.valueOf(txtGroup_no.getText());
        sql="delete from groups where group_no="+group_no+";";
        
         if (DB.Calldb.deleteData(sql)){
            JOptionPane.showMessageDialog(null, "تم الحذف بنجاح.");
            txtGroup_no.setText("");
            txtGroup_name.setText(""); 
            txtGroup_nts.setText("");
            btnState(0,1,0,0);
        }
        else{
            JOptionPane.showMessageDialog(null, "لم تتم العملية.");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "يرجى ملئ حقل الرقم.");
        }
        refreshTable(tblGroup_show);
    }//GEN-LAST:event_btnGroup_delActionPerformed

    private void btnGroup_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGroup_newActionPerformed
        
                txtGroup_no.setText("");
                txtGroup_name.setText(""); 
                txtGroup_nts.setText("");
                btnState(0, 1, 0, 0);
    }//GEN-LAST:event_btnGroup_newActionPerformed

    private void tblGroup_showPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblGroup_showPropertyChange
        refreshTable(tblGroup_show);
    }//GEN-LAST:event_tblGroup_showPropertyChange

    private void tblGroup_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGroup_showMouseClicked
         if (tblGroup_show.getSelectedRow()>-1){
             
            int r=tblGroup_show.getSelectedRow();
            
            txtGroup_no.setText(String.valueOf(tblGroup_show.getValueAt(r, 2)));
            txtGroup_name.setText(String.valueOf(tblGroup_show.getValueAt(r, 1)));
            txtGroup_nts.setText(String.valueOf(tblGroup_show.getValueAt(r, 0)));
            
            btnState(1, 0, 1, 1);
            
         }
    }//GEN-LAST:event_tblGroup_showMouseClicked

    private void txtGroup_schCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtGroup_schCaretUpdate
       name_sch=txtGroup_sch.getText();
       sql="select * from groups where group_name like'%"+name_sch+"%';";
       DB.Calldb.showData(sql, tblGroup_show);
    }//GEN-LAST:event_txtGroup_schCaretUpdate

    private void txtGroup_schKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGroup_schKeyPressed
         if (txtGroup_sch.getText().equals("بحث")){
           txtGroup_sch.setText("");
       }
    }//GEN-LAST:event_txtGroup_schKeyPressed

    private void txtGroup_schFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGroup_schFocusLost
         if (txtGroup_sch.getText().equals("")){
            txtGroup_sch.setText("بحث");
            refreshTable(tblGroup_show);
        }
        txtGroup_sch.setEditable(true);
        
    }//GEN-LAST:event_txtGroup_schFocusLost

     public static void refreshTable(JTable table){
        String sql;
        sql="select * from groups;";
        
        DB.Calldb.showData(sql, table);
    }
   
    public void btnState(Integer n,int s,int e,int d) {
            btnGroup_new.setEnabled(MainForm.numberToBool(n));
            btnGroup_sav.setEnabled(MainForm.numberToBool(s));
            btnGroup_edt.setEnabled(MainForm.numberToBool(e));
            btnGroup_del.setEnabled(MainForm.numberToBool(d));
          
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
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Groups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Groups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGroup_del;
    private javax.swing.JButton btnGroup_edt;
    private javax.swing.JButton btnGroup_new;
    private javax.swing.JButton btnGroup_sav;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGroup_name;
    private javax.swing.JLabel lblGroup_no;
    private javax.swing.JLabel lblGroup_nts;
    private javax.swing.JTable tblGroup_show;
    private javax.swing.JTextField txtGroup_name;
    private javax.swing.JTextField txtGroup_no;
    private javax.swing.JTextField txtGroup_nts;
    private javax.swing.JTextField txtGroup_sch;
    // End of variables declaration//GEN-END:variables
}
