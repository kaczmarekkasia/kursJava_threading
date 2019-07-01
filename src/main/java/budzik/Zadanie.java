package budzik;

public class Zadanie implements Runnable {
    private String comannd;

    public Zadanie(String comannd) {
        this.comannd = comannd;
    }

    public void setComannd(String comannd) {
        this.comannd = comannd;
    }

    public void run() {
        if (comannd.equalsIgnoreCase("teraz")) {

            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("co teraz?");
        }
    }
}
