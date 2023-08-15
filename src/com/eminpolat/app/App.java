package com.eminpolat.app;

import com.eminpolat.exception.MathException;
import com.eminpolat.util.Console;
import com.eminpolat.util.MathUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static void run()
    {
        try {
            double val = Console.readDouble("Bir sayı giriniz:", "Hatalı giriş yaptınız!...");

            Console.writeLine("log10(%f) = %f", val, MathUtil.log10(val));
        }
        catch (MathException ex) {
            Console.writeLine("Message:%s, Status:%s", ex.getMessage(), ex.getMathExceptionStatus());
        }

    }
    public static void main(String [] args)
    {
        run();
    }
}
