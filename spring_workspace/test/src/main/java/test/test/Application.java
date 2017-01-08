package test.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// spring boot proektite vinagi pochvat ot main funkciqta kato izvikvat v main svoq klas
//da se pregleda spring boot aplication anotaciqta
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
