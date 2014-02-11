public class Person
{
    public static int Total;
    String Name;
    int Age;
    public  Person(){
        Total++;
        System.out.println("Конструктор без параметров Person");
    }

    public Person(String name, int age){
        this();
        this.Name = name;
        this.Age = age;
        System.out.println("Конструктор с параметрами Person");
    }
    public String toString(){
        return String.format("%s - %d", this.Name, this.Age);
    }

}
