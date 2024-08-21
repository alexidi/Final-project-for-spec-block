package model.animal.pack_animal.donkey;

import model.animal.Animal;
import model.animal.IdGenerator;
import model.animal.pack_animal.PackAnimal;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    private int stamina;

    public Donkey(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        super(idGenerator, name, dateOfBirth);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public void makeSound() {
        System.out.println("Осёл издает гортанный звук ИииАаа.");
    }

    @Override
    public void carryLoads() {
        System.out.println("Осёл вынослив при перевозке различных тяжестей.");
    }

    @Override
    public Class<? extends Animal> getType() {
        return Donkey.class;
    }

    @Override
    public String toString() {
        return String.format("%s\n stamina: %d", super.toString(), stamina);
    }
}
