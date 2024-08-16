package ir.reyhani.swagger.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String hellWorldName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @PostMapping
    public String helloPost() {
        return "Hello Post";
    }
}
