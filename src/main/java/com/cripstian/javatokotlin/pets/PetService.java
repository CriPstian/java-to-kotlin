package com.cripstian.javatokotlin.pets;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.cripstian.javatokotlin.pets.Color.*;
import static com.cripstian.javatokotlin.pets.Size.*;

@Service
public class PetService {

    private final List<Pet> pets;

    public PetService(final PetsConfiguration petsConfiguration) {
        final String dogBreed = petsConfiguration.getDogs().getBreed();
        final String catBreed = petsConfiguration.getCats().getBreed();
        long id = 0;
        pets = new ArrayList<>(Arrays.asList(
            new Dog(++id, "Capy", 3, dogBreed, ORANGE, SMALL),
            new Cat(++id, "Tom", 4, catBreed, BLACK, MEDIUM, true),
            new Cat(++id, "Archibald", 1, catBreed, WHITE, SMALL, false),
            new Dog(++id, "Shobby", 2, dogBreed, GREEN, LARGE)
        ));
    }

    public List<Pet> findAll() {
        return Collections.unmodifiableList(pets);
    }

    public List<Pet> findAllDogs() {
        return pets.stream()
                .filter(Dog.class::isInstance)
                .collect(Collectors.toList());
    }

    public List<Pet> findAllCats() {
        return pets.stream()
                .filter(Cat.class::isInstance)
                .collect(Collectors.toList());
    }

    public void addPet(final Pet pet) {
        pets.add(pet);
    }

}
