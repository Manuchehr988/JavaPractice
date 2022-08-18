package Day8;

import java.util.Locale;

public class HWday8 {
    public static void main(String[] args) {


//        TASK1
        String name = "hello world";
        boolean hello = name.startsWith("HELLO");
        System.out.println("HELLO = " + hello);

//        TASK2
        boolean ld = name.endsWith("ld");
        System.out.println("ld = " + ld);

//        TASK3
        String str = "Hello, My name is Manuchehr";
        String str1 = str.toLowerCase();
        System.out.println("str1 = " + str1);
        String str2 = str.toUpperCase();
        System.out.println("str2 = " + str2);

//        TASK4
        String a = "       JAVA IS FUN       ";
        int length = a.length();
        System.out.println("length = " + length);

        String trim = a.trim();
        System.out.println("trim = " + trim);

        int length1 = trim.length();
        System.out.println("length1 = " + length1);

//        TASK5
        String a1 = "Java is FAN";
        String replace = a1.substring(8).toLowerCase().replace('a', 'u');
        System.out.println("replace = " + replace);

//        TASK6
        String address = "20341 S. Harvard blvd, Torrance, CA 90501";
        String rep = address.replaceAll("[^0-9]", "*");
        System.out.println("Address = " + rep);






    }
}
