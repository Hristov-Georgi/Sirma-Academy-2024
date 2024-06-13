package classes.carInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInfoApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Car> carsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] carDataArr = sc.nextLine().split("\\s+");

            String brand = carDataArr[0];
            String model = carDataArr[1];
            int horsePower = Integer.parseInt(carDataArr[2]);

            Car car = new Car(brand, model, horsePower);
            carsList.add(car);
        }

        for (Car c : carsList) {
            c.carInfo();
        }
    }
}

