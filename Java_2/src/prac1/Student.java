package prac1;

public class Student implements Compartor<Student>{
    public int TotalPoint;
    public String name;
    public Student(String n, int totalPoint) {
        TotalPoint = totalPoint;
        name = n;
    }

    @Override
    public String compare(Student s1, Student s2) {
        int difference = s1.TotalPoint - s2.TotalPoint;
        if (difference > 0){
            return "Студент " + s1.name + " имеет больше баллов, чем студент " + s2.name + " на " + difference;
        } else if (difference < 0){
            return "Студент " + s1.name + " имеет меньше баллов, чем студент " + s2.name + " на " + difference*(-1);
        }
        return "У студентов одинаковое количество баллов";
    }

    public static void main(String[] args) {
        Student student1 = new Student("Виктор",85);
        Student student2 = new Student("Евгений",87);
        System.out.println(student1.compare(student1, student2));

        Student student3 = new Student("Александр",50);
        Student student4 = new Student("Тимофей",25);
        System.out.println(student3.compare(student3, student4));
        
        Student student5 = new Student("Никита",85);
        Student student6 = new Student("Алексей",85);
        System.out.println(student5.compare(student5, student6));
    }
}
