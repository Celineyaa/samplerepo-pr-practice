public class Celine {
    private String duck;

    public Celine() {
        this.duck = "duckBaby";
    }

    public static void main(String[] args) {
        Celine duck = new Celine();
        System.out.println(duck.getName());
    }

    public String getName() {
        return this.duck;
    }
}
