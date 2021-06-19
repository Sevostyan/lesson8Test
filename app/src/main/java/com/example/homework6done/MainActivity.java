package com.example.homework6done;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> units = new ArrayList();
        units.add("один");
        units.add("два");
        units.add("три");
        units.add("четыре");
        units.add("пять");
        units.add("шесть");
        units.add("семь");
        units.add("восемь");
        units.add("девять");

        List<String> dozens = new ArrayList<>();
        dozens.add("десять");
        dozens.add("двадцать");
        dozens.add("тридцать");
        dozens.add("сорок");
        dozens.add("пятьдесят");
        dozens.add("шестьдесят");
        dozens.add("семьдесят");
        dozens.add("восемьдесят");
        dozens.add("девяносто");

        List<String> hundreds = new ArrayList<>();
        hundreds.add("сто");
        hundreds.add("двести");
        hundreds.add("триста");
        hundreds.add("четыреста");
        hundreds.add("пятьсот");

        List<String> declinationsOfRubles = new ArrayList<>();
        declinationsOfRubles.add("рубль");
        declinationsOfRubles.add("рубля");
        declinationsOfRubles.add("рублей");


        int number = (int) (Math.random() * RandomRange.MAX.value) + RandomRange.MIN.value;
        Log.d("homework6done", "generated number =" + number);

        StringBuilder result = new StringBuilder();
        if (number / 100 != 0)
            result.append(hundreds.get((number / 100) - 1));

        if ((number % 100) / 10 != 0)
            result
                    .append(" ")
                    .append(dozens.get(((number % 100) / 10) - 1));


        if (number % 10 != 0)
            result
                    .append(" ")
                    .append(units.get((number % 10) - 1));

        if (number % 10 == 1)
            result
                    .append(" ")
                    .append(declinationsOfRubles.get(0));
        else if (number % 10 >= 2 && number % 10 <= 4)
            result
                    .append(" ")
                    .append(declinationsOfRubles.get(1));
        else if (number % 10 >= 5 || number % 10 == 0)
            result
                    .append(" ")
                    .append(declinationsOfRubles.get(2));

        Log.d("homework6done", " " + result.toString());
    }
}