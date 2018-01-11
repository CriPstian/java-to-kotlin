package com.cripstian.javatokotlin.pets;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("pets")
public class PetsConfiguration {

    private Dog dogs;
    private Cat cats;

    public Dog getDogs() {
        return dogs;
    }

    public void setDogs(Dog dogs) {
        this.dogs = dogs;
    }

    public Cat getCats() {
        return cats;
    }

    public void setCats(Cat cats) {
        this.cats = cats;
    }

    public static class Dog {
        private String name;
        private String breed;

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat {
        private String name;
        private String breed;

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
