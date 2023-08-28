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

    public void compare(Griffindor griffindor) {
        if (bravery + nobleness + honor > griffindor.getBravery() + griffindor.getNobleness() + getHonor()) {
            System.out.println(name + " сильнее " + griffindor.name);
        } else {
            System.out.println(griffindor.name + " сильнее " + name);
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
                "bravery=" + bravery +
                ", nobleness=" + nobleness +
                ", honor=" + honor +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}
