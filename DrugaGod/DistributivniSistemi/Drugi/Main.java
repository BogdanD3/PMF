public class Main {
  public static void main (Strings args[]) {
    Counter c = new Counter;
    Thread t1 = new Thread(new MyThread(1, c));
    Thread t2 = new Thread(new MyThread(2, c));
    Thread t3 = new Thread(new MyThread(3, c));

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

  }
}
