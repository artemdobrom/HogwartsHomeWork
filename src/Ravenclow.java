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

    public void compare(Ravenclow ravenclow) {
        if (smart + wise + witty + fullOfCreativity > ravenclow.getSmart() + ravenclow.getWise() + ravenclow.getWitty() + ravenclow.getFullOfCreativity()) {
            System.out.println(name + " сильнее " + ravenclow.name);
        } else {
            System.out.println(ravenclow.name + " сильнее " + name);
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
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}
