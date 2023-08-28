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

    public void compare(Puffindui puffindui) {
        if (industriousness + faithful + honest > puffindui.getIndustriousness() + puffindui.getFaithful() + puffindui.getHonest()) {
            System.out.println(name + " сильнее " + puffindui.name);
        } else {
            System.out.println(puffindui.name + " сильнее " + name);
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
                "industriousness=" + industriousness +
                ", faithful=" + faithful +
                ", honest=" + honest +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}
