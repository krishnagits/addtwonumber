package com.demo.addtwonumber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    private final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a,
                   @RequestParam int b,
                   @RequestParam int c) {
        System.out.println("CI/CD triggered...");
        return addService.add(a, b, c);
    }
}
