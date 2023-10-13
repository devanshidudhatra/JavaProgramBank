// WAP to create a class naming "Time".having fields like hours, minutes,seconds. Provide following instance methods:  
// public void printTimeDetails()
// public Time addTime(Time t1,Time t2)
// public Time subtractTime(Time t1,Time t2)
// public static int countObjects()   //static method to count total objects created.
// Test the above mentioned class and its functionality by creating necessary objects

class PrintTimeUsingConstructor {
    private int hours;
    private int minutes;
    private int seconds;
    private static int totalObjects = 0;

    // Default Constructor
    public Time(){
        this.hours = 0;
        this.minutes = 0;
        this.hours = 0;
        totalObjects++;
    }

    // Parameterized Constructor
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        totalObjects++;
    }

    // Copy Constructor
    public Time(Time copyConstructor){
        this.hours = copyConstructor.hours;
        this.minutes = copyConstructor.minutes;
        this.seconds = copyConstructor.seconds;
        totalObjects++;
    }

    public void printTimeDetails() {
        System.out.printf("Time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }

    public Time addTime(Time t1, Time t2) {
        int t1Seconds = t1.hours * 3600 + t1.minutes * 60 + t1.seconds;
        int t2Seconds = t2.hours * 3600 + t2.minutes * 60 + t2.seconds;
        int diffSeconds = Math.abs(t1Seconds + t2Seconds);
        int hours = diffSeconds / 3600;
        int minutes = (diffSeconds % 3600) / 60;
        int seconds = diffSeconds % 60;
        return new Time(hours, minutes, seconds);
    }

    public Time subtractTime(Time t1, Time t2) {
        int t1Seconds = t1.hours * 3600 + t1.minutes * 60 + t1.seconds;
        int t2Seconds = t2.hours * 3600 + t2.minutes * 60 + t2.seconds;
        int diffSeconds = Math.abs(t1Seconds - t2Seconds);
        int hours = diffSeconds / 3600;
        int minutes = (diffSeconds % 3600) / 60;
        int seconds = diffSeconds % 60;
        return new Time(hours, minutes, seconds);
    }

    public static int countObjects() {
        return totalObjects;
    }

    // Main Program
    public static void main(String[] args) {
        Time time1 = new Time(2, 30, 45);
        Time time2 = new Time(1, 45, 15);

        System.out.println("\n\n-------------Default Constructor---------------");
        Time time = new Time();
        time.printTimeDetails();
        System.out.println("----------------------------------------------\n\n");

        System.out.println("-------------- Copy Constructor ---------------");
        Time copyTime = new Time(time1);
        copyTime.printTimeDetails();
        System.out.println("----------------------------------------------\n\n");


        System.out.println("--------------- Time Details -----------------");
        time1.printTimeDetails();
        time2.printTimeDetails();
        System.out.println("----------------------------------------------\n\n");

        System.out.println("-------------- Time Addition -----------------");
        Time total_time = time1.addTime(time1, time2);
        System.out.println("Total time:");
        total_time.printTimeDetails();
        System.out.println("----------------------------------------------\n\n");

        System.out.println("-------------Time Subtraction-----------------");
        Time diff_time = time1.subtractTime(time1, time2);
        System.out.println("Difference time:");
        diff_time.printTimeDetails();
        System.out.println("----------------------------------------------\n\n");

        System.out.println("--------------Total Objects-------------------");
        System.out.println("Total objects created: " + Time.countObjects());
        System.out.println("----------------------------------------------\n\n");
    }
}
