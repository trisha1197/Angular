package com.hexaware.FTP105.integration.test;

import java.util.Arrays;
import java.util.Date;
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

public class CustomerRestTest{
@Test
    public void testRestCustomerWallet() throws AssertionError, URISyntaxException {
    Customer c = new Customer();
    float res = given().when().accept(ContentType.JSON).get(CommonUtil.getURI("/api/customer/1")).getBody().as(float.class);
        c.setWallet(res);
        assertNotNull(res);
        assertEquals(1859.4100341796875, c.getWallet(),0.01);
}

@Test
public void testCustomerLogin() throws AssertionError,URISyntaxException {
Customer res = given()
              .when()
              .accept(ContentType.JSON)
              .get(CommonUtil.getURI("/api/customer?cUserName=siva&cPassword=pass001"))
              .getBody().as(Customer.class);
assertEquals(1859.4100341796875,res.getWallet(),0.01);
assertEquals(1,res.getCId());
assertEquals("sivaram",res.getCName());
assertEquals("siva",res.getCUserName());
assertEquals("pass001",res.getCPassword());
}
}
