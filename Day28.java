import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String firstName = in.next();
            String emailID = in.next();

            if (emailID.endsWith("@gmail.com")) {
                names.add(firstName);
            }
        }

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
