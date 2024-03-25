import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream()
              .filter(x -> x > 0) // фильтруем положительные числа
              .filter(x -> x % 2 == 0) // фильтруем чётные числа
              .sorted(Comparator.naturalOrder())// сортировка в порядке возрастания
              .forEach(System.out::println); // вывод на экран
    }
}
