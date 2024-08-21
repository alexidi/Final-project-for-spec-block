package model.animal.pet_animal.cat;

import model.animal.IdGenerator;
import model.animal.pet_animal.PetAnimal;

import java.time.LocalDate;

public class Cat extends PetAnimal {
    public String furColor;

    public Cat(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка издает звук: Мяу");
    }

    @Override
    public void play() {
        System.out.println("Кошка играется с мячиком.");
    }

    @Override
    public Class<? extends PetAnimal> getType() {
        return Cat.class;
    }

    @Override
    public String toString() {
        return String.format("%s\nFur color: %s\n", super.toString(), furColor);
    }

}
