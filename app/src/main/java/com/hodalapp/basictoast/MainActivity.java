package com.hodalapp.basictoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText name;
EditText password;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.editTextName);
        password =(EditText) findViewById(R.id.editTextPassword);
        submit = (Button) findViewById(R.id.buttonSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(password.getText().toString().length()<3){
//                    Toast.makeText(MainActivity.this,"Password is too shot",Toast.LENGTH_SHORT).show();
//
//                }
//                else
             if(!name.getText().toString().isEmpty() && !password.getText().toString().isEmpty()
                ){
                    Toast.makeText(MainActivity.this,"Wellcome to toast challenge",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this,"Please don't leave it empty",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}