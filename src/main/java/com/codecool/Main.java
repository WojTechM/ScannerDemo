package com.codecool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Starter class
 *
 * @author Wojciech Makieła
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        if (args.length > 0) {
            scanner = new Scanner(new File(args[0]));
        } else {
            scanner = new Scanner(System.in);
        }
        Pattern delimiter = scanner.delimiter();
        new LoginController(scanner).login();
        new MentorController(scanner).run();
        System.out.println("Hello!");
    }
}

