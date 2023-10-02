public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    // Accessors
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }

    // Mutators
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }

    // toString method
    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\n" +
                "ProcedureDate= " + procedureDate + "\n" +
                "Practitioner= " + practitionerName + "\n" +
                "Charges= $" + procedureCharges;
    }
}





