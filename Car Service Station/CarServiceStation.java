import java.util.*;

public class CarServiceStation {
    public static void main(String[] args) {
        
        ServiceStation serviceStation = new ServiceStation();
        Scanner sc = new Scanner(System.in);

        List<Service> selectedServices = new ArrayList<>();
        int totalBill = 0;

        System.out.println("Welcome to the Car Service Station!");

        System.out.print("Enter the type of car (Hatchback, Sedan, SUV): ");
        String carType = sc.next();
        Car car = new Car(carType);

        while (true) {
            System.out.println("\nAvailable Services:");
            for (Service service : serviceStation.services) {
                System.out.println(service.getCode() + " - " + service.getName());
            }

            System.out.print("Enter the service code (or 'done' to finish selecting services): ");
            String serviceCode = sc.next();

            if (serviceCode.equals("done")) {
                break;
            }

            Service service = serviceStation.findServiceByCode(serviceCode);
            if (service != null) {
                selectedServices.add(service);
                totalBill += service.getPrice(carType);
                System.out.println("Added " + service.getName() + " to the bill.");
            } else {
                System.out.println("Invalid service code.");
            }
        }

        System.out.println("\nBill Details:");
        System.out.println("Type of Car: " + car.getCarType());
        System.out.println("Services:");

        for (Service service : selectedServices) {
            System.out.println(service.getName() + " - Rs." + service.getPrice(carType) + "/-");
        }

        if (totalBill > 10000) {
            System.out.println("Complimentary Cleaning: Yes");
        }

        System.out.println("Total Bill: RS." + totalBill + "/-");
        System.out.println("Thank you for choosing our service!");
        sc.close();




    }
}
