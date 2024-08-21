package model.animal.pet_animal;

import model.animal.Animal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public abstract class PetAnimal extends Animal {

    public PetAnimal(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
    }

    public abstract void play();

    public abstract Class<? extends PetAnimal> getType();
}
