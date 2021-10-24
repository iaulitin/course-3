package army;

class Unit {
    protected int hp;
    protected int atk;
    protected double armor;
    protected String name;
    protected boolean isAlive;

    Unit (double armor, String name){
        this.hp = 100;
        this.atk = 0;
        this.armor = armor;
        this.name = name;
        this.isAlive = true;
    }


    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public double getArmor() {
        return armor;
    }
    public void setArmor(double armor) {
        this.armor = armor;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    void status(Unit unit) {
        if (this.hp > 0) {
            isAlive = true;
        } else {
            isAlive = false;
            System.out.println("Press F");
        }
    }

    void attack(Unit unit) {
        System.out.println("Not implemented");
    }


}
