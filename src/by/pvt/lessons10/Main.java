package by.pvt.lessons10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Robot robot1 = new RobotCock();
        Robot robot2 = new RobotBuildar();
        Robot robot3 = new RobotSapper();
        boolean flag = true;
        int choice = 0;
        System.out.println("Добро пожаловать на выставку роботов");
        do {
            System.out.println("Выберите какую выставку хотите посетить:");
            System.out.println("1) Общая выставка \n2)Выставка инженерных роботов \n3)Выставка робота сапера \n4)Выход");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали первую выставку. 1 экспонат это робот повар");
                    System.out.println(robot1.toString());
                    robot1.createRobot();
                    robot1.repairRobot();
                    robot1.powerOffRobot();
                    robot1.reAgregat("скалка");
                    robot1.powerOnRobot();
                    robot1.uniquePossibility();
                    System.out.println("2 экспонат это робот строитель");
                    System.out.println(robot2.toString());
                    robot2.createRobot();
                    robot2.repairRobot();
                    robot2.powerOffRobot();
                    robot2.reAgregat("молоток");
                    robot2.powerOnRobot();
                    robot2.uniquePossibility();
                    System.out.println("третий экспонат это робот сапер");
                    System.out.println(robot2.toString());
                    robot3.createRobot();
                    robot3.repairRobot();
                    robot3.powerOffRobot();
                    robot3.reAgregat("кусачки");
                    robot3.powerOnRobot();
                    robot3.uniquePossibility();
                    break;
                case 2:
                    System.out.println("Вы выбрали вторую выставку. 1 экспонат это робот строитель");
                    System.out.println(robot2.toString());
                    robot2.createRobot();
                    robot2.repairRobot();
                    robot2.powerOffRobot();
                    robot2.reAgregat("молоток");
                    robot2.powerOnRobot();
                    robot2.uniquePossibility();
                    System.out.println("второй экспонат это робот сапер");
                    System.out.println(robot3.toString());
                    robot3.createRobot();
                    robot3.repairRobot();
                    robot3.powerOffRobot();
                    robot3.reAgregat("кусачки");
                    robot3.powerOnRobot();
                    robot3.uniquePossibility();
                    break;
                case 3:
                    System.out.println("Вы выбрали третью выставку .  экспонат это робот сапер");
                    System.out.println(robot3.toString());
                    robot3.createRobot();
                    robot3.repairRobot();
                    robot3.powerOffRobot();
                    robot3.reAgregat("кусачки");
                    robot3.powerOnRobot();
                    robot3.uniquePossibility();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("выберите другой номер");
                    break;
            }

        } while (flag);
    }

}
