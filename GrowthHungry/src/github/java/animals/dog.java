package animals;

import model.Pet;

import java.time.LocalDate;

class Dog extends Pet {

     /*
    dog is a type of pet, dog will inherit a property of pet because dog extends property of pet
      */

    public Dog() {
    }

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }
}
