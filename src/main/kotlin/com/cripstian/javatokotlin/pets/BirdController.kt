package com.cripstian.javatokotlin.pets

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class BirdController(private val petService: PetService) {

    @GetMapping("/pets/birds")
    fun getBirds() = petService.getBirds()

    fun PetService.getBirds() = this.findAll().filter { it is KotlinBird }

    @GetMapping("/pets/{number}-little-{pets}")
    fun getThePets(@PathVariable number: Int, @PathVariable pets: String)= number little pets
}

infix fun Int.little(pets: String): List<Pet> {

    return  generateSequence(0) { it + 1 }
            .map { when(pets) {
                "dogs" -> Dog(it.toLong(), "Capy-$it", 3, "Doggo", Color.ORANGE, Size.SMALL)
                "cats" -> Cat(it.toLong(), "Tom-$it", 3, "Kitty", Color.ORANGE, Size.SMALL, false)
                "birds" -> KotlinBird(it.toLong(), "Bird-$it", it + this)
                else -> throw RuntimeException("No such pet")
                }
            }
            .take(this)
            .toList()
}