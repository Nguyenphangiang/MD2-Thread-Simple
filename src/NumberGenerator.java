public class NumberGenerator implements Runnable{
    private Thread myThread;
    private final String threadName;

    NumberGenerator(String threadName){
        this.threadName = threadName;
    }

    public Thread getMyThread(){
        return myThread;
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing number " + i + " " + threadName);
            System.out.println(hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void start(){
        System.out.println("Start" + threadName);
        if (myThread == null){
            myThread = new Thread(this,threadName);
            myThread.start();
        }
    }
    public int hashCode(){
        myThread = new Thread(this.threadName);
        return myThread.hashCode();
    }
}
