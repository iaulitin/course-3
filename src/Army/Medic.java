package Army;

class Medic extends Unit {
    @Override
    public String toString() {
        return "Army.Medic{" +
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
            System.out.println(this.getName() + " не может атаковать");
        } else {
            System.out.println(getName() + " не может атаковать, так мёртв(а) ");
        }
    }
}
