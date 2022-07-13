package starter.LoginAdmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Post {

    protected static String url = "http://13.229.128.27:8080/";

    @Step("user set post register endpoints")
    public String setApiEndpoints(){
        return url + "login/admin";

    }
    @Step("user send POST HTTP request")
    public void sendPostHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "adminpoin1@gmail.com");
        requestBody.put("password", "adminpoin1medeka");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setApiEndpoints());

    }
    @Step("user see status code 200 and success login")
    public void seeStatusCode200AndSuccessLogin(){
        restAssuredThat(response -> response.statusCode(200));

    }

}

