package pattern1;

import pattern1.appointment.Appointment;
import pattern1.doc.DocPackage;
import pattern1.patient.Patient;
import pattern1.service.Service;
import pattern1.slot.Slot;

public class MedicalApp {
    private static DocPackage docPackage;
    private static Patient patient;
    private static Service service;
    private static Slot slot;

    public static void main(String[] args) {
        String from_who="from_manager";
        Appointment appointment = AppointmentService.getInstance().createApplication(from_who);
        docPackage = appointment.createDocPackage();
        patient = appointment.addPatient();
        service = appointment.addService();
        slot = appointment.addSlot();
    }

}
