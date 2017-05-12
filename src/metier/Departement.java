package metier;

/**
 *
 * @author Alain
 */
public class Departement {

    private int numDept;
    private String nomDept;
    private String villeDept;

    public Departement() {
    }

    public Departement(int numDept, String nomDept, String villeDept) {
        this.numDept = numDept;
        this.nomDept = nomDept;
        this.villeDept = villeDept;
    }

    public int getNumDept() {
        return numDept;
    }

    public String getNomDept() {
        return nomDept;
    }

    public String getVilleDept() {
        return villeDept;
    }

}
