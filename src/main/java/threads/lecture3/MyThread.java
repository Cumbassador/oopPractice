package threads.lecture3;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyThread extends Thread {
    private final int num;
    private final ThredPractice thredPractice;

    @Override
    public void run() {
        thredPractice.printNum(num);

    }
}
