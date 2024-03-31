import javax.swing.*;
import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {

        // Declare three Patient objects
        Patient defaultPatient = new Patient();
        Patient userPatient = new Patient();
        Patient mixedPatient = new Patient();

        // Prompt the user for values for the second Patient object
        userPatient.setIdNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter second patient ID Number")));
        userPatient.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter second patient age")));
        userPatient.setBloodData(TestBloodData.getUserBloodData());

        // Prompt the user for Patient data but use default values for that Patient’s BloodData
        mixedPatient.setIdNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter patient ID number for mixed patient: ")));
        mixedPatient.setAge(Integer.parseInt(JOptionPane.showInputDialog("Enter patient age for mixed patient: ")));

        // Display details of all three Patient objects
        displayPatient("Default Patient", defaultPatient);
        displayPatient("User Patient", userPatient);
        displayPatient("Mixed Patient", mixedPatient);
    }

    private static void displayPatient(String title, Patient patient) {
        System.out.println("\n" + title + ":");
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Data - Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("Blood Data - Rh Factor: " + patient.getBloodData().getRhFactor());
    }
}
