package string;

import java.nio.charset.StandardCharsets;

public class StringPractice {
    public static void main(String[] args) {
//        String name = "Sergey";
//        String copyName = "Sergey";
//        System.out.println("name == copyName = " + (name == copyName));
//        String constructorName = new String("Sergey");
//        System.out.println("name == copyName = " + (name == constructorName));
//        String interName = constructorName.intern();
//        System.out.println("(interName = name) = " + (interName == name));

//        String str = "Я строка";
//        System.out.println("str.length() = " + str.length());
//        System.out.println("str.isEmpty() = " + str.isEmpty());
//        System.out.println("str.equals(\"Я строка\") = " + str.equalsIgnoreCase("Я строкА"));
//        String[] strs = str.split(" ");
//        System.out.println("strs[1] = " + strs[1]);
//        StringBuilder stringBuilder = new StringBuilder(str);
//        for (int i = 0; i < 10_000_000; i++) {
//            stringBuilder.append('!');
        String family = "Zhukov";
        String nickname = "Zhuck";
        family.length();//длина строки
        family.toString();//представить как строку
        family.compareTo(nickname);// сравнение булевский тип данных
        family.split(" ");//разделяет строку
        family.isEmpty();//пустая или не пустая строка
        System.out.println("family.concat(\"S\") = " + family.concat(" S"));// скдадывает строки
        System.out.println("family.subSequence(3,5) = " + family.subSequence(3, 5));// выдает последовательность от заданного символа до указанного последнего
        System.out.println();

    }

    }

