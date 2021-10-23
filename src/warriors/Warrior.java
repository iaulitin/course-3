package warriors;

public class Warrior extends Soldier{
    private boolean isAlive;
    private final int attackForce;
    private final double armor;
    private static Warrior currWarrior;

    public Warrior(int attackForce, double armor, String name) {
        super(name);
        this.isAlive = true;
        this.attackForce = attackForce;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("Воин %s, хп: %d, сила атаки: %d, броня: %2.1f, убийств: %d",
                name, hp, attackForce, armor, getKillCount());
    }

    public boolean isAlive() {
        return isAlive;
    }

    private void checkHp(Warrior killer) {
        if (hp <= 0) {
            isAlive = false;
            System.out.println(name + " погиб от рук " + killer.name);
            killer.increaseKills();
        }
    }

    public void attack(Warrior enemy) {
        if (currWarrior == null) {
            System.out.println(name + " не может атаковать, т.к. сейчас никто не выбран.");
            return;
        }

        if (this != currWarrior) {
            System.out.println(name + " не может атаковать, т.к. сейчас выбран " + currWarrior.name);
            return;
        }

        if (this == enemy) {
            System.out.println(name + " не может атаковать самого себя.");
            return;
        }

        if (attackForce <= 0) {
            System.out.println(name + " не может атаковать, т.к. у него 0 атаки.");
            return;
        }

        if (!enemy.isAlive) {
            System.out.println(name + " пытается атаковать мертвеца. " + enemy.name + " мертв.");
            return;
        }

        String text = String.format("%s атакует (%d атаки) %s (%d hp и %2.1f брони).",
                name, attackForce, enemy.name, enemy.hp, enemy.armor);
        System.out.println(text);

        enemy.hp = (int) (enemy.hp - attackForce * (1 - enemy.armor));
        enemy.checkHp(this);

        if (enemy.isAlive) {
            // "реакция" атакуемого
            System.out.println("Теперь у " + enemy.name + " " + enemy.hp + " хп.");
        }


    }


    public void select() {
        if (this.isAlive) {
            currWarrior = this;
            System.out.println("Выбран " + this);
        } else {
            System.out.println("Нельзя выбрать мертвеца. " + name + " мертв.");
        }
    }


    public static void main(String[] args) {
        Warrior f1 = new Warrior(10, 0.1, "f1");
        Warrior f2 = new Warrior(20, 0.2, "f2");
        Warrior f3 = new Warrior(0, 0, "f3");
        f2.select();
        f2.attack(f1);
        f3.select();
        f3.attack(f1);
        f2.select();
        while (f3.isAlive()) {
            f2.attack(f3);
        }
        f2.attack(f3);
        f2.select();
        System.out.println(f2);
    }

}
