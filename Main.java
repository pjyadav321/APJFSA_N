/*
Create a program in java to implement multilevel inheritance and hierarchical inheritance .
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding.
 */

class Doctor
{    // Base class: Doctor
    // Attributes of a Doctor
    protected String name;
    protected String specialization;

    // Parameterized Constructor
    public Doctor(String name, String specialization)
    {
        this.name = name;
        this.specialization = specialization;
    }

    // Method to display doctor information
    public void displayInfo()
    {
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
    }

    // Method to be overridden
    public void treatPatient()
    {
        System.out.println("Doctor is treating the patient.");
    }
}

class Surgeon extends Doctor
{     // Derived class: Surgeon (Multilevel Inheritance)

    // Constructor
    public Surgeon(String name, String specialization)
    {
        super(name, specialization);
    }

    // Overriding method
    @Override
    public void treatPatient()
    {
        System.out.println("Surgeon is performing surgery on the patient.");
    }

    // Specific method for Surgeon
    public void performSurgery()
    {
        System.out.println("Surgeon is performing a surgical procedure.");
    }
}

// Derived class: Nurse (Hierarchical Inheritance)
class Nurse extends Doctor
{
    // Constructor
    public Nurse(String name, String specialization)
    {
        super(name, specialization);
    }

    // Overriding method
    @Override
    public void treatPatient()
    {
        System.out.println("Nurse is providing care to the patient.");
    }

    // Specific method for Nurse
    public void administerMedication()
    {
        System.out.println("Nurse is administering medication to the patient.");
    }
}

// Main class to test the inheritance and method overriding
public class Main {
    public static void main(String[] args) {
        // Create a Doctor object
        Doctor doctor = new Doctor("Dr. Rajiv", "MD");
        doctor.displayInfo();
        doctor.treatPatient();

        System.out.println("\n==================\n");

        // Create a Surgeon object
        Surgeon surgeon = new Surgeon("Dr. Sanjana", "Orthopedics");
        surgeon.displayInfo();
        surgeon.treatPatient();
        surgeon.performSurgery();

        System.out.println("\n=====================\n");

        // Create a Nurse object
        Nurse nurse = new Nurse("Nurse Rima", "Pediatrics");
        nurse.displayInfo();
        nurse.treatPatient();
        nurse.administerMedication();
    }
}

/*
    OUTPUT:
    Doctor Name: Dr. Rajiv
    Specialization: MD
    Doctor is treating the patient.

    ==================

    Doctor Name: Dr. Sanjana
    Specialization: Orthopedics
    Surgeon is performing surgery on the patient.
    Surgeon is performing a surgical procedure.

    =====================

    Doctor Name: Nurse Rima
    Specialization: Pediatrics
    Nurse is providing care to the patient.
    Nurse is administering medication to the patient.

 */