package com.assignment;

public class App {

    public String analyze(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            } else {
                sum -= num;
            }
        }

        if (sum > 0) return "Positive";
        else if (sum < 0) return "Negative";
        else return "Zero";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.analyze(new int[]{2, 3, 4}));
    }
}
