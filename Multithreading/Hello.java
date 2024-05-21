class MyThread extends Thread {
    public void run() {
        // Code to be executed in the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        // Code to be executed in the main thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
