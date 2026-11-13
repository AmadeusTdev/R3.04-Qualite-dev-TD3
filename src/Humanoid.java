public abstract class Humanoid {
    private String name;
    private String gender;
    private int age;
    private int hunger;
    private int tiredness;
    private int xmasMagic;

    public Humanoid(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hunger = 0;
        this.tiredness = 0;
        this.xmasMagic = 0;
    }

    public void emitSound() {} // Pour émettre un son
    public void move() {} // Pour se déplacer
    public void restore() {} // Pour se restaurer
    public void doActivity() {} // Pour faire une activité (se reposer est une activité)
    public void modifyXmasMagic(int amount) {
        xmasMagic += amount;
    } // Pour modifier la magie de Noël
}
