package rafael.alcocer.caldera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/one")
    public String one() {
        return "one";
    }

    @GetMapping("/two")
    public String two() {
        return "two";
    }

    @GetMapping("/three")
    public String three() {
        return "three";
    }

    @GetMapping("/four")
    public String four() {
        return "four";
    }

    @GetMapping("/five")
    public String five() {
        return "five";
    }
}
