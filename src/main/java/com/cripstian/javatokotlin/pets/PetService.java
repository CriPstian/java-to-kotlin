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
        final String dogDefaultBreed = petsConfiguration.getDogs().getDefaultBreed();
        final String catDefaultBreed = petsConfiguration.getCats().getDefaultBreed();
        pets = new ArrayList<>(Arrays.asList(
            new Dog(1L, "Capy", 3, dogDefaultBreed, ORANGE, SMALL),
            new Cat(2L, "Tom", 4, catDefaultBreed, BLACK, MEDIUM, true),
            new Cat(3L, "Archibald", 1, catDefaultBreed, WHITE, SMALL, false),
            new Dog(4L, "Shobby", 2, dogDefaultBreed, GREEN, LARGE)
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
