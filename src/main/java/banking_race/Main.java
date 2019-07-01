package banking_race;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        for (int i = 0; i < 3000; i++){
            if (i%2==0) {
                bank.dodajZleceniePrzelewu(5, KierunekPrzelewu.PRZYCHODZĄCE);
            }
            if (i%2!=0) {
                bank.dodajZleceniePrzelewu(5, KierunekPrzelewu.WYCHODZĄCE);
            }

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bank.sprawdzStanKonta();

    }
}
