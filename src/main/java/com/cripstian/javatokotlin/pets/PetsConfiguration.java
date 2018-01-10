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
        private String defaultBreed;

        public String getDefaultBreed() {
            return defaultBreed;
        }

        public void setDefaultBreed(String defaultBreed) {
            this.defaultBreed = defaultBreed;
        }
    }

    public static class Cat {
        private String defaultBreed;

        public String getDefaultBreed() {
            return defaultBreed;
        }

        public void setDefaultBreed(String defaultBreed) {
            this.defaultBreed = defaultBreed;
        }
    }
}
