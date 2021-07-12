package pattern.service;

public class ServiceByPatient implements Service {
    @Override
    public Service getService() {
        return new ServiceByPatient();
    }
}
