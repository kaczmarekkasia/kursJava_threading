package budzik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.println("Podaj komendę");
            command = scanner.nextLine();


        } while (!command.equalsIgnoreCase("teraz"));

        Thread thread = new Thread(new Zadanie(command));
        thread.start();

    }
}
