package ru.netology.stats;

public class StatService<count> {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAverage(int[] purchases) {
        int sum = 0;
        for (int i = 0; i < purchases.length; i++) {
            sum += purchases[i];
        }
        int average = sum / purchases.length;
        return average;
    }

    public int findMonthWithMaxPurchase(int[] purchases) {
        int maxMonth = purchases[0];
        int numberOfMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] > maxMonth) {
                maxMonth = purchases[i];
                numberOfMonth = i;
            }
        }
        return numberOfMonth;
    }

    public int findMonthWithMinPurchase(int[] purchases) {
        int minMonth = purchases[0];
        int numberOfMonth = 0;
        for (int i = 1; i < purchases.length; i++) {
            if (purchases[i] < minMonth) {
                minMonth = purchases[i];
                numberOfMonth = i;
            }
        }
        return numberOfMonth;
    }

    public int findMonthsUnderAverage(int[] purchases) {
        int average = calculateAverage(purchases);
        int count = purchases[0];
        for (int i = 0; purchases.length > i; i++) {
        }
        if (purchases[count] < average) {
            average = purchases[count];
        }

        return purchases[count];
    }

    public int findMonthsOverAverage(int[] purchases) {
        int average = calculateAverage(purchases);
        int count = purchases[0];
        for (int i = 0; purchases.length > i; i++) {
        }
        if (purchases[count] > average) {
            average = purchases[count];
        }

        return purchases[count];
    }
}
