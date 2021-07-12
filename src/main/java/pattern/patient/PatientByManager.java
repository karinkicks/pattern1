package pattern.patient;

public class PatientByManager implements Patient {
    @Override
    public Patient getPatient() {
        return new PatientByManager();
    }
}
