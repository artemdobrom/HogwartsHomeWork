// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Griffindor("Гарри ", 1, 2, 5, 4, 5),
                new Griffindor("Гермиона ", 1, 2, 2, 4, 4),
                new Griffindor("Рон ", 1, 1, 2, 3, 4),
                new Slitherin("Малфой ", 4, 1, 4, 3, 4),
                new Ravenclow("Лин ", 2, 1, 4, 1, 1, 3),
        };
        for (int i = 0; i < hogwarts.length; i++) {
            for (int j = i+i; j <hogwarts.length-1 ; j++) {
                hogwarts[i].compare(hogwarts[j]);
            }
        }
        Griffindor harry = (Griffindor) hogwarts[0];
        Griffindor ron = (Griffindor) hogwarts[2];

        harry.compare(ron);
}
    }
