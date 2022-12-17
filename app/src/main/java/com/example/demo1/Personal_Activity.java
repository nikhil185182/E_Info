package com.example.demo1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;

public class Personal_Activity extends AppCompatActivity {
    TextInputEditText e_name,e_address;
    Button date,sub;

    RadioGroup r;
    String gen,dob_date;

    private Person_helper p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        e_name = (TextInputEditText)findViewById(R.id.ename);
        e_address = (TextInputEditText)findViewById(R.id.ename);
        date = findViewById(R.id.pick_date_button);
        sub = findViewById(R.id.sub_button);

        r=findViewById(R.id.gender_group);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.female:
                        gen="Female";
                        break;
                    case R.id.male:
                        gen="Male";
                }
            }
        });

       MaterialDatePicker materialDatePicker = MaterialDatePicker.Builder.datePicker().setTitleText("Select Date")
               .setSelection(MaterialDatePicker.todayInUtcMilliseconds()).build();
       date.setOnClickListener(v->{
           materialDatePicker.show(getSupportFragmentManager(),"Material_Date_Picker");
           materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
               @Override
               public void onPositiveButtonClick(Object selection) {
                   dob_date=materialDatePicker.getHeaderText();
                   date.setText(dob_date);
               }
           });
       });

       p = new Person_helper();

       sub.setOnClickListener(v->{
           p.setName(e_name.getText().toString());
           p.setGender(gen);
           p.setDob(dob_date);
           p.setAddress(e_address.getText().toString());

           Intent i = new Intent(Personal_Activity.this,Education_Activity.class);
           i.putExtra("data",p);
           startActivity(i);
       });
    }
}