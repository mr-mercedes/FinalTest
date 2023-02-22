package org.example.storage;


import org.example.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooStorage<T extends Animal> implements Register{
    private  List<Animal> list = new ArrayList<>();

    protected Animal get(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.size() != 0){
                Animal animal = list.get(i);
                if (animal.getName().equalsIgnoreCase(name)){
                    return animal;
                }
            }
        }
        return null;
    }
    @Override
    public void addNewAnimal(Animal animal){
        if (animal != null){
            list.add(animal);
        } else {
            throw new NullPointerException("Can't add null");
        }
    }

    @Override
    public String showAnimalClass(Animal animal) {
        return animal.getClass().getSimpleName();
    }

    protected int size(){
        return list.size();
    }

    public List<Animal> showAllAnimal(){
        return list;
    }

}
