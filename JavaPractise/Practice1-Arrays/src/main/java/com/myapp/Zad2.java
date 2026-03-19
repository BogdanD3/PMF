public class Zad2 {

  public static float average(int  a[]) {
    float sum = 0;
    for (int num : a) {
      sum += num;
    }
    return sum / a.length;
  }

}
