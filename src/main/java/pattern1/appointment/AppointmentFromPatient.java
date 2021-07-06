package pattern1.appointment;

import pattern1.doc.DocPackage;
import pattern1.doc.DocPackageByPatient;
import pattern1.patient.Patient;
import pattern1.patient.PatientByPatient;
import pattern1.service.Service;
import pattern1.service.ServiceByPatient;
import pattern1.slot.Slot;
import pattern1.slot.SlotByPatient;

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
