package pattern.appointment;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class AppointmentFromManagerIdentityMap {
    AppointmentFromManagerMapper appointmentFromManagerMapper;

    private final Map<Long, AppointmentFromManager> appointmentFromManagerMap = new HashMap<>();

    public AppointmentFromManagerIdentityMap(AppointmentFromManagerMapper appointmentFromManagerMapper) {
        this.appointmentFromManagerMapper = appointmentFromManagerMapper;
    }

    public void addAppointment(AppointmentFromManager appointmentFromManager) {
        appointmentFromManagerMap.put(appointmentFromManager.getId(), appointmentFromManager);
    }

    public AppointmentFromManager getAppointment(Long id) throws SQLException {
        if (appointmentFromManagerMap.get(id) == null) {
            addAppointment(appointmentFromManagerMapper.findById(id));
        } else {
            throw new NoSuchElementException();
        }
        return appointmentFromManagerMap.get(id);
    }

    public void deleteAppointment(Long id){
        if (appointmentFromManagerMap.get(id) == null) {
            throw new NoSuchElementException();
        } else {
            appointmentFromManagerMap.remove(id);
        }
    }




}
