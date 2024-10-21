import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String[] str = new String[]{"aaa", "aab", "aac", "aaa", "aba", "aac", "aac"};
    System.out.println(countOfElements(str));
  }

  public static  <T> Map<T, Integer> countOfElements(T[] array) {
    Map<T, Integer> result = new HashMap<>();

    for (T item : array) {
      if (result.containsKey(item)) {
        result.replace(item, result.get(item) + 1);
      } else {
        result.put(item, 1);
      }
    }

    return result;
  }
}
