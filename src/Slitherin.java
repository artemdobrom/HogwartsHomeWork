public class Slitherin extends Hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambition;

    public Slitherin(String name, int power, int transgression, int cunning, int decisiveness, int ambition) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
    }

    public void compare(Slitherin slitherin) {
        if (cunning + decisiveness + ambition > slitherin.getCunning() + slitherin.getDecisiveness() + slitherin.getAmbition()) {
            System.out.println(name + " сильнее " + slitherin.name);
        } else {
            System.out.println(slitherin.name + " сильнее " + name);
        }
    }


    public int getCunning() {
        return cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    @Override
    public String toString() {
        return "Slitherin{" +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}
