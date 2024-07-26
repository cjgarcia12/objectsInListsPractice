package org.example;

import java.util.Scanner;

class Counter {
    private int startValue;

    public Counter(int value) {
        this.startValue = value;
    }

    public Counter() {
        this.startValue = 0;
    }

    public int getValue() {
        return this.startValue;
    }

    public void Increase() {
        this.startValue++;
    }

    public void Decrease() {
        this.startValue--;
    }

    public void Increase(int increaseBy) {
        if (increaseBy > 0) {
            this.startValue += increaseBy;
        } else {
            increaseBy = 0;
        }
    }
    public void Decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.startValue -= decreaseBy;
        } else {
            decreaseBy = 0;
        }
    }
}

public class CounterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose a start value or press enter to start at 0");
        String start = scanner.nextLine();
        Counter counter;
        if (start.isEmpty()) {
            counter = new Counter();
        } else {
            counter = new Counter(Integer.parseInt(start));
        }


        boolean stop = false;
        while(!stop) {
            System.out.println("what would you like to do? \nChoose a number as shown below\n1: Increase\n2: Decrease"
            + "\n3: Increase By\n4: Decrease By\n5: Get current value\n6: quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    counter.Increase();
                    break;
                case 2:
                    counter.Decrease();
                    break;
                case 3:
                    System.out.println("How much do you want to increase by?");
                    int increaseBy = scanner.nextInt();
                    counter.Increase(increaseBy);
                    break;
                case 4:
                    System.out.println("How much do you want to decrease by?");
                    int decreaseBy = scanner.nextInt();
                    counter.Decrease(decreaseBy);
                    break;
                case 5:
                    System.out.println("Current value: " + counter.getValue());
                    break;
                case 6:
                    stop = true;
                    break;
            }
        }
    }
}
