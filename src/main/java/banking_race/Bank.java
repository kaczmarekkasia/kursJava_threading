package banking_race;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    ExecutorService serwer = Executors.newFixedThreadPool(5);
    KontoBankowe kontoBankowe = new KontoBankowe();

    public void dodajZleceniePrzelewu(double kwota, KierunekPrzelewu kierunek){
       Zlecenie zlecenie = new Zlecenie(kontoBankowe, kwota, kierunek);
       serwer.submit(zlecenie);
    }

    public void sprawdzStanKonta(){
        System.out.println(kontoBankowe.stanKonta);
    }
}
