import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2103 {
    public static void main(String[] args) throws IOException {
        List<String> names = new LinkedList<>();
        LinkedList <String> n2 = new LinkedList<>();
        names.add("Ivan");
        names.add("Kate");
        names.add("Petya");
        names.add(0,"Olya");
        System.out.println(names);
        System.out.println(names.get(2));
//        names.indexOf();

        String [] mass = {"Миша","null","Боря"};
        Arrays.asList(mass);
        names.addAll( Arrays.asList(mass));
        n2.addFirst("Tanya");
        n2.addLast("Petya");
        n2.add("Kate");
        System.out.println(n2);
        System.out.println(names);
//        names.stream().sorted();  //будем изучать на стримах
        //task*****************************************************
        LinkedList <String> phoneNumber = new LinkedList<>();
        phoneNumber.add("+375296464565");
        phoneNumber.add("+375299379992");
        phoneNumber.add("+375257788552");
        LinkedList<String> phones = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            System.out.println("введите номер телефона");
             phones.add(reader.readLine());
        }
        phoneNumber.addAll(phones);
        System.out.println(phoneNumber);
        String userPhone ="4444";
        phoneNumber.removeIf(x-> x.equals(userPhone)); //сравниваем нашу коллекцию с      пользовательским номером телефона

//task 2*****************************
        ArrayList <String > pnoneNumber2 = new ArrayList<>();
        pnoneNumber2.add("+375337894512");
        pnoneNumber2.add("+375292365498");
        pnoneNumber2.add("+375254568725");
        pnoneNumber2.add("+375441245732");
        pnoneNumber2.add("+375293579526");


        while (true) {
            System.out.println("Vvedi index");
            String userIndexString = reader.readLine();
            Integer number = null;
            try {
                number = Integer.parseInt(userIndexString);
                System.out.println(phoneNumber.get(number));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Введена строка");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Несуществующий индекс");
            } catch (Exception ex) {
                System.out.println("Непредвиденная ошибка!!!");
            }


        }

    }
}
