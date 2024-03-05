public class Celine {
    private String duck;
    private int age;

    public Celine() {
        this.duck = "duckBaby";
        this.age = 3;
    }

    public static void main(String[] args) {
        Celine duck = new Celine();
        System.out.println(duck.getName() + duck.getAge());
    }

    public String getName() {
        return this.duck;
    }

    public int getAge() {
        return this.age;
    }
}
