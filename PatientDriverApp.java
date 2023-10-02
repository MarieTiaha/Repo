public class PatientDriverApp {
    public static void main(String[] args) {
        // Create an instance of the Patient class
        Patient patient = new Patient("John", "Doe", "Smith", "123 Main St", "Cityville", "CA", "12345", "301-123-4567", "Jane Doe", "555-555-5555");

        // Create three instances of the Procedure class using different constructors
        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023");
        Procedure procedure2 = new Procedure("Blood Test", "06/13/2023", "Dr. Johnson", 150.0);
        Procedure procedure3 = new Procedure("MRI", "06/14/2023", "Dr. Williams", 300.0);

        // Display patient's information
        displayPatient(patient);

        // Display information about procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = TotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%.2f", totalCharges);
        
        System.out.println();
        System.out.println();
        System.out.println("Student Name: Marie Tiaha");
        System.out.println("MC#: MC21112470");
        System.out.println("Due Date: 10/02/2023");

    }

    // Method to display patient's information
    public static void displayPatient(Patient patient) {
        System.out.println("Patient Info:");
        System.out.println(patient.toString());
        System.out.println();
    }

    // Method to display procedure's information
    public static void displayProcedure(Procedure procedure) {
        //System.out.println("Procedure Information:");
        System.out.println(procedure.toString());
        System.out.println();
    }

    // Method to calculate total charges
    public static double TotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
}