package endpoints;

import data.Constants;
import domainObject.Pet;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StoreEndpoint {

    @Step("Send a GET request to obtain an orden information")
    public static Response getOrderDetails(int detailID) {
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get(Constants.BASE_URL + Constants.BASE_PATH + Constants.STORE_ORDER_ENDPOINT + detailID)
                .then()
                .extract().response();
    }
}
