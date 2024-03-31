public class BloodData {

    public enum BloodType {
        AB, A, B, O
    }

    public enum RhFactor {
        POSITIVE, NEGATIVE
    }

     BloodType blood_type;
     RhFactor rh_factor;

    public BloodData() {
        this.blood_type = BloodType.A;
        this.rh_factor = RhFactor.NEGATIVE;
    }

    public BloodData(BloodType bloodType, RhFactor rhFactor) {
        this.blood_type = bloodType;
        this.rh_factor = rhFactor;
    }

    public BloodType GetBloodType() {
        return blood_type;
    }

    public void SetBloodType(BloodType bloodType) {
        this.blood_type = bloodType;
    }

    public RhFactor GetRhFactor() {
        return rh_factor;
    }

    public void SetRhFactor(RhFactor rhFactor) {
        this.rh_factor = rhFactor;
    }

}