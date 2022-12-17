package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;

public class Education_Activity extends AppCompatActivity {

    TextInputEditText Quali,Percent,College;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        Quali = findViewById(R.id.degree);
        Percent=findViewById(R.id.percent);
        College=findViewById(R.id.college);
        btn = findViewById(R.id.button);

        Person_helper helper = (Person_helper)getIntent().getSerializableExtra("data");

        btn.setOnClickListener(v->{
            helper.setQualification(Quali.getText().toString());
            helper.setPercentage(Percent.getText().toString());
            helper.setCollege(College.getText().toString());

            Intent i = new Intent(Education_Activity.this,Skill_Activity.class);
            i.putExtra("data_1",helper);
            startActivity(i);
        });
    }
}