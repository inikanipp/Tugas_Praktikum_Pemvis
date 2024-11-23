/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectakhir;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.UIManager;

/**
 *
 * @author acer
 */
public class loginPageAdmin extends javax.swing.JFrame {


    public loginPageAdmin() {
        initComponents();
        jPanelGreenHomePage.setBackground(Color.decode("#02613c"));
        jPanelGreenHomePage.putClientProperty( FlatClientProperties.STYLE, "arc: 16" );
//        jButtonRegisterUser.setBorder(BorderFactory.createLineBorder(Color.decode("#02613c"), 2));
        
        try{
            File fontStyle = new File("src/font/Poppins-Regular.ttf");
            File fontStyleSB = new File("src/font/Poppins-SemiBold.ttf");
            File fontStyleM = new File("src/font/Poppins-Medium.ttf");
            Font fontm16 = Font.createFont(Font.TRUETYPE_FONT, fontStyleM).deriveFont(16f);
            Font fontsb40 = Font.createFont(Font.TRUETYPE_FONT, fontStyleSB).deriveFont(40f);
            
            Font fontRegular14 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            Font font1 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(24f);
            
            jLabelLoginPage.setForeground(Color.black);
            jLabelLoginPage.setFont(fontsb40);
            jLabelLoginPage1.setFont(fontsb40);
            jButtonUserLoginGreen.setFont(fontm16);
            
        }catch(Exception e){
            e.printStackTrace();
            
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

        jPanel1 = new javax.swing.JPanel();
        jButtonUserLoginGreen = new javax.swing.JButton();
        jLabelLoginPage = new javax.swing.JLabel();
        jLabelLoginPage1 = new javax.swing.JLabel();
        jLabelGambarAtmin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelGreenHomePage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(949, 616));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(508, 616));

        jButtonUserLoginGreen.setBackground(new java.awt.Color(2, 97, 60));
        jButtonUserLoginGreen.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUserLoginGreen.setText("Login");
        jButtonUserLoginGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserLoginGreenActionPerformed(evt);
            }
        });

        jLabelLoginPage.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelLoginPage.setText("Atmin");

        jLabelLoginPage1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelLoginPage1.setText("Welcome Back");

        jLabelGambarAtmin.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Documents\\nip\\Tugas_Praktikum_Pemvis\\modul5\\projectAkhir\\src\\font\\atmin.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUserLoginGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLoginPage)
                    .addComponent(jLabelLoginPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGambarAtmin, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelLoginPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLoginPage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGambarAtmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUserLoginGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        getContentPane().add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelGreenHomePage.setBackground(new java.awt.Color(2, 97, 60));
        jPanelGreenHomePage.setMinimumSize(new java.awt.Dimension(432, 604));

        javax.swing.GroupLayout jPanelGreenHomePageLayout = new javax.swing.GroupLayout(jPanelGreenHomePage);
        jPanelGreenHomePage.setLayout(jPanelGreenHomePageLayout);
        jPanelGreenHomePageLayout.setHorizontalGroup(
            jPanelGreenHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        jPanelGreenHomePageLayout.setVerticalGroup(
            jPanelGreenHomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGreenHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGreenHomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUserLoginGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserLoginGreenActionPerformed
        // TODO add your handling code here:
        iniAdmin1 atmin = new iniAdmin1();
        atmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonUserLoginGreenActionPerformed

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
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put( "Button.arc", 10 );
//            UIManager.put("Button.border", BorderFactory.createLineBorder(Color.RED));
            
        } catch (Exception e) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonUserLoginGreen;
    private javax.swing.JLabel jLabelGambarAtmin;
    private javax.swing.JLabel jLabelLoginPage;
    private javax.swing.JLabel jLabelLoginPage1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelGreenHomePage;
    // End of variables declaration//GEN-END:variables
}
