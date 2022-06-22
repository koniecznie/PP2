package pl.projects.third;

public class Main01 {
    public static void main(String[] args) throws Exception {

        MyQueue myQueue = new MyQueue(100);

        MyQueueAddThread myQueueAddThread1 = new MyQueueAddThread(myQueue);
        MyQueueAddThread myQueueAddThread2 = new MyQueueAddThread(myQueue);

        MyQueueGetThread myQueueGetThread = new MyQueueGetThread(myQueue);

        Thread thread1 = new Thread(myQueueAddThread1);
        Thread thread2 = new Thread(myQueueAddThread2);
        Thread thread3 = new Thread(myQueueGetThread);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
