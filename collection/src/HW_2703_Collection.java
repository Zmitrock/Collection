import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;
public class HW_2703_Collection {
    public static void main(String[] args) throws IOException {
        //Задача 1
        //Дан список некоторых целых чисел, найдите значение 20 в нем и, если оно присутствует,
        // замените его на 200. Обновите список только при первом вхождении числа 20.
        System.out.println("Task1.***********");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 20, 5, 351, 23, 46, 20, 45,23));
        if (numbers.contains(20)) {
            numbers.set(numbers.indexOf(20), 200);
            System.out.println(numbers);
        }
//        Задача 2
//        Необходимо удалить пустые строки из списка строк.
        System.out.println("Task2.***********");
        LinkedList<String> strings = new LinkedList<>();
        strings.addAll(Arrays.asList("Ivan", "John", "Fedor", "", "Olga", "", "Viktor"));
        strings.removeIf(x -> x.isEmpty());
        System.out.println(strings);
//        Задача 3
//        Дан список чисел. Превратите его в список квадратов этих чисел.
        System.out.println("Task3.***********");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.addAll(Arrays.asList(1, 20, 5, 351, 23, 46, 20, 45));
        for (int i = 0; i < numbers3.size(); i++) {
            numbers3.set(i, ((int) Math.pow(numbers3.get(i), 2)));
        }
        System.out.println(numbers3);
//        Задача 4
//        Дан список чисел, необходимо удалить все вхождения числа 20 из него.
        System.out.println("Task4.***********");
        ArrayList<Integer> numbers4 = new ArrayList<>();
        numbers4.addAll(Arrays.asList(1, 20, 5, 351, 23, 46, 20, 45));
        numbers4.removeIf(x -> x == 20);
        System.out.println(numbers4);
//        Задача 5
//        Необходимо вывести список в обратном порядке.
        System.out.println("Task5.***********");
        System.out.println("Исходный список " + numbers4);
        System.out.print("Список в обратном порядке: ");
        for (int i = numbers4.size() - 1; i >= 0; i--) {
            System.out.print(numbers4.get(i) + " ");
        }
//        Iterator <Integer> iterator=numbers4.iterator();
//        iterator
//        Задача 6
//        Заполнить список ста нулями, кроме первого и последнего элементов, которые должны
//        быть равны единице.
        System.out.println("\nTask6.***********");
        LinkedList<Integer> numbers6 = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            numbers6.add(0);
        }
        numbers6.addFirst(1);
        numbers6.addLast(1);
        System.out.println(numbers6);
//        Задача 7.
//        Сформировать возрастающий список из чётных чисел (количество элементов 45).
        System.out.println("Task7.***********");
        LinkedList<Integer> numbers7 = new LinkedList<>();
        int a = 2;
        for (int i = 0; i < 45; i++) {
            numbers7.add(a);
            a += 2;
        }
        System.out.println(numbers7);
//        Задача 8.
//        Пользователь вводит число. Определить, содержит ли список данное число x. Если содержит,
//        то вывести на экран число 7145, если не содержит, то вывести на экран число 5741;
//        Найдите сумму и произведение элементов списка. Результаты вывести на экран.
        System.out.println("Task8.***********");
        System.out.println("Исходный список"+numbers);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String numString = reader.readLine();
        Integer num = null;
        try {
            num = Integer.parseInt(numString);
            if (numbers.contains(num)) {
                System.out.println(7145+" - Элемент содержится в списке");
            } else {
                System.out.println(5741+" - Элемент НЕ содержится в списке");
            }
        } catch (NumberFormatException ex) {
            try {
                double userNumberDouble = Double.parseDouble(numString);
                System.out.println("Введено нецелое число. Необходимо ввести целое число");
            } catch (NumberFormatException exception) {
                System.out.println("Введено некорректное значение. Необходимо ввести целое число ");
            }
        }
        int sum = 0;
        long mult = 1;
        for (int i = 0; i <numbers.size() ; i++) {
            sum = sum+numbers.get(i);
            mult = mult*numbers.get(i);
        }
        System.out.println("Сумма элементов списка "+sum);
        System.out.println("Произведение элементов списка "+mult);
//        Задача 9.
//        Найти наибольший элемент списка и вывести его на экран;
//        Определите, есть ли в списке повторяющиеся элементы, если да, то вывести на экран это значение;
//        Поменять местами самый большой и самый маленький элементы списка
        System.out.println("Task9.***********");
        System.out.println("Исходный список"+numbers);
        numbers.add(46);
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size() ; i++) {
            if (numbers.get(i)>max) {
                max=numbers.get(i);
            }
            if (numbers.get(i)<min) {
                min = numbers.get(i);
            }
            for (int j = i+1; j <numbers.size() ; j++) {
                if (numbers.get(i)== numbers.get(j)){
                    System.out.println("Повторяющееся значение "+numbers.get(i));
                }
            }
        }
        System.out.println("Наибольший элемент списка "+max);
        int indexMax = numbers.indexOf(max);
        int indexMin = numbers.indexOf(min);
        numbers.set(indexMin,max);
        numbers.set(indexMax,min);
        System.out.println(numbers);
    }
}
