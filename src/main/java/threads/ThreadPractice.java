package threads;

public class ThreadPractice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        for (int i = 0; i < 1_0_000_000; i++) {
//
//        }
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(2000);
//            System.out.println("A");
//        }
//        for (int i = 0; i < 5; i++) {
//            Thread.sleep(3000L);
//            System.out.println("B");
//        }
        Printer printerA = new Printer("A",2000L);
//        Printer printerB = new Printer("B",3000L);
        PrinterRunnable printerRunnableB = new PrinterRunnable("B",3000L);
        Thread threadB = new Thread(printerRunnableB);

        System.out.println("start");
        printerA.start();
        threadB.start();

        threadB.join();
        System.out.println("end");



        ScanerThread scanerThread = new ScanerThread("Sergey",2000);
        ScanerRunnable scanerRunnable = new ScanerRunnable("Maksim",3000);
        Thread thread = new Thread(scanerRunnable);
        System.out.println("start");

        scanerThread.start();
        thread.start();
        thread.join();
        scanerThread.join();
        System.out.println("end");

        Runnable messageTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("This message appears every 5 seconds.");
                } {

                    try {
                        Thread.sleep(5000); // Приостановка на 5 секунд
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread messageThread = new Thread(messageTask);
        messageThread.start();
        messageThread.join();



    }
}
