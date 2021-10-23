package warriors;

public class Medic extends Troop {
    private int healingCount;

    public Medic(String name) {
        super(name);
        this.healingCount = 0;
    }

    @Override
    public void attack(Troop troop) {
        System.out.println("I can not shoot");
    }
}
