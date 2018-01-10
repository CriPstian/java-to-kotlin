package com.cripstian.javatokotlin.pets;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class Cat implements Pet {
    private Long id;
    private String name;
    private Integer age;
    private String breed;
    private Color color;
    private Size size;
    private Boolean hasFur;

    Cat(Long id, String name, Integer age, String breed, Color color, Size size, Boolean hasFur) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.hasFur = hasFur;
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

    public Boolean getHasFur() {
        return hasFur;
    }

    public void setHasFur(Boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color == cat.color &&
                Objects.equals(id, cat.id) &&
                Objects.equals(name, cat.name) &&
                Objects.equals(age, cat.age) &&
                Objects.equals(breed, cat.breed) &&
                size == cat.size &&
                Objects.equals(hasFur, cat.hasFur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, breed, color, size, hasFur);
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
                .append("hasFur", hasFur)
                .toString();
    }
}
