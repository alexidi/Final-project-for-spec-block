package model.animal.pack_animal.camel;


import model.animal.Animal;
import model.animal.IdGenerator;
import model.animal.pack_animal.PackAnimal;

import java.time.LocalDate;

public class Camel extends PackAnimal {
    private int numberOfHumps;

    public Camel(IdGenerator idGenerator, String name, LocalDate dateOfBirth, int numberOfHumps) {
        super(idGenerator, name, dateOfBirth);
        this.numberOfHumps = numberOfHumps;
    }

    public int getNumberOfHumps() {
        return numberOfHumps;
    }

    public void setNumberOfHumps(int numberOfHumps) {
        this.numberOfHumps = numberOfHumps;
    }

    @Override
    public void makeSound() {
        System.out.println("Верблюд издает гортанный звук.");
    }

    @Override
    public void carryLoads() {
        System.out.println("Верблюд перевозит различные тяжелые грузы.");
    }

    @Override
    public Class<? extends Animal> getType() {
        return Camel.class;
    }

    @Override
    public String toString() {
        return String.format("%s\n number of humps: %d", super.toString(), numberOfHumps);
    }
}
