package edu.towson.insure;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        //Lifetime of creds object only lasts until end of try/catch
        try (SensitiveObject creds = new SensitiveObject()) {

            creds.append(new TestObj(123456789, "John"));
            System.out.println(creds.read());

            //Add Equals Method

            pausesProgram();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        pausesProgram();

    }

    private static void pausesProgram() {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }
}
