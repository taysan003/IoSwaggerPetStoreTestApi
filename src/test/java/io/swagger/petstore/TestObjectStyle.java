package io.swagger.petstore;

import io.swagger.petstore.controllers.pet.PetCtrl;
import io.swagger.petstore.models.pet.PetModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;

public class TestObjectStyle {

    @Test
    public void testAddNewPetToStore(){
        int idTestValue = RandomUtils.nextInt(0, 9000);
        String testPetName = RandomStringUtils.randomAlphabetic(5);
        PetModel testPet = new PetModel(idTestValue, null, testPetName, null, null, "AVAILABLE");
       new PetCtrl().addNewPet(testPet);

    }
}
