package org.example.view;


import org.example.controller.AnimalController;
import org.example.controller.CountController;
import org.example.model.Counter;
import org.example.model.animals.*;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ViewUser {
    private final AnimalController animalController;
    private final CountController countController;

    public ViewUser(AnimalController userController, CountController countController) {
        this.animalController = userController;
        this.countController = countController;
    }

    public void run() {
        Commands command;

        while (true) {
            for (Commands value : Commands.values()) {
                System.out.printf("%d. %s%n", value.getCode(), Commands.getValueByCode(value.getCode()));
            }
            String userCommand = prompt("Введите команду: ");
            command = Commands.getValueByCode(Integer.parseInt(userCommand));
            if (command == Commands.EXIT) return;
            switch (command) {
                case CREATE:
                    try (Counter counter = countController.getCounter()) {
                        int classAnimal = printAllAnimalClass();
                        String name = prompt("Имя животного: ");
                        String age = prompt("Возраст в месяцах: ");
                        animalController.saveAnimal(createAnimalCurrentClass(name, Integer.parseInt(age), classAnimal));
                        counter.add();
                        System.out.printf("Считаю!!! %d", counter.getCount());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case READ:
                    try {
                        for (Animal animal : animalController.readAnimals()) {
                            System.out.println(animal);
                        }
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case TRAIN:
                    Animal animal = getAnimal("Выберете ID животного для тренеровки: ");
                    animal.showCommands();
                    String animalCommand = prompt("Введите команду: ");
                    animal.addCommand(animalCommand);
                    animalController.updateAnimal(animal);
                    break;
                case LIST_COMMANDS:
                    Animal animalC = getAnimal("Выберете ID животного для просмотра изученных команд: ");
                    animalC.showCommands();
                    break;


            }
        }
    }

    private Animal getAnimal(String message) {
        for (Animal animal : animalController.readAnimals()) {
            System.out.println(animal);
        }
        String choice = prompt(message);
        Animal animal;
        try {
            animal = animalController.readAnimal(Integer.parseInt(choice));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return animal;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private Animal createAnimalCurrentClass(String name, int age, int choice) {
        switch (choice) {
            case 1:
                return new Cat(name, age);
            case 2:
                return new Dog(name, age);
            case 3:
                return new Hamster(name, age);
            case 4:
                return new Camel(name, age);
            case 5:
                return new Horse(name, age);
            case 6:
                return new Donkey(name, age);
        }
        return null;
    }

    private int printAllAnimalClass() {
        Map<Integer, String> allAnimalClass = new TreeMap<>(Map.of(1, "Кошка",
                2, "Собака",
                3, "Хомяк",
                4, "Верблюд",
                5, "Лошадь",
                6, "Осел"));


        for (Map.Entry<Integer, String> animalClass : allAnimalClass.entrySet()) {
            System.out.printf("%d. %s%n", animalClass.getKey(), animalClass.getValue());
        }
        return Integer.parseInt(prompt("Выберете какое животное вы хотите создать: "));
    }
}
