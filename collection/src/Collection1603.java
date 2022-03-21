import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection1603 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(100);// по умолчанию размерность создаваемого массива 10
        names.add("James");
        names.add("Eric");
        names.add("Иван");
        ((ArrayList<String>) names).trimToSize();
        for (String name : names) {
            System.out.println(names);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        String userName = "Маша";
        System.out.println(names.contains(userName));
        System.out.println(names.get(0));
        System.out.println(names);
        boolean result = names.remove("Маша");
        if (result) {
            System.out.println("Объект удален");
        } else {
            System.out.println("Объект неудален");
        }

        List<Integer> numbers = new ArrayList<>();
           numbers.addAll(Arrays.asList(1, 2, 5, 100, 3));
        numbers.set(1, 20);// установить в позицию 1 значение 20
        Iterator<Integer> iterator = numbers.iterator();
//        iterator.hasNext(); проверяет есть ли элементы в следующем элементе1
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n % 2 == 0) {
                iterator.remove();
            }
//            System.out.println(iterator.next());
        }
        System.out.println(numbers);

//        for (int number : numbers) {      // в цикле нельзя использовать remove
//            if (number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }
        numbers.removeIf(x -> x%2==0);

        System.out.println(numbers);
        numbers.forEach(x -> {
            System.out.println(x * 2);
        });








    }
}
