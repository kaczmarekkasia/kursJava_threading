package thread;

import java.util.Random;

public class Zadanie implements Runnable { //specjalnie po polsku, bo istnieje klasa Task, której nie nadpisujemy!!
    private String nazwaZadania;
    private int czasDoOdczekania;

    public Zadanie(String nazwaZadania) {
        this.nazwaZadania = nazwaZadania;
        this.czasDoOdczekania = new Random().nextInt((1000)+1);
    }

    public void run() {
        //to jest metoda która się wywoła kiedy program wystartuje

        try {
            Thread.sleep(czasDoOdczekania);
        } catch (InterruptedException e) {
            e.printStackTrace(); //może się okazać że okres przespania jest "za długi" i wtedy w Mainie możemy go "wybudzić" Interrup
        }

        System.out.println("Siema! Jestem " + nazwaZadania + " " + czasDoOdczekania);
    }
}
