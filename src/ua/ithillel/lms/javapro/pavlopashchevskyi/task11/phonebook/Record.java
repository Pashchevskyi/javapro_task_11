package ua.ithillel.lms.javapro.pavlopashchevskyi.task11.phonebook;

public class Record {

  private final String name;
  private final String phone;

  public Record(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name + " " + phone;
  }
}
