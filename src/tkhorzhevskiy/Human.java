package tkhorzhevskiy;

public class Human {
    private int age;
    private int weight;
    private int height;
    private String name;
    private String surname;

    void eat() {
        System.out.println(this.name + surname + " покушал");
    }

    void sleep() {
        System.out.println(this.name + surname + " поспал");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
