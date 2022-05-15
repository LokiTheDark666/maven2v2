package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int alfa, int omega, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSqrService(alfa, omega);

        Assertions.assertEquals(expected, actual);
    }
}
