/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcenter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author 11
 */
public class RadiologistFrame extends javax.swing.JFrame {

    /**
     * Creates new form RadiologistFrame
     */
    public RadiologistFrame() {
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
        radiologist_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radiologist_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radiologist_age = new javax.swing.JTextField();
        radiologist_gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radiologist_shift = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        radiologist_address = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Radiologist Form");

        jLabel1.setBackground(java.awt.Color.lightGray);
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("Enter id:");

        radiologist_id.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_id.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setBackground(java.awt.Color.lightGray);
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.lightGray);
        jLabel2.setText("Enter Name");

        radiologist_name.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_name.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel3.setBackground(java.awt.Color.lightGray);
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.lightGray);
        jLabel3.setText("Age");

        radiologist_age.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_age.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        radiologist_gender.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_gender.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        radiologist_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel4.setBackground(java.awt.Color.lightGray);
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.lightGray);
        jLabel4.setText("Gender");

        jLabel5.setBackground(java.awt.Color.lightGray);
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.lightGray);
        jLabel5.setText("Shift");

        radiologist_shift.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_shift.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        radiologist_shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening", "Night" }));

        jLabel6.setBackground(java.awt.Color.lightGray);
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setText("Address");

        radiologist_address.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        radiologist_address.setColumns(20);
        radiologist_address.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        radiologist_address.setRows(5);
        jScrollPane1.setViewportView(radiologist_address);

        jButton1.setBackground(java.awt.Color.darkGray);
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.lightGray);
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.darkGray);
        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setForeground(java.awt.Color.lightGray);
        jButton2.setText("Find");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radiologist_id, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiologist_name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiologist_age, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiologist_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiologist_shift, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(radiologist_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radiologist_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radiologist_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiologist_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radiologist_shift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(radiologist_id.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Provide Radiologist Id ");
       
     }
     else if(radiologist_name.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Enter Radiologist Name!");
         
     }
     else if(radiologist_age.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Provide Age! ");
        
     }
     else if(radiologist_address.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Please Provide Address! ");
         
     }
     else{
       try{
          Class.forName("java.sql.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
    String query = " insert into radiologist(radiologist_id,radiologist_name,"
            + "radiologist_age,radiologist_gender,radiologist_shift,"
            + "radiologist_address)"
        + " values (?,?,?,?,?,?)";
    
    
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString(1,radiologist_id.getText());
      preparedStmt.setString(2,radiologist_name.getText());
      preparedStmt.setString(3,radiologist_age.getText());
      preparedStmt.setString(4,radiologist_gender.getSelectedItem().toString());
      preparedStmt.setString(5,radiologist_shift.getSelectedItem().toString());
      preparedStmt.setString(6,radiologist_address.getText());
      preparedStmt.execute();
      JOptionPane.showMessageDialog(null,"Record Stored Successfully! "); 
       }
       catch(Exception ex){
           System.out.println("Some PRoblem"+ex);
       }
         
     }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RadiologistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadiologistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadiologistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadiologistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadiologistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea radiologist_address;
    private javax.swing.JTextField radiologist_age;
    private javax.swing.JComboBox<String> radiologist_gender;
    private javax.swing.JTextField radiologist_id;
    private javax.swing.JTextField radiologist_name;
    private javax.swing.JComboBox<String> radiologist_shift;
    // End of variables declaration//GEN-END:variables
}
