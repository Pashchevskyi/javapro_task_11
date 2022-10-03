package ua.ithillel.lms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.ListWizard;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.phonebook.Record;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.phonebook.TelephoneDirectory;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.StringCounter;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output.StringCounterJSONOutput;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output.StringCounterOutput;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task11.stringcounter.output.StringCounterTableOutput;

public class Main {

  public static void main(String[] args) {
    // 11.1
    String[] strings = {"Тарас", "Назар", "Тарас", "Сергійко", "Василь", "Сергійко", "Василь"};
    List<String> stringsList = new ArrayList<>();
    Collections.addAll(stringsList, strings);
    int occurs = ListWizard.countOccurance(stringsList, "Тарас");
    System.out.println(occurs);

    //11.2
    int[] arr = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
    List<Integer> list = ListWizard.toList(arr);
    System.out.println(list);

    //11.3
    int numberListLength = 20;
    int repeatsQuantity = 20;
    List<Number> numbersList = new ArrayList<>(numberListLength * repeatsQuantity);
    Random rnd = new Random();
    for (int i = 0; i < numberListLength; i++) {
      for (int j = repeatsQuantity - 1; j >= 0; j--) {
        numbersList.add(rnd.nextInt(numberListLength));
      }
    }
    System.out.println("Числовий список до 11.3:");
    System.out.println(numbersList);
    System.out.println("Числовий список після 11.3:");
    System.out.println(ListWizard.findUnique(numbersList));

    //11.4
    System.out.println("Підрахунок повторень слів для 11.4:");
    Set<StringCounter> stringsOccurrence = ListWizard.calcOccurance(stringsList);
    StringCounterOutput sctOutput = new StringCounterTableOutput(stringsOccurrence);
    System.out.println("Вивід для 11.4**");
    System.out.println(sctOutput);
    System.out.println("Вивід для 11.4***");
    StringCounterOutput scJSONOutput = new StringCounterJSONOutput(stringsOccurrence);
    System.out.println(scJSONOutput);

    //phonebook
    System.out.println("Phonebook");
    Set<Record> records = new LinkedHashSet<>();
    records.add(new Record("Іванів", "+380661234567"));
    records.add(new Record("Іванів", "+380971234565"));
    records.add(new Record("Іванів", "+380631234563"));
    records.add(new Record("Петрів", "+380676543210"));
    records.add(new Record("Петрів", "+380506543211"));
    TelephoneDirectory td = new TelephoneDirectory(records);
    System.out.println(td);
    td.add(new Record("Петрів", "+380936543212"));
    td.add(new Record("Сидоренко", "+380951234567"));
    System.out.println(td);
    System.out.println("Пошук у телефонній книзі:");
    Record fr = td.find("Петрів");
    System.out.println(!("".equals(fr.getName())) ? "Знайдено перший запис: " + fr :
        "Нічого не знайдено");
    Set<Record> frs = td.findAll("Іванів");
    System.out.println("За Вашим запитом знайдено записів: " + frs.size());
    System.out.println(frs);
  }
}
