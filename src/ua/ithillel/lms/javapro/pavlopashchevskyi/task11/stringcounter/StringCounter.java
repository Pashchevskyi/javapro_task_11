package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter;

import java.util.Objects;

public class StringCounter {

  private final String name;
  private final int occurrence;

  public StringCounter(String name, int occurrence) {
    this.name = name;
    this.occurrence = occurrence;
  }

  public String getName() {
    return name;
  }

  public int getOccurrence() {
    return occurrence;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringCounter that = (StringCounter) o;
    return occurrence == that.occurrence && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, occurrence);
  }
}
