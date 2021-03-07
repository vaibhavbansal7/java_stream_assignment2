package com.knoldus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeTest {
    public static void main(String[] args) {


        Random random = new Random();
        List<Integer> primenumber = new ArrayList<>();

        for(int i = 0; i < 100 ; i++){
            primenumber.add(random.nextInt(100));
        }

        primenumber.stream().filter(number -> number != 1 && number > 0 && IntStream.range(2,number/2).noneMatch(t -> number % t == 0))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
