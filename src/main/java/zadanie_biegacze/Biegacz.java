package zadanie_biegacze;

import java.util.Random;

public class Biegacz implements Runnable{
    private String name;
    private int distance = 0;

    public Biegacz(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void run(){
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }

            int distanceReached = new Random().nextInt((10) + 1);
            System.out.println("Jestem " + name + " przebiegłem " + distanceReached);
            distance += distanceReached;

        }
    }
}
