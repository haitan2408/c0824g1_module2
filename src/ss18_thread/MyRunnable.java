package ss18_thread;

public class MyRunnable implements Runnable {
    private String threadName;

    MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running. Iteration: " + i);
            try {
                Thread.sleep(1000); // Tạm dừng 1 giây để mô phỏng công việc
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName + " has finished executing.");
    }

    public static void main(String[] args) {
        // Tạo các đối tượng Runnable
        MyRunnable runnable1 = new MyRunnable("Thread 1");
        MyRunnable runnable2 = new MyRunnable("Thread 2");

        // Tạo các đối tượng Thread và truyền Runnable vào
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Khởi động các luồng
        thread1.start();
        thread2.start();

        // Chờ các luồng kết thúc
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished executing.");
    }
}

