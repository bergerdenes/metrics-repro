package org.example.repro;

import org.springframework.stereotype.Controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Controller
@Path("")
public class TestController {

    @GET
    @Path("test")
    public String testResponse() {
        return "testing";
    }
}
