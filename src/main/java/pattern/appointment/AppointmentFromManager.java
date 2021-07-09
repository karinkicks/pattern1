package pattern.appointment;

import pattern.doc.DocPackage;
import pattern.doc.DocPackageByManager;
import pattern.patient.Patient;
import pattern.patient.PatientByManager;
import pattern.service.Service;
import pattern.service.ServiceByManager;
import pattern.slot.Slot;
import pattern.slot.SlotByManager;

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
