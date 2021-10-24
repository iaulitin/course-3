package army;

public class Soldier extends Unit {
    Soldier(int atk, double armor, String name) {
        super(armor, name);
        this.atk = atk;
    }

    @Override
    public String toString() {
        return String.format("Солдат %s хп = %d, атака = %d, броня = %.1f, живой ли = %b", name, hp, atk, armor, isAlive);
    }


    @Override
    void attack(Unit target) {
        if (atk<=0){
            System.out.println(name + " не может атаковать");
            return;
        }
        if (!isAlive) {
            System.out.println(name + " не может атаковать, так как мёртв(а) ");
            return;
        }
        if (!target.isAlive) {
            System.out.println(name + " уже убил " + target.name);

            return;
        }

        System.out.println(name + " стреляет по " + target.name + " и наносит " + atk + " урона ");
        target.setHp((int) (target.hp - atk * (1 - target.armor)));
        target.status(target);
        if (target.isAlive) {
            System.out.println("У " + target.name + " осталось " + target.hp + " здоровья");
        }

    }
}


