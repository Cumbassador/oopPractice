package threads.lecture3;

import lombok.SneakyThrows;

public class ThredPractice {
    public static void main(String[] args) {




        ThredPractice thredPractice = new ThredPractice();
        MyThread thread1 = new MyThread(1,thredPractice);
        MyThread thread2 = new MyThread(2,thredPractice);
        MyThread thread3 = new MyThread(3,thredPractice);

        thread1.start();
        thread2.start();
        thread3.start();




    }
    @SneakyThrows
    public synchronized void printNum(int num){
//        synchronized (this) {
            System.out.println("Begin" + num);
            this.wait(3000);
            System.out.println("End" + num);

//        }
    }
}
