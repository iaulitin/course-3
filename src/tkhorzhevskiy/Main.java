package tkhorzhevskiy;

public class Main {
    public static void main(String[] args) {
        Student volodya = new Student();
        volodya.setName("Vladimir") ;
        volodya.setSurname("Karyuk");
        volodya.setAge(25);
        volodya.setHeight(192);
        volodya.setWeight(92);
        volodya.setLazy(true);
        volodya.setYearofeducation(4);

        System.out.println(volodya.getName());
        System.out.println(volodya.getSurname());
        System.out.println(volodya.getAge());
        System.out.println(volodya.getHeight());
        System.out.println(volodya.getWeight());
        System.out.println(volodya.getYearofeducation());
        System.out.println(volodya.getLazy());

        volodya.eat();
        volodya.sleep();
        volodya.learn();

    }
}
