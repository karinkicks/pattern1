package pattern1.service;

public class ServiceByManager implements Service {
    @Override
    public Service getService() {
        return new ServiceByManager();
    }
}
