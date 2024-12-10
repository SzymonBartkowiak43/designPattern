package org.example;

/*Given a list of numbers and a number k,
return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17,
 return true since 10 + 7 is 17.*/


public class Main {
    public static void main(String[] args) {
        long start, end;
        int laps = 10;

//        String s1 = "Janek ";
//        System.out.println(s1.hashCode());
//        s1 += "Kowalski";
//        System.out.println(s1.hashCode());

        StringBuffer buffer = new StringBuffer("Janek");
        System.out.println(buffer.hashCode());
        buffer .append("Kowalski");
        System.out.println(buffer.hashCode());



        // StringBuffer
//        start = System.currentTimeMillis();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < laps; i++) {
//            sb.append("Tequila ");
//        }
//        end = System.currentTimeMillis();
//        System.out.println("StringBuffer time: " + (end - start) + "ms");
//
//        // StringBuilder
//        start = System.currentTimeMillis();
//        StringBuilder sbuilder = new StringBuilder();
//        for (int i = 0; i < laps; i++) {
//            sbuilder.append("Tequila ");
//        }
//        end = System.currentTimeMillis();
//        System.out.println("StringBuilder time: " + (end - start) + "ms");
//
//        // String
//        start = System.currentTimeMillis();
//        String string = "";
//        for (int i = 0; i < laps; i++) {
//            string += "Tequila ";
//        }
//        end = System.currentTimeMillis();
//        System.out.println("String time: " + (end - start) + "ms");
    }
}
