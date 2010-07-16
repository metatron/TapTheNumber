package jp.arrow.angelforest.tapnumbers.main;

import java.util.ArrayList;

import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;

public class TapTheNumbersActivity extends Activity {
    private TapTheNumbersLogic logic;
    private DisplayMessageView msgView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        logic = new TapTheNumbersLogic();

        logic.reset();
        initButton(logic.getNumberList());
        initStartButton();

        //display view
        msgView = new DisplayMessageView(this);
        addContentView(msgView, new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
    }

    private void initStartButton() {
        setStartButtonClickListener((Button)findViewById(R.id.Button26));
    }

    private void setButtonClickListener(final Button btn, final int num) {
        //change the text of the btn
        btn.setText(""+num);

        //set click listener
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(null, "Number pressed:" + num);
//                logic.getUserInputList().add(num);
                if(logic.isClickNumberSame(num)) {
                    btn.setEnabled(false);

                    //check finished
                    if(logic.isLastNumber()) {
                        msgView.setState(DisplayMessageView.STATE_FINISHED);
                    }
                 }
            }
        });
    }

    private void setStartButtonClickListener(Button btn) {
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //enable all btn
                enableAllButtons();

                //reset crntNumber
                logic.reset();

                initButton(logic.getNumberList());

                //set state to go
                msgView.reset();
                msgView.setState(DisplayMessageView.STATE_GO);
            }
        });
    }

    private void initButton(ArrayList<Integer> numberList) {
        setButtonClickListener((Button)findViewById(R.id.Button01), numberList.get(0));
        setButtonClickListener((Button)findViewById(R.id.Button02), numberList.get(1));
        setButtonClickListener((Button)findViewById(R.id.Button03), numberList.get(2));
        setButtonClickListener((Button)findViewById(R.id.Button04), numberList.get(3));
        setButtonClickListener((Button)findViewById(R.id.Button05), numberList.get(4));
        setButtonClickListener((Button)findViewById(R.id.Button06), numberList.get(5));
        setButtonClickListener((Button)findViewById(R.id.Button07), numberList.get(6));
        setButtonClickListener((Button)findViewById(R.id.Button08), numberList.get(7));
        setButtonClickListener((Button)findViewById(R.id.Button09), numberList.get(8));
        setButtonClickListener((Button)findViewById(R.id.Button10), numberList.get(9));
        setButtonClickListener((Button)findViewById(R.id.Button11), numberList.get(10));
        setButtonClickListener((Button)findViewById(R.id.Button12), numberList.get(11));
        setButtonClickListener((Button)findViewById(R.id.Button13), numberList.get(12));
        setButtonClickListener((Button)findViewById(R.id.Button14), numberList.get(13));
        setButtonClickListener((Button)findViewById(R.id.Button15), numberList.get(14));
        setButtonClickListener((Button)findViewById(R.id.Button16), numberList.get(15));
        setButtonClickListener((Button)findViewById(R.id.Button17), numberList.get(16));
        setButtonClickListener((Button)findViewById(R.id.Button18), numberList.get(17));
        setButtonClickListener((Button)findViewById(R.id.Button19), numberList.get(18));
        setButtonClickListener((Button)findViewById(R.id.Button20), numberList.get(19));
        setButtonClickListener((Button)findViewById(R.id.Button21), numberList.get(20));
        setButtonClickListener((Button)findViewById(R.id.Button22), numberList.get(21));
        setButtonClickListener((Button)findViewById(R.id.Button23), numberList.get(22));
        setButtonClickListener((Button)findViewById(R.id.Button24), numberList.get(23));
        setButtonClickListener((Button)findViewById(R.id.Button25), numberList.get(24));
    }

    private void disableButton(int clickedBtnNum) {
        switch(clickedBtnNum) {
        case 1:
            findViewById(R.id.Button01).setEnabled(false);
            break;
        case 2:
            findViewById(R.id.Button02).setEnabled(false);
            break;
        case 3:
            findViewById(R.id.Button03).setEnabled(false);
            break;
        case 4:
            findViewById(R.id.Button04).setEnabled(false);
            break;
        case 5:
            findViewById(R.id.Button05).setEnabled(false);
            break;
        case 6:
            findViewById(R.id.Button06).setEnabled(false);
            break;
        case 7:
            findViewById(R.id.Button07).setEnabled(false);
            break;
        case 8:
            findViewById(R.id.Button08).setEnabled(false);
            break;
        case 9:
            findViewById(R.id.Button09).setEnabled(false);
            break;
        case 10:
            findViewById(R.id.Button10).setEnabled(false);
            break;
        case 11:
            findViewById(R.id.Button11).setEnabled(false);
            break;
        case 12:
            findViewById(R.id.Button12).setEnabled(false);
            break;
        case 13:
            findViewById(R.id.Button13).setEnabled(false);
            break;
        case 14:
            findViewById(R.id.Button14).setEnabled(false);
            break;
        case 15:
            findViewById(R.id.Button15).setEnabled(false);
            break;
        case 16:
            findViewById(R.id.Button16).setEnabled(false);
            break;
        case 17:
            findViewById(R.id.Button17).setEnabled(false);
            break;
        case 18:
            findViewById(R.id.Button18).setEnabled(false);
            break;
        case 19:
            findViewById(R.id.Button19).setEnabled(false);
            break;
        case 20:
            findViewById(R.id.Button20).setEnabled(false);
            break;
        case 21:
            findViewById(R.id.Button21).setEnabled(false);
            break;
        case 22:
            findViewById(R.id.Button22).setEnabled(false);
            break;
        case 23:
            findViewById(R.id.Button23).setEnabled(false);
            break;
        case 24:
            findViewById(R.id.Button24).setEnabled(false);
            break;
        case 25:
            findViewById(R.id.Button25).setEnabled(false);
            break;
        }
    }

    private void enableAllButtons() {
        for(int i=1; i<=TapTheNumbersLogic.MAX_NUMBER; i++) {
            enableButton(i);
        }
    }
    private void enableButton(int clickedBtnNum) {
        switch(clickedBtnNum) {
        case 1:
            findViewById(R.id.Button01).setEnabled(true);
            break;
        case 2:
            findViewById(R.id.Button02).setEnabled(true);
            break;
        case 3:
            findViewById(R.id.Button03).setEnabled(true);
            break;
        case 4:
            findViewById(R.id.Button04).setEnabled(true);
            break;
        case 5:
            findViewById(R.id.Button05).setEnabled(true);
            break;
        case 6:
            findViewById(R.id.Button06).setEnabled(true);
            break;
        case 7:
            findViewById(R.id.Button07).setEnabled(true);
            break;
        case 8:
            findViewById(R.id.Button08).setEnabled(true);
            break;
        case 9:
            findViewById(R.id.Button09).setEnabled(true);
            break;
        case 10:
            findViewById(R.id.Button10).setEnabled(true);
            break;
        case 11:
            findViewById(R.id.Button11).setEnabled(true);
            break;
        case 12:
            findViewById(R.id.Button12).setEnabled(true);
            break;
        case 13:
            findViewById(R.id.Button13).setEnabled(true);
            break;
        case 14:
            findViewById(R.id.Button14).setEnabled(true);
            break;
        case 15:
            findViewById(R.id.Button15).setEnabled(true);
            break;
        case 16:
            findViewById(R.id.Button16).setEnabled(true);
            break;
        case 17:
            findViewById(R.id.Button17).setEnabled(true);
            break;
        case 18:
            findViewById(R.id.Button18).setEnabled(true);
            break;
        case 19:
            findViewById(R.id.Button19).setEnabled(true);
            break;
        case 20:
            findViewById(R.id.Button20).setEnabled(true);
            break;
        case 21:
            findViewById(R.id.Button21).setEnabled(true);
            break;
        case 22:
            findViewById(R.id.Button22).setEnabled(true);
            break;
        case 23:
            findViewById(R.id.Button23).setEnabled(true);
            break;
        case 24:
            findViewById(R.id.Button24).setEnabled(true);
            break;
        case 25:
            findViewById(R.id.Button25).setEnabled(true);
            break;
        }
    }
}