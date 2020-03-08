package ru.netology.stats;

public class StatService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public int calculateAverage(int[] purchases) {
        int sum = 0;
        for (int purchase = 0; purchase < purchases.length; purchase++) {
            sum += purchases[(int) purchase];
        }
        int average = sum / 12;
        return average;
    }



    public int findMonthWithMaxPurchase(int[] purchases) {
        int MaxMonth = purchases[0];
        for (int purchase = 1; purchase < purchases.length; purchase++) {
            if (purchases[(int) purchase] > MaxMonth) {
                MaxMonth = purchases[(int) purchase];
            }
        }
        return purchases[];
    }
    public int findMonthsUnderAverage(int[] purchases) {
        int sum = 0;
        int purchase;
        for (purchase = 0; purchases.length > purchase; purchase++) {
            sum += purchases[(int) purchase];
        }
        int average = sum / 12;
        if (purchases[purchase] < average) {
            average = purchases[purchase];
        }
        return purchases[purchase];
    }
}
