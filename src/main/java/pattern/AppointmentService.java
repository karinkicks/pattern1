package pattern;

import pattern.appointment.Appointment;
import pattern.appointment.AppointmentFromManager;
import pattern.appointment.AppointmentFromPatient;

import java.util.NoSuchElementException;

public class AppointmentService {
    public static final String FROM_MANAGER = "from_manager";
    public static final String FROM_PATIENT = "from_patient" ;

    public Appointment createAppointment(String creator){
        if(creator.equals(FROM_MANAGER)){
            return new AppointmentFromManager();
        }
        else if(creator.equals(FROM_PATIENT)){
            return new AppointmentFromPatient();
        }else{
            throw new NoSuchElementException("нет такого варианта создания записи на прием");
        }
    }

    private static final AppointmentService instance = new AppointmentService();

    public static AppointmentService getInstance() {
        return instance;
    }
    private AppointmentService(){}
}
