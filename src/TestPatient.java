import javax.swing.*;
public class TestPatient {
    public static void main(String[] args) {
        //Creating the first 3 patient objects
        Patient default_patient = new Patient();
        Patient user_patient = new Patient();
        Patient mixed_patient = new Patient();

        //Get the values for the second Patient object
        user_patient.SetIdNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter second patient ID Number")));
        user_patient.SetAge(Integer.parseInt(JOptionPane.showInputDialog("Enter second patient age")));
        user_patient.SetBloodData(TestBloodData.GetUserBloodData());

        // Get the values for the mixed patient data
        mixed_patient.SetIdNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter patient ID number for mixed patient: ")));
        mixed_patient.SetAge(Integer.parseInt(JOptionPane.showInputDialog("Enter patient age for mixed patient: ")));

        // Display all the details
        DisplayPatientData("Default Patient", default_patient);
        DisplayPatientData("User Patient", user_patient);
        DisplayPatientData("Mixed Patient", mixed_patient);
    }

    private static void DisplayPatientData(String title, Patient patient) {
        JOptionPane.showMessageDialog(null, title + ":" + "\n" + "ID Number: " + patient.GetIdNumber() + "\n" + "Age: " + patient.GetAge() + "\n" + "Blood Data - Blood Type: " + patient.GetBloodData().GetBloodType() + "\n" + "Blood Data - Rh Factor: " + patient.GetBloodData().GetRhFactor());
    }
}
