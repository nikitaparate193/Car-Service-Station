import java.util.*;

class Service {
    private String code;
    private String name;
    private int hatchbackPrice;
    private int sedanPrice;
    private int suvPrice;

    public Service(String code, String name, int hatchbackPrice, int sedanPrice, int suvPrice) {
        this.code = code;
        this.name = name;
        this.hatchbackPrice = hatchbackPrice;
        this.sedanPrice = sedanPrice;
        this.suvPrice = suvPrice;
    }

    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }

    public int getPrice(String carType) {
        if (carType.equals("Hatchback")) {
            return hatchbackPrice;
        } else if (carType.equals("Sedan")) {
            return sedanPrice;
        } else if (carType.equals("SUV")) {
            return suvPrice;
        }
        return 0;
    }
    

    
}
