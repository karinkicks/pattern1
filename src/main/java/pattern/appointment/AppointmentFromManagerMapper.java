package pattern.appointment;

import pattern.patient.Patient;
import pattern.service.Service;
import pattern.slot.Slot;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AppointmentFromManagerMapper {
    Connection connection;

    public AppointmentFromManagerMapper(Connection connection){
        this.connection=connection;
    }

    public AppointmentFromManager findById(Long idAppointment) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, CREATED_AT, SLOT, PATIENT, SERVICE FROM APPOINTMENT WHERE IDPERSON = ?");
        statement.setLong(1,idAppointment);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                AppointmentFromManager appointment = new AppointmentFromManager();
                appointment.setId(resultSet.getLong(1));
                appointment.setCreatedAt(resultSet.getObject(2, LocalDateTime.class));
                appointment.setSlot(resultSet.getObject(3, Slot.class));
                appointment.setPatient(resultSet.getObject(4, Patient.class));
                appointment.setService(resultSet.getObject(4, Service.class));
                return appointment;
            }
        }

        throw new NoSuchElementException();
    }

    public void insert(AppointmentFromManager appointment) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "insert into APPOINTMENT (ID, CREATED_AT, SLOT, PATIENT, SERVICE) VALUES (?,?,?,?,?)");
        try {
            statement.setLong(1, appointment.getId());
            statement.setObject(2, appointment.getCreatedAt());
            statement.setObject(3, appointment.getSlot());
            statement.setObject(3, appointment.getPatient());
            statement.setObject(3, appointment.getService());

            int row = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<AppointmentFromManager> findAll() throws SQLException{
        List<AppointmentFromManager> arrayList = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement(
                "select ID, CREATED_AT, SLOT, PATIENT, SERVICE from  APPOINTMENT");
        try (ResultSet resultSet = statement.executeQuery()){
            while (resultSet.next()) {
                AppointmentFromManager appointment= new AppointmentFromManager(resultSet.getLong(1), resultSet.getObject(2, LocalDateTime.class), resultSet.getObject(3, Slot.class), resultSet.getObject(4, Patient.class), resultSet.getObject(5, Service.class));
                arrayList.add(appointment);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return arrayList;
    }

    public void delete(AppointmentFromManager appointment) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "delete from APPOINTMENT where ID=?");
        try {
            statement.setLong(1, appointment.getId());

            int row = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void update(AppointmentFromManager appointment) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "update APPOINTMENT set CREATED_AT=?, SLOT=?, PATIENT=?, SERVICE=? where ID=?");
        try {
            statement.setObject(1, appointment.getCreatedAt());
            statement.setObject(2, appointment.getSlot());
            statement.setObject(3, appointment.getPatient());
            statement.setObject(4, appointment.getService());
            statement.setLong(5, appointment.getId());

            int row = statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
