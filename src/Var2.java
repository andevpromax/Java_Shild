public class Var2 {
    public static void main(String[] args) {
        int var;
        double x;

        var = 10;
        x = 10.5;

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной х: " + x);
        System.out.println();

        var = var/4;
        x = x/4;

        System.out.println("Значение переменной var после деления - " + var);
        System.out.println("Значение переменной x после деления - " + x);

    }
}
