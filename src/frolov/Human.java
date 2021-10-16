package frolov;


public class Human {
    String name;
    int age;
    String sex;
    String favoriteAnimal;
    boolean aboba;

    public void eat() {
        System.out.println(this.name + " поел. Теперь он - абоба!");
        this.aboba = true;
    }

    public void sleep() {
        System.out.println(this.name + " поспал. Теперь он - не абоба!");
        this.aboba = false;
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

    public String getAboba() {
        if (this.aboba) {
            return this.name + " является абобой";
        }
        return this.name + " не является абобой";
    }

    public void setAboba(String aboba) {
        this.aboba = aboba.equals("aboba");
    }
}
