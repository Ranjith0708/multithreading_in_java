package basicmultithreading;

public class ExtendsThread {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadB.start();
        threadA.start();
    }

}

class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Started execution of "+Thread.currentThread()+" for "+i);
        }
    }
}

class ThreadB extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Started execution of "+Thread.currentThread()+" for "+i);
        }
    }
}
