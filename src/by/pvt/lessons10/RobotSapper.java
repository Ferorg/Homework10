package by.pvt.lessons10;

public class RobotSapper implements Robot, RobotEngineer {

    private String model;
    private int powerConsumption;
    private String deminingAgent;
    private String manufacturerCountry;
    private String material;
    private boolean isSwitch;

    @Override
    public void createRobot() {
        model = "Минер 1";
        powerConsumption = 100;
        manufacturerCountry = "Китай";
        deminingAgent = "пассатижи";
        material = "сталь";
        isSwitch = false;

    }

    @Override
    public void repairRobot() {
        powerOffRobot();
        System.out.println("робот готов к починке");
        for (int i = 0; i <= 10; i++) {
            System.out.println("починка робота завершена на " + i * 10 + "%");
        }
        System.out.println("Починка завершена.Робот готов к работе");
        powerOnRobot();
    }

    public void say() {
        if (isSwitch) {
            System.out.println("робот сапер рассказывает свои действия по разминированию");
        } else {
            System.out.println("чтобы робот говорил необходимо его включить!");
        }
    }

    @Override
    public void reAgregat(String agregat) {
        if (!isSwitch) {
            deminingAgent = agregat;
            System.out.println("вы заменяете агрегат для разминирования");
        } else {
            System.out.println("чтобы заменить агрегат выключите робота");
        }

    }

    @Override
    public void powerOnRobot() {
        isSwitch = true;
        System.out.println("Робот строитель включен");

    }

    @Override
    public void powerOffRobot() {
        isSwitch = false;
        System.out.println("Робот строитель выключен");


    }


    public void uniquePossibility() {
        if (isSwitch) {
            System.out.println("Робот " + model + " начинает разминировать мину перед ним!");
        } else {
            System.out.println("для проверки спосоностей необходимо включить робота!");
        }

    }


    public String toString() {
        return "RobotSapper{" +
                "model='" + model + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", deminingAgent='" + deminingAgent + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", material='" + material + '\'' +
                ", isSwitch=" + isSwitch +
                '}';
    }
}
