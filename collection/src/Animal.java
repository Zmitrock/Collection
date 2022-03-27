import java.util.Objects;

public class Animal implements Comparable {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public int compareTo(Object o) {
        if (this == (Animal) o) {
            return 0; //объекты равны
        }
        if (o == null || getClass() != o.getClass()) {
            throw new IllegalArgumentException("Несовпадение типов при сравнении объектов");
        }
//        Animal animal1= this;               //один из вариантов переопределения
//        Animal animal2= (Animal) o;
        Integer age1 = this.getAge();
        Integer age2 = ((Animal) o).getAge();
        return age1.compareTo(age2);

//        if (animal1.getAge()< animal2.getAge()){
//            return -1;
//        }
//        if (animal1.getAge()> animal2.getAge()){
//            return 1;
//        }
//        return 0;
//    }


    }
}