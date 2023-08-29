public class Puffindui extends Hogwarts {
    private int industriousness;
    private int faithful;
    private int honest;

    public Puffindui(String name, int power, int transgression, int industriousness, int faithful, int honest) {
        super(name, power, transgression);
        this.industriousness = industriousness;
        this.faithful = faithful;
        this.honest = honest;
    }

    private int sumFeatures() {
        return this.industriousness + this.faithful + this.honest;
    }

    public void compare(Puffindui puffindui) {
        if (this.sumFeatures() > puffindui.sumFeatures()) {
            System.out.println(getName() + " сильнее " + puffindui.getName());
        } else {
            System.out.println(puffindui.getName() + " сильнее " + getName());
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getFaithful() {
        return faithful;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return "Puffindui{" +
                super.toString() +
                "industriousness=" + industriousness +
                ", faithful=" + faithful +
                ", honest=" + honest +
                '}';
    }
}
