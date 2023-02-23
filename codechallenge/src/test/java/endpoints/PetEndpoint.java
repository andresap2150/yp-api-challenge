package endpoints;

import data.Constants;
import domainObject.Pet;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetEndpoint {

    @Step("Send a POST request to create a new pet")
    public static Response addNewPet(Pet pet) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(pet)
                .when()
                .post(Constants.BASE_URL + Constants.BASE_PATH + Constants.PET_ENDPOINT)
                .then()
                .extract().response();
    }

    @Step("Send a GET request to obtain the pet with the given id")
    public static Response getPetById(int petId) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get(Constants.BASE_URL + Constants.BASE_PATH + Constants.PET_ENDPOINT + petId)
                .then()
                .extract().response();
    }

    @Step("Send a DELETE request to remove the pet with the given id")
    public static Response deletePetById(int petId) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .delete(Constants.BASE_URL + Constants.BASE_PATH + Constants.PET_ENDPOINT + petId)
                .then()
                .extract().response();
    }

    //TODO: add the other methods for the service
}
