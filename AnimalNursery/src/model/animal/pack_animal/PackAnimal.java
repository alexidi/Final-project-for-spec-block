package model.animal.pack_animal;

import model.animal.Animal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    public PackAnimal(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
    }

    public abstract void carryLoads();

    public abstract Class<? extends Animal> getType();
}
