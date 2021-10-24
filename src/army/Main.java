package army;

public class Main {
    public static void main(String[] args) {
        Soldier valera = new Soldier(20, 0.4, "Valera");
        Soldier andrey = new Soldier(0, 0.4, "Andrey");
        Medic lena = new Medic(0.2, "Lena");


        System.out.println(valera);
        System.out.println(lena);
        lena.attack(valera);
        while(lena.isAlive){
            valera.attack(lena);
        }
        lena.attack(valera);
        System.out.println(valera);
        andrey.attack(valera);
    }
}
