/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateassignment;


import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Baltic
 */
public class MyFrame extends javax.swing.JFrame{

    /**
     * Creates new form MyFrame
     */
    public MyFrame() {
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

        jlp = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlp.setBackground(new java.awt.Color(51, 51, 51));
        jlp.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Employees check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Employees check ( only by age 18 - 35 ) ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Employees update ( income )");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Insert new employee");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Delete employee");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText(" Employees database manipulation :");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jta.setEditable(false);
        jta.setBackground(new java.awt.Color(204, 204, 204));
        jta.setColumns(20);
        jta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jta.setForeground(new java.awt.Color(255, 102, 0));
        jta.setRows(5);
        jScrollPane1.setViewportView(jta);

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Baltic\\Documents\\NetBeansProjects\\HibernateAssignment\\ee.png")); // NOI18N

        jlp.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlp.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpLayout = new javax.swing.GroupLayout(jlp);
        jlp.setLayout(jlpLayout);
        jlpLayout.setHorizontalGroup(
            jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jlpLayout.createSequentialGroup()
                        .addGroup(jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addGroup(jlpLayout.createSequentialGroup()
                                .addGroup(jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6)
                                    .addComponent(jButton5)
                                    .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jlpLayout.setVerticalGroup(
            jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlpLayout.createSequentialGroup()
                .addGroup(jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jlpLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jlpLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addGroup(jlpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        
        Session  session = NewHibernateUtil.getSessionFactory().openSession();
        String hql = "from Employee";
        Query query = session.createQuery(hql);
        
        List<Employee> employee;
        
           try{               

               session.beginTransaction();
               
               employee = query.list();
               

               
               for(Employee emp : employee){ 
                               
                jta.setText(employee.toString().replace("[", "").replace(",", "").replace("]", ""));               
                                                    
           } 
               
               session.getTransaction().commit();
                              session.close();

               
           }catch(HibernateException e){
                
               System.out.println("Greska: " + e.getMessage());
           }
           
                

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        InsertFrame frame2 = new InsertFrame();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        frame2.getContentPane().setBackground(new java.awt.Color(51, 51, 51));
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
            Session  session = NewHibernateUtil.getSessionFactory().openSession();
                String hql = "from Employee employee where employee.age > 18 and employee.age < 35";
                Query query = session.createQuery(hql);
                Transaction tx = null;
        
        List<Employee> employee = null;
        
           try{               

               session.beginTransaction();
               
               employee = query.list();
               
           for(Employee emp : employee){ 
                               
                jta.setText(employee.toString().replace("[", "").replace(",", "").replace("]", ""));               
                                                    
           }
               
               session.getTransaction().commit();
                              session.close();

              
           }catch(HibernateException e){
                
               System.out.println("Greska: " + e.getMessage());
           }
           
                   
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        UpdateFrame uf = new UpdateFrame();
        uf.setLocationRelativeTo(null);
        uf.setVisible(true);
        uf.getContentPane().setBackground(new java.awt.Color(51, 51, 51));
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Session  session = NewHibernateUtil.getSessionFactory().openSession();
              
        String x = JOptionPane.showInputDialog("Insert ID to delete employee");
               
        try{               
    
            String hql = "delete from Employee employee where employee.employeeId = :id ";
                
               Query query = session.createQuery(hql);

               session.getTransaction().begin();
               
               Query deletedEmp = query.setParameter("id", Integer.valueOf(x));
               
               int result = deletedEmp.executeUpdate();
               
               jta.setText("Employee with ID: " + String.valueOf(x) + "  has been deleted!" );               
                       
               session.getTransaction().commit();
               session.close();
               
           }catch(HibernateException e){
                
               System.out.println("Greska: " + e.getMessage());
           }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed
        
    
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
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane jlp;
    private javax.swing.JTextArea jta;
    // End of variables declaration//GEN-END:variables
}
