class InternalAssesment{
static void subtract(int n1, int n2){
    System.out.println("int, int " + (n1 - n2));
    }
static void subtract(long l1, long l2){
    System.out.println("long, long " + (l1 - l2));
    }
public static void main(String[] args){
    //code 1
    System.out.println("-----------------------------------");
    subtract(25, 5L);
    subtract(25l, 5);
    //Code 2
    System.out.println("-----------------------------------");
    String name1 = "PDEU";
    String name2 = new String("PDEU");
    System.out.println(name1 + "\t" + name2);
    System.out.println(name1 == name2);
    System.out.println("-----------------------------------");
    // //code 3
    // float number = 25.0 * 2;
    // System.out.println(number);
    //code 4
    // System.out.println("-----------------------------------");
    // int[] array = new int[5];
    // array[5] = 5;
    // System.out.println(array[5]);
    // System.out.println("-----------------------------------");
    // //code 5
    // for(int i = 0; i >= 0; i++) System.out.println(i);
    }
}