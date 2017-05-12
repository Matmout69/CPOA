/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import metier.Employe;
import modele.ModeleJTable;

/**
 *
 * @author Alain
 */
public class FenetreApplication extends javax.swing.JFrame {

    private ModeleJTable leModele;

    public FenetreApplication() {
        // instanciation du modele de données de la JTable
        this.leModele = new ModeleJTable();
        // initialisation des composants
        initComponents();
        // affichage
        try {
            leModele.chargerLesEmployes();
            // formattage de la date du titre
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String laDate = LocalDate.now().format(formatDate);
            lbTitre.setText("Edition du " + laDate);
        } catch (SQLException ex) {
            System.out.println(" Erreur au chargement : " + ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        laTable = new javax.swing.JTable();
        jpGestion = new javax.swing.JPanel();
        btInserer = new javax.swing.JButton();
        btSupprimer = new javax.swing.JButton();
        lbPhoto = new javax.swing.JLabel();
        lbTitre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Affichage des employés");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        laTable.setModel(leModele);
        laTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(laTable);

        jpGestion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Gestion des employés", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 10))); // NOI18N

        btInserer.setText("Inserer");
        btInserer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsererActionPerformed(evt);
            }
        });

        btSupprimer.setText("Supprimer");
        btSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpGestionLayout = new javax.swing.GroupLayout(jpGestion);
        jpGestion.setLayout(jpGestionLayout);
        jpGestionLayout.setHorizontalGroup(
            jpGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGestionLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btInserer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSupprimer)
                .addGap(78, 78, 78))
        );
        jpGestionLayout.setVerticalGroup(
            jpGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpGestionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserer)
                    .addComponent(btSupprimer))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lbPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.gif"))); // NOI18N

        lbTitre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbTitre.setForeground(new java.awt.Color(0, 0, 153));
        lbTitre.setText("Edition du ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbPhoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSupprimerActionPerformed
        // TODO add your handling code here:
        int ligne = laTable.getSelectedRow();
        if (ligne != -1) {
            try {
                leModele.supprimerEmploye(ligne);
            } catch (SQLException e) {
                System.out.println("Erreur à la suppression : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btSupprimerActionPerformed

    private void btInsererActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsererActionPerformed
        // TODO add your handling code here:
        try {
            Employe emp = new Employe();
            FenetreSaisie laSaisie = new FenetreSaisie(this, emp);
            if (laSaisie.doModal() == true) {
                leModele.insererEmploye(emp);
            }
        } catch (SQLException e) {
            System.out.println("Erreur à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_btInsererActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vraiment sortir ?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (reponse == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInserer;
    private javax.swing.JButton btSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpGestion;
    private javax.swing.JTable laTable;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbTitre;
    // End of variables declaration//GEN-END:variables
}