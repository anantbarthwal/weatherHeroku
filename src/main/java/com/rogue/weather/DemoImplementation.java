package com.rogue.weather;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoImplementation implements DemoInterface{

    @Override
    public String getDemo() {
        return "heloooooooooooooooooooooo";

    }
}
