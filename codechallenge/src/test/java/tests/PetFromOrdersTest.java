package tests;

import endpoints.PetEndpoint;
import endpoints.StoreEndpoint;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Petstore API Tests")
@Feature("Pet and orders API Tests")
public class PetFromOrdersTest {

    @Story("Get the pet from the first order")
    @Test
    public void testGetOrderThenGetThatPet() {
        Response responseOrder = StoreEndpoint.getOrderDetails(1);

        int petID = responseOrder.jsonPath().getInt("petId");

        //TODO: create a order object in domainObjects
        Response responsePet = PetEndpoint.getPetById(petID);
        assertEquals(200, responsePet.getStatusCode());
        assertEquals(petID, responsePet.jsonPath().getInt("id"));
        assertEquals("Cat 1", responsePet.jsonPath().getString("name"));
    }

}
