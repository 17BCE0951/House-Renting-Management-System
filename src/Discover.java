
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Discover extends javax.swing.JFrame {

    /**
     * Creates new form Discover
     */
    public Discover() {
        initComponents();
        show_user();
    }
    public ArrayList<User> userList(){
        ArrayList<User> usersList=new ArrayList<>();
        try{
        Connection con;
       MyConnection registercon=new MyConnection();
       con=registercon.getConnection();
        String query1="select * from house;";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query1);
        User user;
        while(rs.next()){
            user=new User(rs.getString("Name"),rs.getString("LandlordName"),rs.getString("Type"),rs.getInt("No_of_Rooms"), (int) rs.getLong("Price"),rs.getString("DoorNo"),rs.getString("Landmark"),rs.getString("Location"), (int) rs.getLong("Landlord_PhoneNo"));
            usersList.add(user);
        }
     }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
     return usersList;   
    }
   public void show_user(){
       ArrayList<User> list=userList();
       DefaultTableModel model=(DefaultTableModel)jt1.getModel();
       Object[] row=new Object[9];
       for(int i=0;i<list.size();i++){
           row[0]=list.get(i).getName();
           row[1]=list.get(i).getLandlordName();
           row[2]=list.get(i).getType();
           row[3]=list.get(i).getRooms();
           row[4]=list.get(i).getPrice();
           row[5]=list.get(i).getDoorNo();
           row[6]=list.get(i).getLandmark();
           row[7]=list.get(i).getLocation();
           row[8]=list.get(i).getLandlord_PhoneNo();
           model.addRow(row);
        }
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
        b1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Discover house");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 43, 170, 22));

        b1.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 102));
        b1.setText("Back");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 720, 110, -1));

        jt1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "LandlordName", "Type", "No_of_Rooms", "Price", "DoorNo", "Landmark", "Location", "Landlord_PhoneNo"
            }
        ));
        jt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, 1382, 212));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Payment_id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("To_Landlord");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 140, -1));

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 70, -1));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, 90, -1));

        b2.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 102));
        b2.setText("Payment");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 120, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 365, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 413, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 492, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 598, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 660, -1, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(881, 685, -1, -1));

        l2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 0, 102));
        l2.setText("--");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 530, -1, -1));

        l4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 0, 102));
        l4.setText("--");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, -1, -1));

        l5.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 0, 102));
        l5.setText("--");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 620, -1, -1));

        l6.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        l6.setForeground(new java.awt.Color(0, 0, 102));
        l6.setText("--");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 660, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("UserName");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 75, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(801, 470, 75, -1));

        b3.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 102));
        b3.setText("Next");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 720, 100, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\lenovo\\Desktop\\correct.jpg")); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1420, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
         new commonscreen().setVisible(true);   
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       
       Connection con;
       MyConnection registercon=new MyConnection();
       con=registercon.getConnection();
       int row=jt1.getSelectedRow();
       String value=(jt1.getModel().getValueAt(row,5).toString());
       String querys="insert into payment(Payment_id,To_landlord,Payment_amount,Date,Time,From_customer) values(?,?,?,?,?,?);";
       String querys2="delete from bond where DoorNo='"+value+"';";
       String querys3="delete from furniture where DoorNo='"+value+"';";
       String querys4="delete from maintainence where DoorNo='"+value+"';";
       String querys5="delete from services where DoorNo='"+value+"';";
       String querys6="delete from water where DoorNo='"+value+"';";
       String querys1="delete from house where DoorNo = '"+value+"';";
        try {
            PreparedStatement pstmt=con.prepareStatement(querys);
            PreparedStatement pst1=con.prepareStatement(querys1);
            PreparedStatement pst2=con.prepareStatement(querys2);
            PreparedStatement pst3=con.prepareStatement(querys3);
            PreparedStatement pst4=con.prepareStatement(querys4);
            PreparedStatement pst5=con.prepareStatement(querys5);
            PreparedStatement pst6=con.prepareStatement(querys6);
            pst2.executeUpdate();
            pst3.executeUpdate();
            pst4.executeUpdate();
            pst5.executeUpdate();
            pst6.executeUpdate();
            pst1.executeUpdate();
            pstmt.setString(1,t2.getText());
            pstmt.setString(2, l2.getText());
            pstmt.setString(3,l4.getText());
            pstmt.setString(4, l5.getText());
            pstmt.setString(5, l6.getText());
            pstmt.setString(6, t1.getText()); 
            pstmt.executeUpdate();
          JOptionPane.showMessageDialog(this,"Payment Successful");
          
            // TODO add your handling code here:
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
       // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void jt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt1MouseClicked
    int num = 0;
    int i=jt1.getSelectedRow();
    TableModel model=jt1.getModel();
    l2.setText(model.getValueAt(i,1).toString());
    l4.setText(model.getValueAt(i,4).toString());
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
    Date date=new Date();
    l5.setText(sdf.format(date));
    SimpleDateFormat tf=new SimpleDateFormat("HH:mm:ss");
    Date dat=new Date();
    l6.setText(tf.format(dat));
    
    

           // TODO add your handling code here:
    }//GEN-LAST:event_jt1MouseClicked

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
 new End().setVisible(true);
 dispose();// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(Discover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discover.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discover().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jt1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
