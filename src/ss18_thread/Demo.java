package ss18_thread;

public class Demo implements Runnable{
    private String threadName;

    public Demo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread name: "+ threadName);
        for (int i =0; i < 5; i++) {
            System.out.println("Thread name: "+ threadName +": "+ i * 5);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Lỗi");
            }
        }
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo("Thread 1");
        Demo demo2 = new Demo("Thread 2");

        Thread thread1 = new Thread(demo1);
        Thread thread2 = new Thread(demo2);

        thread1.start();
        thread2.start();

//        Công việc C cần đợi tất cả thread chạy xong thì mới thực hiện thì làm cách nào
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Bye");
    }
}
