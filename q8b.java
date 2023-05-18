final class MyClass {
    // class cannot be inherited
    final int MY_CONST = 42;
    // constant variable that cannot be changed

    final void myMethod() {
        // method cannot be overridden
        System.out.println("Hello from final method!");
    }
}

// error: cannot inherit from final class
// class MyDerivedClass extends MyClass {}

public class q8b {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // cannot change the value of MY_CONST
        // error: cannot assign a value to final variable
        // obj.MY_CONST = 123;
        obj.myMethod();
    }
}
