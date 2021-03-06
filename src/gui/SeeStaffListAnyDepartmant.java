/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelclasses.Staff;
import modelclasses.Departmant;
import modelclasses.StaffList;
import modelclasses.StaffList;

/**
 *
 * @author CỌP
 */
public class SeeStaffListAnyDepartmant extends javax.swing.JPanel {

    /**
     * Creates new form XemDanhSachNV
     */
    public SeeStaffListAnyDepartmant() {
        initComponents();
        Vector<Departmant> vs = Departmant.getMaDVandTenDV();
        DefaultComboBoxModel cm = new DefaultComboBoxModel(vs);
        cboChonMaDVandTenDonVi.setModel(cm);
        //check get yet?
//        for(int i=0; i<vs.size();i++){
//            System.out.println(vs.get(i));
//        }

//        setT();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDanhSach = new javax.swing.JTable();
        cboChonMaDVandTenDonVi = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Chọn đơn vị: ");

        tbDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tbDanhSach);

        jScrollPane1.setViewportView(jScrollPane4);

        cboChonMaDVandTenDonVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChonMaDVandTenDonVi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChonMaDVandTenDonViActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboChonMaDVandTenDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboChonMaDVandTenDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboChonMaDVandTenDonViActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChonMaDVandTenDonViActionPerformed
       Vector v = new Vector();
       v.addElement("Mã nhân viên");
       v.addElement("Họ");
       v.addElement("Tên");
       v.addElement("Chức vụ");
       Departmant departmant2;
       String madv = cboChonMaDVandTenDonVi.getSelectedItem().toString();
       departmant2=(Departmant)(cboChonMaDVandTenDonVi.getSelectedItem());
       madv= String.valueOf(departmant2.getMaDV());
       int madvchinh = Integer.parseInt(madv);
       DefaultTableModel tm2 = new DefaultTableModel(StaffList.getRecordStaffList(madvchinh), v);
       tbDanhSach.setModel(tm2);
    }//GEN-LAST:event_cboChonMaDVandTenDonViActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboChonMaDVandTenDonVi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbDanhSach;
    // End of variables declaration//GEN-END:variables
}
