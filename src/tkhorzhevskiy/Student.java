package tkhorzhevskiy;

public class Student extends Human {
    private int yearofeducation;
    private boolean isLazy = true;
    public void learn() {
        if (this.isLazy) {
            System.out.println(this.getName() + " Не учится");
        } else {
            System.out.println(this.getName() + " Учится");
        }
    }
    public int getYearofeducation(){
        return this.yearofeducation;
    }
    public void setYearofeducation(int yearofeducation) {
        this.yearofeducation = yearofeducation;
    }
    public boolean getLazy() {
        return this.isLazy;
    }
    public void setLazy(boolean isLazy) {
        this.isLazy = isLazy;
    }

}

