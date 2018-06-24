package com.singtel.rest.basis.service;

import com.singtel.java.basis.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by RajeshRaja on 24/6/2018.
 */
@Service
public class AnimalServiceImpl implements AnimalService {

    Animal[] animals = {
            new Duck(),
            new Chicken(),
            new Rooster("nl").getChicken(),
            new Rooster("da").getChicken(),
            new Parrot(),
            new Parrot("Woof, woof"),
            new Parrot("Meow"),
            new Parrot("Cock-a-doodle-doo"),
            new Shark(),
            new Clownfish (),
            new Dolphins(new Fish()),
            new Butterfly(),
            new Caterpillar()
    };

    Predicate<Animal> flyPredicate = (animal) -> animal.fly() == true;
    Predicate<Animal> walkPredicate = animal -> animal.walk();
    Predicate<Animal> singPredicate = animal -> animal.sing();
    Predicate<Animal> swimPredicate = animal -> animal.swim();

    public List<Animal> getAllAnimals() {
        return Arrays.asList(animals);
    }

    @Override
    public List<Animal> getFlyingAnimals() {
        return Arrays.asList(animals).stream().filter(flyPredicate).collect(Collectors.toList());
    }

    @Override
    public List<Animal> getWalkingAnimals() {
        return Arrays.asList(animals).stream().filter(walkPredicate).collect(Collectors.toList());
    }

    @Override
    public List<Animal> getSingingAnimals() {
        return Arrays.asList(animals).stream().filter(singPredicate).collect(Collectors.toList());
    }

    @Override
    public List<Animal> getSwimmingAnimals() {
        return Arrays.asList(animals).stream().filter(swimPredicate).collect(Collectors.toList());
    }

}
