package pattern1.appointment;

import pattern1.doc.DocPackage;
import pattern1.patient.Patient;
import pattern1.service.Service;
import pattern1.slot.Slot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeAppointment implements Appointment{
    List<Appointment> appointments = new ArrayList<>();

    @Override
    public DocPackage createDocPackage(DocPackage docPackage) {
        for (Appointment operation : appointments) {
            operation.createDocPackage(docPackage);
        }
        return docPackage;
    }

    @Override
    public Patient addPatient(Patient patient) {
        for (Appointment operation : appointments) {
            operation.addPatient(patient);
        }
        return patient;
    }

    @Override
    public Service addService(Service service) {
        for (Appointment operation : appointments) {
            operation.addService(service);
        }
        return service;
    }

    @Override
    public Slot addSlot(Slot slot) {
        for (Appointment operation : appointments) {
            operation.addSlot(slot);
        }
        return slot;
    }

    public Appointment add(Appointment... operations) {
        this.appointments.addAll(Arrays.asList(operations));
        return this;
    }

}
