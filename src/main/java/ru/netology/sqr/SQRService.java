package ru.netology.sqr;

public class SQRService {
    public static int outputSquaresOfTheRange (int bottom, int upper){
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= bottom & i*i<= upper) {
                result++;
            }
        }
        System.out.println(result);
        return result;
    }
}