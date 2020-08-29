package day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Иванович", "Математика");
        Student student = new Student("Соловьев Евгений Олегович");

        teacher.markStudent(student);
    }
}
