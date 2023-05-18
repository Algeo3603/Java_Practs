class A {
    A() {
        System.out.println("This is constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("This is constructor B");
    }
}

class C extends B {
    C() {
        System.out.println("This is Constructor C");
    }
}


public class q7a {
    public static void main(String args[]) {

        A a = new A();
        System.out.println();
        System.out.println();

        B b = new B();
        System.out.println();
        System.out.println();

        C c = new C();
        System.out.println();
        System.out.println();
    }
}
