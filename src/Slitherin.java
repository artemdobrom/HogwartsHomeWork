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

    private int sumFeatures() {
        return this.cunning + this.decisiveness + this.ambition;
    }

    public void compare(Slitherin slitherin) {
        if (this.sumFeatures() > slitherin.sumFeatures()) {
            System.out.println(getName() + " сильнее " + slitherin.getName());
        } else {
            System.out.println(slitherin.getName() + " сильнее " + getName());
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
                super.toString() +
                "cunning=" + cunning +
                ", decisiveness=" + decisiveness +
                ", ambition=" + ambition +
                '}';
    }



}
