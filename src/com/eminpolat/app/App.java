package com.eminpolat.app;

import com.eminpolat.exception.IndeterminedException;
import com.eminpolat.exception.UndefinedException;
import com.eminpolat.util.MathUtil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        try {
            double val = kb.nextDouble();
            double result = MathUtil.log10(val);

            System.out.printf("log10(%f) = %f%n", val, result);
        }
        catch (IndeterminedException ignore) {
            System.out.println("Belirsiz...");
        }
        catch (UndefinedException ignore) {
            System.out.println("Tanımsız...");
        }
        catch (InputMismatchException ignore) {
            System.out.println("Hatalı değer girildi...");
        }
        finally {
            System.out.println("Program sonu...");
        }

    }
    public static void main(String [] args)
    {
        run();
    }
}
