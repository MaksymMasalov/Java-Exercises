import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        List<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        Scanner lineScanner = new Scanner(line);
        while (lineScanner.hasNextInt()) {
            myArray.add(lineScanner.nextInt());
        }
        lineScanner.close();

        if (myArray.size() == 0){
            return;
        }

        int startUpSequence = 0;
        int endUpSequence = 1;
        int maxLen = 1;
        while (endUpSequence < myArray.size()) {
            if (myArray.get(endUpSequence) > myArray.get(endUpSequence - 1)) {
                if (endUpSequence - startUpSequence + 1 > maxLen) {
                    maxLen = endUpSequence - startUpSequence + 1;
                }
            }
            else {
                startUpSequence = endUpSequence;
            }
            endUpSequence++;
        }
        System.out.print(maxLen);
    }
}