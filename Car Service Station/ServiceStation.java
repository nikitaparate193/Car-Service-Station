import java.util.*;

class ServiceStation {
    protected List<Service> services;

    public ServiceStation() {
        services = new ArrayList<>();
        services.add(new Service("BS01", "Basic Servicing", 2000, 4000, 5000));
        services.add(new Service("EF01", "Engine Fixing", 5000, 8000, 10000));
        services.add(new Service("CF01", "Clutch Fixing", 2000, 4000, 6000));
        services.add(new Service("BF01", "Brake Fixing", 1000, 1500, 2500));
        services.add(new Service("GF01", "Gear Fixing", 3000, 6000, 8000));
    }

    public Service findServiceByCode(String serviceCode) {
        for (Service service : services) {
            if (service.getCode().equals(serviceCode)) {
                return service;
            }
        }
        return null;
    }
}
