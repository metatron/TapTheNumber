package jp.arrow.angelforest.tapnumbers.main;

import java.util.ArrayList;

import android.util.Log;

public class TapTheNumbersLogic {
    public static final int MAX_NUMBER = 25;
    private int crntNumber = 1;

    private ArrayList<Integer> numberList = new ArrayList<Integer>();

    public boolean isClickNumberSame(int clickedNum) {
        if(crntNumber == clickedNum) {
            crntNumber++;
            return true;
        }

        return false;
    }

    public boolean isLastNumber() {
        if(crntNumber == MAX_NUMBER+1) {
            return true;
        }

        return false;
    }

    public void reset() {
        crntNumber = 1;
        numberList.clear();
        resetNumberList();
    }

    public void resetNumberList() {
        //choose number
        do {
            //generate random number
            int genedNum = (int)((MAX_NUMBER+5)*Math.random());

            //check and if it not exists on the list,
            //put that on
            if(genedNum > 0 && !numberList.contains(genedNum) && genedNum <= MAX_NUMBER) {
                numberList.add(genedNum);
                Log.e(null, "gened: " + genedNum);
            }
        } while(numberList.size() < MAX_NUMBER);
        Log.e(null, "finished!!!!!!!!" + numberList.size());
    }

    public ArrayList<Integer> getNumberList() {
        return numberList;
    }
}
