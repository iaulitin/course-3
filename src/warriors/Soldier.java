package warriors;

public class Soldier extends Troop {
    private int killCount;

    public Soldier(String name) {
        super(name);
        this.killCount = 0;
    }

    @Override
    public void attack(Troop troop) {
        System.out.println("Die die!!!");
    }

    public int getKillCount() {
        return this.killCount;
    }

    public void increaseKills() {
        this.killCount++;
    }
}
