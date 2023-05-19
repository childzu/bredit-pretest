package org.bredit.exam;

public class QuestionOne {
    public int process(int base, int pow) {
        if (pow == 0) return 1;
        int result = base;
        for (int i = 1 ; i < Math.abs(pow) ; i++) {
            int temp = result;
            for(int j =1; j < base; j++) {
                temp += result;
            }
            result = temp;
        }
        return result;
    }

    public static void main(String[] args) {
        QuestionOne one  = new QuestionOne();
        System.out.println(one.process(2, 2));
        System.out.println(one.process(2, 4));
        System.out.println(one.process(10, 3));
        System.out.println(one.process(9, 3));
        System.out.println(one.process(10, 0));
        System.out.println(one.process(0, 10));
        System.out.println(one.process(-2, 2));
        System.out.println(one.process(-2, 4));
    }

}
