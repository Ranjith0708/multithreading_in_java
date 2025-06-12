package basicmultithreading;

public class ConcurrencyExample {
    public static void main(String[] args) {
        Runnable thread = ()-> {
          for (int i=0;i<20;i++){
              System.out.println(Thread.currentThread().getName()+" -Task A : execution starts for "+i);
              sleep();
          }
        };
        Runnable thredB = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" -Task B : execution ends for "+i);
                sleep();
            }
        };
        Thread concurrencyThread = new Thread(thread,"Concurrency thread A");
        Thread concurrencyThreadB = new Thread(thredB,"Concurrency thread B");
        concurrencyThread.start();
        concurrencyThreadB.start();
    }

    private static void sleep() {
        try {
            System.out.println("Sleep start for "+Thread.currentThread().getName());
            Thread.sleep(5000); // simulate work and context switching
            System.out.println("Sleep end for "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
