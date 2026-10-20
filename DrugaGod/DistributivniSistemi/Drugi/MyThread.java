public class MyThread implements Runnable {
  
  final int id;
  Counter counter;

  public MyThread (int id, Counter counter) {
    this.id = id;
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.value ++;
    }
  }
}
