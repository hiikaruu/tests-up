package steps;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import models.*;
import org.testng.Assert;

import static io.restassured.RestAssured.given;


public class UserSteps {
    @Step("Проверка пользователя")
    public void checkResponse(UserResponse userExcepted, UserResponse userActual){
        Assert.assertEquals(userExcepted, userActual);
    }
    @Step("Проверка неизвестного пользователя")
    public void checkUNKResponse(UserNFResponse userExcepted, UserNFResponse userActual){
        Assert.assertEquals(userExcepted, userActual);
    }
    @Step("Получить список пользователей")
    public UsersResponse getUserList(Integer Id){
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users?page=" + Id)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response().as(UsersResponse.class);
    }
  @Step("Получить пользователя по Id")
    public UserResponse getUserById(Integer Id, Integer statusCode) {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users/" + Id)
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(UserResponse.class);
    }
  @Step ("Получить список неизвестных пользователей")
  public UsersNFResponse getUNKUser() {
      return given()
              .baseUri("https://reqres.in")
              .get("/api/unknown")
              .then()
              .statusCode(200)
              .extract()
              .response().body().as(UsersNFResponse.class);

  }
    @Step ("Получить неизвестного пользователя по Id")
    public UserNFResponse getUNKUserById(Integer Id, Integer statusCode) {
        return given()
                .baseUri("https://reqres.in")
                .get("/api/unknown/"+Id)
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(UserNFResponse.class);}
    @Step("Создать пользователя")
    public UserChangedResponse postCreate(UserRequest UR, Integer statusCode){
        return given()
                .baseUri("https://reqres.in")
                .body(UR)
                .contentType(ContentType.JSON)
                .post("/api/users")
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(UserChangedResponse.class);}
    @Step("Обновить пользователя")
    public UserChangedResponse putUpdate(UserRequest UR, Integer Id, Integer statusCode){
        return given()
                .baseUri("https://reqres.in")
                .body(UR)
                .contentType(ContentType.JSON)
                .put("/api/users/"+Id)
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(UserChangedResponse.class);}
    @Step("Обновить пользователя")
    public UserChangedResponse patchUpdate(UserRequest UR, Integer Id, Integer statusCode){
        return given()
                .baseUri("https://reqres.in")
                .body(UR)
                .contentType(ContentType.JSON)
                .put("/api/users/"+Id)
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(UserChangedResponse.class);}
    @Step("Удалить пользователя")
    public void deleteUser(Integer Id,Integer statusCode) {
        given()
                .baseUri("https://reqres.in")
                .delete("/api/users/"+Id)
                .then()
                .statusCode(statusCode)
                .extract()
                .response();
    }
    @Step("Регистрация пользователя")
    public RegisterResponse userRegister(LoginRequest LR, Integer statusCode){
        return given()
                .baseUri("https://reqres.in")
                .body(LR)
                .contentType(ContentType.JSON)
                .post("/api/register")
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(RegisterResponse.class);
    }
    @Step("Авторизация пользователя")
    public LoginResponse userLogin(LoginRequest LR, Integer statusCode){
        return given()
                .baseUri("https://reqres.in")
                .body(LR)
                .contentType(ContentType.JSON)
                .post("/api/login")
                .then()
                .statusCode(statusCode)
                .extract()
                .response().body().as(LoginResponse.class);
    }
    @Step("Получить список пользователей")
    public UsersResponse getDelayUserList(){
        return given()
                .baseUri("https://reqres.in")
                .get("/api/users?delay=3")
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response().as(UsersResponse.class);
    }
}

