package com.example.b1_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount = (TextView) findViewById(R.id.showCount);
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this , R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        count++;
        if(showCount != null){
            showCount.setText(Integer.toString(count));
        }
    }
}