package Army;

public class Main {
    public static void main(String[] args) {
        Soldier Valeriy = new Soldier();
        Valeriy.setHp(100);
        Valeriy.setAtk(20);
        Valeriy.setArmor(0.5);
        Valeriy.setName("Valera");
        Valeriy.setAlive(true);

        Medic Elena = new Medic();
        Elena.setHp(100);
        Elena.setAtk(0);
        Elena.setArmor(0.2);
        Elena.setName("Lena");
        Elena.setAlive(true);

        System.out.println(Valeriy.toString());
        System.out.println(Elena.toString());
        Elena.attack(Valeriy);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Valeriy.attack(Elena);
        Elena.attack(Valeriy);
        System.out.println(Elena.toString());
    }
}
