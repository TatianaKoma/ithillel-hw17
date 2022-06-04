
import enums.Message;
import service.ActionService;

import java.util.Scanner;

public class Main {

    public final static String PATH = "src/main/resources/files/library.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ActionService actionService = new ActionService(scanner, PATH);

        System.out.println(Message.HELLO.getValue());
        String command;
        do {
            command = scanner.nextLine().toLowerCase();
            actionService.getAction(command).run();
        } while (!command.equals("exit"));
    }
}
