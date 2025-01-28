import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Приветсьввую вас на гонке «24 часа Ле-Мана»!");
        Scanner scanner = new Scanner(System.in);
        Race carLeader = new Race();

        for(int i = 1; i <= 3; ++i) {
            System.out.println("— Введите название машины №" + i + ":");
            String inCarBrand = scanner.next();
            System.out.println("— Введите скорость машины №" + i + ":");
            int inCarSpeed = currectSpeed(scanner);
            carLeader.makeRace(new Car(inCarBrand, inCarSpeed));
        }

        if (carLeader.draw == 0) {
            System.out.println("Победитель гонки «24 часа Ле-Мана»: " + carLeader.leadRace);
        }

        if (carLeader.draw == -1) {
            System.out.println("Победитель гонки «24 часа Ле-Мана» не установлен, так как ничья");
        }
    }

    public static int currectSpeed(Scanner scanner1) {
        while(true) {
            int carSpeed = scanner1.nextInt();
            if (carSpeed >= 0 && carSpeed <= 250) {
                return carSpeed;
            }
            System.out.println("Неправильная скорость. Введите скорость в диапозоне от 0 до 250");
        }
    }
}


