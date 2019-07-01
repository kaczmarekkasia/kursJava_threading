package banking_race;

public class KontoBankowe {
    public double stanKonta;
    private final Object lock = new Object();

    public void  przelewPrzychodzący(double kwota){
        synchronized (lock) {
            stanKonta += kwota;
        }
    }

    public void przelewWychodzący(double kwota){
        synchronized (lock) {
            stanKonta -= kwota;
        }
    }
}
