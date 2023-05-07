package by.pvt.lessons10;

public class RobotBuildar implements Robot,RobotEngineer {
    private String model;
    private int powerConsumption;
    private String manufacturerCountry;
    private String unitForBuilding;
    private String material;
    private boolean isSwitch;


    @Override
    public void createRobot() {
        model = "Builder 2.0";
        powerConsumption = 100;
        manufacturerCountry = "Китай";
        unitForBuilding = "клешни и молоток";
        material = "карбон";
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
            unitForBuilding = agregat;
            System.out.println("вы заменяете агрегат для строительства");
        } else {
            System.out.println("чтобы заменить агрегат выключите робота");
        }
    }


    public void powerOnRobot() {
        isSwitch=true;
        System.out.println("Робот строитель включен");

    }


    public void powerOffRobot() {
        isSwitch=false;
        System.out.println("Робот строитель выключен");


    }
    @Override
    public void uniquePossibility() {
        if (isSwitch) {
            System.out.println("Робот " + model + " начинает строить!");
        } else {
            System.out.println("для проверки спосоностей необходимо включить робота!");
        }

    }

    @Override
    public void say() {
        if(isSwitch){
        System.out.println("робот строитель рассказывает что строит.");
        }else{
            System.out.println("чтобы робот говорил необходимо его включить!");
        }
    }

    @Override
    public String toString() {
        return "RobotBuildar{" +
                "model='" + model + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", unitForBuilding='" + unitForBuilding + '\'' +
                ", material='" + material + '\'' +
                ", isSwitch=" + isSwitch +
                '}';
    }

}
