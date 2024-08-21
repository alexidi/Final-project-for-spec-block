package model.animal;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Serializable {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private List<String> commands;

    public Animal(IdGenerator idGenerator, String name, LocalDate dateOfBirth) {
        this.id = idGenerator.getCurrentId();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public void makeSound() {
    }

    private abstract Class<? extends Animal> getType();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal other = (Animal) o;
        return id == other.id && name.equals(other.name) && dateOfBirth.equals(other.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.format("Animal type: %s\n id: %d\n name: %s\n date of birth: %s",
                getClass().getSimpleName(), id, name, dateOfBirth, commands);
    }
}
