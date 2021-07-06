package pattern1.appointment;

import pattern1.doc.DocPackage;
import pattern1.patient.Patient;
import pattern1.service.Service;
import pattern1.slot.Slot;

public interface Appointment {
    DocPackage createDocPackage(DocPackage docPackage);
    Patient addPatient(Patient patient);
    Service addService(Service service);
    Slot addSlot(Slot slot);
}
