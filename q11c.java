class Fibo extends Thread {
    public void run() {
        int a = 0, b = 1, c = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Fibo " + a);
            a = b;
            b = c;
            c = a + b;
        }
    }
}

class Prime extends Thread {
    public void run() {
        System.out.println("PRIMEEEEEEEEEEEEEE");
        int cnt = 0, num = 2;
        for (int q = 0;;q++) {
            int factors = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.println("Prime " + num);
                cnt++;
            }
            if (cnt == 20) {
                break;
            }

            num++;
        }
    }
}


public class q11c {
    public static void main(String args[]) {
        System.out.println("Alan");

        Fibo f = new Fibo();
        Prime p = new Prime();

        f.start();
        p.start();

    }
}
