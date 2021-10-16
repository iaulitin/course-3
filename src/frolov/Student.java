package frolov;

public class Student extends Human {
    String secondLanguage;
    boolean isStupid = false;

    public static void main(String[] args) {
        Student zahar = new Student();
        zahar.name = "Захар";
        zahar.age = 15;
        zahar.sex = "М";
        zahar.favoriteAnimal = "Жираф";
        zahar.aboba = true;
        zahar.secondLanguage = "Английский";

        zahar.sleep();
        System.out.println(zahar.getAboba());
        zahar.eat();
        System.out.println(zahar.getAboba());
        System.out.println(zahar.getIsStupid());
        zahar.setIsStupid("очинь умный");
        System.out.println(zahar.getIsStupid());
        zahar.learn();
        System.out.println(zahar.getIsStupid());
    }

    public void learn() {
        this.isStupid = false;
        System.out.println(this.name + " поучился.");
    }

    public String getSecondLanguage() {
        if (this.secondLanguage == null) {
            return "Знает только русский";
        } else {
            return this.secondLanguage;
        }
    }

    public void setSecondLanguage(String newLanguage) {
        this.secondLanguage = newLanguage;
    }

    public String getIsStupid() {
        return this.isStupid ? this.name + " глупенький" : this.name + " умненький";
    }

    public void setIsStupid(String mind) {
        if (mind.equals("умный")) {
            this.isStupid = false;
        } else {
            this.isStupid = true;
        }
    }
}
