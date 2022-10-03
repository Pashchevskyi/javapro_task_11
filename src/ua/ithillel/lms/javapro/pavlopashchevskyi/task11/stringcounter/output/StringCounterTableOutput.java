package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output;

import java.util.Set;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.StringCounter;

public class StringCounterTableOutput extends StringCounterOutput {

  public StringCounterTableOutput(Set<StringCounter> strings) {
    super(strings);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (StringCounter item : strings) {
      sb.append(item.getName());
      sb.append(": ");
      sb.append(item.getOccurrence());
      sb.append("\n");
    }
    return sb.toString();
  }
}
