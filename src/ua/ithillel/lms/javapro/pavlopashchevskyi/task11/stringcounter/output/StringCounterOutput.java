package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output;

import java.util.Set;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.StringCounter;

public abstract class StringCounterOutput {

  protected Set<StringCounter> strings;

  public StringCounterOutput(Set<StringCounter> strings) {
    this.strings = strings;
  }
}
