package model.animal.pack_animal.horse;

import model.animal.IdGenerator;
import model.animal.pack_animal.PackAnimal;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    private int weight;

    public Horse(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = Integer.parseInt(weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Конь издает звук: НиииГогого");
    }

    public Class<? extends PackAnimal> getType() {
        return Horse.class;
    }

    public void carryLoads() {
        System.out.println("Конь тянет большой вес");
    }

    @Override
    public String toString() {
        return String.format("%s\nWeight: %d\n", super.toString(), weight);
    }
}
