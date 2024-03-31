import javax.swing.*;
public class TestBloodData {
    public static void main(String[] args) {
        BloodData default_blood_data = new BloodData();

        // Get user values
        BloodData.BloodType user_bloodtype = BloodData.BloodType.valueOf(JOptionPane.showInputDialog("Enter your blood type (A, B, O, AB)"));
        BloodData.RhFactor user_rhFactor = BloodData.RhFactor.valueOf(JOptionPane.showInputDialog("Enter your blood rh factor (POSITIVE, NEGATIVE)"));
        BloodData user_blood_data = new BloodData(user_bloodtype, user_rhFactor);

        DisplayBloodData("Default Blood Data", default_blood_data);

        // Change the values in the default object with the new user values
        default_blood_data.SetBloodType(user_bloodtype);
        default_blood_data.SetRhFactor(user_rhFactor);

        // Display the details
        DisplayBloodData("User Blood Data", user_blood_data);
        DisplayBloodData("Updated Default Blood Data", default_blood_data);
    }
    public static BloodData GetUserBloodData(){
        BloodData.BloodType user_bloodtype = BloodData.BloodType.valueOf(JOptionPane.showInputDialog("Enter your blood type (A, B, O, AB)"));
        BloodData.RhFactor user_rhFactor = BloodData.RhFactor.valueOf(JOptionPane.showInputDialog("Enter your blood rh factor (POSITIVE, NEGATIVE)"));
        return new BloodData(user_bloodtype, user_rhFactor);
    }
    public static void DisplayBloodData(String title, BloodData blood_data) {
        JOptionPane.showMessageDialog(null,  title + ":" + "\n" + "Blood Type: " + blood_data.GetBloodType() + "\n" + "Rh Factor: " + blood_data.GetRhFactor());
    }
}
