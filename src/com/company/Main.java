//տասնըքանի ---- չի կարդում
//1000000-ից էն կոմ խառնվում է
//2 մլրդ եսիմքանիսից հետո էռոռ ս,,,,,, հարց՝ ոնց անեմ, որ էռռոռ չտա ու թույլ տա, որ ավելի մեծ թվեր ինփութ անեմ 

package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> numbers = new LinkedHashMap<>();
        numbers.put(0, "");
        numbers.put(1, "մեկ ");
        numbers.put(2, "երկու ");
        numbers.put(3, "երեք ");
        numbers.put(4, "չորս ");
        numbers.put(5, "հինգ ");
        numbers.put(6, "վեց ");
        numbers.put(7, "յոթ ");
        numbers.put(8, "ութ ");
        numbers.put(9, "ինը ");
        numbers.put(10, "տաս ");
        numbers.put(20, "քսան");
        numbers.put(30, "երեսուն");
        numbers.put(40, "քառասուն");
        numbers.put(50, "հիսուն");
        numbers.put(60, "վաթսուն");
        numbers.put(70, "յոթանասուն");
        numbers.put(80, "ութսուն");
        numbers.put(90, "ինսուն");
        numbers.put(100, "հարյուր ");
        numbers.put(1000, "հազար ");
        numbers.put(1000000, "միլիոն ");
        numbers.put(1000000000, "միլիարդ ");
        String input;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int myNumber = number;
        int counter = 0;
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        if (counter == 1) {
            System.out.println(myNumber + " = " + numbers.get(myNumber));

        } else if (counter == 2) {
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 * 10;
            if (myNumber > 10 && myNumber < 20) {
                System.out.println(myNumber + " = " + (numbers.get(tasnavor) + "նը" + numbers.get(miavor)));
            } else {
                System.out.println(myNumber + " = " + (numbers.get(tasnavor) + numbers.get(miavor)));
            }
        } else if (counter == 3) {
            int miavor = myNumber % 10;
            int tasnavor = (myNumber / 10) % 10 * 10;
            int haryuravor = (myNumber / 100);
            System.out.println(myNumber + " = " + numbers.get(haryuravor) + numbers.get(100) + numbers.get(tasnavor) + numbers.get(miavor));

        } else if (counter == 4) {
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            int hazaravor = myNumber / 1000;
            System.out.println(myNumber + " = " + numbers.get(hazaravor) + numbers.get(1000) +
                    numbers.get(haryuravor) + numbers.get(100)
                    + numbers.get(tasnavor) + numbers.get(miavor));

        } else if (counter == 5) {
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            int hazaravoriMiavor = myNumber / 1000 % 10;
            int hazaravoriTasnavor = myNumber / 10000 * 10;//54321

            System.out.println(myNumber + " = " + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + " " + numbers.get(1000) +
                    numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor));

        } else if (counter == 6) {
            int myHimnakanNumber = myNumber;
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            myNumber = myNumber / 1000;                   //654321
            int hazaravoriMiavor = myNumber % 10;
            int hazaravoriTasnavor = (myNumber / 10) % 10 * 10;
            int hazaravoriHaryuravor = (myNumber / 100);


            System.out.print(myHimnakanNumber + " = " + numbers.get(hazaravoriHaryuravor) +
                    numbers.get(100) + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + numbers.get(1000));
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            System.out.println((numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor)));

        } else if (counter == 7) {
            int milionavor = myNumber / 1000000;
            myNumber = myNumber % 1000000;
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            myNumber = myNumber / 1000;                   //8700000
            int hazaravoriMiavor = myNumber % 10;
            int hazaravoriTasnavor = (myNumber / 10) % 10 * 10;
            int hazaravoriHaryuravor = (myNumber / 100);

            if (hazaravoriHaryuravor == 0) {
                numbers.put(100, "");
            }

            System.out.print(numbers.get(milionavor) + numbers.get(1000000) + numbers.get(hazaravoriHaryuravor) +
                    numbers.get(100) + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + numbers.get(1000));
            numbers.put(100, "հարյուր ");
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            System.out.println((numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor)));

        } else if (counter == 8) {
            int milionavoriMiavor = myNumber / 1000000 % 10;
            int milionavoriTasnavor = myNumber / 10000000 * 10;
            myNumber = myNumber % 1000000;
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            myNumber = myNumber / 1000;                   //87654321
            int hazaravoriMiavor = myNumber % 10;
            int hazaravoriTasnavor = (myNumber / 10) % 10 * 10;
            int hazaravoriHaryuravor = (myNumber / 100);

            if (hazaravoriHaryuravor == 0) {
                numbers.put(100, "");
            }
            //80700000

            System.out.print(numbers.get(milionavoriTasnavor) + numbers.get(milionavoriMiavor) + " " + numbers.get(1000000) + numbers.get(hazaravoriHaryuravor) +
                    numbers.get(100) + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + numbers.get(1000));
            numbers.put(100, "հարյուր ");
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            System.out.println((numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor)));

        } else if (counter == 9) {
            int milionavoriMiavor = myNumber / 1000000 % 10;
            int milionavoriTasnavor = myNumber / 10000000 % 10 * 10;
            int milionavoriHaryuravor = myNumber / 100000000;
            myNumber = myNumber % 1000000;
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            myNumber = myNumber / 1000;                   //987654321
            int hazaravoriMiavor = myNumber % 10;
            int hazaravoriTasnavor = (myNumber / 10) % 10 * 10;
            int hazaravoriHaryuravor = (myNumber / 100);


            System.out.print(numbers.get(milionavoriHaryuravor) + numbers.get(100)
                    + numbers.get(milionavoriTasnavor) + numbers.get(milionavoriMiavor) + " "
                    + numbers.get(1000000) + numbers.get(hazaravoriHaryuravor) +
                    numbers.get(100) + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + numbers.get(1000));
            numbers.put(100, "հարյուր ");
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            System.out.println((numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor)));

        } else if (counter == 10) {
            int milionavoriMiavor = myNumber / 1000000 % 10;
            int milionavoriTasnavor = myNumber / 10000000 % 10 * 10;
            int milionavoriHaryuravor = myNumber / 100000000 % 10;
            int miliardavor = myNumber / 1000000000;
            myNumber = myNumber % 1000000;
            int miavor = myNumber % 10;
            int tasnavor = myNumber / 10 % 10 * 10;
            int haryuravor = myNumber / 100 % 10;
            myNumber = myNumber / 1000;                   //9876543210
            int hazaravoriMiavor = myNumber % 10;
            int hazaravoriTasnavor = (myNumber / 10) % 10 * 10;
            int hazaravoriHaryuravor = (myNumber / 100);


            System.out.print(numbers.get(miliardavor) + numbers.get(1000000000) +
                    numbers.get(milionavoriHaryuravor) + numbers.get(100) + numbers.get(milionavoriTasnavor)
                    + numbers.get(milionavoriMiavor) + " " + numbers.get(1000000) + numbers.get(hazaravoriHaryuravor) +
                    numbers.get(100) + numbers.get(hazaravoriTasnavor) + numbers.get(hazaravoriMiavor) + numbers.get(1000));
            numbers.put(100, "հարյուր ");
            if (haryuravor == 0) {
                numbers.put(100, "");
            }
            System.out.println((numbers.get(haryuravor) + numbers.get(100) +
                    numbers.get(tasnavor) + numbers.get(miavor)));
        }
    }
}
