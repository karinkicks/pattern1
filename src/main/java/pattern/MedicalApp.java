package pattern;

import pattern.appointment.Appointment;
import pattern.appointment.CompositeAppointment;
import pattern.doc.DocPackage;
import pattern.listeners.ScoreboardListener;
import pattern.listeners.WorkEmailListener;
import pattern.patient.Patient;
import pattern.producer.Editor;
import pattern.service.Service;
import pattern.slot.Slot;

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

        //подписка
        Editor editor = new Editor();
        editor.events.subscribe("Ivanov", new ScoreboardListener("Табло в регистратуре"));
        editor.events.subscribe("Volkov", new WorkEmailListener("admin@example.com"));
        editor.visitDoctor("Ivanova", slot);

    }

}
