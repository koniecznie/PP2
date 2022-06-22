package pl.projects.third;


public class MyQueueGetThread implements Runnable {

    private MyQueue myQueue;

    public MyQueueGetThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true){
            myQueue.getValue();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}