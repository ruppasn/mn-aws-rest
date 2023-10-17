package com.example;

import io.micronaut.http.annotation.*;

@Controller("/mn-aws-rest")
public class MnAwsRestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}