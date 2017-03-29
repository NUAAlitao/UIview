package com.example.uiview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        editText = (EditText)findViewById(R.id.edittext1);
        textView = (TextView)findViewById(R.id.textview1);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                String input = editText.getText().toString();
                if((input.equals("王标宇"))||(input.equals("wangbiaoyv"))){
                    input = "my son";
                }
                String temp = "hello "+input;
                textView.setText(temp);
                break;
            default:
                break;
        }
    }
}
