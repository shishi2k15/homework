import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {

        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);

        Integer firstNum = input.nextInt();
        Integer secondNum = input.nextInt();

        Integer smallNum = Math.min(firstNum, secondNum);
        Integer bigNum = Math.max(firstNum, secondNum);

        List<Integer> randNum = new ArrayList<>();
        randNum(smallNum, bigNum, randNum);

        for (int num : randNum) {
            System.out.print(num + " ");
        }
    }

    private static void randNum(Integer smallNum, Integer bigNum, List<Integer> randNum) {
        Random randomGenerator = new Random();

        for (int i = 0; i <= bigNum - smallNum; i++) {
            Integer randomNumber = randomGenerator.nextInt(bigNum - smallNum + 1) + smallNum;
            while (randNum.contains(randomNumber)) {
                randomNumber = randomGenerator.nextInt(bigNum - smallNum + 1) + smallNum;
            }
            randNum.add(randomNumber);
        }
    }
}