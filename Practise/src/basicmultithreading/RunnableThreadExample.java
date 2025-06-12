package basicmultithreading;

public class RunnableThreadExample {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadOne(),"Thread one");
        Thread threadTwo = new Thread(new ThreadTwo(),"Thread two");
        Thread threadThree = new Thread(()->{
            for(int j=0;j<100;j++){
                System.out.println("Thread 3 "+j);
            }
        });
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}

class ThreadOne implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

class ThreadTwo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <150 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
