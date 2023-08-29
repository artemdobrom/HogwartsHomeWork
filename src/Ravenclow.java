public class Ravenclow extends Hogwarts {

    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclow(String name, int power, int transgression, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, power, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    private int sumFeatures() {
        return this.smart + this.wise + this.witty+this.fullOfCreativity;
    }

    public void compare(Ravenclow ravenclow) {
        if (this.sumFeatures() > ravenclow.sumFeatures()) {
            System.out.println(getName() + " сильнее " + ravenclow.getName());
        } else {
            System.out.println(ravenclow.getName() + " сильнее " + getName());
        }
    }


    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclow{" +
                super.toString() +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                '}';
    }
}
