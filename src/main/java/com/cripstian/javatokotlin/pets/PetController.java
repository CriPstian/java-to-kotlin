package com.cripstian.javatokotlin.pets;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/dogs")
    public List<Pet> getDogs() {
        return petService.findAllDogs();
    }

    @GetMapping("/cats")
    public List<Pet> getCats() {
        return petService.findAllCats();
    }

    @GetMapping
    public List<Pet> getAll() {
        return petService.findAll();
    }

    @PostMapping("/dog")
    @ResponseStatus(HttpStatus.CREATED)
    public  void addDog(@RequestBody Dog pet) {
        petService.addPet(pet);
    }

    @PostMapping("/cat")
    @ResponseStatus(HttpStatus.CREATED)
    public  void addCat(@RequestBody Cat pet) {
        petService.addPet(pet);
    }

}
