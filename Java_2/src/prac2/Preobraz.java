package prac2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Preobraz {
    List<Human> humans;
    public Preobraz(){
        this.humans = new ArrayList<>();
        var h1 = new Human(20, "Ева", "Немойкина", LocalDate.of(2004, Month.NOVEMBER, 27), 50);
        var h2 = new Human(25, "Аня", "Тягина", LocalDate.of(1999, Month.AUGUST, 31), 65);
        var h3 = new Human(31, "Маша", "Флоринская", LocalDate.of(1993, Month.FEBRUARY, 6), 56);
        var h4 = new Human(56, "Алина", "Зубеева", LocalDate.of(1968, Month.MAY, 17), 62);
        var h5 = new Human(78, "Алена", "Смирнова", LocalDate.of(1946, Month.JUNE, 17), 49);
        var h6 = new Human(21, "Сабина", "Желобова", LocalDate.of(2003, Month.NOVEMBER, 25), 66);
        var h7 = new Human(23, "Саша", "Фридрих", LocalDate.of(2001, Month.AUGUST, 13), 80);
        var h8 = new Human(26, "Настя", "Лукьяненко", LocalDate.of(1998, Month.APRIL, 5), 49);
        var h9 = new Human(16, "Артем", "Лимонов", LocalDate.of(2008, Month.SEPTEMBER, 14), 75);
        var h10 = new Human(7, "Алена", "Кириллова", LocalDate.of(2017, Month.JUNE, 25), 35);
        this.humans.addAll(List.of(h1,h2,h3,h4,h5,h6,h7,h8,h9,h10));
    }
    public List<Human> lessWeight(){
        this.humans.stream().forEach((h) -> {
            h.weight -= 5;
        });
        return this.humans;
    }
    public List<Human> filterByDate(){
        LocalDate date = LocalDate.of(1999, Month.FEBRUARY, 3);
        return this.humans.stream().filter((h) -> date.isBefore(h.birthDate)).toList();
    }
    public String concatenation(){
        return this.humans.stream().map(h->h.lastName).reduce((h1,h2) -> h1 + " " + h2).get();
    }
}
