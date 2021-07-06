package pattern1;

import pattern1.appointment.Appointment;
import pattern1.appointment.CompositeAppointment;
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
        String from_who1="from_patient";
        Appointment appointment = AppointmentService.getInstance().createAppointment(from_who);
        Appointment appointment1 = AppointmentService.getInstance().createAppointment(from_who1);
        Appointment appointment2 = AppointmentService.getInstance().createAppointment(from_who);
        docPackage = appointment.createDocPackage(docPackage);
        patient = appointment.addPatient(patient);
        service = appointment.addService(service);
        slot = appointment.addSlot(slot);

        Appointment appointments = new CompositeAppointment().add(appointment, appointment1, appointment2);
        service = appointments.addService(service);

    }

}
