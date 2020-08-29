package day6.Task3;

import java.util.Random;

class Teacher {
    private String fio;
    private String article;

    public Teacher(String fio, String article) {
        this.fio = fio;
        this.article = article;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    String markLetter;


    public void markStudent(Student student) {
        Random random = new Random();
        int mark = 2 + random.nextInt(4);
        switch (mark) {
            case 2:
                markLetter = "неудовлетворительно";
                break;
            case 3:
                markLetter = "удовлетворительно";
                break;
            case 4:
                markLetter = "хорошо";
                break;
            case 5:
                markLetter = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s%n", fio, student.getFio(), article, markLetter);
    }
}

class Student {
    private String fio;

    public Student(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}
