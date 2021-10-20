package warriors;

public class warrior {
    int hp;
    boolean isAlive;
    int attackForce;
    double armor;
    String name;
    static warrior currWarrior;

    public warrior(int attackForce, double armor, String name) {
        this.hp = 100;
        this.isAlive = true;
        this.attackForce = attackForce;
        this.armor = armor;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Воин " + name + ", хп: " + hp + ", сила атаки: " + attackForce + ", броня: " + armor;
    }


    private void checkHp(warrior killer) {
        if (this.hp <= 0) {
            isAlive = false;
            System.out.println(name + " погиб от рук " + killer.name);
        }
    }

    public void attack(warrior enemy) {
        if (this == currWarrior) {
            if (attackForce > 0) {
                if (enemy.isAlive) {
                    // "реакция" атакующего
                    System.out.println(name + " атакует (" + attackForce + " атаки) " + enemy.name + " (" + enemy.hp + " hp и " + enemy.armor + " брони).");
                    enemy.hp = (int) (enemy.hp - attackForce * (1 - enemy.armor));
                    enemy.checkHp(this);
                    if (enemy.isAlive) {
                        // "реакция" атакуемого
                        System.out.println("Теперь у " + enemy.name + " " + enemy.hp + " хп.");
                    }
                } else {
                    System.out.println(name + " пытается атаковать мертвеца. " + enemy.name + " мертв.");
                }
            } else {
                System.out.println(name + " не может атаковать, т.к. у него 0 атаки.");
            }
        } else {
            if (currWarrior == null) {
                System.out.println(name + " не модет атакрвать, т.к. сейчас никто не выбран.");
            } else {
                System.out.println(name + " не модет атакрвать, т.к. сейчас выбран " + currWarrior.name);
            }
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
        warrior f1 = new warrior(10, 0.1, "f1");
        warrior f2 = new warrior(20, 0.2, "f2");
        warrior f3 = new warrior(0, 0, "f3");
        f2.select();
        f2.attack(f1);
        f3.select();
        f3.attack(f1);
        f2.select();
        while (f3.isAlive) {
            f2.attack(f3);
        }
        f3.select();
    }

}
