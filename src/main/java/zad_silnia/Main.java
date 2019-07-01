package zad_silnia;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ZadanieSilnia z1 = new ZadanieSilnia(5);
        ZadanieSilnia z2 = new ZadanieSilnia(7);
        ZadanieSilnia z3 = new ZadanieSilnia(12);
        ZadanieSilnia z4 = new ZadanieSilnia(1);
        ZadanieSilnia z5 = new ZadanieSilnia(13);


        Thread[] threads = new Thread[5];
        threads[0] = new Thread(z1);
        threads[1] = new Thread(z2);
        threads[2] = new Thread(z3);
        threads[3] = new Thread(z4);
        threads[4] = new Thread(z5);

        System.out.println("Wątki zakończyły pracę, wyniki:");

        for (Thread thread : threads) {
            thread.start();
            thread.join();
        }

        System.out.println("Kończę pracę.");
    }
}
