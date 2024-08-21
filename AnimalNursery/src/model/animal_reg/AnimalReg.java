package model.animal_reg;

import model.animal.Animal;

import java.io.Serializable;
import java.util.*;

public class AnimalReg implements Serializable {
    private final Map<Class<? extends Animal>, List<Animal>> animalsMap;

    public AnimalReg() {
        animalsMap = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        Class<? extends Animal> animalClass = animal.getClass();
        List<Animal> animals = animalsMap.computeIfAbsent(animalClass, k -> new ArrayList<>());
        animals.add(animal);
    }

    public void trainAnimal(String name, String command) {
        findAnimalByName(name).forEach(animal -> animal.addCommand(command));
    }

    public void printAnimalCommands(String name, String command) {
        findAnimalByName(name).forEach(animal -> System.out.println(animal.getCommands()));
    }

    public void printAllAnimals() {
        getAnimalsSortedById().forEach(System.out::println);
    }

    public boolean isAnimalExist(String name) {
        return findAnimalByName(name).size() > 0;
    }

    private List<Animal> getAnimalsSortedByDateOfBirth() {
        return sortAnimalsBy(new AnimalsComparatorByDateOfBirth());
    }

    private List<Animal> getAnimalsSortedById() {
        return sortAnimalsBy(new AnimalsComparatorById());
    }
    public int getMaxId() {
        return findAllAnimals().stream().mapToInt(Animal::getId).max().orElse(0);
    }

    private List<Animal> findAllAnimals() {
        List<Animal> allAnimals = new ArrayList<>();
        animalsMap.values().forEach(allAnimals::addAll);
        return allAnimals;
    }

    private List<Animal> findAnimalByName(String name) {
        return findAllAnimals().stream().filter(animal -> animal.getName().equals(name)).toList();
    }

    private List<Animal> sortAnimalsBy(Comparator<Animal> comparator) {
        List<Animal> allAnimals = findAllAnimals();
        allAnimals.sort(comparator);
        return allAnimals;
    }

    public int totalNumberOfAnimals() {
        return findAllAnimals().size();
    }

    public void removeAnimal(String name) {
        findAnimalByName(name).forEach(Animal::makeSound);
        animalsMap.values().forEach(animals -> animals.removeIf(animal -> animal.getName().equals(name)));
    }
}
