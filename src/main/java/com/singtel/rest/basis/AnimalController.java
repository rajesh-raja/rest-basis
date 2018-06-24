package com.singtel.rest.basis;

import com.singtel.java.basis.Animal;
import com.singtel.rest.basis.common.Constants;
import com.singtel.rest.basis.dto.AnimalDTO;
import com.singtel.rest.basis.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    AnimalService animalService;

    @GetMapping(path="/all")
    public AnimalDTO getAllAnimalsCount() {
        return populateResponseDTO(animalService.getAllAnimals(), Constants.ANIMAL_TYP);
    }

    @GetMapping("/fly")
    public AnimalDTO getFlyingAnimalsCount() {
        return populateResponseDTO(animalService.getFlyingAnimals(), Constants.ANIMAL_TYP_FLY);
    }

    @GetMapping("/walk")
    public AnimalDTO getWalkingAnimalsCount() {
        return populateResponseDTO(animalService.getWalkingAnimals(), Constants.ANIMAL_TYP_WALK);
    }

    @GetMapping("/sing")
    public AnimalDTO getSingingAnimalsCount() {
        return populateResponseDTO(animalService.getSingingAnimals(), Constants.ANIMAL_TYP_SING);
    }

    @GetMapping("/swim")
    public AnimalDTO getSwimmingAnimalsCount() {
        return populateResponseDTO(animalService.getSwimmingAnimals(), Constants.ANIMAL_TYP_SWIM);
    }

    private AnimalDTO populateResponseDTO(List<Animal> animalList, String animalTyp) {
        return new AnimalDTO(animalTyp, animalList.size());
    }
}
