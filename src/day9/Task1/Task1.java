package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Евгений", "МР12");
        Teacher teacher = new Teacher("Иван Иванович", "Алгебра");

        System.out.println(student.getName());
        System.out.println(teacher.getNameOfArticle());

        student.printInfo();
        teacher.printInfo();

    }
}