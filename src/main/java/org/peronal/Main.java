package org.peronal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanClass conv = new RomanClass();

        System.out.println("Welcome To Roman Converter Validator");
        int input;
        String res;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Select Option: \n1) Roman to Integer \n2) Integer to Roman \n");
            input = GetInput.getOption(sc);
            res = String.valueOf(input == 1 ? conv.RomanToint(sc) : conv.IntToRoman(sc));
        } catch (Exception e) {

        }

    }

}