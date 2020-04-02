package better.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecUtils {

    public static RequestSpecBuilder getDefaultSpecBuilder() {
        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .log(LogDetail.ALL);
    }

    public static RequestSpecification buildDefaultSpec() {
        return getDefaultSpecBuilder().build();
    }
}
