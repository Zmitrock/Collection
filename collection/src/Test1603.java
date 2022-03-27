import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test1603 {
    public static void main(String[] args) throws IOException {
//        Задание 1
//        Пользователь вводит с клавиатуры набор чисел. По-
//                лученные числа необходимо сохранить в список. После
//        чего нужно показать меню, в котором предложить поль-
//                зователю набор пунктов:
//        1. Добавить элемент в список;
//        2. Удалить элемент из списка;
//        3. Показать содержимое списка;
//        4. Проверить есть ли значение в списке;
//        5. Заменить значение в списке.
//        В зависимости от выбора пользователя выполняется
//        действие, после чего меню отображается снова.

        LinkedList<Integer> numbers = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите набор чисел");
        String str = reader.readLine();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
                for (int j = i + 1; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) {
                        sb.append(str.charAt(j));
                        i=j;
                    } else {
                        i = j;
                        break;
                    }
                }
                numbers.add(Integer.parseInt(sb.toString()));
            }
        }
        boolean flag = true;
        while (flag) {
            System.out.println("1. Добавить элемент в список");
            System.out.println("2. Удалить элемент из списка");
            System.out.println("3. Показать содержимое списка");
            System.out.println("4.Проверить есть ли значение в списке");
            System.out.println("5. Заменить значение в списке");
            System.out.println("0. Завершить выполнение программы");
            switch (inputMenu()) {
                case 1:
                    System.out.println("введите значение (число), которое необходимо добавить в список");
                    try {
                        numbers.add(inputNum());
                    } catch (NullPointerException ex) {
                        System.out.println("Неорректный ввод");
                    }
                    break;
                case 2:
                    System.out.println("введите значение, которое нужно удалить из списка");
                    try {
                        Integer z = inputNum();
                        numbers.removeIf(x -> x.equals(z));
                    } catch (NullPointerException ex) {
                        System.out.println("Некорректный ввод");
                    }
                    break;
                case 3:
                    System.out.println("Список: " + numbers);
                    break;
                case 4:
                    System.out.println("введите проверяемое значение");
                    try {
                        if (numbers.contains(inputNum())) {
                            System.out.println("Значение есть в списке");
                        } else
                            System.out.println("Значения нет в списке");
                    } catch (NullPointerException ex) {
                        System.out.println("Некорректный ввод");
                    }
                    break;
                case 5:
                    System.out.println("введите значение, которое нужно заменить");
                    int y = inputNum();
                    System.out.println("введите новое значение");
                    int newX = inputNum();
                    try {
                        numbers.set(numbers.indexOf(y), newX);
                    } catch (NullPointerException ex) {
                        System.out.println("Некорректный ввод");
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("Значения, которое нужно заменить, нет в списке");
                    }
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }

    public static int inputMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        int answer = -1;
        try {
            answer = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("incorrect input!!! Try again");
        }
        return answer;
    }

    public static int inputNum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberString = reader.readLine();
        Integer number = null;
        try {
            number = Integer.parseInt(numberString);
        } catch (NumberFormatException ex) {
            try {
                double userNumberDouble = Double.parseDouble(numberString);
                System.out.println("Введено нецелое число. Необходимо ввести целое число");
            } catch (NumberFormatException exception) {
                System.out.println("Введено некорректное значение. Необходимо ввести целое число ");
            }
        }
        return number;
    }

}
