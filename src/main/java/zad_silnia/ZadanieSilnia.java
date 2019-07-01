package zad_silnia;

import java.util.List;

public class ZadanieSilnia implements Runnable {

    private int liczba;
    private int silniaZLiczby;
    private final Object lock = new Object();

    public ZadanieSilnia(int liczba) {
        this.liczba = liczba;
    }

    public void run() {
        synchronized (lock) {


            for (int i = 0; i <= liczba; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("silnia: "+ liczba + " = " + silniaRekurencyjnie(liczba));
        }
    }





    private int silniaRekurencyjnie(int liczba){
        {
            if (liczba < 1)
                return 1;
            else
                return liczba * silniaRekurencyjnie(liczba - 1);
        }
    }

}

