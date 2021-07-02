package pattern1.patient;

public class PatientByPatient implements Patient {
    @Override
    public Patient getPatient() {
        return new PatientByPatient();
    }
}
