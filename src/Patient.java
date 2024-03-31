public class Patient {
    private int id_number;
    private int age;
    private BloodData blood_data;

    public Patient() {
        this.id_number = 0;
        this.age = 0;
        this.blood_data = new BloodData();
    }

    public Patient(int idNumber, int age, BloodData bloodData) {
        this.id_number = idNumber;
        this.age = age;
        this.blood_data = bloodData;
    }

    public int GetIdNumber() {
        return id_number;
    }

    public void SetIdNumber(int idNumber) {
        this.id_number = idNumber;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int age) {
        this.age = age;
    }

    public BloodData GetBloodData() {
        return blood_data;
    }

    public void SetBloodData(BloodData bloodData) {
        this.blood_data = bloodData;
    }
}
