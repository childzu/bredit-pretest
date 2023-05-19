package org.bredit.exam;

import java.util.List;

public class QuestionTwo {
    public String process(List<String> list, int col) {
        int size = list.size();
        if(size < 1 || col < 1)
            return "<table></table>";
        int dataCount = 0;
        String result = "<table>";
        String temp = "";
        for(int row = 0; row < Math.abs(size/col); row++){
            temp = "<tr>";
            for(int i = 0; i < col; i++){
                dataCount += 1;
                temp += "<td>" + list.get(dataCount-1) + "</td>";
            }
            temp += "</tr>";
            result += temp;
        }
        temp = "<tr>";
        if(size%col > 0) {
            for(int i = 0; i < col; i++){
                dataCount += 1;
                if(dataCount > size) {
                    temp += "<td></td>";
                }
                else {
                    temp += "<td>" + list.get(dataCount - 1) + "</td>";
                }
            }
            temp += "</tr>";
            result += temp;
        }
        return result + "</table>";
    }

    public static void main(String args[]) {
        QuestionTwo two  = new QuestionTwo();
        System.out.println(two.process(List.of(new String[]{"a", "b", "c"}), 2));
        System.out.println(two.process(List.of(new String[]{"a", "b", "c"}), 3));
    }
}
