package model.animal.pet_animal.dog;

import model.animal.IdGenerator;
import model.animal.pet_animal.PetAnimal;

import java.time.LocalDate;

public class Dog extends PetAnimal {
    public String breed;

    public Dog(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака издает звук: Гав");
    }

    @Override
    public void play() {
        System.out.println("Собака играет в апорт.");
    }

    @Override
    public Class<? extends PetAnimal> getType() {
        return Dog.class;
    }

    @Override
    public String toString() {
        return String.format("%s\nBreed: %s\n", super.toString(), breed);
    }
}
