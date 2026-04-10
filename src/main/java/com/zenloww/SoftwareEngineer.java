package com.zenloww;

import java.util.Objects;

public class SoftwareEngineer {
    private int id;
    private String name;
    private String techStack;

    SoftwareEngineer(int id, String name, String techStack){
        this.id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTecStack() {
        return techStack;
    }

    public void setTecStack(String tecStack) {
        this.techStack = tecStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
