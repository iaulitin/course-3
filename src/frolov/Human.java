package frolov;


public class Human {
    private String name;
    private int age;
    private String sex;
    private String favoriteAnimal;
    private boolean isAboba;

    public void eat() {
        System.out.println(this.name + " поел. Теперь он - абоба!");
        this.isAboba = true;
    }

    public void sleep() {
        System.out.println(this.name + " поспал. Теперь он - не абоба!");
        this.isAboba = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFavoriteAnimal() {
        return this.favoriteAnimal;
    }

    public void setFavoriteAnimal(String favoriteAnimal) {
        this.favoriteAnimal = favoriteAnimal;
    }

    public boolean isAboba() {
        return this.isAboba;
    }

    public void setAboba(boolean isAboba) {
        this.isAboba = isAboba;
    }
}
