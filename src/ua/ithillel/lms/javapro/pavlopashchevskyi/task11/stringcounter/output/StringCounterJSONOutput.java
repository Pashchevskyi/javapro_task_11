package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output;

import java.util.Set;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.StringCounter;

public class StringCounterJSONOutput extends StringCounterOutput {

  public StringCounterJSONOutput(Set<StringCounter> strings) {
    super(strings);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[\n");
    for (StringCounter item : strings) {
      sb.append("{name: \"");
      sb.append(item.getName());
      sb.append("\", occurrence: ");
      sb.append(item.getOccurrence());
      sb.append("},\n");
    }
    sb.append("]");
    return sb.toString();
  }
}
