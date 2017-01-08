package test.test;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//controler - upravlenie na web servisa
@RestController
public class GreetingController {

    private static final String template = "Pesho e mnogo zle, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/webServices")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Adilll") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
