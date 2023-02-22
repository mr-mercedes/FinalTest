package org.example;

import org.example.animals.Camel;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.storage.ZooStorage;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ZooStorage zooStorage = new ZooStorage();
        Cat cat = new Cat("Барсик", 2, "Сфинкс");
        Dog dog = new Dog("Бим", 1, "Овчарка");
        Camel camel = new Camel("Имя", 4, "Перевозка");
        cat.addCommand(new Command("Спать", "хррррр..."));
        cat.addCommand(new Command("Есть", "хрум..."));
        System.out.println(cat);
        cat.showCommands();
        zooStorage.addNewAnimal(cat);
        zooStorage.addNewAnimal(dog);
        zooStorage.addNewAnimal(camel);
        List list = zooStorage.showAllAnimal();
        for (Object o : list) {
            System.out.println(o);
        }
    }
}