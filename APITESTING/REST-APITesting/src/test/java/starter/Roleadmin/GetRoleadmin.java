package starter.Roleadmin;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetRoleadmin {
    protected static String url = "http://13.250.122.4:8080";

    @Step("Admin set GET endpoint role admin")
    public String setGetUrlApiEndpointRoleadmin() {
        return url + "/users/role/admin/";
    }

    @Step("user send GET HTTP request categories")
    public void sendGetHttpRequestCategories() {
        SerenityRest.given().get(setGetUrlApiEndpointRoleadmin());
    }

    @Step("user receive status code 200")
    public void userReceiveValidHttpResponse200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user receive valid url")
    public void validateDataDetailUrl() {
    }
}
