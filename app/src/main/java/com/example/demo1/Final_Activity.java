package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Final_Activity extends AppCompatActivity {
    TextView name,gender,dob,address,qual,percen,col,skills;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Person_helper helper = (Person_helper)getIntent().getSerializableExtra("data_2");
        name = findViewById(R.id.t1);
        gender = findViewById(R.id.t2);
        dob = findViewById(R.id.t3);
        address = findViewById(R.id.t4);
        qual = findViewById(R.id.t5);
        percen = findViewById(R.id.t6);
        col = findViewById(R.id.t7);
        skills = findViewById(R.id.t8);

        name.setText("Name : "+helper.getName());
        gender.setText("Gender : "+helper.getGender());
        dob.setText("Date Of Birth : "+helper.getDob());
        address.setText("Address : "+helper.getAddress());
        qual.setText("Qulaification : "+helper.getQualification());
        percen.setText("Percentage : "+helper.getPercentage());
        col.setText("College : "+helper.getCollege());
        String temp = "";
        for(String s : helper.getTechSkills())
            temp+=s+",";
        skills.setText("Skills : "+temp);
    }
}