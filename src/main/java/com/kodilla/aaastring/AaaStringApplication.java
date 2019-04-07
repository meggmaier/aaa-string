package com.kodilla.aaastring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class AaaStringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AaaStringApplication.class, args);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        Random theGenerator = new Random();
        for(int n=0; n < 50; n++){

            queue.push(theGenerator.nextInt(51));
        }

        String string = "a";

        for(Integer elem: queue){
            System.out.println(String.join("", Collections.nCopies(queue.poll(), string)));
        }

        Verifier verifier = new Verifier();
        verifier.isEvenOdd(queue);


    }

}
