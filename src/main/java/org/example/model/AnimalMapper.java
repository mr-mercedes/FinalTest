package org.example.model;


import org.example.model.animals.*;

import java.util.*;

public class AnimalMapper {

    public String map(Animal animal) {
        return String.format("%s,%d,%s,%d,%s",
                animal.getClass().getSimpleName(),
                animal.getId(),
                animal.getName(),
                animal.getBirthDay(),
                animal.getCommands());
    }

    public Animal map(String line) {
        String stringCommands = line.substring(line.indexOf('['));
        String info = line;
        if (stringCommands.length() != 0) {
            info = line.substring(0, line.indexOf(stringCommands) - 1);
        }
        String[] arrayInfo = info.split(",");
        String className = arrayInfo[0];
        int id = Integer.parseInt(arrayInfo[1]);
        String name = arrayInfo[2];
        int age = Integer.parseInt(arrayInfo[3]);

        String[] arrayCommands;
        List<String> listCommands = new ArrayList<>();
        if (stringCommands.length() > 2) {
            String stringCommandsRep = stringCommands.replace("]", "")
                    .replace("[", "")
                    .replace(" ", "");
            if (stringCommandsRep.contains(",")) {
                arrayCommands = stringCommandsRep.split(",");
            } else {
                arrayCommands = new String[]{stringCommandsRep};
            }
            listCommands.addAll(Arrays.asList(arrayCommands));
        }

        switch (className) {
            case "Cat":
                return new Cat(id, name, age, listCommands);
            case "Dog":
                return new Dog(id, name, age, listCommands);
            case "Hamster":
                return new Hamster(id, name, age, listCommands);
            case "Camel":
                return new Camel(id, name, age, listCommands);
            case "Horse":
                return new Horse(id, name, age, listCommands);
            case "Donkey":
                return new Donkey(id, name, age, listCommands);
        }
        throw new IllegalStateException("Class not found");
    }

}
