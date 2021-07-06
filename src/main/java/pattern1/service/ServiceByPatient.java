package pattern1.service;

public class ServiceByPatient implements Service {
    @Override
    public Service getService() {
        return new ServiceByPatient();
    }
}
