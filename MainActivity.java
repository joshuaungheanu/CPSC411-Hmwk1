// Joshua Ungheanu
// CPSC 411 - Hmwk1

package com.example.hmwk1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv = new HorizontalScrollView(this);
        hsv.setBackgroundColor(Color.BLACK);
        setContentView(hsv);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        hsv.addView(mainLayout);

        //-----------Row 1------------------------------------------------
        LinearLayout layout1 = new LinearLayout(this);
        layout1.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout1.setLayoutParams(lp); //row1

        //Row 1 Column 1---------------------------------------

        TextView num1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num1.setPadding(30, 0, 30, 0);
        num1.setLayoutParams(lp);
        num1.setText("1");
        num1.setBackgroundColor(Color.GRAY);
        num1.setTextSize(20);
        num1.setTextColor(Color.BLACK);

        layout1.addView(num1);

        //Row 1 Column 2---------------------------------------

        TextView string1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string1.setLayoutParams(lp);
        string1.setText("Rules void hello1(int hour)");
        string1.setGravity(Gravity.CENTER);
        string1.setBackgroundColor(Color.BLACK);
        string1.setTextSize(20);
        string1.setTextColor(Color.WHITE);

        layout1.addView(string1);

        mainLayout.addView(layout1);

        //-----------Row 2&3 Horizontally-----------------------
        LinearLayout layout2_3 = new LinearLayout(this);
        layout2_3.setOrientation(LinearLayout.HORIZONTAL);

        //----------Row 2&3 Vertically------------------------

        LinearLayout layout2_3v = new LinearLayout(this);
        layout2_3v.setOrientation(LinearLayout.VERTICAL);

        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout2_3v.setLayoutParams(lp); //row2

        TextView num2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num2.setPadding(30, 0, 30, 0);
        num2.setLayoutParams(lp);
        num2.setText("2");
        num2.setBackgroundColor(Color.GRAY);
        num2.setTextSize(20);
        num2.setTextColor(Color.BLACK);

        layout2_3v.addView(num2);

        TextView num3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num3.setPadding(30, 0, 30, 0);
        num3.setLayoutParams(lp);
        num3.setText("3");
        num3.setBackgroundColor(Color.GRAY);
        num3.setTextSize(20);
        num3.setTextColor(Color.BLACK);

        layout2_3v.addView(num3);
        layout2_3.addView(layout2_3v);
        mainLayout.addView(layout2_3);

        //-------Row 2 and 3 Col 1-----------------------------------------
        LinearLayout layout23_1 = new LinearLayout(this);

        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.MATCH_PARENT //height
        );
        layout23_1.setLayoutParams(lp);

        TextView string2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.MATCH_PARENT //height
        );
        lp.setMargins(2,2,2,2);
        string2.setPadding(86, 0, 86, 0);
        string2.setGravity(Gravity.CENTER);
        string2.setLayoutParams(lp);
        string2.setText("Properties");
        string2.setBackgroundColor(Color.WHITE);
        string2.setTextSize(20);
        string2.setTextColor(Color.BLACK);

        layout23_1.addView(string2);
        layout2_3.addView(layout23_1);

        //----------Row 2 & 3 with Col 3------------------------

        LinearLayout layout23_2 = new LinearLayout(this);
        layout23_2.setOrientation(LinearLayout.VERTICAL);

        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout23_2.setLayoutParams(lp);

        TextView string2_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string2_1.setPadding(30, 0, 30, 0);
        string2_1.setLayoutParams(lp);
        string2_1.setText("name");
        string2_1.setGravity(Gravity.CENTER);
        string2_1.setBackgroundColor(Color.WHITE);
        string2_1.setTextSize(20);
        string2_1.setTextColor(Color.BLACK);

        layout23_2.addView(string2_1);

        TextView string2_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string2_2.setPadding(234, 0, 235, 0);
        string2_2.setLayoutParams(lp);
        string2_2.setText("category");
        string2_2.setGravity(Gravity.CENTER);
        string2_2.setBackgroundColor(Color.WHITE);
        string2_2.setTextSize(20);
        string2_2.setTextColor(Color.BLACK);

        layout23_2.addView(string2_2);
        layout2_3.addView(layout23_2);

        //----------Row 2 & 3 with Col 4------------------------

        LinearLayout layout23_3 = new LinearLayout(this);
        layout23_3.setOrientation(LinearLayout.VERTICAL);

        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout23_3.setLayoutParams(lp);

        TextView string2_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string2_3.setPadding(30, 0, 30, 0);
        string2_3.setLayoutParams(lp);
        string2_3.setText("Day Hour Classification");
        string2_3.setBackgroundColor(Color.WHITE);
        string2_3.setTextSize(20);
        string2_3.setTextColor(Color.BLACK);

        layout23_3.addView(string2_3);

        TextView string2_4 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string2_4.setPadding(30, 0, 30, 0);
        string2_4.setLayoutParams(lp);
        string2_4.setText("Day and Time");
        string2_4.setBackgroundColor(Color.WHITE);
        string2_4.setTextSize(20);
        string2_4.setTextColor(Color.BLACK);

        layout23_3.addView(string2_4);
        layout2_3.addView(layout23_3);


        //-----------Row 4------------------------------------------------
        LinearLayout layout4 = new LinearLayout(this);
        layout4.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout4.setLayoutParams(lp); //row4

        //Row 4 Column 1---------------------------------------

        TextView num4 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num4.setPadding(30, 0, 30, 0);
        num4.setLayoutParams(lp);
        num4.setText("4");
        num4.setBackgroundColor(Color.GRAY);
        num4.setTextSize(20);
        num4.setTextColor(Color.BLACK);

        layout4.addView(num4);

        //Row 4 Column 2---------------------------------------

        TextView string4 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string4.setPadding(155, 0, 154, 0);
        string4.setLayoutParams(lp);
        string4.setText("Rule");
        string4.setTypeface(Typeface.DEFAULT_BOLD);
        string4.setBackgroundColor(Color.CYAN);
        string4.setTextSize(20);
        string4.setTextColor(Color.BLACK);

        layout4.addView(string4);

        //Row 4 column 3-------------------------------------

        TextView string4_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string4_1.setPadding(303, 0, 304, 0);
        string4_1.setLayoutParams(lp);
        string4_1.setText("C1");
        string4_1.setTypeface(Typeface.DEFAULT_BOLD);
        string4_1.setBackgroundColor(Color.CYAN);
        string4_1.setTextSize(20);
        string4_1.setTextColor(Color.BLACK);

        layout4.addView(string4_1);

        //Row 4 Col 4------------------------------------------

        TextView string4_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string4_2.setPadding(400, 0, 400, 0);
        string4_2.setLayoutParams(lp);
        string4_2.setText("A1");
        string4_2.setTypeface(Typeface.DEFAULT_BOLD);
        string4_2.setBackgroundColor(Color.CYAN);
        string4_2.setTextSize(20);
        string4_2.setTextColor(Color.BLACK);

        layout4.addView(string4_2);

        mainLayout.addView(layout4);

        //-----------Row 5------------------------------------------------
        LinearLayout layout5 = new LinearLayout(this);
        layout5.setOrientation(LinearLayout.HORIZONTAL);
        //int num = 1;
        //num  \
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout5.setLayoutParams(lp); //row5

        //Row 5 Column 1---------------------------------------

        TextView num5 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num5.setPadding(30, 0, 30, 0);
        num5.setLayoutParams(lp);
        num5.setText("5");
        num5.setBackgroundColor(Color.GRAY);
        num5.setTextSize(20);
        num5.setTextColor(Color.BLACK);

        layout5.addView(num5);

        //Row 5 Column 2---------------------------------------

        TextView string5 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string5.setPadding(200, 0, 200, 0);
        string5.setLayoutParams(lp);
        string5.setText(" ");
        string5.setBackgroundColor(Color.CYAN);
        string5.setTextSize(20);
        string5.setTextColor(Color.BLACK);

        layout5.addView(string5);

        //Row 5 column 3-------------------------------------

        TextView string5_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string5_1.setPadding(10, 0, 10, 0);
        string5_1.setLayoutParams(lp);
        string5_1.setText("min <= hour && hour <= max");
        string5_1.setBackgroundColor(Color.CYAN);
        string5_1.setTextSize(20);
        string5_1.setTextColor(Color.BLACK);

        layout5.addView(string5_1);

        //Row 5 Col 4------------------------------------------

        TextView string5_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string5_2.setPadding(10, 0, 10, 0);
        string5_2.setLayoutParams(lp);
        string5_2.setText("System.out.println(greeting + \", World!\")");
        string5_2.setBackgroundColor(Color.CYAN);
        string5_2.setTextSize(20);
        string5_2.setTextColor(Color.BLACK);

        layout5.addView(string5_2);

        mainLayout.addView(layout5);

        //-----------Row 6------------------------------------------------
        LinearLayout layout6 = new LinearLayout(this);
        layout6.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout6.setLayoutParams(lp); //row6

        //Row 6 Column 1---------------------------------------

        TextView num6 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num6.setPadding(30, 0, 30, 0);
        num6.setLayoutParams(lp);
        num6.setText("6");
        num6.setBackgroundColor(Color.GRAY);
        num6.setTextSize(20);
        num6.setTextColor(Color.BLACK);

        layout6.addView(num6);

        //Row 6 Column 2---------------------------------------

        TextView string6 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string6.setPadding(200, 0, 200, 0);
        string6.setLayoutParams(lp);
        string6.setText(" ");
        string6.setBackgroundColor(Color.CYAN);
        string6.setTextSize(20);
        string6.setTextColor(Color.BLACK);

        layout6.addView(string6);

        //Row 6 column 3-------------------------------------

        TextView string6_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string6_1.setPadding(84, 0, 84, 0);
        string6_1.setLayoutParams(lp);
        string6_1.setText("int min");
        string6_1.setBackgroundColor(Color.CYAN);
        string6_1.setTextSize(20);
        string6_1.setTextColor(Color.BLACK);

        layout6.addView(string6_1);

        //Row 6 Col 4------------------------------------------

        TextView string6_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string6_2.setPadding(84, 0, 84, 0);
        string6_2.setLayoutParams(lp);
        string6_2.setText("int max");
        string6_2.setBackgroundColor(Color.CYAN);
        string6_2.setTextSize(20);
        string6_2.setTextColor(Color.BLACK);

        layout6.addView(string6_2);

        //Row 6 Col 5------------------------------------------

        TextView string6_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string6_3.setPadding(180, 0, 180, 0);
        string6_3.setLayoutParams(lp);
        string6_3.setText("String greeting");
        string6_3.setBackgroundColor(Color.CYAN);
        string6_3.setTextSize(20);
        string6_3.setTextColor(Color.BLACK);

        layout6.addView(string6_3);

        mainLayout.addView(layout6);

        //-----------Row 7------------------------------------------------
        LinearLayout layout7 = new LinearLayout(this);
        layout7.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout7.setLayoutParams(lp); //row6

        //Row 7 Column 1---------------------------------------

        TextView num7 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num7.setPadding(30, 0, 30, 0);
        num7.setLayoutParams(lp);
        num7.setText("7");
        num7.setBackgroundColor(Color.GRAY);
        num7.setTextSize(20);
        num7.setTextColor(Color.BLACK);

        layout7.addView(num7);

        //Row 7 Column 2---------------------------------------

        TextView string7 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string7.setPadding(10, 0, 299, 0);
        string7.setLayoutParams(lp);
        string7.setText("Rule");
        string7.setTypeface(Typeface.DEFAULT_BOLD);
        string7.setBackgroundColor(Color.WHITE);
        string7.setTextSize(20);
        string7.setTextColor(Color.BLACK);

        layout7.addView(string7);

        //Row 7 column 3-------------------------------------

        TextView string7_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string7_1.setPadding(10, 0, 199, 0);
        string7_1.setLayoutParams(lp);
        string7_1.setText("From");
        string7_1.setTypeface(Typeface.DEFAULT_BOLD);
        string7_1.setBackgroundColor(Color.YELLOW);
        string7_1.setTextSize(20);
        string7_1.setTextColor(Color.BLACK);

        layout7.addView(string7_1);

        //Row 7 Col 4------------------------------------------

        TextView string7_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string7_2.setPadding(10, 0, 274, 0);
        string7_2.setLayoutParams(lp);
        string7_2.setText("To");
        string7_2.setTypeface(Typeface.DEFAULT_BOLD);
        string7_2.setBackgroundColor(Color.YELLOW);
        string7_2.setTextSize(20);
        string7_2.setTextColor(Color.BLACK);

        layout7.addView(string7_2);

        //Row 7 Col 5------------------------------------------

        TextView string7_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string7_3.setPadding(10, 0, 180, 0);
        string7_3.setLayoutParams(lp);
        string7_3.setText("Greeting");
        string7_3.setTypeface(Typeface.DEFAULT_BOLD);
        string7_3.setBackgroundColor(Color.MAGENTA);
        string7_3.setTextSize(20);
        string7_3.setTextColor(Color.BLACK);

        layout7.addView(string7_3);

        mainLayout.addView(layout7);

        //-----------Row 8--------------------------------------
        LinearLayout layout8 = new LinearLayout(this);
        layout8.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout8.setLayoutParams(lp);

        //Row 8 Column 1---------------------------------------

        TextView num8 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num8.setPadding(30, 0, 30, 0);
        num8.setLayoutParams(lp);
        num8.setText("8");
        num8.setBackgroundColor(Color.GRAY);
        num8.setTextSize(20);
        num8.setTextColor(Color.BLACK);

        layout8.addView(num8);

        //Row 8 Column 2---------------------------------------

        TextView string8 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string8.setPadding(10, 0, 313, 0);
        string8.setLayoutParams(lp);
        string8.setText("R10");
        string8.setBackgroundColor(Color.WHITE);
        string8.setTextSize(20);
        string8.setTextColor(Color.BLACK);

        layout8.addView(string8);

        //Row 8 column 3-------------------------------------

        TextView string8_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string8_1.setPadding(290, 0, 10, 0);
        string8_1.setLayoutParams(lp);
        string8_1.setText("0");
        string8_1.setBackgroundColor(Color.YELLOW);
        string8_1.setTextSize(20);
        string8_1.setTextColor(Color.BLACK);

        layout8.addView(string8_1);

        //Row 8 Col 4------------------------------------------

        TextView string8_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string8_2.setPadding(272, 0, 10, 0);
        string8_2.setLayoutParams(lp);
        string8_2.setText("11");
        string8_2.setBackgroundColor(Color.YELLOW);
        string8_2.setTextSize(20);
        string8_2.setTextColor(Color.BLACK);

        layout8.addView(string8_2);

        //Row 8 Col 5------------------------------------------

        TextView string8_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string8_3.setPadding(10, 0, 180, 0);
        string8_3.setLayoutParams(lp);
        string8_3.setText("Good Morning");
        string8_3.setBackgroundColor(Color.MAGENTA);
        string8_3.setTextSize(20);
        string8_3.setTextColor(Color.BLACK);

        layout8.addView(string8_3);

        mainLayout.addView(layout8);





        //-----------Row 9------------------------------------------------
        LinearLayout layout9 = new LinearLayout(this);
        layout9.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout9.setLayoutParams(lp);

        //Row 9 Column 1---------------------------------------

        TextView num9 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num9.setPadding(30, 0, 30, 0);
        num9.setLayoutParams(lp);
        num9.setText("9");
        num9.setBackgroundColor(Color.GRAY);
        num9.setTextSize(20);
        num9.setTextColor(Color.BLACK);

        layout9.addView(num9);

        //Row 9 Column 2---------------------------------------

        TextView string9 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string9.setPadding(10, 0, 313, 0);
        string9.setLayoutParams(lp);
        string9.setText("R20");
        string9.setBackgroundColor(Color.WHITE);
        string9.setTextSize(20);
        string9.setTextColor(Color.BLACK);

        layout9.addView(string9);

        //Row 9 column 3-------------------------------------

        TextView string9_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string9_1.setPadding(261, 0, 10, 0);
        string9_1.setLayoutParams(lp);
        string9_1.setText("12");
        string9_1.setBackgroundColor(Color.YELLOW);
        string9_1.setTextSize(20);
        string9_1.setTextColor(Color.BLACK);

        layout9.addView(string9_1);

        //Row 9 Col 4------------------------------------------

        TextView string9_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string9_2.setPadding(272, 0, 10, 0);
        string9_2.setLayoutParams(lp);
        string9_2.setText("17");
        string9_2.setBackgroundColor(Color.YELLOW);
        string9_2.setTextSize(20);
        string9_2.setTextColor(Color.BLACK);

        layout9.addView(string9_2);

        //Row 9 Col 5------------------------------------------

        TextView string9_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string9_3.setPadding(10, 0, 180, 0);
        string9_3.setLayoutParams(lp);
        string9_3.setText("Good Afternoon");
        string9_3.setBackgroundColor(Color.MAGENTA);
        string9_3.setTextSize(20);
        string9_3.setTextColor(Color.BLACK);

        layout9.addView(string9_3);

        mainLayout.addView(layout9);



        //-----------Row 10------------------------------------------------
        LinearLayout layout10 = new LinearLayout(this);
        layout10.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout10.setLayoutParams(lp);

        //Row 10 Column 1---------------------------------------

        TextView num10 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num10.setPadding(15, 0, 15, 0);
        num10.setLayoutParams(lp);
        num10.setText("10");
        num10.setBackgroundColor(Color.GRAY);
        num10.setTextSize(20);
        num10.setTextColor(Color.BLACK);

        layout10.addView(num10);

        //Row 10 Column 2---------------------------------------

        TextView string10 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string10.setPadding(10, 0, 314, 0);
        string10.setLayoutParams(lp);
        string10.setText("R30");
        string10.setBackgroundColor(Color.WHITE);
        string10.setTextSize(20);
        string10.setTextColor(Color.BLACK);

        layout10.addView(string10);

        //Row 10 column 3-------------------------------------

        TextView string10_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string10_1.setPadding(261, 0, 10, 0);
        string10_1.setLayoutParams(lp);
        string10_1.setText("18");
        string10_1.setBackgroundColor(Color.YELLOW);
        string10_1.setTextSize(20);
        string10_1.setTextColor(Color.BLACK);

        layout10.addView(string10_1);

        //Row 10 Col 4------------------------------------------

        TextView string10_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string10_2.setPadding(272, 0, 10, 0);
        string10_2.setLayoutParams(lp);
        string10_2.setText("21");
        string10_2.setBackgroundColor(Color.YELLOW);
        string10_2.setTextSize(20);
        string10_2.setTextColor(Color.BLACK);

        layout10.addView(string10_2);

        //Row 10 Col 5------------------------------------------

        TextView string10_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string10_3.setPadding(10, 0, 180, 0);
        string10_3.setLayoutParams(lp);
        string10_3.setText("Good Evening");
        string10_3.setBackgroundColor(Color.MAGENTA);
        string10_3.setTextSize(20);
        string10_3.setTextColor(Color.BLACK);

        layout10.addView(string10_3);

        mainLayout.addView(layout10);




        //-----------Row 11------------------------------------------------
        LinearLayout layout11 = new LinearLayout(this);
        layout11.setOrientation(LinearLayout.HORIZONTAL);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        layout11.setLayoutParams(lp);

        //Row 11 Column 1---------------------------------------

        TextView num11 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        num11.setPadding(15, 0, 15, 0);
        num11.setLayoutParams(lp);
        num11.setText("11");
        num11.setBackgroundColor(Color.GRAY);
        num11.setTextSize(20);
        num11.setTextColor(Color.BLACK);

        layout11.addView(num11);

        //Row 11 Column 2---------------------------------------

        TextView string11 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string11.setPadding(10, 0, 313, 0);
        string11.setLayoutParams(lp);
        string11.setText("R40");
        string11.setBackgroundColor(Color.WHITE);
        string11.setTextSize(20);
        string11.setTextColor(Color.BLACK);

        layout11.addView(string11);

        //Row 11 column 3-------------------------------------

        TextView string11_1 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string11_1.setPadding(262, 0, 10, 0);
        string11_1.setLayoutParams(lp);
        string11_1.setText("22");
        string11_1.setBackgroundColor(Color.YELLOW);
        string11_1.setTextSize(20);
        string11_1.setTextColor(Color.BLACK);

        layout11.addView(string11_1);

        //Row 11 Col 4------------------------------------------

        TextView string11_2 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string11_2.setPadding(272, 0, 10, 0);
        string11_2.setLayoutParams(lp);
        string11_2.setText("23");
        string11_2.setBackgroundColor(Color.YELLOW);
        string11_2.setTextSize(20);
        string11_2.setTextColor(Color.BLACK);

        layout11.addView(string11_2);

        //Row 11 Col 5------------------------------------------

        TextView string11_3 = new TextView(this);
        lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, //width
                ViewGroup.LayoutParams.WRAP_CONTENT //height
        );
        lp.setMargins(2,2,2,2);
        string11_3.setPadding(10, 0, 180, 0);
        string11_3.setLayoutParams(lp);
        string11_3.setText("Good Night");
        string11_3.setBackgroundColor(Color.MAGENTA);
        string11_3.setTextSize(20);
        string11_3.setTextColor(Color.BLACK);

        layout11.addView(string11_3);

        mainLayout.addView(layout11);
    }
}