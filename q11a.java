class Table extends Thread {
    private int num;
    public Table(int num) {
        this.num = num;
    }

    public synchronized void run() {
        for (int i = 1; i <=10; i++) {
            System.out.printf("%d times %d = %d\n", num, i, num*i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class q11a {
    public static void main(String args[]) {
        Table a = new Table(3);
        Table b = new Table(5);
        Table c = new Table(7);
        
        a.start();
        b.start();
        c.start();
    }
}
