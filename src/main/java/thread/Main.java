package thread;

import thread.Zadanie;

public class Main {
    public static void main(String[] args) {

        Thread[] tablicaThreadow = new Thread[5];//wątek (coś co wykonuje zadania)

        for (int i=0; i<tablicaThreadow.length; i++){
            tablicaThreadow[i] = new Thread(new Zadanie("Marian " + i));
        }
        for (Thread thread : tablicaThreadow){
            thread.start();
        }

        for (Thread thread : tablicaThreadow) {
            try {
                thread.join(); //wymuszamy zakończenie danego wątku aby program poszedł dalej
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Koniec");

    }
}
