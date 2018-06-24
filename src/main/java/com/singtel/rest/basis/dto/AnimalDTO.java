package com.singtel.rest.basis.dto;

import java.io.Serializable;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
public class AnimalDTO implements Serializable {
    private String animalType;
    private int animalCount;

    public AnimalDTO(String animalType, int animalCount) {
        this.animalType = animalType;
        this.animalCount = animalCount;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }
}
