package army;

class Medic extends Unit {
    Medic(double armor, String name) {
        super(armor, name);
    }

    @Override
    public String toString() {
        return String.format ("Медик %s хп = %d, атака = %d, броня = %.1f, живой ли = %b", name, hp, atk, armor, isAlive);
    }

    @Override
    void attack(Unit target) {
        if (hp > 0) {
            System.out.println(this.name + " не может атаковать");
        } else {
            System.out.println(name + " не может атаковать, так мёртв(а) ");
        }
    }
}
