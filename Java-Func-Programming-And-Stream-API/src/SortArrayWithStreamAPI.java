import java.util.*;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = new int[8];
        List<Integer> myList = new ArrayList<>();

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = input.nextInt();
        }
        String order = input.next(); //sorting order

        for (int i = 0; i < numArray.length; i++) {
            myList.add(numArray[i]);
        }

        if (order.equals("ascending")) {
            myList.stream()
                    .sorted((e2, e1) -> Integer.compare(e2, e1))
                    .forEach(e -> System.out.println(e));
        } else if (order.equals("descending")) {
            myList.stream()
                    .sorted((e1, e2) -> Integer.compare(e2, e1))
                    .forEach(e -> System.out.print(e + " "));
        }
    }
}
