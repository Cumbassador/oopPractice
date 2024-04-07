package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Watch> watchesList = new ArrayList<Watch>();

        Watch seiko = new Watch("Seiko","Sergey",18000.0);
        Watch gShock = new Watch("GCHOCK","Best Dancer",100000.0);
        watchesList.add(seiko);
        watchesList.add(gShock);

        for (Watch elemWatch: watchesList) {
            System.out.println("elemWatch = " + elemWatch);
        }
        System.out.println(" ");
        watchesList.remove(0);
        for (Watch elemWatch: watchesList){
            System.out.println("elemWatch = " + elemWatch);
        }
        System.out.println(" ");
        System.out.println("watchesList.contains(seiko) = " + watchesList.contains(seiko));
        System.out.println("watchesList.contains(gShock) = " + watchesList.contains(gShock));
        System.out.println("watchesList.toString() = " + watchesList.toString());
        System.out.println("watchesList.get(0).getFirm() = " + watchesList.get(0).getFirm());
        watchesList.set(0,seiko);
        System.out.println("watchesList.toString() = " + watchesList.toString());
        List<Watch> watchesOmegaList = new ArrayList<>();
        Watch andrewOmega = new Watch("Omega","Andrew",100_000.0);
        Watch romanOmega = new Watch("Omega","Roman",100_000.0);
        watchesOmegaList.add(andrewOmega);
        watchesOmegaList.add(romanOmega);
        System.out.println("watchesOmegaList.toString() = " + watchesOmegaList.toString());
        watchesList.addAll(watchesOmegaList);
        System.out.println("watchesList.toString() = " + watchesList.toString());
        Watch sergeyWatch = new Watch("Watch","Sergey", 10_000);
        watchesList.add(1,sergeyWatch);


    }
}
