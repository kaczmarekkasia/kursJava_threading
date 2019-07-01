package zadanie_biegacze;

import zadanie_biegacze.Biegacz;

public class MainBiegacze {
    public static void main(String[] args) {
        // 1. Zadaniem (przekazywanym do wątku) będzie obiekt klasy biegacz (to co robi biegacz)
        // 2. Wewnątrz metody run biegacz ma zawsze przesypiać 1000ms i losować liczbę.
        // Wylosowana liczba to będzie dystans który on przebiegł (np do 10; mają przebec 100).
        // Po przebiegnięciu (wykonaniu) biegacz ma wypisać ile przebiegł. W biegaczu (klasie) musi znajdować
        // się pole dystansu który przebiegł. Do pola sumujemy wszytskie odcinki które przebiegł.
        // Pole musi mieć getter.
        // 3. W metodzie Mian wystartujemy wszytskie wątki.
        // 4. Metoda Main powinna mieć pętle while w której co 3000ms wywołuje metodę getterta i pobiera ptrzebiegnięty\
        // dystans z każdego z biegaczy (biegacze i : wszytskie dystanse po kolei)
        // 5. Biegacze mają przebiec dystans do 100, losujemy im dystans po 10.
        // 6. Na koniec Main'a wątek main powinien robić Join wszystkich wątków.
        // 7. Na koniec Maina po join;ach powinien być wypisany komunikat "Koniec"


        Biegacz b1 = new Biegacz("Marek");
        Biegacz b2 = new Biegacz("Ula");
        Biegacz b3 = new Biegacz("Olek");
        Biegacz b4 = new Biegacz("Maks");
        Biegacz b5 = new Biegacz("Juzia");

        Biegacz[] biegacze = new Biegacz[5];
        biegacze[0] = b1;
        biegacze[1] = b2;
        biegacze[2] = b3;
        biegacze[3] = b4;
        biegacze[4] = b5;

        Thread[] threads = new Thread[5];
        for (int i=0; i < threads.length; i++){
            threads[i]=new Thread(biegacze[i]);
        }

        for (int i=0; i < threads.length; i++){
            threads[i].start();
        }

        boolean czyKtosSkonczyl = false;
        while (!czyKtosSkonczyl){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Biegacze przebiegli: ");
            for (int i=0; i <biegacze.length; i++){
                System.out.print(biegacze[i].getDistance() + " ");
                if (biegacze[i].getDistance() >= 100) {
                    czyKtosSkonczyl = true;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < threads.length; i++){
            threads[i].interrupt();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                break;
            }
        }

    }
}
