package ru.mirea.practice.u23k1158.t1.t2;

public final class Two {
    private Two() {

    }

    public static void main(String[] args) {
        Person person1 = new Person("Антонов", "Антон", "Антонович");
        Person person2 = new Person("Петров", "Петр", null);
        Person person3 = new Person("Сидоров", null, "Сидорович");
        Person person4 = new Person("Кузнецов", null, null);

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}