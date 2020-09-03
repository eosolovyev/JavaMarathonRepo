package day9.Task1;

public class Teacher extends Human {
    private String nameOfArticle;

    public String getNameOfArticle() {
        return nameOfArticle;
    }

    public void setNameOfArticle(String nameOfArticle) {
        this.nameOfArticle = nameOfArticle;
    }

    public Teacher(String name, String nameOfArticle) {
        super(name);
        this.nameOfArticle = nameOfArticle;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}
