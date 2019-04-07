package com.kodilla.aaastring;
import java.util.*;

public class Verifier {

    ArrayList isEven = new ArrayList<Integer>();
    ArrayList isOdd = new ArrayList<Integer>();

      public void isEvenOdd(ArrayDeque<Integer> theStack){

        for (Integer stack: theStack){
            int temporaryValue = theStack.poll();

            if (temporaryValue % 2 == 0){
                isEven.add(temporaryValue);

            } else {
                isOdd.add(temporaryValue);

            }
        }
    }
}
