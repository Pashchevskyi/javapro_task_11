package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.phonebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class TelephoneDirectory {

  private final Set<Record> records;

  public TelephoneDirectory(Set<Record> records) {
    this.records = records;
  }

  public boolean add(Record record) {
    if (record == null) {
      return false;
    }
    return this.records.add(record);
  }

  public Record find(String name) {
    Record defaultResult = new Record("", "");
    if (name == null) {
      return defaultResult;
    }
    for (Record record : records) {
      if (name.equals(record.getName())) {
        return record;
      }
    }
    return defaultResult;
  }

  public Set<Record> findAll(String name) {
    Set<Record> result = new LinkedHashSet<>();
    if (name == null) {
      return result;
    }
    for (Record record : records) {
      if (name.equals(record.getName())) {
        result.add(record);
      }
    }
    return result;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Record record : records) {
      sb.append(record.toString());
      sb.append("\n");
    }
    return sb.toString();
  }
}
