package warriors;

public class Troop {
    protected String name;
    protected int hp;

    public Troop(String name) {
        this.name = name;
        this.hp = 100;
    }

    public void attack(Troop troop) {
        System.out.println("Not implemented");
    }
}
