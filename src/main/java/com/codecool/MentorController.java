package com.codecool;

import java.util.Scanner;

/**
 * @author Wojciech Makieła
 */
class MentorController {

    private final Scanner scanner;

    public MentorController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean isRunning = true;
        while (isRunning) {
            String input = scanner.nextLine();
            // switch
            System.out.println(input);
            if ("0".equals(input)) {
                isRunning = false;
            }
        }
    }
}
