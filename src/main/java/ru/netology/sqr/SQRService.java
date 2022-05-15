package ru.netology.sqr;

public class SQRService {
    public int calcSqrService(int alfa, int omega) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= alfa &&
            sqr <= omega) {
                count++;
            }
        }
        return count;
    }
}
