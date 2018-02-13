package utils;

import java.util.Scanner;

public class ConsoleInteractor implements UserInteractor {

    private Scanner sc = new Scanner(System.in);
    @Override
    public String readCommand() throws UserInteractorReadException {
        return sc.nextLine();
    }

    @Override
    public void print(String output) throws UserInteractorWriteException {
        System.out.println(output);
    }
}
