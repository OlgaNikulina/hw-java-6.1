package ru.netology.stats;

public class StatService<count, countOfMonths> {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int calculateAverage(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum / purchases.length;
    }

    public int findMonthWithMaxPurchase(int[] purchases) {
        int maxMonth = purchases[0];
        int numberOfMonth = 1;
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
        int numberOfMonth = 1;
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
        int countOfMonths = 0;
        for (int i = 0; purchases.length > i; i++) {
            if (purchases[i] < average) {
                countOfMonths++;
            }
        }
        return countOfMonths;
    }

    public int findMonthsOverAverage(int[] purchases) {
        int average = calculateAverage(purchases);
        int countOfMonths = 0;
        for (int i = 0; purchases.length > i; i++) {
            if (purchases[i] > average) {
                countOfMonths++;
            }
        }
        return countOfMonths;
    }
}