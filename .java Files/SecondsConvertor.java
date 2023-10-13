public class SecondsConvertor {
  public static void main(String[] args) {
    int seconds = 5341;
    int hours = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    seconds = seconds % 60;
    System.out.println(hours + " hours " + minutes + " minutes and " + seconds + " seconds.");
  }
}