package threads.lecture2;

public class ThreadPractice {
    public static void main(String[] args) {
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");

            }
        };
        anonymousRunnable.run();

        Thread thread = new Thread(anonymousRunnable);
        thread.start();

        Runnable functionalRunnable = () -> System.out.println("Привет из функционального программирвоания");
        new Thread(functionalRunnable).start();

//        new Thread(() ->{
//            for (int i = 0; i < 5; i++) {
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Привет из быстрого потока");
//            }
//        }).start();
//        Runnable runnable=() ->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println("Привет после сна в 3 секунды");
//                try {
//                    Thread.sleep(3000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        };
//        Thread thread1 = new Thread(runnable);
//        thread1.setDaemon(true);
//        thread1.start();
        Runnable runnable = () -> System.out.println("Привет я Runnable");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет я проснулся после 4 секунд");

                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread2 = new Thread(runnable1);
        thread2.setDaemon(true); // Установка потока как демона
        thread2.start();





    }
}
