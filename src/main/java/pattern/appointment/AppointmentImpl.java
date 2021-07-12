package pattern.appointment;

import pattern.patient.Patient;
import pattern.service.Service;
import pattern.slot.Slot;

import java.time.LocalDateTime;

public abstract class AppointmentImpl implements Appointment{
    private Long id;
    private LocalDateTime createdAt;
    private Slot slot;
    private Patient patient;
    private Service service;

    public AppointmentImpl(Long id, LocalDateTime createdAt, Slot slot, Patient patient, Service service) {
        this.id = id;
        this.createdAt = createdAt;
        this.slot = slot;
        this.patient = patient;
        this.service = service;
    }

    public AppointmentImpl() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
