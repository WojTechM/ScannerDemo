package com.codecool;

import java.util.Scanner;

/**
 * @author Wojciech Makieła
 */
class LoginController {

    private final Scanner scanner;

    public LoginController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void login() {
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        System.out.println("Login: " + login + " " + password);
    }
}
