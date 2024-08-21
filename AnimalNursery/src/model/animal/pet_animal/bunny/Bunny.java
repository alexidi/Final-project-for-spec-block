package model.animal.pet_animal.bunny;

import model.animal.pet_animal.PetAnimal;
import model.animal.IdGenerator;
import java.time.LocalDate;

public class Bunny extends PetAnimal {
    public int earSize;

    public Bunny(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
        this.earSize = earSize;
    }

    public int getEarSize() {
        return earSize;
    }

    public void setEarSize(int earSize) {
        this.earSize = earSize;
    }

    @Override
    public void makeSound() {
        System.out.println("Кролик издает тонкий писк");
    }

    @Override
    public void play() {
        System.out.println("Кролик играет с морковкой.");
    }

    @Override
    public Class<? extends PetAnimal> getType() {
        return Bunny.class;
    }

    @Override
    public String toString() {
        return String.format("%s\nEar size: %d\n", super.toString(), earSize);
    }
}
