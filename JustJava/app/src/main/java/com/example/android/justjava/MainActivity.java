package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method called when score button pressed
     */
    public void submitQuiz(View view) {
        /**Question 1*/
        CheckBox gallstonesscheckbox = (CheckBox) findViewById(R.id.gallstones);
        boolean isgallstones = gallstonesscheckbox.isChecked();
        CheckBox diabetesecheckbox = (CheckBox) findViewById(R.id.diabetes);
        boolean isdiabetese = diabetesecheckbox.isChecked();
        CheckBox heartattackcheckbox = (CheckBox) findViewById(R.id.heart_attack);
        boolean isheartattack = heartattackcheckbox.isChecked();
        int result;
        calculateResult1(isgallstones, isdiabetese, isheartattack);

        /**Question 2*/
        EditText medit = (EditText) findViewById(R.id.edit_text1);
        String q2 = medit.getText().toString();
        if (q2.matches("c")) {
            score = score + 1;
        }
        /**Question3*/
        RadioButton ground_radio = (RadioButton) findViewById(R.id.q3_1);
        boolean is_ground = ground_radio.isChecked();
        RadioButton instant_radio = (RadioButton) findViewById(R.id.q3_2);
        boolean is_instant = instant_radio.isChecked();
        calculateResult2(is_ground, is_instant);
        /**Question4*/
        RadioButton south = (RadioButton) findViewById(R.id.q4_1);
        boolean is_south = south.isChecked();
        RadioButton africa = (RadioButton) findViewById(R.id.q4_2);
        boolean is_africa = africa.isChecked();
        calculateResult3(is_south, is_africa);
        /**Question5*/
        RadioButton gardenias = (RadioButton) findViewById(R.id.q5_1);
        boolean is_gardenias = gardenias.isChecked();
        RadioButton roses = (RadioButton) findViewById(R.id.q5_2);
        boolean is_roses = roses.isChecked();
        calculateResult4(is_gardenias, is_roses);
        /**Question6*/
        RadioButton counter = (RadioButton) findViewById(R.id.q6_1);
        boolean is_counter = counter.isChecked();
        RadioButton freezer = (RadioButton) findViewById(R.id.q6_2);
        boolean is_freezer = freezer.isChecked();
        result = calculateResult5(is_counter, is_freezer);

        displayResult(result);
        score = 0;
    }

    /**
     * Calculates the scores of the quiz.*/

           /**Question1
     */
    private int calculateResult1(boolean isgallstones, boolean isdiabetese, boolean isheartattack) {
        if ((isgallstones) && (isdiabetese)) {
            score = score + 1;
        }
        return score;
    }

    /**
     * Question3
     */
    private int calculateResult2(boolean isground, boolean isinistance) {
        if (isground) {
            score = score + 0;
        }
        if (isinistance) {
            score = score + 1;
        }
        return score;
    }

    /**
     * Question4
     */
    private int calculateResult3(boolean is_south, boolean is_africa) {
        if (is_south) {
            score = score + 0;
        }
        if (is_africa) {
            score = score + 1;
        }
        return score;
    }

    /**
     * Question5
     */
    private int calculateResult4(boolean is_gardenias, boolean is_roses) {
        if (is_gardenias) {
            score = score + 1;
        }
        if (is_roses) {
            score = score + 0;
        }
        return score;
    }

    /**
     * Question6
     */
    private int calculateResult5(boolean is_counter, boolean is_freezer) {
        if (is_counter) {
            score = score + 1;
        }
        if (is_freezer) {
            score = score + 0;
        }
        return score;
    }

    /**
     * Display Score
     */
    private void displayResult(int price) {
        Toast.makeText(this, "You got:  " + price + "  out of 6", Toast.LENGTH_SHORT).show();

    }
}