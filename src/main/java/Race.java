import java.util.ArrayList;


class Race {
    static int HOURS = 24;
    static String leaderTitle = "";
    static int leaderSpeed = 0;
    static int leaderDistance = 0;

    public static String leader(ArrayList<Car> cars) {
        //leaderDistance = hours * скорость (вводит пользователь)
        for (Car car : cars) {
            if (car.speed > leaderSpeed) {
                leaderSpeed = car.speed;
                leaderTitle = car.title;
                leaderDistance = HOURS * car.speed;
            }
        }

        return leaderTitle;
    }
}
