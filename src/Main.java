import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<>(); // для строк

        magicBox1.add("Яблоко");
        magicBox1.add("Груша");
        magicBox1.add("Киви");
        magicBox1.add("Дыня");
        magicBox1.add("Виноград");
        magicBox1.add("Апельчин");


        System.out.println("Достали из первой коробки " + magicBox1.pick());
        System.out.println();


        MagicBox<Integer> magicBox2 = new MagicBox<>(); // для чисел

        magicBox2.add(300);
        magicBox2.add(500);
        magicBox2.add(700);
        magicBox2.add(900);
        magicBox2.add(1200);

        System.out.println("Достали из второй коробки " + magicBox2.pick());

    }
}