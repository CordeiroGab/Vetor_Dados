import Entities.Data;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);




        System.out.print("Enter the person number:  ");
        int number = sc.nextInt();
        Data [] vect = new Data [number];

        for (int i = 0; i < number; i++) {
            int x = 1 + i;
            Locale.setDefault(Locale.US);
            System.out.println("Date the person "+x);
            sc.nextLine();
            System.out.println("Enter the name of the person: ");
            String name = sc.next();
            System.out.println("Enter the age of the person: ");
            int age = sc.nextInt();
            System.out.println("Enter the height of the person: ");
            double height = sc.nextDouble();
            vect[i] = new Data(name, age, height);
        }

        double averageHeigth = 0;
        int averageAge = 0;
        String [] names = new String [number];


        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16){ averageAge++; };
            averageHeigth = averageHeigth + vect[i].getHeight();
            names[i] = vect[i].getName();
        }

        System.out.printf("The percentage age of the person is %.1f", ((double)averageAge /number) * 100);
        System.out.printf("\nThe average height of the person is %.2f", (averageHeigth / number) );
        System.out.println("\nThe name of the person is ");

       for (int i = 0; i < vect.length; i++) {
           if(vect[i].getAge() < 16){
               System.out.println(names[i]);
           };
       }


    }
}