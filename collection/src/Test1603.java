import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1603 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int a;
        do
        {  System.out.println("введите число");
            int n= sc.nextInt();
            numbers.add(n);
            System.out.println(" если хотите продолжить - введите 1");
             a= sc.nextInt();}
            while (a==1);
        System.out.println("1. Добавить элемент в список");
        System.out.println("2. Удалить элемент из списка");
        System.out.println("3. Показать содержимое списка");
        System.out.println("4.Проверить есть ли значение в списке");
        System.out.println("5. Заменить значение в списке");
        int k = sc.nextInt();
        switch (k) {
            case 1:
                System.out.println("введите значение");
                int n = sc.nextInt();
                numbers.add(n);
                break;
            case 2:
                System.out.println("введите удаляемое значение");
                int z = sc.nextInt();
                numbers.remove(z);
                break;
            case 3:
                System.out.println(numbers);
                break;
            case 4:
                System.out.println("введите проверяемое значение");
                int x = sc.nextInt();
                if(numbers.contains(x)) {
                    System.out.println("Значение есть в списке");
                }else
                    System.out.println("Значения нет в списке");
                break;
            case 5:
            System.out.println("введите значение, которое нужно заменить");
            int y = sc.nextInt();
            System.out.println("введите новое значение");
            int newX = sc.nextInt();
            numbers.set(numbers.indexOf(newX), newX);
            break;
        }

    }

}
