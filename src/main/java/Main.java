import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Создаём экземпляр класса Scanner.
        // Используем один экземпляр класса во всей программе.
        Scanner scanner = new Scanner(System.in);
        String carTitle = "";
        int carSpeed = 0;
        ArrayList<Car> cars = new ArrayList<>();

        // Запрашиваем и читаем название и скорость для трёх автомобилей
        for (int numCar = 1; numCar <= 3; numCar++) {
            try {
                System.out.println("— Введите название машины №" + numCar + ":");
                carTitle = scanner.next().trim();

            } catch (Exception e) {
                System.out.println("Введите корректные данные");
            }
            while (true) {
                try {
                    System.out.println("— Введите скорость машины №" + numCar + ": ");
                    if (scanner.hasNextInt()) {
                        carSpeed = scanner.nextInt();
                        if (carSpeed >= 0 && carSpeed <= 250) {
                            break;
                        }
                        System.out.println("— Неправильная скорость ");
                    } else {
                        System.out.println("— Неправильная скорость ");
                        scanner.next();
                    }
                } catch (Exception e) {
                    System.out.println("— Неправильная скорость ");
                }

            }
            cars.add(new Car(carTitle, carSpeed));
        }

        String leaderTitleInRace = Race.leader(cars);
        System.out.println("Самая быстрая машина: " + leaderTitleInRace);

    }
}
