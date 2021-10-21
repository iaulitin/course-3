package Army;

public class Soldier extends Unit {
    @Override
    public String toString() {
        return "Warrior{" +
                "hp=" + getHp() +
                ", atk=" + getAtk() +
                ", armor=" + getArmor() +
                ", имя='" + getName() + '\'' +
                ", живой ли=" + getAlive() +
                '}';
    }

    @Override
    void attack(Unit target) {
        if (getHp() > 0) {
            if (target.getAlive()) {
                System.out.println(getName() + " стреляет по " + target.getName() + " и наносит " + getAtk() + " урона ");
                target.setHp((int) (target.getHp() - getAtk() * (1 - target.getArmor())));
                target.status(this);
                if (target.getAlive()) {
                    System.out.println("У " + target.getName() + " осталось " + target.getHp() + " здоровья");
                }
            } else {
                System.out.println(getName() + " уже убил " + target.getName());
            }
        } else {
            System.out.println(getName() + " не может атаковать, так как мёртв(а) ");
        }
    }
}
