package org.bredit.exam;

public class QuestionThree {
    public int process(int amount, int speed, int day) {
        if(amount < 1 || speed <1 || day < 1) {
            return 0;
        }
        int left = amount;
        int previousAmt = 0;
        int todayLeftAmt = 0;
        for (int i = 0 ; i < day ; i++) {
            if(i < 1) {
                todayLeftAmt = 1;
                previousAmt = todayLeftAmt;
                left = left - todayLeftAmt;
            }
            else {
                todayLeftAmt = speed * previousAmt;
                previousAmt = todayLeftAmt;
                left = left - todayLeftAmt;
                if(left < 1) {
                    previousAmt = 0;
                    left = 0;
                }
            }
        }
        return left;
    }

    public static void main(String args[]) {
        QuestionThree questionThree = new QuestionThree();
        System.out.println(questionThree.process(10, 2, 1));
        System.out.println(questionThree.process(10, 2, 2));
        System.out.println(questionThree.process(10, 2, 5));
        System.out.println(questionThree.process(20, 3, 3));
    }
}
