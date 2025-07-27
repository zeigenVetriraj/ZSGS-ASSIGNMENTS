


/*
 1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.
‌
 */
public class HospitalRecord {
    public static void main(String[] args) {
        // InPatient Record
        InPatientRecord ip = new InPatientRecord();
        ip.inputInPatientDetails("IP001", "John Doe", "2025-07-27", "Pneumonia", "R101", 5, 2000);
        System.out.println("=== InPatient Record ===");
        ip.displayRecord();

        System.out.println("----------------------------------------------------------------");

        // OutPatient Record
        OutPatientRecord op = new OutPatientRecord();
        op.inputOutPatientDetails("OP001", "Jane Smith", "2025-07-27", "Flu", "Dr. Kumar", 500);
        System.out.println("=== OutPatient Record ===");
        op.displayRecord();
    }
}


// ---------------------- Base Class ----------------------
class MedicalRecord {
    private String recordId;
    private String patientName;
    private String dateOfVisit;
    private String diagnosis;

    public void inputRecordDetails(String recordId, String patientName, String dateOfVisit, String diagnosis) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.dateOfVisit = dateOfVisit;
        this.diagnosis = diagnosis;
    }

    public void displayRecord() {
        System.out.println("Record ID: " + recordId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date of Visit: " + dateOfVisit);
        System.out.println("Diagnosis: " + diagnosis);
    }
}


// ---------------------- InPatient ----------------------
class InPatientRecord extends MedicalRecord {
    private String roomNumber;
    private int numberOfDaysAdmitted;
    private double roomCharges;

    public void inputInPatientDetails(String recordId, String patientName, String dateOfVisit,String diagnosis, String roomNumber, int numberOfDaysAdmitted, double roomCharges) {
        super.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);
        this.roomNumber = roomNumber;
        this.numberOfDaysAdmitted = numberOfDaysAdmitted;
        this.roomCharges = roomCharges;
    }

    public double calculateTotalCharges() {
        return numberOfDaysAdmitted * roomCharges;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Number of Days Admitted: " + numberOfDaysAdmitted);
        System.out.println("Room Charges per Day: " + roomCharges);
        System.out.println("Total Charges: " + calculateTotalCharges());
    }
}


// ---------------------- OutPatient ----------------------
class OutPatientRecord extends MedicalRecord {
    private String doctorName;
    private double consultationFee;

    public void inputOutPatientDetails(String recordId, String patientName, String dateOfVisit, String diagnosis, String doctorName, double consultationFee) {
        super.inputRecordDetails(recordId, patientName, dateOfVisit, diagnosis);
        this.doctorName = doctorName;
        this.consultationFee = consultationFee;
    }

    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}
