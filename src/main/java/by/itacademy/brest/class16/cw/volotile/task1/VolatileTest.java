package by.itacademy.brest.class16.cw.volotile.task1;



public class VolatileTest {

//    private static volatile int MY_INT = 0;
    private static int MY_INT = 0;

    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (local_value < 5) {
//                if (MY_INT%2 == 0){
//                    System.out.println("MY -> " + MY_INT);
//                    System.out.println("LOCAL -> " + local_value);
//                }
                if (local_value != MY_INT) {
                    System.out.printf("Got Change for MY_INT : %d %n", MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override public void run()
        {
            int local_value = MY_INT;
            while (MY_INT < 5) {
                System.out.printf("Incrementing MY_INT to %d %n", local_value + 1);

                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    System.out.println("CATCH");
                }
            }
        }
    }
}
