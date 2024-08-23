public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Gandalf", 1000, "Mago");
        Heroi heroi2 = new Heroi("Conan", 30, "Guerreiro");
        Heroi heroi3 = new Heroi("Bruce Lee", 32, "Monge");
        Heroi heroi4 = new Heroi("Naruto", 17, "Ninja");

        // método atacar para cada herói
        heroi1.atacar();
        heroi2.atacar();
        heroi3.atacar();
        heroi4.atacar();
    }
}
