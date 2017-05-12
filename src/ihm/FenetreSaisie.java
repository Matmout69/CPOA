/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import metier.Employe;
import java.time.DateTimeException;
import modele.ModeleJComboBox;

public class FenetreSaisie extends javax.swing.JDialog {

    private final Employe emp;
    private boolean etatSortie;
    private ModeleJComboBox leModele;

    public FenetreSaisie(java.awt.Frame parent, Employe emp) {
        super(parent, true);  // mode modal 
        this.setLocation(parent.getLocation());
        this.emp = emp;
        etatSortie = false;
        try {
            leModele = new ModeleJComboBox();
            initComponents();
            cbDept.setSelectedIndex(0);
        } catch (SQLException e) {
            System.out.println("Exception au chargement des départements : " + e.getMessage());
        }
    }

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txJob = new javax.swing.JTextField();
        txNumero = new javax.swing.JTextField();
        txNom = new javax.swing.JTextField();
        lbNom = new javax.swing.JLabel();
        lbJob = new javax.swing.JLabel();
        btValid = new javax.swing.JButton();
        lbNumero = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        txDate = new javax.swing.JTextField();
        lbDept = new javax.swing.JLabel();
        cbDept = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un employé");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        lbNom.setText("Nom Employé");

        lbJob.setText("Job Employé");

        btValid.setText("Valider");
        btValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidActionPerformed(evt);
            }
        });

        lbNumero.setText("Numéro employé");

        lbDate.setText("Date embauche");

        lbDept.setText("Département de l'employé");

        cbDept.setModel(leModele);
        cbDept.setSelectedIndex(0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btValid))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDept)
                                .addGap(18, 18, 18)
                                .addComponent(cbDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbJob, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(txJob, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)
                                    .addComponent(txDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero)
                    .addComponent(txNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom)
                    .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbJob))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDate))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDept)
                    .addComponent(cbDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btValid)
                .addGap(34, 34, 34))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidActionPerformed
        // TODO add your handling code here:
        try {
            // validation saisie du numéro de l'employé
            String leNumero = txNumero.getText();
            if (leNumero.isEmpty()) {
                throw new Exception("champ numero vide");
            }
            emp.setNumEmp(Integer.parseInt(leNumero));
            // validation saisie du nom de l'employé
            String leNom = txNom.getText();
            if (leNom.isEmpty()) {
                throw new Exception("champ nom vide");
            }
            emp.setNomEmp(leNom);
            // validation saisie du job de l'employé
            String leJob = txJob.getText();
            if (leJob.isEmpty()) {
                throw new Exception("champ job vide");
            }
            emp.setJobEmp(leJob);
            // validation saisie de la date d'embauche de l'employé
            String laDate = txDate.getText();
            if (laDate.isEmpty()) {
                throw new Exception("champ date vide");
            }
            // conversion de la cahine date en LocalDate et validation de la adte
            String[] champsDate = laDate.split("/");
            try {
                LocalDate dateEmbauche = LocalDate.of(
                        Integer.parseInt(champsDate[2]),
                        Integer.parseInt(champsDate[1]),
                        Integer.parseInt(champsDate[0])
                );
                LocalDate aujourdhui = LocalDate.now();
                if (dateEmbauche.isAfter(aujourdhui)) {
                    throw new Exception("date embauche postérieure à date aujour'hui");
                }
                emp.setDateEmp(dateEmbauche);
            } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                throw new Exception("format de date incorrect");
            }
            // sélection du département
            int indexItem = cbDept.getSelectedIndex();
            if (indexItem < 0) {
                throw new Exception("choisir un département");
            }
            int leDepartement = leModele.getNumDept(indexItem);
            emp.setDeptEmp(leDepartement);

            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btValidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btValid;
    private javax.swing.JComboBox<String> cbDept;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDept;
    private javax.swing.JLabel lbJob;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JTextField txDate;
    private javax.swing.JTextField txJob;
    private javax.swing.JTextField txNom;
    private javax.swing.JTextField txNumero;
    // End of variables declaration//GEN-END:variables
}
