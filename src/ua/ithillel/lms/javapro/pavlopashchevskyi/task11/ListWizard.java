package ua.ithillel.lms.javapro.pavlopashchevskyi.task11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.StringCounter;

public class ListWizard {

  public static int countOccurance(List<String> list, String searching) {
    if (list == null) {
      return 0;
    }
    int count = 0;
    for (String item : list) {
      if (item.equals(searching)) {
        count++;
      }
    }
    return count;
  }

  public static List<Integer> toList(int[] arr) {
    if (arr == null) {
      return new ArrayList<>(0);
    }
    List<Integer> result = new ArrayList<>(arr.length);
    for (int item : arr) {
      result.add(item);
    }
    return result;
  }

  public static List<Number> findUnique(List<Number> list) {
    if (list == null) {
      return new ArrayList<>(0);
    }
    Set<Number> uniques = new LinkedHashSet<>(list);
    return new ArrayList<>(uniques);
  }

  public static Set<StringCounter> calcOccurance(List<String> list) {
    if (list == null) {
      return new HashSet<>(0);
    }
    Set<StringCounter> result = new HashSet<>();
    for (int i = 0; i < list.size(); i++) {
      result.add(new StringCounter(list.get(i), countOccurance(list, list.get(i))));
    }
    return result;
  }
}
