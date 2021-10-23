package army;

public class Main {
    public static void main(String[] args) {
        Soldier valera = new Soldier(20, 0.4, "Valera");


        Medic lena = new Medic(0, 0.2, "Lena");


        System.out.println(valera);
        System.out.println(lena);
        lena.attack(valera);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        valera.attack(lena);
        lena.attack(valera);
        System.out.println(valera);
    }
}
