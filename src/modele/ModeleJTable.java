package modele;

import accesAuxDonnees.DaoEmp;
import application.Appli;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import metier.Employe;

/**
 *
 * @author Alain
 */
public class ModeleJTable extends AbstractTableModel {

    // le conteneur de données
    private final List<Employe> leConteneur;
    // le titre des champs du conteneur
    private final String[] titre;
    // l'objet DAO pour mettre à jour le conteneur
    private final DaoEmp leDaoEmp;

    public ModeleJTable() {
        // définition du conteneur d'étudiants
        this.leConteneur = new ArrayList<>();
        // définition des noms du champ
        this.titre = new String[]{"Numéro", "Nom", "Job", "Date embauche", "Département"};
        // récupération de l'objet DAO utilisé
        this.leDaoEmp = Appli.getDaoEmp();
    }

    @Override
    public int getRowCount() {
        return leConteneur.size();
    }

    @Override
    public int getColumnCount() {
        return titre.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Employe emp = leConteneur.get(row);
        switch (column) {
            case 0:
                return emp.getNumEmp();
            case 1:
                return emp.getNomEmp();
            case 2:
                return emp.getJobEmp();
            case 3:
                return emp.getDateEmp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            case 4:                
                return emp.getDeptEmp();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titre[column];
    }

    public void insererEmploye(Employe emp) throws SQLException {
        // on tente d'insérer l'employé dans la base
        leDaoEmp.insererEmploye(emp);
        // si c'est OK on l'ajoute au conteneur du modèle
        leConteneur.add(emp);
        // on rafraichit la vue par une notification de modification des données  
        this.fireTableDataChanged();
    }

    public void supprimerEmploye(int ligne) throws SQLException {
        // on récupère le numéro de l'employé de la ligne sélectionnée
        int numEmp = (int) getValueAt(ligne, 0);
        // on tente de supprimer l'employé dans la base
        leDaoEmp.supprimerEmploye(numEmp);
        // si c'est OK on l'enlève du conteneur du modèle
        leConteneur.remove(ligne);
        // on rafraichit la vue par une notification de modification des données
        this.fireTableDataChanged();
    }

    public void chargerLesEmployes() throws SQLException {
        // chargement de tous les employés dans la base dans le conteneur du modèle
        leDaoEmp.lireLesEmployes(leConteneur);
        // si c'est OK on rafraichit la vue par une notification  
        this.fireTableDataChanged();
    }
}
