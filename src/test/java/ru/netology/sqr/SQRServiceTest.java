package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void outputSquaresOfTheRange() {
        SQRService service = new SQRService();

        int bottom = 200;
        int upper = 300;
        int numbSquares = 3;
        int real = service.outputSquaresOfTheRange (bottom, upper);

        assertEquals(numbSquares,real);
    }
    @Test
    void outputSquaresOfTheRangeZero() {
        SQRService service = new SQRService();

        int bottom = 10;
        int upper = 40;
        int numbSquares = 0;
        int real = service.outputSquaresOfTheRange (bottom, upper);

        assertEquals(numbSquares,real);
    }
    @Test
    void outputSquaresOfTheRange22() {
        SQRService service = new SQRService();

        int bottom = 10;
        int upper = 999;
        int numbSquares = 22;
        int real = service.outputSquaresOfTheRange (bottom, upper);

        assertEquals(numbSquares,real);
    }
    @Test
    void outputSquaresOfTheRange68() {
        SQRService service = new SQRService();

        int bottom = 1000;
        int upper = 10500;
        int numbSquares = 68;
        int real = service.outputSquaresOfTheRange (bottom, upper);

        assertEquals(numbSquares,real);
    }
}