package by.pvt.lessons10;

public class RobotCock implements Robot {
    private String model;
    private int powerConsumption;
    private String powerSupplyModel;
    private String manufacturerCountry;
    private String agregatDlyaPrigotovleniya;
    private String material;
    private boolean isSwitch;


    @Override
    public void createRobot() {
        model = "Повар2000";
        powerConsumption = 100;
        manufacturerCountry = "Китай";
        agregatDlyaPrigotovleniya = "сковорода и лопатка";
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

    @Override
    public void reAgregat(String agregat) {
        if (!isSwitch) {
            agregatDlyaPrigotovleniya = agregat;
            System.out.println("вы заменяете агрегат для приготовления");
        } else {
            System.out.println("чтобы заменить агрегат выключите робота");
        }
    }

    @Override
    public void powerOnRobot() {
        isSwitch = true;
        System.out.println("Робот включен");
    }

    @Override
    public String toString() {
        return "RobotCock{" + "model='" + model + '\'' + ", powerConsumption=" + powerConsumption + ", powerSupplyModel='" + powerSupplyModel + '\'' + ", manufacturerCountry='" + manufacturerCountry + '\'' + ", agregatDlyaPrigotovleniya='" + agregatDlyaPrigotovleniya + '\'' + ", material='" + material + '\'' + ", isSwitch=" + isSwitch + '}';
    }

    @Override
    public void powerOffRobot() {
        isSwitch = false;
        System.out.println("Робот выключен");
    }

    @Override
    public void uniquePossibility() {
        if (isSwitch) {
            System.out.println("Робот " + model + " начинает готовить!");
        } else {
            System.out.println("для проверки спосоностей необходимо включить робота!");
        }
    }
}
