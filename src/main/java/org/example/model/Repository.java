package org.example.model;


import org.example.model.animals.Animal;

import java.util.List;

public interface Repository {

    void createAnimal(Animal animal);

    List<Animal> getAnimals();

    void updateAnimal(Animal animal);
}
