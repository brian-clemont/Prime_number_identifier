package com.coutinho.brian.primenumberidentifier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button check_button;
    private EditText enter_number;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enter_number =(EditText)findViewById(R.id.input_number);
        check_button =(Button)findViewById(R.id.button_check);
        result =(TextView)findViewById(R.id.result);
        check_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String input = enter_number.getText().toString();
        int number = Integer.parseInt(input);
        int flag=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                result.setText(number+getString(R.string.is_not_a_prime));
                flag=1;
                break;
            }

        }
        if (flag==0)
            result.setText(number+getString(R.string.is_prime));

    }
}
