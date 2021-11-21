package com.rogue.weather;

import org.springframework.web.bind.annotation.GetMapping;

public interface DemoInterface {

    @GetMapping("/demo")
    public String getDemo();
}
