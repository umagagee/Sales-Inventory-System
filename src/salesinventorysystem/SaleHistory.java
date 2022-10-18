/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesinventorysystem;

import java.awt.print.PrinterException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author UMAGAGEE
 */
public class SaleHistory extends javax.swing.JFrame {
      Connection con = null;
    PreparedStatement ps= null;
    ResultSet rs = null;
     Statement stm=null;

    /**
     * Creates new form SaleHistory
     */
    public SaleHistory() {
        initComponents();
        con=ConnectionToDatabase.conn();
        setLocationRelativeTo(null);
        showallSalesHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        textSearch7 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        textSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel89 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        jButton13 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(0, 51, 51));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Item Details");
        jPanel15.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 66, -1, 40));

        jLabel48.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Search By:");
        jPanel15.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 66, -1, 40));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tittle" }));
        jPanel15.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 66, 182, 40));

        textSearch7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textSearch7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSearch7KeyTyped(evt);
            }
        });
        jPanel15.add(textSearch7, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 72, 195, 31));

        jPanel16.setBackground(new java.awt.Color(0, 51, 51));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 51, 51));
        jLabel82.setText("Sales History");
        jLabel82.setOpaque(true);
        jPanel16.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jButton4.setBackground(new java.awt.Color(51, 255, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 40));

        jLabel29.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Search by Invoice:");
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 40));

        textSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textSearchKeyTyped(evt);
            }
        });
        jPanel15.add(textSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 195, 31));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 60));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        toDate.setDateFormatString("yyy-MM-dd");
        jPanel3.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 30));

        jLabel89.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel89.setText("From");
        jPanel3.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, -10, -1, 40));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel81.setText("To");
        jPanel3.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -10, 20, 40));
        jPanel3.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 30));

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Find");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 100, 40));

        jButton6.setBackground(new java.awt.Color(51, 255, 204));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Print");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 90, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 494, 970, 72));

        jTable7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane6.setViewportView(jTable7);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 162, 970, 321));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 1010, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, 80, 1000, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSearch7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearch7KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearch7KeyTyped

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       showallSalesHistory();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        String st=textSearch.getText().trim().toUpperCase();
        String sql="Select  sale_number,item_name,quantity,previous_qty,selling_price,total_price,date,user from sales "
        + "where sale_number like '"+st+"%' ";

        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            jTable7.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
    }//GEN-LAST:event_textSearchKeyReleased

    private void textSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textSearchKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
          
            URL   url=this.getClass().getClassLoader().getResource("logo/Share.jpg");  
            
            HashMap param =  new HashMap();

        //    param.put("myImg", url);



InputStream jasperStream = getClass().getResourceAsStream("/report/SaleHistoryReport.jasper");
//JasperReport jr =  JasperCompileManager.compileReport(getClass().getResourceAsStream("/reports/memberReport.jrxml"));jasper
 //JasperReport jr =  JasperCompileManager.compileReport(jd);
  JasperReport jr =  (JasperReport) JRLoader.loadObject(jasperStream);
  JasperPrint jp  = JasperFillManager.fillReport(jr, param, con);
  
  JasperViewer jv = new JasperViewer(jp,false); 
  jv.setVisible(true);
    
    

    } catch ( JRException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        // Date date=jDateChooser1.getDate();
        //  Date date = new Date();

        if(     fromDate.getDate() == null && toDate.getDate()== null ){
            JOptionPane.showMessageDialog(this, "Please fill the date fields","Error", JOptionPane.ERROR_MESSAGE);

        }else if(toDate.getDate()== null){
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");
            String receiveDate=dateFormat.format(fromDate.getDate());
            String sql="Select  sale_number,item_name,quantity,previous_qty,selling_price,total_price,date,user from sales "
            + "where date like '"+receiveDate+"%' ";

            try {
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                jTable7.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
        }  else if(toDate.getDate()!= null  && fromDate.getDate()!= null ) {
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");

            //   SimpleDateFormat dateFormat=new SimpleDateFormat("yyy-MM-dd");
            String startDate=dateFormat.format(fromDate.getDate());
            String endDate=dateFormat.format(toDate.getDate());

            String sql="Select sale_number,item_name,quantity,previous_qty,selling_price,total_price,date,user from sales "
            + "WHERE  date between '"+startDate+"' and '"+endDate+"'  ";

            try {
                ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                jTable7.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }

        }
    }//GEN-LAST:event_jButton13ActionPerformed

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
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField textSearch7;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables

  void showallSalesHistory(){
       try{
        
        
        String sql ="select  sale_number,item_name,quantity,previous_qty,selling_price,total_price,date,user from sales";
        
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        jTable7.setModel(DbUtils.resultSetToTableModel(rs)); 

    }
    catch(SQLException e){
    JOptionPane.showMessageDialog(null, e.getMessage());
    }
   
}
  
 

}