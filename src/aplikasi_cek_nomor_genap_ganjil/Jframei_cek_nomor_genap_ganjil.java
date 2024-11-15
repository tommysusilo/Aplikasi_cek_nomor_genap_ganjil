/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_cek_nomor_genap_ganjil;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Win 10
 */
public class Jframei_cek_nomor_genap_ganjil extends javax.swing.JFrame {

    /**
     * Creates new form Jframei_cek_nomor_genap_ganjil
     */
    public Jframei_cek_nomor_genap_ganjil() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelnomor = new javax.swing.JLabel();
        txtNomor = new javax.swing.JTextField();
        btnCek = new javax.swing.JButton();
        lblHasil = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelnomor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelnomor.setText("NOMOR");

        txtNomor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomorFocusGained(evt);
            }
        });
        txtNomor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomorKeyTyped(evt);
            }
        });

        btnCek.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCek.setText("CEK NOMOR");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });

        lblHasil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnCek)
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCek)
                .addGap(18, 18, 18)
                .addComponent(lblHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        titel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titel.setText("Aplikasi Cek Nomor Genap Ganjil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(titel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
         try {
            // Ambil input dari text field dan ubah menjadi integer
            int nomor = Integer.parseInt(txtNomor.getText());
            String hasil = "Nomor " + nomor;

            // Validasi apakah genap atau ganjil
            if (nomor % 2 == 0) {
               // lblHasil.setText("Hasil: Nomor " + nomor + " adalah Genap");
                 hasil += " adalah Genap";
            } else {
               // lblHasil.setText("Hasil: Nomor " + nomor + " adalah Ganjil");
                 hasil += " adalah Ganjil";
            }
            if (prima(nomor)) {
               // lblHasil.setText(lblHasil.getText() + " dan juga Prima");
                hasil += " dan juga Prima";
                JOptionPane.showMessageDialog(this, hasil, "Hasil Pengecekan", JOptionPane.INFORMATION_MESSAGE);
            } else {
              //  lblHasil.setText(lblHasil.getText() + " dan Bukan Prima");
                hasil += " dan bukan Prima";
                JOptionPane.showMessageDialog(this, hasil, "Hasil Pengecekan", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (NumberFormatException e) {
            // Menampilkan pesan kesalahan jika input bukan angka yang valid
            lblHasil.setText("Hasil: Masukkan nomor yang valid.");
        }
    }//GEN-LAST:event_btnCekActionPerformed

    private void txtNomorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomorFocusGained
        txtNomor.setText("");
    }//GEN-LAST:event_txtNomorFocusGained

    private void txtNomorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomorKeyTyped
       char c = evt.getKeyChar();
            if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                evt.consume(); // Mencegah karakter yang bukan angka
                 JOptionPane.showMessageDialog(null,
                         "Masukkan Hanya Nomor!",
                        "Error",
                         JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_txtNomorKeyTyped

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
            java.util.logging.Logger.getLogger(Jframei_cek_nomor_genap_ganjil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframei_cek_nomor_genap_ganjil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframei_cek_nomor_genap_ganjil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframei_cek_nomor_genap_ganjil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframei_cek_nomor_genap_ganjil().setVisible(true);
            }
        });
    }
    
     private boolean prima(int number) {
        if (number <= 1) {
            return false; // Bilangan kurang dari atau sama dengan 1 bukan prima
        }
        if (number == 2) {
            return true; // 2 adalah bilangan prima
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Mengecek pembagi hingga akar kuadrat
            if (number % i == 0) {
                return false; // Jika ada pembagi selain 1 dan angka itu sendiri, maka bukan prima
            }
        }
        return true; // Jika tidak ada pembagi, maka angka adalah prima
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel jLabelnomor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel titel;
    private javax.swing.JTextField txtNomor;
    // End of variables declaration//GEN-END:variables
}
