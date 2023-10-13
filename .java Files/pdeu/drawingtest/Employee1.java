/*WAP to store Employee Object(id, name) to file Employee.txt */
import java.io.*;

class Employee implements Serializable{
    String name;
    int id;
    public Employee(int i, String n){
        name = n;
        id = i;
    }
    public String toString(){
        return "ID : " + id + "Name : " + name;
    }
}
class Employee1{
    public static void main(String[] args) {
        ObjectOutputStream os = null;
        Employee e1 = new Employee(1,"ABC");
        try{
            os = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
            os.writeObject(e1);
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }finally{
            try{
                os.close();
            }catch(Exception e){}
        }
    }
}