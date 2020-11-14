package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedualController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String hi(@RequestParam("name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
