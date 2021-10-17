package frolov;

public class Student extends Human {
    private String secondLanguage;
    private boolean isStupid = false;

    public static void main(String[] args) {
        Student zahar = new Student();
        zahar.setName("Захар");
        zahar.setAge(15);
        zahar.setSex("M");
        zahar.setFavoriteAnimal("Жираф");
        zahar.setAboba(true);
        zahar.secondLanguage = "Английский";

        zahar.sleep();
        System.out.println("Абоба ли захар? " + zahar.isAboba());
        zahar.eat();
        System.out.println("Абоба ли захар? " + zahar.isAboba());
        System.out.println("Глупый ли захар? " + zahar.isStupid());
        zahar.setStupid(true);
        System.out.println("Глупый ли захар? " + zahar.isStupid());
        zahar.learn();
        System.out.println("Глупый ли захар? " + zahar.isStupid());
    }

    public void learn() {
        this.isStupid = false;
        System.out.println(this.getName() + " поучился.");
    }

    public String getSecondLanguage() {
        return this.secondLanguage;
    }

    public void setSecondLanguage(String newLanguage) {
        this.secondLanguage = newLanguage;
    }

    public boolean isStupid() {
        return this.isStupid;
    }

    public void setStupid(boolean isStupid) {
        this.isStupid = isStupid;
    }
}
