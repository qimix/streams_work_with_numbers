import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list1 = new ArrayList<Integer>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a > 0 && a % 2 == 0) {
                list1.add(a);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
    }
}
