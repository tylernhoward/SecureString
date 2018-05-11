package edu.towson.insure;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        //Lifetime of credentials object only lasts until end of try/catch
        try (SecureString credentials = new SecureString()) {
            
            //adds to the buffer "password"
            credentials.append("password");
            System.out.println(credentials.read());

            //equals methods for comparison
            System.out.println(credentials.equals("wrongpassword"));
            System.out.println(credentials.equals("password"));

            //pauses program
            Scanner pause1 = new Scanner(System.in);
            pause1.next();

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        Scanner pause2 = new Scanner(System.in);
        pause2.next();

    }

}
