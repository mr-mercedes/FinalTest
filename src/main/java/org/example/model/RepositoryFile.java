package org.example.model;


import org.example.model.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFile implements Repository {
    private final AnimalMapper mapper = new AnimalMapper();
    private final FileOperation fileWork;

    public RepositoryFile(FileOperation fileWork) {
        this.fileWork = fileWork;
    }

    @Override
    public List<Animal> getAnimals() {
        List<String> lines = fileWork.readAllLines();
        List<Animal> animals = new ArrayList<>();
        for (String line : lines) {
            animals.add(mapper.map(line));
        }
        return animals;
    }

    @Override
    public void createAnimal(Animal animal) {
        List<Animal> animals = getAnimals();
        int max = 0;
        for (Animal item : animals) {
            int id = item.getId();
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        animal.setId(newId);
        animals.add(animal);
        List<String> lines = new ArrayList<>();
        for (Animal item : animals) {
            lines.add(mapper.map(item));
        }
        fileWork.saveAllLines(lines);
    }

    @Override
    public void updateAnimal(Animal animalForUpdate) {
        List<Animal> animals = getAnimals();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getId() == animalForUpdate.getId()) {
                animals.set(i, animalForUpdate);
            }
        }
        List<String> lines = new ArrayList<>();
        for (Animal item : animals) {
            lines.add(mapper.map(item));
        }
        fileWork.saveAllLines(lines);
    }
}
