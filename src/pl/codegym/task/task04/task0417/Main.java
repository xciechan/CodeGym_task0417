package pl.codegym.task.task04.task0417;

import java.io.*;

/**
    Created by xciechan
    on 2023-03-17

    The application checks 3 numbers entered.
    If some numbers are the same, print them.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        int numberOne = readNumber();
        int numberTwo = readNumber();
        int numberThree = readNumber();

        printTheSameNumber(numberOne, numberTwo, numberThree);

    }

    public static int readNumber () throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());

        return number;
    }

    public static void printTheSameNumber (int numberOne, int numberTwo, int numberThree){
        if (numberOne == numberTwo) {
            if (numberOne == numberThree)
                System.out.println(numberOne + " " + numberTwo + " " + numberThree);
            else
                System.out.println(numberOne + " " + numberTwo);
        }
        else if (numberOne == numberThree)
                System.out.println(numberOne + " " + numberThree);

        else if (numberTwo == numberThree)
            System.out.println(numberTwo + " " + numberThree);

    }
}