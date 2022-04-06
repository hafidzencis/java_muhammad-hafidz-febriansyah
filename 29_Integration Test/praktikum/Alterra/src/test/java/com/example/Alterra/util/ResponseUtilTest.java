package com.example.Alterra.util;

import com.example.Alterra.constant.appconstant;
import com.example.Alterra.payload.Response;
import org.apache.tomcat.util.http.ResponseUtil;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponseUtilTest {

    @Test
    void_buildResponse_Succes(){
        ResponseEntity<Object> responseEntity = ResponseUtil.build(appconstant.KEY_SUCCESS,null, HttpStatus.OK);
        assertEquals(HttpStatus.OK.value(), responseEntity.getStatusCodeValue());
    }
}
