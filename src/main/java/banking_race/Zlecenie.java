package banking_race;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Zlecenie implements Runnable {
    private KontoBankowe kontoNaKtorePrzelacPieniadze;
    double kwota;
    KierunekPrzelewu kierunek;


    public void run() {
        if (kierunek.equals(KierunekPrzelewu.PRZYCHODZĄCE)){
            kontoNaKtorePrzelacPieniadze.przelewPrzychodzący(kwota);
        }
        if (kierunek.equals(KierunekPrzelewu.WYCHODZĄCE)){
            kontoNaKtorePrzelacPieniadze.przelewWychodzący(kwota);
        }
    }
}
