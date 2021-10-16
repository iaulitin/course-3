package tkhorzhevskiy;

public class Student extends Human {


    private int YearOfEducation;
    private boolean lazy = true;

    public void learn() {
        if (this.lazy) {
            System.out.println(this.getName() + " Не учится");
        } else {
            System.out.println(this.getName() + " Учится");
        }

    }
    public boolean getLazy() {
        return this.lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public int getYearOfEducation(){
        return this.YearOfEducation;
    }

    public void setYearOfEducation(int yearOfEducation) {
        YearOfEducation = yearOfEducation;
    }

}

