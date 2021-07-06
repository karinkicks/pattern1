package pattern1.appointment;

import pattern1.doc.DocPackage;
import pattern1.doc.DocPackageByManager;
import pattern1.patient.Patient;
import pattern1.patient.PatientByManager;
import pattern1.service.Service;
import pattern1.service.ServiceByManager;
import pattern1.slot.Slot;
import pattern1.slot.SlotByManager;

public class AppointmentFromManager implements Appointment{
    @Override
    public DocPackage createDocPackage(DocPackage docPackage) {
        return new DocPackageByManager();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return new PatientByManager();
    }

    @Override
    public Service addService(Service service) {
        return new ServiceByManager();
    }

    @Override
    public Slot addSlot(Slot slot) {
        return new SlotByManager();
    }

}
