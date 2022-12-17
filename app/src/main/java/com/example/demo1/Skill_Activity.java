package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class Skill_Activity extends AppCompatActivity {
    TextInputEditText sname;
    ImageButton btn;
    Button submit;
    ListView lv;
    private ArrayList<String> sk;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        sname=findViewById(R.id.sname);
        btn=findViewById(R.id.imageButton);
        lv=findViewById(R.id.l_view);
        submit = findViewById(R.id.button3);

        sk = new ArrayList<>();
        adapter=new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,sk);

        lv.setAdapter(adapter);

        btn.setOnClickListener(v->{
            sk.add(sname.getText().toString());
            adapter.notifyDataSetChanged();
            sname.setText("");
        });

        submit.setOnClickListener(v->{
            Person_helper helper = (Person_helper)getIntent().getSerializableExtra("data_1");
            helper.setTechSkills(sk);
            Intent i = new Intent(Skill_Activity.this,Final_Activity.class);
            i.putExtra("data_2",helper);
            startActivity(i);
        });
    }
}