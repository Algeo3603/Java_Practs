import java.util.Scanner;
import java.util.Vector;

public class q4a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Vector<String> names = new Vector<String>();

        System.out.println("Enter names of students. Type done to stop");
        String inp = sc.nextLine();

        while (!inp.equals("done")) {
            names.add(inp);
            inp = sc.nextLine();
        }

        System.out.println("The entered names are: ");
        // for (int i = 0; i < names.size(); i++) {
        //     System.out.println(names.get(i));
        // }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
