package tests;

import domainObject.Pet;
import endpoints.PetEndpoint;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Petstore API Tests")
@Feature("Pet API Tests")
public class PetTest {

    @Story("Get the 1 pet")
    @Test
    public void testGetPetById() {
        Response response = PetEndpoint.getPetById(1);

        //TODO: the response code should be a constant
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals("Cat 1", response.jsonPath().getString("name"));
        Assertions.assertEquals("available", response.jsonPath().getString("status"));
    }

    @Story("Create a test pet for deleting")
    @Test
    public void testAddNewPet() {
        Pet newPet = new Pet();
        newPet.setId(1000);
        newPet.setName("Test Pet andres");
        newPet.setStatus("available");

        Response response = PetEndpoint.addNewPet(newPet);

        assertEquals(200, response.getStatusCode());
        assertEquals(newPet.getId(), response.jsonPath().getInt("id"));
        assertEquals(newPet.getName(), response.jsonPath().getString("name"));
        assertEquals(newPet.getStatus(), response.jsonPath().getString("status"));
    }

    @Story("Create a test pet for deleting")
    @Test
    public void testDeletingAPet() {

        //TODO: this should be a setting
        int idToRemove = 1000;

        Response response = PetEndpoint.deletePetById(idToRemove);
        assertEquals(200, response.getStatusCode());

        //confirm the delete with the get
        Response responseGet = PetEndpoint.getPetById(idToRemove);
        assertEquals(404,responseGet.getStatusCode());
    }

}
