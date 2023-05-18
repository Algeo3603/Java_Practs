class Char extends Thread {
    private String letter;
    public Char(String letter) {
        this.letter = letter;
    }

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(letter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}


public class q11b {
    public static void main(String args[]) {
        Char c1 = new Char("/");
        Char c2 = new Char("*");

        c1.start();
        c2.start();
    }
}
