import java.util.Scanner;

public class ClosestPointOn2DCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(),
                y = scanner.nextDouble(),
                circle_x = scanner.nextDouble(),
                circle_y = scanner.nextDouble(),
                r = scanner.nextDouble(),
                A, k, xt, yt;

        A = Math.sqrt((x - circle_x) * (x - circle_x) + (y - circle_y) * (y - circle_y));
        k = r / A;
        xt = circle_x + (x - circle_x) * k;
        yt = circle_y + (y - circle_y) * k;
        System.out.print(xt);
        System.out.print(" ");
        System.out.print(yt);
    }
}