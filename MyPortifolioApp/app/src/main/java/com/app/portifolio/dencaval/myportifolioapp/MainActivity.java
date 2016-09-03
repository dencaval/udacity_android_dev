package com.app.portifolio.dencaval.myportifolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String> appNameList = new ArrayList<String>();
        appNameList.add("Popular Movies");
        appNameList.add("Stock Hawk");
        appNameList.add("Build It Bigger");
        appNameList.add("Make Your App Material");
        appNameList.add("Go Ubiquitous");
        appNameList.add("Capstone");

        for (int i = 0; i < appNameList.size(); i++){
            final int current = i;
            String button_text = appNameList.get(current);
            final String toast_text = "This button will launch my ".concat(button_text)
                    .concat(" app!");

            int resId = getResources().getIdentifier("button".concat(Integer.toString(i+1)),
                    "id", getPackageName());
            Button b = (Button) findViewById(resId);
            b.setText(button_text);

            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), toast_text, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
