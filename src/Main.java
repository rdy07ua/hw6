import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Створити програму для виведення чисел від 1 до 10

        for (int t = 0; t <= 10; t++) {
            System.out.println(t);
        }


        // Показати всі парні числа в діапазоні від 1 до 100

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }



        // Знайти факторіал числа 7

      int number = 7, factorial = 1;
        for (int f = 1; f <= number; f++) {
            factorial *= f;
            System.out.println(factorial);

        }

        //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)

        int n1 = 0, n2 = 1, sum = 0;
        System.out.println(n1 + "\n" + n2 + "" );
        while (sum <=100) {
            sum = n1 + n2;
        if (sum > 100) {
            break;
        }
        System.out.println(sum + "" );
        n1 = n2;
        n2 = sum;
        }
        }


    }








