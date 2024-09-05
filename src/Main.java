import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 public static void main(String[] args) {



        //Задача 1: Четное или нечетное число
//       Scanner in =new Scanner(System.in);
//        System.out.print("Input a number: ");
//        int num = in.nextInt();
//        if (num%2==0) {
//            System.out.println("число четное");
//        } else {
//            System.out.println("число нечетное");
//        }
////////////////////////////////////////////////////////
//
//        //Задача 2: Минимальное из трех чисел
//        System.out.print("Input first number: ");
//        int n1 = in.nextInt();
//        System.out.print("Input second number: ");
//        int n2 = in.nextInt();
//        System.out.print("Input third number: ");
//        int n3 = in.nextInt();
//        int[] ar = {n1, n2, n3};
//        int min=ar[1];
//        for (int i = 1; i < ar.length; i++) {
//            if (ar[i] < min) {
//                min = ar[i];
//            }
//        }
//     System.out.println(min);
////////////////////////////////////////////////////////
//
//        //Задача 3: Таблица умножения
//     for (int i =1;i<11;i++){
//         int k=i*5;
//         System.out.println("5 * "+i+" = "+k);
//     }
////////////////////////////////////////////////////////
//
////        Задача 4: Сумма чисел от 1 до N
//     System.out.print("Input N: ");
//        int N = in.nextInt();
//        for (int i=N; i>N/2;i--){
//         int nn = N-i;
//            System.out.println(i+" + "+nn+" = "+N);
//     }
////////////////////////////////////////////////////////
//
////        Задача 5: Число Фибоначчи
//     System.out.print("Input NN: ");
//        int NN = in.nextInt();
//     int[] f = new int[NN];
//     f[0] = 0;
//     f[1] = 1;
//     for (int i = 2; i < NN; ++i) {
//         f[i] = f[i - 1] + f[i - 2];
//     }
//     for (int i = 0; i < NN; ++i) {
//         System.out.println(f[i]);
//     }
////////////////////////////////////////////////////////
//
////                Задача 6: Проверка простого числа
//     System.out.print("Input NNN: ");
//        int NNN = in.nextInt();
//boolean b = true;
//     if(NNN < 2) b=false;
//     else{for(int i = 2; i <= NNN / 2; i++) {
//         if(NNN % i == 0) {
//             b=false;
//         }
//     }}
//     if (b){
//         System.out.println("простое");
//     }
//     else{
//         System.out.println("не простое");
//     }
////////////////////////////////////////////////////////
//
////        Задача 7: Обратный порядок чисел
//     System.out.print("Input number: ");
//        int numb = in.nextInt();
//        for (int i=numb;i>0;i--){
//            System.out.println(i);
//        }
////////////////////////////////////////////////////////
//
////                Задача 8: Сумма четных чисел
//     System.out.print("Input A: ");
//        int A = in.nextInt();
//     System.out.print("Input B: ");
//     int B = in.nextInt();
//     int sum =0;
//     for (int i = A;i<=B;i++){
//         if(i%2==0){
//             sum=sum+i;
//         }
//     }
//    System.out.println(sum);
//     //////////////////////////////////////////////////////
//
//    //Задача 9: Реверс строки
////        Условие:
////        Пользователь вводит строку. Программа должна вывести эту строку в обратном порядке.
//     System.out.print("Введите строку: ");
//       String str = in.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(reversed);
//////////////////////////////////////////////////////

     //Задача 10: Количество цифр в числе
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        String number = in.nextLine();
//        int digitCount = number.replace("-", "").length();
//        System.out.println("Количество цифр в " + number + ": " + digitCount);
//////////////////////////////////////////////////////

     //Задача 11: Факториал числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число N: ");
//        int n = in.nextInt();
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал " + n + " равен " + factorial);
//////////////////////////////////////////////////////

     //Задача 12: Сумма цифр числа
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = in.nextInt();
//        int sum = 0;
//        number = Math.abs(number);
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        System.out.println(sum);
//////////////////////////////////////////////////////

     //Задача 13: Палиндром
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String str = in.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        if(reversed.equals(str)){
//            System.out.println("палиндром");
//        } else {
//            System.out.println(" не палиндром");
//        }
//////////////////////////////////////////////////////

     //Задача 14: Найти максимальное число в массиве
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int max = array[0];
//        for (int num : array) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println("max);
//////////////////////////////////////////////////////

     //Задача 15: Сумма всех элементов массива
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер: ");
//        int size = in.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        System.out.println("sum);
//////////////////////////////////////////////////////

     //Задача 16: Количество положительных и отрицательных чисел
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размер: ");
//        int size = in.nextInt(); int[] array = new int[size];
//        System.out.println("Введите элементы:");
//        for (int i = 0; i < size; i++) {
//            array[i] = in.nextInt();
//        }
//        int positiveCount = 0, negativeCount = 0;
//        for (int num : array) {
//            if (num > 0) positiveCount++;
//            else if (num < 0) negativeCount++;
//        }
//        System.out.println("Количество положительных чисел: " + positiveCount);
//        System.out.println("Количество отрицательных чисел: " + negativeCount);
//////////////////////////////////////////////////////

     //Задача 17: Простые числа в диапазоне
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите A и B: ");
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
//        for (int i = A; i <= B; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//    private static boolean isPrime(int num) {
//        if (num < 2) return false;
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//////////////////////////////////////////////////////

     //Задача 18: Подсчет гласных и согласных в строке
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку: ");
//        String input = in.nextLine().toLowerCase();
//        int vowelCount = 0, consonantCount = 0;
//        for (char ch : input.toCharArray()) {
//            if (Character.isLetter(ch)) {
//                if ("aeiouyAEIOUYаеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(ch) != -1)
//                {
//                    vowelCount++;
//                } else
//                {
//                    consonantCount++;
//                }
//            }
//        }
//        System.out.println("Количество гласных: " + vowelCount);
//        System.out.println("Количество согласных: " + consonantCount);
//////////////////////////////////////////////////////

     //Задача 19: Перестановка слов в строке
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите строку, состоящую из нескольких слов: ");
//        String n = in.nextLine();
//        String[] words = n.split(" ");
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i]);
//            if (i != 0) reversed.append(" ");
//        }
//        System.out.println("Слова в обратном порядке: " + reversed.toString());
//////////////////////////////////////////////////////

     //Задача 20: Число Армстронга
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        int num = in.nextInt();
//        int originalNumber = num;
//        int sum = 0;
//        int digitsCount = String.valueOf(num).length();
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, digitsCount);
//            num /= 10;
//        }
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " является числом Армстронга!");
//        } else {
//            System.out.println(originalNumber + " не является числом Армстронга!");
//        }
 }
}
