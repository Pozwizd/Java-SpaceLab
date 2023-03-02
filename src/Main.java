import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // input
        System.out.println("Введите количество значений");
        Scanner numbers = new Scanner(System.in);
        int inputNumbers = numbers.nextInt();
        int[] massive = new int[inputNumbers];

        for (int i = 0; i < inputNumbers; i++) {
            System.out.println(String.format("Введите число, осталось ввести %x значений", -i+inputNumbers));
            Scanner number = new Scanner(System.in);
            massive[i] = number.nextInt();
        }
        System.out.println(massive);

        // sorting
        int note;
        for (int y = 0; y < inputNumbers; y++) {
            for (int i = 0; i < inputNumbers; i++) {
                try {
                    if (massive[i] > massive[i+1]){
                        note = massive[i+1];
                        massive[i+1] = massive[i];
                        massive[i] = note;
                    }
                } catch (Exception e){
                    break;
                }
            }
        }
        // print result
        for (int i: massive) {
            System.out.println(i);
        }

    }

}

