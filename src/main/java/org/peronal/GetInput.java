package org.peronal;

import java.util.Scanner;

public class GetInput {

    static int getOption(Scanner sc) throws SelectionInvalidExceoption {
        int input ;//= Integer.parseInt(sc.nextLine());
        if (sc.hasNextInt()) {
            input = Integer.parseInt(sc.nextLine());
            return input;
        } else {
           throw new SelectionInvalidExceoption("Invalid Input!");
        }
    }
}
