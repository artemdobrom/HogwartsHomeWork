public class Hogwarts {
    private final String name;
    private int power;
    private int transgression;

    Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public void compare(Hogwarts hogwarts) {
        if (power + transgression > hogwarts.getPower() + hogwarts.getPower()) {
            System.out.println(name + " сильнее " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " сильнее " + name);
        }
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", transgression=" + transgression +
                '}';
    }
}