import java.util.*;

public class HashSet2303 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Minsk");//возвращает тру, если объект добавлен.Если такой объект уже был в коллекции ,
        // то добавления не будет
        cities.add("Brest");
        cities.add("Grodno");
        boolean n = cities.add("Minsk"); // если элемент есть в коллекции, то он встает на последнюю позицию
        cities.add("Moskow");
        cities.add("Mosty");
        cities.add("Kiev");
        System.out.println(n);
        System.out.println(cities);
        HashSet<Animal> animals = new HashSet<>();
        Animal animal1 = new Animal("Murzik", 3000, "white");
        Animal animal2 = new Animal("Bob", 13, "black");

        animals.add(new Animal("Bob", 5, "black"));
        animals.add(new Animal("Murzik", 3, "white"));
        animals.add(new Animal("Bob", 5, "black"));
        animals.add(animal2);

        System.out.println(animals);
        animal2.setName("Bob"); //изменяем поля объекта, уже находящегося в коллекции
        animal2.setAge(5);
        animal2.setColor("black");
        animals.removeIf(animal -> "Murzik".equals(animal.getName()));
        animals.add(animal2);

        System.out.println(animals);

        LinkedHashSet<String> citiesLinkHashSet = new LinkedHashSet<>();
        citiesLinkHashSet.add("Гродно");
        citiesLinkHashSet.add("Минск");
        citiesLinkHashSet.add("Брест");
        citiesLinkHashSet.add("Гродно");
        System.out.println(citiesLinkHashSet);

        TreeSet<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Петя");
        namesTreeSet.add("Катя");
        namesTreeSet.add("Аня");
        namesTreeSet.add("Миша");
        System.out.println(namesTreeSet);
        TreeSet<Animal> animalTreeSet = new TreeSet<>();
        animalTreeSet.add(animal1);
        animalTreeSet.add(animal2);
        System.out.println("Sorting" +animalTreeSet);
        TreeSet<Animal> animalTreeSet2 = new TreeSet<>(new AnimalComparator());//задаем компаратор, который
//        показывает как мы будем сортировать классы

        ArrayList<Animal> animalslist = new ArrayList<>();
        animalslist.sort(new AnimalComparator());
    }
}
