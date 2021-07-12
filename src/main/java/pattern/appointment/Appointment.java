package pattern.appointment;

import pattern.doc.DocPackage;
import pattern.patient.Patient;
import pattern.service.Service;
import pattern.slot.Slot;

public interface Appointment {
    DocPackage createDocPackage(DocPackage docPackage);
    Patient addPatient(Patient patient);
    Service addService(Service service);
    Slot addSlot(Slot slot);
}
