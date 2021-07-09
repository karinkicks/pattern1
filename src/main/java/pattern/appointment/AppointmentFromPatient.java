package pattern.appointment;

import pattern.doc.DocPackage;
import pattern.doc.DocPackageByPatient;
import pattern.patient.Patient;
import pattern.patient.PatientByPatient;
import pattern.service.Service;
import pattern.service.ServiceByPatient;
import pattern.slot.Slot;
import pattern.slot.SlotByPatient;

public class AppointmentFromPatient implements Appointment{
    @Override
    public DocPackage createDocPackage(DocPackage docPackage) {
        return new DocPackageByPatient();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return new PatientByPatient();
    }

    @Override
    public Service addService(Service service) {
        return new ServiceByPatient();
    }

    @Override
    public Slot addSlot(Slot slot) {
        return new SlotByPatient();
    }

}
