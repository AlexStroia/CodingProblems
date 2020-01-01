import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<Object> objects2 = new ArrayList<>();
        objects2.add(1);
        objects2.add(3);
        objects2.add(5);

        objects.add(1);
        objects.add(3);
        objects.add(5);
        objects.add(objects2);

        System.out.println(productSum(objects));

    }

    public static int productSum(List<Object> array) {
        return productSumHelper(array,1);
    }

    private static int productSumHelper(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object ob : array) {
            if (ob instanceof ArrayList) {
                sum += (productSumHelper((ArrayList)ob, multiplier + 1));
            } else {
                sum = sum + (Integer) ob;
            }
        }
        return sum * multiplier;
    }
}
