package com.company;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Level level = null;
        Car car = null;
        Car opponentCar = null;
        System.out.println("Enter your name: ");
        String nameOfUser = scan.nextLine();
        User user = new User(nameOfUser, false);
        System.out.println("Do you want to buy a premium? It increases your speed to 50km/h \n" +
                "1. Yes \n" +
                "2. No");
        int answerOfUser = scan.nextInt();
        int premiumSpeed = 0;
        if (answerOfUser == 1){
            user.setSubscriptionChecker(true);
            premiumSpeed = premiumSpeed + 50;
        }
        user.update(new ArrayList<>());

        pause(4000);

        System.out.println("HELLO " + user.getName() + ". \n" +
                "You have to add few cars.\n" +
                "After you have to set map");
        System.out.println("Choose time of race:\n" +
                "1. Day\n" +
                "2. Night");
        int timeOfRace = scan.nextInt();

        pause(4000);

        System.out.println("Choose landscape of map:\n" +
                "1. Desert landscape\n" +
                "2. Temple landscape");
        int landscapeType = scan.nextInt();
        if (timeOfRace == 1){
            if (landscapeType == 1){
                level = new DayTimeBright((new DesertLevel(new DefaultLevel())));
            }
            else if(landscapeType == 2){
                level = new DayTimeBright((new TempleLevel(new DefaultLevel())));
            }
        }
        else if(timeOfRace == 2){
            if (landscapeType == 1){
                level = new DayTimeNight((new DesertLevel(new DefaultLevel())));
            }
            else if(landscapeType == 2){
                level = new DayTimeNight((new TempleLevel(new DefaultLevel())));
            }
        }
        System.out.println("Choose car:\n" +
                "1. Honda\n" +
                "2. Toyota\n" +
                "3. Mercedes");
        int typeOfCar = scan.nextInt();
        if (typeOfCar == 1){
            car = new Honda(5F, 400 + premiumSpeed, "Model 3", new DriftDrive(), new NoBibip());
        }
        else if(typeOfCar == 2){
            car = new Toyota(3.0F, 250 + premiumSpeed, "Model 2", new UnpleasantDrive(), new ClassicMusicBibip());
        }
        else if(typeOfCar == 3){
            car = new Mercedes(3.5F, 300 + premiumSpeed, "Model 5", new SmoothDrive(), new LoudBibip());
        }


        int randomOpponent =  (int)(Math.random() * 2);
        System.out.println(randomOpponent);
        if (randomOpponent == 0){
            opponentCar = new Honda(5F, 400, "Model 3", new DriftDrive(), new NoBibip());
        }
        else if(randomOpponent == 1){
            opponentCar = new Toyota(3.0F, 250, "Model 2", new UnpleasantDrive(), new ClassicMusicBibip());
        }
        else if(randomOpponent == 2){
            opponentCar = new Mercedes(3.5F, 300, "Model 5", new SmoothDrive(), new LoudBibip());
        }
        System.out.println(level.generateLevel());
        System.out.println("\n\n");

        pause(4000);

        System.out.println("Your car: \n");
        car.display();
        car.performDrive();
        car.performBibip();

        System.out.println("\n\n");

        pause(4000);

        System.out.println("Your opponent's car: \n");
        opponentCar.display();
        opponentCar.performDrive();
        opponentCar.performBibip();
        System.out.println("\n\n");

        pause(4000);

        if (car.getMaxSpeed() > opponentCar.getMaxSpeed()){
            System.out.println("U won because your speed is " + car.getMaxSpeed() + " and opponents speed is " + opponentCar.getMaxSpeed());
        }
        else if(car.getMaxSpeed() == opponentCar.getMaxSpeed()){
            System.out.println("Draw because your speed is " + car.getMaxSpeed() + " and opponents speed is " + opponentCar.getMaxSpeed());
        }
        else {
            System.out.println("You lost because your speed is " + car.getMaxSpeed() + " and opponents speed is " + opponentCar.getMaxSpeed());
        }

        pause(4000);

        System.out.println("Thank you for playing!");
    }
}