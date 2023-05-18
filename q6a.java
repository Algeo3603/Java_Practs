class MyClass {
    static int count = 0; // static variable to keep track of object count
    MyClass() {
        count++;
    }
}
public class q6a {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();
        System.out.println("Number of objects created: " + MyClass.count);
    }
}
