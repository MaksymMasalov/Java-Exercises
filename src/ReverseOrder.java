import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> items = new ArrayList<>();
        while (scanner.hasNext()) {
            int nextInt = scanner.nextInt();
            if (nextInt == -1) {
                items.add(0,nextInt);
                break;
            }
            items.add(nextInt);
        }
        scanner.close();
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = (items.size() - 1); i >= 0; i--) {
            joiner.add(items.get(i).toString());
        }
        System.out.print(joiner.toString());
    }
}
