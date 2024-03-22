package comparable;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) {
        Boy sergey = new Boy("Sergey",20,180);
        Boy nikolai = new Boy("Nikolay",18,185);
        Boy vasya = new Boy("Vasya",21,164);
        System.out.println("sergey.compareTo(vasya) = " + sergey.compareTo(vasya));
        System.out.println("vasya.compareTo(nikolai) = " + vasya.compareTo(nikolai));
        Boy[] boys = new Boy[]{sergey,nikolai,vasya};
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Arrays.sort(boys);
        System.out.println("Arrays.toString(boys) = " + Arrays.toString(boys));
        Person anatoliy = new Person("Anatoliy","Zhukov",25);
        Person vladimir = new Person("Vladimir","Semenov",30);
        Person anatoli = new Person("Anatoliy","Zhukov",19);
        Person andrey= new Person("Andrey","Semenov",30);
        Person[] pers = new Person[] {anatoliy,anatoli,vladimir,andrey};
        System.out.println("Arrays.toString(pers) = " + Arrays.toString(pers));
        Arrays.sort(pers);
        System.out.println("Arrays.toString(pers) = " + Arrays.toString(pers));
        Person andrey2 = andrey.clone();
        System.out.println("andrey2 = " + andrey2);


    }
}
