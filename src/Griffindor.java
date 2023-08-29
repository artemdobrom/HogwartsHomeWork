public class Griffindor extends Hogwarts {
    private int bravery;
    private int nobleness;
    private int honor;


    public Griffindor(String name, int power, int transgression, int bravery, int nobleness, int honor) {
        super(name, power, transgression);
        this.bravery = bravery;
        this.nobleness = nobleness;
        this.honor = honor;
    }


    private int sumFeatures() {
        return this.nobleness + this.honor + this.bravery;
    }

    public void compare(Griffindor griffindor) {
        if (this.sumFeatures() > griffindor.sumFeatures()) {
            System.out.println(getName() + " сильнее " + griffindor.getName());
        } else {
            System.out.println(griffindor.getName() + " сильнее " + getName());
        }
    }

    public int getBravery() {
        return bravery;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                super.toString() +
                "nobleness=" + nobleness +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
    }


