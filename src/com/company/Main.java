package com.company;

public class Main {
    public static void main(String[] args) {
        Shelter romashka = new Shelter("Ромашка", " ул.Первомайская 9 ");
        Dog layka = new Dog("Layka", "Шавка", Color.WHITE, romashka, new String[]{"Сидеть", "Лежать"});
        System.out.println(layka.getInfo());
        layka.makeVoise();
        System.out.println("__________________");

        Dog booldog = new Dog("Джо джо", "бульдог", Color.BLACK, romashka, new String[]{"Кусать", "Бегать"});
        System.out.println(booldog.getInfo());
        booldog.makeVoise();
        System.out.println("__________________");

        Dog avcharka = new Dog("Спидвагон", "Авфчарка", Color.BROWN, romashka);
        System.out.println(avcharka.getInfo());
        avcharka.makeVoise();
    }
}
