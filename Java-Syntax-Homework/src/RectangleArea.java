import java.util.Scanner;

public class RectangleArea {
    public static int getArea(int a, int b){
        int area = a * b;
        return area;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int sideA = input.nextInt();
        int sideB = input.nextInt();

        int area = getArea(sideA, sideB);

        System.out.println(area);
    }
}