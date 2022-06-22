package pl.projects.third;

public class MyQueueAddThread implements Runnable {

    private MyQueue myQueue;

    public MyQueueAddThread(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true){
            myQueue.addValue(generateRandom(1, 100));
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private int generateRandom(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
