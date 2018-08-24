package io.swagger.petstore.controllers.pet;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.swagger.petstore.models.pet.PetModel;
import static io.restassured.RestAssured.given;

    public class PetCtrl {

        public PetCtrl() {
            RestAssured.requestSpecification = new RequestSpecBuilder()
                    .addHeader("api_key", "123123")
                    .setBaseUri("http://petstore.swagger.io")
                    .setBasePath("/v2/pet")
                    .setContentType(ContentType.JSON)
                    .log(LogDetail.ALL).build();

        }
    public PetModel addNewPet(PetModel pet) {
            return  given()
                .body(pet)
                .when()
                .post()
                .as(PetModel.class);


    }
}
