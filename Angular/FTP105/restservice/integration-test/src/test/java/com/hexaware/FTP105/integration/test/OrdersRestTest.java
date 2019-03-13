package com.hexaware.FTP105.integration.test;
import java.util.Arrays;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import static com.jayway.restassured.RestAssured.given;

public class OrdersRestTest {
   @Test
    public void testOrdersvhistory() throws AssertionError, URISyntaxException {

    Time ort=new Time(12,46,03);
    Time est=new Time(00,10,00);
    String str="2019-02-06";
    Date od3=Date.valueOf(str);
    Orders[] res = given()
                  .when()
                  .accept(ContentType.JSON)
                  .get(CommonUtil.getURI("/api/orders/vhistory/500"))
                  .getBody()
                  .as(Orders[].class);

    assertEquals(1000, res[0].getFoodId());
    assertEquals(1, res[0].getQty());
    assertEquals(60.59, res[0].getTotalPrice(), 0.1);
    assertEquals(est, res[0].getEstimatedTime());
    assertEquals(ort, res[0]. getOrderTime());
    assertEquals(od3, res[0]. getOrderDate());
    assertEquals("DELIVERED", res[0].getOStatus());
    assertEquals(300, res[0]. getOId());
    assertEquals("Thanks for visiting", res[0].getOComment());
    assertEquals(1, res[0].getCId());
    assertEquals(500, res[0].getVId());
 }
    @Test
    public void testOrderschistory() throws AssertionError, URISyntaxException {
    Time ort=new Time(12,46,03);
    Time est=new Time(00,10,00);
    String str="2019-02-06";
    Date od=Date.valueOf(str);
    Orders[] res = given().when().accept(ContentType.JSON)
        .get(CommonUtil.getURI("/api/orders/chistory/1"))
        .getBody().as(Orders[].class);

    assertEquals(1000, res[0].getFoodId());
    assertEquals(1, res[0].getQty());
    assertEquals(60.59, res[0].getTotalPrice(), 0.1);
    assertEquals(est, res[0].getEstimatedTime());
    assertEquals(ort, res[0]. getOrderTime());
    assertEquals(od, res[0]. getOrderDate());
    assertEquals("DELIVERED", res[0].getOStatus());
    assertEquals(300, res[0]. getOId());
    assertEquals("Thanks for visiting", res[0].getOComment());
    assertEquals(1, res[0].getCId());
    assertEquals(500, res[0].getVId());
}

@Test
    public void testPlacedOrders() throws AssertionError, URISyntaxException {
    Time ort=new Time(15,26,56);
    Time est=new Time(15,26,56);
        String str="2019-03-11";
    Date od1=Date.valueOf(str);
    Orders[] res = given().when().accept(ContentType.JSON)
                  .get(CommonUtil.getURI("/api/orders/placed/500"))
                  .getBody().as(Orders[].class);

    assertEquals(1000, res[0].getFoodId());
    assertEquals(1, res[0].getQty());
    assertEquals(60.59, res[0].getTotalPrice(), 0.1);
    assertEquals(est, res[0].getEstimatedTime());
    assertEquals(ort, res[0]. getOrderTime());
    assertEquals("PLACED", res[0].getOStatus());
    assertEquals(od1, res[0].getOrderDate());
    assertEquals(334, res[0]. getOId());
    assertEquals(null, res[0].getOComment());
    assertEquals(3, res[0].getCId());
    assertEquals(500, res[0].getVId());
}
}