import java.util.Scanner;

public class TriangleArea {

    public static int getArea(int x1, int x2, int x3, int y1, int y2, int y3){
        int area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
        return area;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        int area = getArea(x1 ,x2 ,x3 ,y1 ,y2 ,y3);

        System.out.println(Math.abs(area));
    }
}
