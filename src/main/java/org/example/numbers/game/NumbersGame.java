package org.example.numbers.game;

public class NumbersGame {
    public void Play (){

        int randomNumber;
        randomNumber = (int) (Math.random() * 100 );

        System.out.println("the random number is "+ randomNumber);
    }
}
