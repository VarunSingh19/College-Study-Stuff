class Student {
    String name;
    int age;

    public void Printinfo(String name) {
        System.out.println(name);
    }

    public void Printinfo(int age) {
        System.out.println(age);
    }

    public void Printinfo(String name, int age) {
        System.out.println(name+"  "+age);
        
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Varun";
        s1.age = 20;

        s1.Printinfo(s1.age);
        s1.Printinfo(s1.name,s1.age);
    }
}
