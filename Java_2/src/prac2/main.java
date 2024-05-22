package prac2;

public class main {
    public static void main(String[] args) {
        var test = new Preobraz();
        System.out.println("///Уменишение веса на 5///");
        test.lessWeight().forEach((h) -> {System.out.print(h.firstName + " " + h.lastName + " " + h.weight + "\n");});

        System.out.println("///Дата рождения меньше 3 февраля 1999///");
        test.filterByDate().forEach((h) -> {System.out.print(h.firstName + " " + h.lastName + " " + h.birthDate + "\n");});

        System.out.println("///Конкатенаяция фамилий в строку///");
        System.out.print(test.concatenation());
        }
}
