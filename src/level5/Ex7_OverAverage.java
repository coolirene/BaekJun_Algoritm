package level5;

import java.util.Scanner;

public class Ex7_OverAverage {

    static int total;
    static int totalScore;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());

        for(int i=0; i<num; i++) {

            total = 0; totalScore = 0;

            String str = s.nextLine();

            calAverage(str);
        }    
    }

    static private void calAverage(String str) {
        String[] strArray = str.split(" ");
        int num = 0;
        total += Integer.parseInt(strArray[0]);

        for(int i=1; i<strArray.length; i++) {
            totalScore += Integer.parseInt(strArray[i]);
        }

        for(int i=1; i<strArray.length; i++) {

            if(Integer.parseInt(strArray[i]) > totalScore/total) {
                num++;
            }
        }
        System.out.printf("%.3f%% \n",(double)num / ((double)strArray.length-1)* 100);
    }
}

 