package com.example.tngp17_001.homework3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends Activity implements View.OnClickListener {
    int input;
    int count = 0;
    ImageButton buttonCoin;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        input = intent.getIntExtra("input",0);
        iniInstances();
    }

    private void iniInstances() {
        tvDisplay = (TextView) findViewById(R.id.tv_display);
        tvDisplay.setText(count+"");
        buttonCoin = (ImageButton) findViewById(R.id.button_coin);
        buttonCoin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(count >= input){
            Intent intent = new Intent(this, MainActivity.class);
            finish();
            startActivity(intent);
        }else{
            tvDisplay.setText(++count+"");
        }
    }
}
