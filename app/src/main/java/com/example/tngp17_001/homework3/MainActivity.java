package com.example.tngp17_001.homework3;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText editTextInput;
    ImageButton buttonPlay;

    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        setContentView(R.layout.activity_main);
        initInstances();
    }
    private void initInstances(){
        editTextInput = (EditText) findViewById(R.id.edit_text_input);
        buttonPlay = (ImageButton) findViewById(R.id.button_play);
        buttonPlay.setOnClickListener(this);
    }
    public void onClick(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        try {
            int input = Integer.parseInt(editTextInput.getText().toString());
            intent.putExtra("input",input);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast.makeText(this, "invalid input",Toast.LENGTH_SHORT).show();
        }
        startActivity(intent);

    }


}
