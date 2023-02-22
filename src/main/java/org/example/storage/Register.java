package org.example.storage;


import org.example.animals.Animal;

public interface Register<T extends Animal> {
    void addNewAnimal(Animal animal);

    String showAnimalClass(Animal animal);

}
