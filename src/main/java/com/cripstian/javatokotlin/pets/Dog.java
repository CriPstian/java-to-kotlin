package com.cripstian.javatokotlin.pets;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class Dog implements Pet {
    private Long id;
    private String name;
    private Integer age;
    private String breed;
    private Color color;
    private Size size;

    Dog(Long id, String name, Integer age, String breed, Color color, Size size) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(id, dog.id) &&
                Objects.equals(name, dog.name) &&
                Objects.equals(age, dog.age) &&
                Objects.equals(breed, dog.breed) &&
                Objects.equals(color, dog.color) &&
                size == dog.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, breed, color, size);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("age", age)
                .append("breed", breed)
                .append("color", color)
                .append("size", size)
                .toString();
    }
}
