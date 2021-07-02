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
    public DocPackage createDocPackage() {
        return new DocPackageByPatient();
    }

    @Override
    public Patient addPatient() {
        return new PatientByPatient();
    }

    @Override
    public Service addService() {
        return new ServiceByPatient();
    }

    @Override
    public Slot addSlot() {
        return new SlotByPatient();
    }

}
